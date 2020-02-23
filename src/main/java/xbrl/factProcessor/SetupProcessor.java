package xbrl.factProcessor;

import org.apache.commons.collections4.map.HashedMap;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.parsers.SchemaCache;
import xbrl.parsers.SchemaParser;
import xbrl.parsers.concepts.ContextParser;
import xbrl.parsers.concepts.FactParser;
import xbrl.parsers.concepts.OrganizationParser;
import xbrl.schemaElementTypes.SchemaContent;
import xbrl.schemaElementTypes.SchemaElement;
import xbrl.util.CoreFileTreeWalker;
import xbrl.util.UniversalNamespaceCache;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class SetupProcessor {

  protected static String checkFilePresence(String dir) {
    String baseDir;
    try {
      baseDir = dir;
      if (!new File(dir).isDirectory()) {
        if (new File(dir).getParentFile().isDirectory()) {
          baseDir = new File(dir).getParent();
        } else {
          return null;
        }
      }
      Path startingDir = Paths.get(baseDir);
      CoreFileTreeWalker finder = new CoreFileTreeWalker(baseDir);
      Files.walkFileTree(startingDir, finder);
      if (finder.done()) {
        Map<String, String> componentFiles = finder.getFiles();
        String xsdFile = componentFiles.get("xsd");
        if (xsdFile == null) {
          CoreFileTreeWalker finder2 = new CoreFileTreeWalker(baseDir, "**.xml");
          Files.walkFileTree(startingDir, finder2);
          if (finder2.done()) {
            componentFiles = finder.getFiles();
            for (String s : componentFiles.keySet()) {
              if (!s.contains("_")) {
                return componentFiles.get(s);
              }
            }
          }
        } else {
          return xsdFile;
        }
      }
      return null;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  protected static UniversalNamespaceCache namespaceParser(String filename) {
    try {
      DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = builderFactory.newDocumentBuilder();
      org.w3c.dom.Document xmlDocument = builder.parse(new File(filename));
      return new UniversalNamespaceCache(xmlDocument, true);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  protected static SchemaContent parseSchemas(List<String> additionalSchemas) {
    SchemaParser schemaParser = new SchemaParser();
    for (String aSchema : additionalSchemas) {
      schemaParser.parse(aSchema);
    }
    return schemaParser.getSchemaContent();
  }

  protected static ContextContent factParser(
      String filename, String customPrefix, String defaultPrefix) {

    try {
      filename = filename.replace(".xsd", ".xml");

      SAXReader reader = new SAXReader();
      Document document = reader.read(new File(filename));

      List<ContextElement> contextElements =
          new ContextParser(customPrefix, defaultPrefix).parse(document);
      List<OrganizationElement> organizationElements = new OrganizationParser().parse(document);

      ContextContent contextContent = new ContextContent();
      contextContent.addAllContextElements((LinkedList<ContextElement>) contextElements);
      contextContent.addAllOrganizationElements(
          (LinkedList<OrganizationElement>) organizationElements);
      contextContent = new FactParser().parse(document, contextContent);
      System.out.println("SETUP FACT AND CONTEXT PARSER COMPLETE");
      return contextContent;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  protected static Period getDocumentPrimaryReportingPeriod(
      List<OrganizationElement> organizationElements) {
    String yearOrQuartyer = "n";
    String docDate = null;
    for (OrganizationElement oe : organizationElements) {
      if (oe.getFieldName().equals("DocumentFiscalPeriodFocus")) {
        switch (oe.getValue()) {
          case "Q1":
            yearOrQuartyer = "q";
            break;
          case "Q2":
            yearOrQuartyer = "q";
            break;
          case "Q3":
            yearOrQuartyer = "q";
            break;
          case "Q4":
            yearOrQuartyer = "q";
            break;
          case "FY":
            yearOrQuartyer = "y";
            break;
          default:
            System.out.println(oe.getValue());
            break;
        }

        System.out.println(oe.getValue());
      } else if (oe.getFieldName().equals("DocumentPeriodEndDate")) {
        docDate = oe.getValue();
      }
    }

    if (docDate != null) {
      LocalDate start = null;
      LocalDate date =
          LocalDate.parse(
              docDate); // LocalDate.parse(yearFocus + "-" + Integer.toString(month-offset));
      if (yearOrQuartyer.equals("q")) {
        start = date.minusDays(90);
        System.out.println(start.getDayOfWeek());
      } else if (yearOrQuartyer.equals("y")) {
        start = date.minusMonths(12);
      }
      System.out.println(date);
      System.out.println(start);
      Period period = new Period();
      period.setEndDate(date);
      period.setStartDate(start);
      return period;
    } else {
      return null;
    }
  }

  public static Map<String, List<FactElement>> mapFactsBySchemaId(
      List<FactElement> facts, SchemaCache schemaCache) {
    Map<String, List<FactElement>> factById = new HashedMap<>();
    for (FactElement fe : facts) {
      SchemaElement se = schemaCache.getElement(fe.getTag());
      if (se != null) {
        fe.setSchemaElement(se);
        if (se.getId() != null) {
          if (factById.containsKey(se.getId())) {
            if (!factById.get(se.getId()).contains(fe)) {
              factById.get(se.getId()).add(fe);
            }
          } else {
            LinkedList<FactElement> tmp = new LinkedList<>();
            tmp.add(fe);
            factById.put(se.getId(), tmp);
          }
        }
      }
    }
    return factById;
  }

  public static Map<String, List<FactElement>> mapFactsBySchemaName(
      List<FactElement> facts, SchemaCache schemaCache) {
    Map<String, List<FactElement>> factByName = new HashedMap<>();

    for (FactElement fe : facts) {
      SchemaElement se = schemaCache.getElement(fe.getTag());
      if (se.getName() != null) {
        if (factByName.containsKey(se.getName())) {
          if (!factByName.get(se.getName()).contains(fe)) {
            factByName.get(se.getName()).add(fe);
          }
        } else {
          LinkedList<FactElement> tmp = new LinkedList<>();
          tmp.add(fe);
          factByName.put(se.getName(), tmp);
        }
      }
    }
    return factByName;
  }

  public static Map<Period, Map<String, FactElement>> mapFactsByPeriodAndSchemaId(
      List<FactElement> facts, SchemaCache schemaCache) {
    Map<Period, Map<String, FactElement>> periodFactById = new HashedMap<>();
    for (FactElement fe : facts) {
      SchemaElement se = schemaCache.getElement(fe.getTag());
      if (se != null) {
        fe.setSchemaElement(se);
        if (se.getId() != null) {
          if (periodFactById.containsKey(fe.getPeriod())) {
            periodFactById.get(fe.getPeriod()).put(se.getId(), fe);
          } else {
            HashedMap<String, FactElement> tmp = new HashedMap<>();
            tmp.put(se.getId(), fe);
            periodFactById.put(fe.getPeriod(), tmp);
          }
        }
      }
    }
    return periodFactById;
  }

  public static Map<Period, Map<String, FactElement>> mapFactsByPeriodAndSchemaName(
      List<FactElement> facts, SchemaCache schemaCache) {
    Map<Period, Map<String, FactElement>> periodFactsByName = new HashedMap<>();
    for (FactElement fe : facts) {
      SchemaElement se = schemaCache.getElement(fe.getTag());
      if (se.getName() != null) {
        if (periodFactsByName.containsKey(fe.getPeriod())) {
          periodFactsByName.get(fe.getPeriod()).put(se.getName(), fe);
        } else {
          HashedMap<String, FactElement> tmp = new HashedMap<>();
          tmp.put(se.getName(), fe);
          periodFactsByName.put(fe.getPeriod(), tmp);
        }
      }
    }
    return periodFactsByName;
  }
}
