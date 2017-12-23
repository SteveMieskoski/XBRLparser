package xbrl.factProcessor;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.subTypes.Period;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Directory abc-20161231 in test resources contains a reference implementation of us-gaap taxonomy and instance components used for testing
 */
public class FactProcessorSetupOpsTest {

  //    @Ignore("parseSchemas Test is ignored") //UnCommented when building other tests to reduce
  // noise
  @Test
  public void parseSchemas() {
       /* String[] refSchema = {"src/test/resources/abc-20161231/abc-20161231.xsd"};
        SchemaContent schemaContent = FactProcessorSetupOps.parseSchemas(new ArrayList<>(Arrays.asList(refSchema)));

//        Assert.assertNotNull("entryPoints",schemaContent.getEntryPoints());
        Assert.assertNotNull("filenames", schemaContent.getFilenames());
        Assert.assertNotNull("linkbases", schemaContent.getLinkbases());
        Assert.assertNotNull("preCache", schemaContent.getPreCache());
        Assert.assertNotNull("schemaElementIds", schemaContent.getSchemaElementIds());
        Assert.assertNotNull("schemaElementNameMap", schemaContent.getSchemaElementNameMap());
        Assert.assertNotNull("schemaRoles", schemaContent.getSchemaRoles());
        Assert.assertNotNull("schemaElements", schemaContent.getSchemaElements());*/
    }

//    @Ignore("factParser Test is ignored") //UnCommented when building other tests to reduce noise
    @Test
    public void factParser() {
     /*   ContextContent contextContent = FactProcessorSetupOps.factParser("src/test/resources/abc-20161231/abc-20161231.xsd", "abc", "us-gaap");

        Assert.assertNotNull("FactProcessorSetupOps.factParser Result", contextContent);
        Assert.assertNotNull("getContextElements", contextContent.getContextElements());
        Assert.assertNotNull("getOrganizationElements", contextContent.getOrganizationElements());
        Assert.assertNotNull("getAllFacts", contextContent.getAllFacts());*/
    }

//    @Ignore("getDocumentPrimaryReportingPeriod Test is ignored") //UnCommented when building other tests to reduce noise
    @Test
    public void getDocumentPrimaryReportingPeriod() {
        /*//todo: convert to using junit parameters
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

        Assert.assertEquals("FY: DocumentPrimaryReportingPeriod", expectedPeriod, FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(testOrgList));

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


        Assert.assertEquals("Q#: DocumentPrimaryReportingPeriod", quarterPeriod, FactProcessorSetupOps.getDocumentPrimaryReportingPeriod(testOrgList));
*/
    }
}