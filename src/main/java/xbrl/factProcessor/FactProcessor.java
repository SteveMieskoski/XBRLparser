package xbrl.factProcessor;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.extractFundamentals.*;
import xbrl.parsers.concepts.ContextParser;
import xbrl.parsers.concepts.FactParser;
import xbrl.parsers.concepts.OrganizationParser;
import xbrl.util.CommLine;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactProcessor {
  private final Logger logger = LoggerFactory.getLogger(FactProcessor.class);
  private HoldStuff holdStuff;
  private ReportContent reportContent;

  //    public FactProcessor() {}

  public FactProcessor(String xbrlFile) {
    holdStuff = new HoldStuff();
    try {
      SAXReader reader = new SAXReader();
      Document document = reader.read(new File(xbrlFile));
      List<FactElement> factElements = FactParser.parse(document);
      List<OrganizationElement> organizationElements = OrganizationParser.parse(document);
      List<ContextElement> contextElements = ContextParser.parse(document, null, null);
      factElements = FactParser.addContextToFacts(factElements, contextElements);
      Period period = getDocumentReportingPeriod(organizationElements);

      Map<Period, Map<String, FactElement>> facts = mapFactsByPeriodAndTag(factElements);

      FundamentalAccountingConcepts accountingFacts =
              new FundamentalAccountingConcepts(facts, period, organizationElements, holdStuff);

      accountingFacts.process();
    } catch (DocumentException e) {
      e.printStackTrace();
    }

  }

    public static FactProcessor parse(String xbrlFile) {
        return new FactProcessor(xbrlFile);
    }

  private static Map<Period, Map<String, FactElement>> mapFactsByPeriodAndTag(
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

  protected static Period getDocumentReportingPeriod(
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

  public void createExcel() {
    if (this.holdStuff.getResultSets() != null) {
      ToExcel.createWorkbook(this.holdStuff.getReportContent());
    }
  }

  // NOTE: HOLDSTUFF , An Idea Regarding another way to pass values around
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
