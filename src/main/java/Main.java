import xbrl.factProcessor.FactProcessor;
import xbrl.factProcessor.FundamentalAccountingFacts;
import xbrl.factProcessor.ProcessFacts;

import javax.security.auth.callback.Callback;

public class Main {

  public static void main(String[] args) {

    ProcessFacts processFacts =
        ProcessFacts.parse(
            "/media/sysadmin/projects/Fin/XBRLparser/src/main/resources/abc-20161231/abc-20161231.xml");
    processFacts.createExcel();

    //    if(args.length > 0){
    //      CliInterpreter.parseCommandLine(args);
    //    }
    //
    //    factToExcelDemo();

  }

  private static void factDemo() {
    String filename = "/media/sysadmin/projects/Fin/demoData/amzn/amzn-20170630";
    /*            String filename =
    "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630";*/
    /*    String filename =
    "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/basic_example/abc-20101231";*/
    String[] addAdditionalSchemas = {
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/us-gaap-2016-01-31.xsd",
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/dei-2014-01-31.xsd"
    };
//    FundamentalAccountingFacts fundamentalAccountingFacts =
//        FactProcessor.build(filename, addAdditionalSchemas).getFundamentalsProcessor();
//    fundamentalAccountingFacts.process();

    //      FactProcessor.build(filename, null).process(null);
    //      FactProcessor factProcessor = FactProcessor.build(filename, null);
    //      factProcessor.process(null);
  }

  private static void factToExcelDemo() {

    String[] addAdditionalSchemas = {
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/us-gaap-2016-01-31.xsd",
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/dei-2014-01-31.xsd"
    };
    String[] filenames = {
      "/media/sysadmin/projects/Fin/demoData/amzn/amzn-20170630",
      "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630"
    };
//    FactProcessor factProcessor = FactProcessor.build();
//    FundamentalAccountingFacts fundamentalAccountingFacts;
//    for (String f : filenames) {
//      fundamentalAccountingFacts = factProcessor.processSingleRepeatable(f, addAdditionalSchemas);
//      fundamentalAccountingFacts.process();
//    }
//    factProcessor.createExcel();
  }
}
