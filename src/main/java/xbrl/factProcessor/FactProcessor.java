package xbrl.factProcessor;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.*;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.extractFundamentals.FundamentalAccountingConcepts;
import xbrl.factProcessor.extractFundamentals.ReportContent;
import xbrl.parsers.SchemaCache;
import xbrl.parsers.SchemaParser;
import xbrl.parsers.concepts.ContextParser;
import xbrl.parsers.concepts.FactParser;
import xbrl.parsers.concepts.OrganizationParser;
import xbrl.parsers.concepts.ResourceParser;
import xbrl.util.CommLine;

import java.io.File;
import java.time.LocalDate;
import java.util.*;

public class FactProcessor {
    private final Logger logger = LoggerFactory.getLogger(ProcessFacts.class);
    private HoldStuff holdStuff;

    public FactProcessor() {}

    public FactProcessor(String xbrlFile) {
        holdStuff = new HoldStuff();
        ContextContent contextContent = factParser(xbrlFile);
        Period period = getDocumentPrimaryReportingPeriod(contextContent.getOrganizationElements());
        Map<Period, Map<String, FactElement>> facts =
                mapFactsByPeriodAndSchemaName(contextContent.getAllFacts());
        FundamentalAccountingConcepts accountingConcepts =
                new FundamentalAccountingConcepts(facts, period);
        FundamentalAccountingFacts accountingFacts =
                new FundamentalAccountingFacts(
                        holdStuff, period, accountingConcepts, contextContent.getOrganizationElements());
        accountingFacts.process();
    }

    public static ProcessFacts build() {
        return new ProcessFacts();
    }

    public static ProcessFacts parse(String xbrlFile) {
        return new ProcessFacts(xbrlFile);
    }

    public void createExcel() {
        if (this.holdStuff.getResultSets() != null) {
            ToExcel.createWorkbook(this.holdStuff.getReportContent());
        }
    }

    private Map<Period, Map<String, FactElement>> mapFactsByPeriodAndSchemaName(
            List<FactElement> facts) {
        Map<Period, Map<String, FactElement>> periodFactsByName = new HashMap<>();
        for (FactElement fe : facts) {

            if (periodFactsByName.containsKey(fe.getPeriod())) {
                periodFactsByName.get(fe.getPeriod()).put(fe.getTag(), fe);
            } else {
                HashMap<String, FactElement> tmp = new HashMap<>();
                tmp.put(fe.getTag(), fe);
                periodFactsByName.put(fe.getPeriod(), tmp);
            }
        }
        return periodFactsByName;
    }

    protected ContextContent factParser(String filename) {

        try {

            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(filename));

            List<ContextElement> contextElements = new ContextParser().parse(document);
            List<OrganizationElement> organizationElements = new OrganizationParser().parse(document);

            ContextContent contextContent = new ContextContent();
            contextContent.addAllContextElements((LinkedList<ContextElement>) contextElements);
            contextContent.addAllOrganizationElements(
                    (LinkedList<OrganizationElement>) organizationElements);
            contextContent = new FactParser().parse(document, contextContent);
            logger.info("SETUP FACT AND CONTEXT PARSER COMPLETE");
            return contextContent;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    protected Period getDocumentPrimaryReportingPeriod(
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
                        break;
                }

            } else if (oe.getFieldName().equals("DocumentPeriodEndDate")) {
                docDate = oe.getValue();
            }
        }

        if (docDate != null) {
            LocalDate start = null;
            LocalDate date = LocalDate.parse(docDate);
            if (yearOrQuartyer.equals("q")) {

                start = date.minusMonths(3);

            } else if (yearOrQuartyer.equals("y")) {
                start = date.minusMonths(12);
                if (start.getMonthValue() == date.getMonthValue()) {
                    start = start.plusDays(1);
                }
            }

            Period period = new Period();
            period.setEndDate(date);
            period.setStartDate(start);
            return period;
        } else {
            return null;
        }
    }

    // NOTE: An Idea Regarding another way to pass values around
    class HoldStuff implements CommLine {
        List<ResultSet> resultSets;
        ReportContent reportContent;
        Map<String, String> linkbases;
        List<String> schemaRefs;

        @Override
        public void transmitResults(ResultSet resultSet) {
            if (this.resultSets == null) {
                this.resultSets = new ArrayList<>();
            }
            if (this.reportContent == null) this.reportContent = new ReportContent();
            this.reportContent.addProcessedResults(resultSet);
            this.resultSets.add(resultSet);
        }

        @Override
        public void transmitFileMap(Map<String, String> componentFiles) {
            //       if (componentFiles.containsKey("fact")) {
            ////         factFileFallback = componentFiles.get("fact");
            //       }
        }

        @Override
        public void transmitFileResource(Map<String, String> linkbases, List<String> schemaRefs) {
            this.linkbases = linkbases;
            this.schemaRefs = schemaRefs;
        }

        public List<ResultSet> getResultSets() {
            return resultSets;
        }

        public void setResultSets(List<ResultSet> resultSets) {
            this.resultSets = resultSets;
        }

        public ReportContent getReportContent() {
            return reportContent;
        }

        public void setReportContent(ReportContent reportContent) {
            this.reportContent = reportContent;
        }
    }
}
