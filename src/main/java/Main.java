import xbrl.FilingParser.ParserEntry;
import xbrl.taxonomyParser.TaxonomyEntry;
import scraps.xbrlSchemas.ExpEntry;

import java.io.File;

public class Main {

  public static void main(String[] args) {

//    extendedLinkTreeThingTrial();
    newParser();
  }

  private static void taxonomyParser() {
    String filename =
            "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    new TaxonomyEntry();
  }

  private static void newParser() {
    String filename =
            "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    new ParserEntry();
  }

  private static void schemaParse() {
    String filename =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    new ExpEntry();
  }

}
