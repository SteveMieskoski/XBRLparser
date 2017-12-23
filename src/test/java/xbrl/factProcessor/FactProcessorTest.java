package xbrl.factProcessor;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.parsers.SchemaCache;
import xbrl.parsers.SchemaParser;
import com.spotify.hamcrest.pojo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;

public class FactProcessorTest {

  //    @Ignore("FactProcessor.build Test is ignored") //UnCommented when building other tests to
  // reduce noise
  @Test
  public void build() {
    // todo: re-write test to match new implementations in FactProcessor
  }

  @Test
  public void parse() {}

  @Test
  public void factParser() {
    FactProcessor factProcessor = new FactProcessor();
    ContextContent contextContent = factProcessor.factParser("testingFragments/abc-20161231.xml");

    Assert.assertNotNull("FactProcessorSetupOps.factParser Result", contextContent);
    Assert.assertNotNull("getContextElements", contextContent.getContextElements());
    Assert.assertNotNull("getOrganizationElements", contextContent.getOrganizationElements());
    Assert.assertNotNull("getAllFacts", contextContent.getAllFacts());
  }

  @Test
  public void createExcel() {};

  @Test
  public void getDocumentPrimaryReportingPeriod() {
    // todo: convert to using junit parameters
    FactProcessor factProcessor = new FactProcessor();
    // Year
    List<OrganizationElement> testOrgList = new ArrayList<>();
    OrganizationElement documentPeriodElement = new OrganizationElement();
    documentPeriodElement.setFieldName("DocumentFiscalPeriodFocus");
    documentPeriodElement.setValue("FY");
    testOrgList.add(documentPeriodElement);

    OrganizationElement documentEndDate = new OrganizationElement();
    documentEndDate.setFieldName("DocumentPeriodEndDate");
    documentEndDate.setValue("2016-12-31");
    testOrgList.add(documentEndDate);

    Period expectedPeriod = new Period();
    expectedPeriod.setEndDate(LocalDate.parse("2016-12-31"));
    expectedPeriod.setStartDate(LocalDate.parse("2016-01-01"));

    Assert.assertEquals(
        "FY: DocumentPrimaryReportingPeriod",
        expectedPeriod,
        factProcessor.getDocumentPrimaryReportingPeriod(testOrgList));

    // Quarter
    testOrgList.clear();
    Assert.assertTrue(testOrgList.size() == 0);
    OrganizationElement documentQuarterElement = new OrganizationElement();
    documentQuarterElement.setFieldName("DocumentFiscalPeriodFocus");
    documentQuarterElement.setValue("Q4");
    testOrgList.add(documentQuarterElement);

    OrganizationElement documentQuarterEndDate = new OrganizationElement();
    documentQuarterEndDate.setFieldName("DocumentPeriodEndDate");
    documentQuarterEndDate.setValue("2016-12-31");
    testOrgList.add(documentQuarterEndDate);

    Period quarterPeriod = new Period();
    quarterPeriod.setEndDate(LocalDate.parse("2016-12-31"));
    quarterPeriod.setStartDate(LocalDate.parse("2016-09-30"));

    Assert.assertEquals(
        "Q#: DocumentPrimaryReportingPeriod",
        quarterPeriod,
        factProcessor.getDocumentPrimaryReportingPeriod(testOrgList));
  };
}
