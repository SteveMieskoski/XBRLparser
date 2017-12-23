package xbrl.parsers;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import xbrl.elementTypes.SchemaContent;

import static org.junit.Assert.*;

public class SchemaCacheTest {

  private static SchemaContent schemaContent;
  private static SchemaCache schemaCache;

  @Ignore(
      "SchemaCache Tests are not yet implemented") // UnCommented when building other tests to
                                                   // reduce noise
  @BeforeClass
  public static void setUpClass() {
    System.out.println("@BeforeClass setUpClass");
    String pwd = System.getProperty("user.dir");
    String fileSeparator = System.getProperty("file.separator");
    schemaContent =
        SchemaParser.parse(
                pwd + fileSeparator + "src/test/resources/testingFragments/tinySchema.xsd")
            .getSchemaContent();
    schemaCache = new SchemaCache(schemaContent);
  }

  /*
   * process to test:
   * - create two identical initial caches
   * - @Before method to manually update the control cache to reflect the state after a second schema is processed
   *   - Likely easiest means to do the update would be to create a new SchemaContent then swap/remove the necessary items/contents
   * - run filterAndUpdateCache to use internal mechanism to update cache.
   * - compare the two following the update action
   * - assert they contain the same items (see FactProcessorTest.build() Test)
   */

  @Ignore("SchemaCache.addSchemaElements Test is not yet implemented")
  @Test
  public void addSchemaElements() {}

  @Ignore("SchemaCache.addManySchemaElements Test is  not yet implemented")
  @Test
  public void addManySchemaElements() {}

  @Ignore("SchemaCache.getElement Test is  not yet implemented")
  @Test
  public void getElement() {}

  @Ignore("SchemaCache.filterAndUpdateCache Test is  not yet implemented")
  @Test
  public void filterAndUpdateCache() {}

  @Ignore("SchemaCache.getElementById Test is  not yet implemented")
  @Test
  public void getElementById() {}
}
