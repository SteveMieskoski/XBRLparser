package xbrl.factProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(FactProcessor.class);
    private List<String> additionalSchemas;
    private UniversalNamespaceCache namespaceCache;
    private SchemaCache schemaCache;
    private ContextContent contextContent;
    private List<ResultSet> resultSets;
    private ReportContent reportContent;
    private String factFileFallback;

    private FactProcessor() {
    }

    public FactProcessor(String xsdFileDir, String[] additionalSchemas) {

        String xsdFile = FactProcessorSetupOps.checkFilePresence(xsdFileDir, this);
        if (xsdFile != null) {
            processSingle(xsdFile, additionalSchemas);
        }
    }

    public FactProcessor(String xsdFileDir) {

        String xsdFile = FactProcessorSetupOps.checkFilePresence(xsdFileDir, this);
        if (xsdFile != null) {
            processSingle(xsdFile, null);
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

    private void processSingle(String xsdFile, String[] additionalSchemas) {
        if (this.reportContent == null) {
            this.reportContent = new ReportContent();
        }
        String defaultPrefix = "us-gaap";
        String customPrefix = defaultPrefix;
        System.out.println(xsdFile);
        if (xsdFile.contains(".xsd")) addAdditionalSchemas(xsdFile);
        namespaceCache = FactProcessorSetupOps.namespaceParser(xsdFile);
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

        if (this.schemaCache == null) {
            SchemaContent sc = FactProcessorSetupOps.parseSchemas(this.additionalSchemas);
            this.schemaCache = new SchemaCache(sc);
            this.contextContent = FactProcessorSetupOps.factParser(xsdFile, customPrefix, defaultPrefix);
            if (this.contextContent == null) {
                logger.warn("No xml file found with name equal to the suplied xsd file");
                if(factFileFallback != null) logger.warn("Using {} as fallback", factFileFallback);
                this.contextContent = FactProcessorSetupOps.factParser(factFileFallback, customPrefix, defaultPrefix);
            }
            System.out.println("this.contextContent: " + this.contextContent);
        } else {
            List<String> toParse = this.schemaCache.filterAndUpdateCache(this.additionalSchemas);
            SchemaContent sc = FactProcessorSetupOps.parseSchemas(toParse);
            this.schemaCache.addManySchemaElements(sc);
            this.contextContent = FactProcessorSetupOps.factParser(xsdFile, customPrefix, defaultPrefix);
            if (this.contextContent == null) {
                logger.warn("No xml file found with name equal to the suplied xsd file");
                if(factFileFallback != null) logger.warn("Using {} as fallback", factFileFallback);
                this.contextContent = FactProcessorSetupOps.factParser(factFileFallback, customPrefix, defaultPrefix);
            }
            System.out.println(this.contextContent);
        }
    }

    // todo: configure to accept custom mappings
    public FundamentalAccountingFacts processSingleRepeatable(
            String additionalXsdFile, String[] additionalSchemas) {
        if (this.reportContent == null) {
            this.reportContent = new ReportContent();
        }
        String xsdFile = FactProcessorSetupOps.checkFilePresence(additionalXsdFile, this);
        if (xsdFile != null) {
            String defaultPrefix = "us-gaap";
            String customPrefix = defaultPrefix;
            if (xsdFile.contains(".xsd")) addAdditionalSchemas(xsdFile);
            namespaceCache = FactProcessorSetupOps.namespaceParser(xsdFile);
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

            if (this.schemaCache == null) {
                SchemaContent sc = FactProcessorSetupOps.parseSchemas(this.additionalSchemas);
                this.schemaCache = new SchemaCache(sc);
                this.contextContent = FactProcessorSetupOps.factParser(xsdFile, customPrefix, defaultPrefix);

                if (this.contextContent == null) {
                    logger.warn("No xml file found with name equal to the suplied xsd file");
                    if(factFileFallback != null) logger.warn("Using {} as fallback", factFileFallback);
                    if(factFileFallback == null) logger.error("No xbrl instance xml or xbrl file found");
                    this.contextContent = FactProcessorSetupOps.factParser(factFileFallback, customPrefix, defaultPrefix);
                }
                return getFundamentalsProcessor(customPrefix);
            } else {
                List<String> toParse = this.schemaCache.filterAndUpdateCache(this.additionalSchemas);
                SchemaContent sc = FactProcessorSetupOps.parseSchemas(toParse);
                this.schemaCache.addManySchemaElements(sc);

                this.contextContent = FactProcessorSetupOps.factParser(xsdFile, customPrefix, defaultPrefix);
                if (this.contextContent == null) {
                    logger.warn("No xml file found with name equal to the suplied xsd file");
                    if(factFileFallback != null) logger.warn("Using {} as fallback", factFileFallback);
                    this.contextContent = FactProcessorSetupOps.factParser(factFileFallback, customPrefix, defaultPrefix);
                }
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
                    FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(
                            this.contextContent.getOrganizationElements());
            FundamentalAccountingConcepts accountingConcepts =
                    new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
            System.out.println(accountingConcepts);
            return new FundamentalAccountingFacts(
                    this, period, accountingConcepts, this.contextContent.getOrganizationElements());
        }
        logger.error("getFundamentalsProcessor called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    public FundamentalAccountingFacts getFundamentalsProcessor() {
        if (this.contextContent != null) {
            Period period =
                    FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(
                            this.contextContent.getOrganizationElements());
            FundamentalAccountingConcepts accountingConcepts =
                    new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
            System.out.println(accountingConcepts);
            return new FundamentalAccountingFacts(
                    this, period, accountingConcepts, this.contextContent.getOrganizationElements());
        }
        logger.error("getFundamentalsProcessor called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    public FundamentalAccountingFacts getFundamentalsProcessor(Map<String, String[]> mappings) {
        if (this.contextContent != null) {
            Period period =
                    FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(
                            this.contextContent.getOrganizationElements());
            FundamentalAccountingConcepts accountingConcepts =
                    new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);
            //    accountingConcepts.set(mappings);

            return new FundamentalAccountingFacts(
                    this, period, accountingConcepts, this.contextContent.getOrganizationElements());
        }
        logger.error("getFundamentalsProcessor called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    @Override
    public void transmitResults(ResultSet resultSet) {
        if (this.resultSets == null) {
            this.resultSets = new ArrayList<>();
        }
        this.reportContent.addProcessedResults(resultSet);
        this.resultSets.add(resultSet);
    }

    @Override
    public void transmitFileMap(Map<String, String> componentFiles) {
        if (componentFiles.containsKey("fact")) {
            factFileFallback = componentFiles.get("fact");
        }
    }

    public void createExcel() {
        if (this.resultSets != null) {
            ToExcel.createWorkbook(this.reportContent);
        }
    }

    public void process(Map<String, String[]> mappings) {
        if (this.contextContent != null) {
            fundamentals(mappings);
        }
        logger.error("process called before file(s) processed via processSingleRepeatable");
        // todo: add an exception
    }

    public void fundamentals(Map<String, String[]> mappings) {
        if (this.contextContent != null) {
            Period period =
                    FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(
                            this.contextContent.getOrganizationElements());

            FundamentalAccountingConcepts accountingConcepts =
                    new FundamentalAccountingConcepts(getFactsGroupedByPeriodAndName(), period);

            accountingConcepts.setFocusPeriod(period);

            if (this.contextContent.getOrganizationElements() != null) {
                accountingConcepts.setOrganizationElementsList(
                        this.contextContent.getOrganizationElements());
            }

            accountingConcepts.process(mappings);
        }
        logger.error("fundamentals called before file(s) processed via processSingleRepeatable");
        // todo: add an exception
    }

    public Map<String, List<FactElement>> getFactsGroupedById() {
        if (this.contextContent != null) {
            return FactProcessorSetupOps.mapFactsBySchemaName(
                    this.contextContent.getAllFacts(), this.schemaCache);
        }
        logger.error("getFactsGroupedById called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    public Map<String, List<FactElement>> getFactsGroupedByName() {
        if (this.contextContent != null) {
            return FactProcessorSetupOps.mapFactsBySchemaId(this.contextContent.getAllFacts(), this.schemaCache);
        }
        logger.error("getFactsGroupedByName called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    public Map<Period, Map<String, FactElement>> getFactsGroupedByPeriodAndId() {
        if (this.contextContent != null) {
            return FactProcessorSetupOps.mapFactsByPeriodAndSchemaId(
                    this.contextContent.getAllFacts(), this.schemaCache);
        }
        logger.error("getFactsGroupedByPeriodAndId called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    public Map<Period, Map<String, FactElement>> getFactsGroupedByPeriodAndName() {
        if (this.contextContent != null) {
            return FactProcessorSetupOps.mapFactsByPeriodAndSchemaName(
                    this.contextContent.getAllFacts(), this.schemaCache);
        }
        logger.error("getFactsGroupedByPeriodAndName called before file(s) processed via processSingleRepeatable");
        return null; // todo: replace this with an exception
    }

    // getters and setters for test usage
    // For Tests to gain access to private properties
    public <T> T check(String property) {
        // todo: cache is not clearing and being repopulated.  but it is using the cached version rather
        // todo: than re-parsing the files
        switch (property) {
            case "additionalSchemas":
                return (T) additionalSchemas;
            case "namespaceCache":
                return (T) namespaceCache;
            case "schemaCache":
                return (T) schemaCache;
            case "contextContent":
                return (T) contextContent;
            case "resultSets":
                return (T) resultSets;
            case "reportContent":
                return (T) reportContent;
        }
        return null;
    }

}
