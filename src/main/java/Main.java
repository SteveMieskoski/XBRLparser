import xbrl.experimentalParsers.currentExp.LabelNode;
import xbrl.experimentalParsers.currentExp.LabelTreeIterator;
import xbrl.experimentalParsers.currentExp.LabelTreeProcessor;
import xbrl.experimentalParsers.extendedLink.ExtendedLink;
import xbrl.experimentalParsers.extendedLink.ExtendedLinkOrig;
import xbrl.experimentalParsers.priorExps.DigParseDemo;
import xbrl.factProcessor.FactProcessor;
import xbrl.factProcessor.FundamentalAccountingFacts;
import xbrlSchemas.Entry;

import java.io.File;

public class Main {

  public static void main(String[] args) {

//    extendedLinkTreeThingTrial();
    schemaParse();
  }

  private static void schemaParse() {
    String filename =
        "/home/steve/projects/2_java/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    new Entry();
  }

  private static void factDemo() {
    String filename = "/media/sysadmin/projects/Fin/demoData/amzn/amzn-20170630";
    /*            String filename =
    "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630";*/
    /*    String filename =
    "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/basic_example/abc-20101231";*/
    FundamentalAccountingFacts fundamentalAccountingFacts =
        FactProcessor.build(filename, null).getFundamentalsProcessor();
    fundamentalAccountingFacts.process();

    //      FactProcessor.build(filename, null).process(null);
    //      FactProcessor factProcessor = FactProcessor.build(filename, null);
    //      factProcessor.process(null);
  }

  private static void factToExcelDemo() {

    String[] filenames = {
      "/media/sysadmin/projects/Fin/demoData/amzn/amzn-20170630",
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630"
    };
    FactProcessor factProcessor = FactProcessor.build();
    FundamentalAccountingFacts fundamentalAccountingFacts;
    for (String f : filenames) {
      fundamentalAccountingFacts = factProcessor.processAdditional(f, null);
      fundamentalAccountingFacts.process();
    }
    factProcessor.createExcel();
  }

  private static void extendedLinkTrial() {
    try {
      String filename =
          "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_pre.xml";
      ExtendedLinkOrig extendedLinkOrig = new ExtendedLinkOrig("pre");
      extendedLinkOrig.parse(filename);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void extendedLinkTreeThingTrial() {
    // can handle calculation extended links (generally)
    String filename =
        "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_pre.xml";
    System.out.println("****LabelTree Processor****");

    ExtendedLink processor = new ExtendedLink();
    processor.loadFile(new File(filename));

    // process a single xlink:presentation node
    for (String s : processor.getExtendedLinkRoles().keySet()) {
      processor.setTagSet(s);
      for (String ss : processor.getExtendedLinkRoles().get(s)) {
        processor.processPresentationNode(ss);

        // building the label tree from the processed data
        processor.buildLabelTree();

        // displaying the tree struture
        processor.viewTree();
      }
    }
  }

  private static void someTreeThingTrial() {
    // can handle calculation extended links (generally)
    String filename =
        "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_pre.xml";
    System.out.println("****LabelTree Processor****");

    LabelTreeProcessor processor = new LabelTreeProcessor();
    processor.loadFile(new File(filename));

    // process a single xlink:presentation node
    for (String s : processor.getExtendedLinkRoles().keySet()) {
      processor.setTagSet(s);
      for (String ss : processor.getExtendedLinkRoles().get(s)) {
        processor.processPresentationNode(ss);

        // building the label tree from the processed data
        processor.buildLabelTree();

        // displaying the tree struture
        processor.viewTree();
      }
    }
  }

  private static void printTreeThings(LabelTreeProcessor processor) {
    System.out.println(processor.getExtendedLinkRoles());
    System.out.println("================================");
    LabelNode ln = processor.getTreeRootNode();
    LabelTreeIterator.makeHierarchyMap(ln);
    //        for(LabelNode ln: processor.simpleTreeIterator()){
    //          if(ln.isRootNode()){
    //
    //            System.out.println("===========================");
    //          }
    //          System.out.println(ln.getNodeName());
    //        }
  }

  private static void digsterTrial() {
    try {
      String filename =
          "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/basic_example/abc-20101231_pre.xml";
      DigParseDemo.parse(filename);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
