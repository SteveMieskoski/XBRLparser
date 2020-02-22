package FilingParser;

import FilingParser.ElementTypes.*;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import xbrl.schemaElementTypes.SchemaContent;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilingEntry {

  SchemaContent schemaContent;
  String currentFile;
  String basePath = null;
  String altBasePath = null;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();
  boolean isXsd = false;
  List<List<Element>> elements = new ArrayList<>();
  List<String> extendedPrefixes = new ArrayList<>();
  DatabaseHandler databaseHandler = new DatabaseHandler();; //new DatabaseHandler(false);
  boolean shouldPersist = true; //false; // true;

  public FilingEntry() {
    extendedPrefixes.add(
        "us-gaap"); // <- need to remove this hard coding and get this via parsing (i.e.
    // programmatically)
    String allEntryPoint =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/us-gaap-entryPoint-all-2017-01-31.xsd";
    String filename =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    String file1 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-cal-2017-01-31.xml";
    String file2 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-acec-def-2017-01-31.xml";
    String file3 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-def-2017-01-31.xml";
    String file4 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630.xml";
    String file5 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";
    String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";
    preParse(file4);
    //    databaseHandler.insertFacts(
    //            "file1",
    //            "file1",
    //            "file1",
    //            "file1",
    //            "file1");
  }

  public void preParse(String filename) {
    File fileInput = new File(filename);
    basePath = fileInput.getParent();
    altBasePath = basePath;
    parse(filename);
  }

  public File getFile(String filename) {
    if (filename == null) {
      return null;
    }
    File file;
    if (basePath == null) {
      basePath =
          "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/";
    }

    if (altBasePath == null) {
      altBasePath = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/";
    }

    File fileBase = new File(basePath);
    File fileInput = new File(filename);

    try {
      System.out.println("-----------------------------------------"); // todo remove dev item
      System.out.println(filename); // todo remove dev item
      if (!cache.contains(filename)) {
        cache.add(filename);
      } else {
        return null;
      }
      if (!filename.startsWith("/")
          && !filename.startsWith("../")
          && !filename.contains("http://")) {
        File altFileBase = new File(altBasePath);
        file = new File(altFileBase, filename);
      } else if (filename.contains("http://")) {
        URL url = new URL(filename);
        file = new File(url.getFile());
      } else if (!fileInput.isAbsolute()) {
        file = new File(fileBase, filename);
      } else {
        file = new File(filename);
      }
      if (!file.exists()) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); // todo remove dev item
        System.out.println(filename); // todo remove dev item
        return null;
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
      return null;
    }
    return file;
  }

  public void parse(String filename) {
    System.out.println("filename: " + filename);
    this.currentFile = filename;
    try {
      File file = getFile(filename);
      if (file == null) {
        return;
      }

      System.out.println(file.getCanonicalPath()); // todo remove dev item
      SAXReader reader = new SAXReader();
      reader.setDefaultHandler(new FilingRawParser(this));
      Document document = reader.read(file);

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
        "====================================================================================="); // todo remove dev item
    //    System.out.println(elements); // todo remove dev item
    ParserTwo parserTwo = new ParserTwo(this);
    //        System.out.println(parserTwo.getContexts()); // todo remove dev item
    //    System.out.println(parserTwo.getItemConcepts()); // todo remove dev item
    //    System.out.println(parserTwo.getCalculations()); // todo remove dev item
//        System.out.println(parserTwo.getRoleRefs()); // todo remove dev item
    persist(parserTwo);
  }

  public void persist(ParserTwo parserTwo) {
    if(shouldPersist){
      insertFacts(parserTwo);
      insertExtendedLinks(parserTwo);
      insertContexts(parserTwo);
      insertRoleRefs(parserTwo);
    }
  }

  public void insertFacts(ParserTwo parserTwo){
    System.out.println("Insert Facts"); // todo remove dev item
    for (ItemConcept itemConcept : parserTwo.getItemConcepts()) {
      databaseHandler.insertFacts(
              itemConcept.prefix,
              itemConcept.tag,
              itemConcept.contextRef,
              itemConcept.unitRef,
              itemConcept.decimals,
              itemConcept.value);
    }
  }

  public void insertExtendedLinks(ParserTwo parserTwo){
    System.out.println("Insert Extended Links"); // todo remove dev item
    for (ExtendedLink extendedLink : parserTwo.getCalculations()) {
      databaseHandler.insertLinkBase(
              extendedLink.uuid,
              extendedLink.tag,
              extendedLink.type,
              extendedLink.role,
              extendedLink.title,
              extendedLink.schema);
      for (ExtendedLink.Arc arc : extendedLink.arcs) {
        databaseHandler.insertArcs(
                extendedLink.uuid,
                arc.type,
                arc.arcrole,
                arc.from,
                arc.to,
                arc.order,
                arc.use,
                arc.weight,
                arc.priority);
      }
      for (ExtendedLink.Loc loc : extendedLink.locs) {
        databaseHandler.insertLocator(extendedLink.uuid, loc.type, loc.href, loc.label);
      }
    }
  }

  public void insertContexts(ParserTwo parserTwo){
    System.out.println("Insert Contexts"); // todo remove dev item
    for (Context context : parserTwo.getContexts()) {
      String segmentDim = null;
      String segmentValue = null;
      if (!context.segments.isEmpty()) {
        XmlEntry xmlEntry = context.segments.get(0);
        segmentValue = xmlEntry.getText();
        if (xmlEntry.attributes.containsKey("dimension")) {
          segmentDim = xmlEntry.attributes.get("dimension");
        }
      }

      databaseHandler.insertContexts(
              context.getId(),
              context.getEntityIdentifier(),
              context.getIdentifierSchema(),
              context.getPeriodStart(),
              context.getPeriodEnd(),
              context.getInstant(),
              context.getForever(),
              segmentDim,
              segmentValue);
    }
  }

  public void insertRoleRefs(ParserTwo parserTwo){
    System.out.println("Insert Role refs"); // todo remove dev item
    for (RoleRef roleRef : parserTwo.getRoleRefs()) {
      databaseHandler.insertRoleRefs(
              roleRef.roleRefId,
              roleRef.schemaDef,
              roleRef.type,
              roleRef.href,
              roleRef.roleUri);
    }
  }
}
