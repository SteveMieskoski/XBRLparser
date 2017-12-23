package xbrl.factProcessor;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;
import xbrl.parsers.SchemaCache;
import xbrl.parsers.SchemaParser;
import com.spotify.hamcrest.pojo.*;

import java.util.Map;

import static org.hamcrest.CoreMatchers.*;

public class FactProcessorTest {


    private static SchemaContent schemaContent;
    private static SchemaCache schemaCache;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass setUpClass");
        String pwd = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        schemaContent = new SchemaParser().parse(pwd + fileSeparator + "src/test/resources/testingFragments/tinySchema.xsd");
        schemaCache = new SchemaCache(schemaContent);
    }

//    @Ignore("FactProcessor.build Test is ignored") //UnCommented when building other tests to reduce noise
    @Test
    public void build() {
        FactProcessor factProcessor = FactProcessor.build("src/test/resources/testingFragments/tinySchema.xsd");
//        System.out.println(schemaCache);
//        System.out.println(factProcessor.getSchemaCache());

        Map<String, Map<String, SchemaElement>> cache = schemaCache.check("cache");
        SchemaCache sc = factProcessor.check("schemaCache");
        Map<String, Map<String, SchemaElement>> cacheTest = sc.check("cache");
        for(String s: cache.keySet()){
            System.out.println(s);
            System.out.println(cacheTest.keySet());
            Assert.assertTrue("caches do not contain the same keys", cacheTest.containsKey(s));
            Map<String, SchemaElement> schemaTestElementMap = cacheTest.get(s);
            Map<String, SchemaElement> schemaElementMap = cache.get(s);
            for(String ss: schemaElementMap.keySet()){
                SchemaElement se = schemaElementMap.get(ss);
                SchemaElement seTest = schemaTestElementMap.get(ss);
                System.out.println(se);
                System.out.println(seTest);
                final IsPojo<SchemaElement> sut =
                        IsPojo.pojo(SchemaElement.class)
                                .withProperty("id", is(se.getId()))
                                .withProperty("name", is(se.getName()))
                                .withProperty("type", is(se.getType()))
                                .withProperty("substitutionGroup", is(se.getSubstitutionGroup()))
                                .withProperty("periodType", is(se.getPeriodType()))
                                .withProperty("balance", is(se.getBalance()))
                                .withProperty("isAbstract", is(se.isAbstract))
                                .withProperty("nillable", is(se.nillable));

                Assert.assertThat(seTest, is(sut));
            }
        }

    }

    @Test
    public void build1() {
    }

    @Test
    public void build2() {
    }

    @Test
    public void processAdditional() {
    }

    @Test
    public void getFundamentalsProcessor() {
    }

    @Test
    public void getFundamentalsProcessor1() {
    }

    @Test
    public void process() {
    }

    @Test
    public void fundamentals() {
    }

    @Test
    public void getFactsGroupedById() {
    }

    @Test
    public void getFactsGroupedByName() {
    }

    @Test
    public void getFactsGroupedByPeriodAndId() {
    }

    @Test
    public void getFactsGroupedByPeriodAndName() {
    }
}