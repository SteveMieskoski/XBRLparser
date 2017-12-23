package xbrl.parsers.concepts;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.subTypes.Period;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;


public class FactParserTest {

//        @Ignore("FactParser.parse Test is ignored") //UnCommented when building other tests to reduce noise
    @Test
    public void parse() {

        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File("src/test/resources/testingFragments/abc-20161231.xml"));
            ContextContent contextContent = new ContextContent();

            ContextElement contextElement1 = new ContextElement();
            contextElement1.setPeriod(new Period());
            contextElement1.setId("D-2015");
            contextElement1.getPeriod().setStartDate("2015-01-01");
            contextElement1.getPeriod().setTemporalType("Duration");
            contextElement1.getPeriod().setEndDate("2015-12-31");

            ContextElement contextElement2 = new ContextElement();
            contextElement2.setPeriod(new Period());
            contextElement2.setId("I-2016");
            contextElement2.getPeriod().setInstant("2016-12-31");
            contextElement2.getPeriod().setTemporalType("Instant");
            contextContent.addContext(contextElement1);
            contextContent.addContext(contextElement2);

            contextContent = new FactParser().parse(document, contextContent);

            Assert.assertEquals(106, contextContent.getAllFacts().size());
            for (FactElement fe : contextContent.getAllFacts()) {
                Assert.assertNotNull(fe.getTag());
                Assert.assertNotNull(fe.getContextRef());
                Assert.assertNotNull(fe.getPeriod());
                Assert.assertNotNull(fe.getUnitRef());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


}