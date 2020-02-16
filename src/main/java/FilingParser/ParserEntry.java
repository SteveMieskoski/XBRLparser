package FilingParser;

public class ParserEntry {

    public ParserEntry() {

        String allEntryPoint =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/us-gaap-entryPoint-all-2017-01-31.xsd";
        String filename =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
        String file1 =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-cal-2017-01-31.xml";
        String file2 =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-acec-def-2017-01-31.xml";
        String file3 =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-def-2017-01-31.xml";
        String file4 =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630.xml";
        String file5 =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";
        String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";

        new FilingEntry();
//        new AltEntry().parse(file5);
    }
}
