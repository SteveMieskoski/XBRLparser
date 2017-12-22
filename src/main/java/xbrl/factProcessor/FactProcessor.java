package xbrl.factProcessor;

import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.extractFundamentals.FundamentalAccountingConcepts;
import xbrl.factProcessor.extractFundamentals.ReportContent;
import xbrl.parsers.SchemaCache;
import xbrl.elementTypes.SchemaContent;
import xbrl.util.CommLine;
import xbrl.util.UniversalNamespaceCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactProcessor implements CommLine {

  private List<String> additionalSchemas;
  private UniversalNamespaceCache namespaceCache;
  private SchemaCache schemaCache;
  private ContextContent contextContent;
  private List<ResultSet> resultSets;
  private ReportContent reportContent;

  private FactProcessor() {}

  public FactProcessor(String xsdFileDir, String[] additionalSchemas) {

    String xsdFile = SetupProcessor.checkFilePresence(xsdFileDir);
    if (xsdFile != null) {
      startProcessor(xsdFile, additionalSchemas);
    }
  }

  public FactProcessor(String xsdFileDir) {

    String xsdFile = SetupProcessor.checkFilePresence(xsdFileDir);
    if (xsdFile != null) {
      startProcessor(xsdFile, null);
    }
  }

  public static FactProcessor build() {
    return new FactProcessor();
  }

  public static FactProcessor build(String xsdFileDir) {
    return new FactProcessor(xsdFileDir);
  }

  public static FactProcessor build(String xsdFileDir, String[] additionalSchemas) {
    return new FactProcessor(xsdFileDir, additionalSchemas);
  }

  private void startProcessor(String xsdFile, String[] additionalSchemas) {
    if(this.reportContent == null){
      this.reportContent = new ReportContent();
    }
    String defaultPrefix = "us-gaap";
    String customPrefix = defaultPrefix;
    System.out.println(xsdFile);
    if (xsdFile.contains(".xsd")) addAdditionalSchemas(xsdFile);
    namespaceCache = SetupProcessor.namespaceParser(xsdFile);
    if (namespaceCache != null) {
      for (String s : namespaceCache.getUri2Prefix().keySet()) {
        Pattern pat =
            Pattern.compile(
                "http://xbrl\\.org|http://www\\.xbrl\\.org|http://www\\.w3\\.org|http://xbrl\\.sec\\.gov|http://fasb\\.org|http://www\\.fasb\\.org");
        Matcher mat = pat.matcher(s);
        if (!mat.find()) {
          customPrefix = namespaceCache.getUri2Prefix().get(s);
        }
      }
    }

    if (additionalSchemas != null) {
      for (String s : additionalSchemas) {
        addAdditionalSchemas(s);
      }
    }

    // Temporary Hard code
    addAdditionalSchemas(
        "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/us-gaap-2016-01-31.xsd");
    addAdditionalSchemas(
        "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/dei-2014-01-31.xsd");

    if (this.schemaCache == null) {
      SchemaContent sc = SetupProcessor.parseSchemas(this.additionalSchemas);
      this.schemaCache = new SchemaCache(sc);
      this.contextContent = SetupProcessor.factParser(xsdFile, customPrefix, defaultPrefix);
      System.out.println(this.contextContent);
    } else {
      List<String> toParse = this.schemaCache.filterAndUpdateCache(this.additionalSchemas);
      SchemaContent sc = SetupProcessor.parseSchemas(toParse);
      this.schemaCache.addManySchemaElements(sc);
      this.contextContent = SetupProcessor.factParser(xsdFile, customPrefix, defaultPrefix);
      System.out.println(this.contextContent);
    }
  }

  // todo: configure to accept custom mappings
  public FundamentalAccountingFacts processAdditional(
      String additionalXsdFile, String[] additionalSchemas) {
    if(this.reportContent == null){
      this.reportContent = new ReportContent();
    }
    String xsdFile = SetupProcessor.checkFilePresence(additionalXsdFile);
    if (xsdFile != null) {
      String defaultPrefix = "us-gaap";
      String customPrefix = defaultPrefix;
      //      System.out.println(xsdFile);
      if (xsdFile.contains(".xsd")) addAdditionalSchemas(xsdFile);
      namespaceCache = SetupProcessor.namespaceParser(xsdFile);
      if (namespaceCache != null) {
        for (String s : namespaceCache.getUri2Prefix().keySet()) {
          Pattern pat =
              Pattern.compile(
                  "http://xbrl\\.org|http://www\\.xbrl\\.org|http://www\\.w3\\.org|http://xbrl\\.sec\\.gov|http://fasb\\.org|http://www\\.fasb\\.org");
          Matcher mat = pat.matcher(s);
          if (!mat.find()) {
            customPrefix = namespaceCache.getUri2Prefix().get(s);
          }
        }
      }

      if (additionalSchemas != null) {
        for (String s : additionalSchemas) {
          addAdditionalSchemas(s);
        }
      }

      // Temporary Hard code
      addAdditionalSchemas(
          "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/us-gaap-2016-01-31.xsd");
      addAdditionalSchemas(
          "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/dei-2014-01-31.xsd");

      if (this.schemaCache == null) {
        SchemaContent sc = SetupProcessor.parseSchemas(this.additionalSchemas);
        this.schemaCache = new SchemaCache(sc);
//        this.schemaCache.check();
        this.contextContent = SetupProcessor.factParser(xsdFile, customPrefix, defaultPrefix);
        System.out.println(this.contextContent);
        return getFundamentalsProcessor(customPrefix);
      } else {
        List<String> toParse = this.schemaCache.filterAndUpdateCache(this.additionalSchemas);
        SchemaContent sc = SetupProcessor.parseSchemas(toParse);
        this.schemaCache.addManySchemaElements(sc);

        this.contextContent = SetupProcessor.factParser(xsdFile, customPrefix, defaultPrefix);
        System.out.println(this.contextContent);
//        this.schemaCache.check();
        return getFundamentalsProcessor(customPrefix);
      }
    } else {
      return null; // todo: replace this with an exception
    }
  }

  private void addAdditionalSchemas(String schemas) {
    if (this.additionalSchemas == null) {
      this.additionalSchemas = new ArrayList<>();
    }
    this.additionalSchemas.add(schemas);
  }

  private FundamentalAccountingFacts getFundamentalsProcessor(String customPrefix) {
    if (this.contextContent != null) {
      Period period =
              SetupProcessor.getDocumentPrimaryReportingPeriod(
                      this.contextContent.getOrganizationElements());
      FundamentalAccountingConcepts accountingConcepts =
              new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
      System.out.println(accountingConcepts);
      return new FundamentalAccountingFacts(
              this, period, accountingConcepts, this.contextContent.getOrganizationElements());
    } else {
      return null; // todo: replace this with an exception
    }
  }

  public FundamentalAccountingFacts getFundamentalsProcessor() {
    if (this.contextContent != null) {
      Period period =
          SetupProcessor.getDocumentPrimaryReportingPeriod(
              this.contextContent.getOrganizationElements());
      FundamentalAccountingConcepts accountingConcepts =
          new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
      System.out.println(accountingConcepts);
      return new FundamentalAccountingFacts(
          this, period, accountingConcepts, this.contextContent.getOrganizationElements());
    } else {
      return null; // todo: replace this with an exception
    }
  }

  public FundamentalAccountingFacts getFundamentalsProcessor(Map<String, String[]> mappings) {
    if (this.contextContent != null) {
      Period period =
          SetupProcessor.getDocumentPrimaryReportingPeriod(
              this.contextContent.getOrganizationElements());
      FundamentalAccountingConcepts accountingConcepts =
          new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
      //    accountingConcepts.set(mappings);

      return new FundamentalAccountingFacts(
          this, period, accountingConcepts, this.contextContent.getOrganizationElements());
    } else {
      return null; // todo: replace this with an exception
    }
  }

  @Override
  public void transmitResults(ResultSet resultSet) {
    if (this.resultSets == null) {
      this.resultSets = new ArrayList<>();
    }
    System.out.println(resultSet);
    System.out.println("====================================================");
    this.reportContent.addProcessedResults(resultSet);
    this.resultSets.add(resultSet);
  }

  public void createExcel() {
    if (this.resultSets != null) {
      ToExcel.createWorkbook(this.reportContent);
    }
  }

  public void process(Map<String, String[]> mappings) {
    if (this.contextContent != null) {
      fundamentals(mappings);
    } else {
      return; // todo: replace this with an exception
    }
  }

  public void fundamentals(Map<String, String[]> mappings) {
    if (this.contextContent != null) {
      Period period =
          SetupProcessor.getDocumentPrimaryReportingPeriod(
              this.contextContent.getOrganizationElements());

      FundamentalAccountingConcepts accountingConcepts =
          new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);

      accountingConcepts.setFocusPeriod(period);

      if (this.contextContent.getOrganizationElements() != null) {
        accountingConcepts.setOrganizationElementsList(
            this.contextContent.getOrganizationElements());
      }

      accountingConcepts.process(mappings);
    } else {
      return; // todo: replace this with an exception
    }
  }

  public Map<String, List<FactElement>> getFactsGroupedById() {
    if (this.contextContent != null) {
      return SetupProcessor.mapFactsBySchemaName(
          this.contextContent.getAllFacts(), this.schemaCache);
    } else {
      return null; // todo: replace this with an exception
    }
  }

  public Map<String, List<FactElement>> getFactsGroupedByName() {
    if (this.contextContent != null) {
      return SetupProcessor.mapFactsBySchemaId(this.contextContent.getAllFacts(), this.schemaCache);
    } else {
      return null; // todo: replace this with an exception
    }
  }

  public Map<Period, Map<String, FactElement>> getFactsGroupedByPeriodAndId() {
    if (this.contextContent != null) {
      return SetupProcessor.mapFactsByPeriodAndSchemaId(
          this.contextContent.getAllFacts(), this.schemaCache);
    } else {
      return null; // todo: replace this with an exception
    }
  }

  public Map<Period, Map<String, FactElement>> getFactsGroupedByPeriodAndName() {
    if (this.contextContent != null) {
      return SetupProcessor.mapFactsByPeriodAndSchemaName(
          this.contextContent.getAllFacts(), this.schemaCache);
    } else {
      return null; // todo: replace this with an exception
    }
  }
}
