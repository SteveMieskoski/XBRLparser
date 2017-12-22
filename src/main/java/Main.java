import xbrl.factProcessor.FactProcessor;
import xbrl.factProcessor.FundamentalAccountingFacts;

public class Main {

  public static void main(String[] args) {

    factToExcelDemo();

  }


  private static void factDemo(){
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

  private static void factToExcelDemo(){

    String[] filenames = {"/media/sysadmin/projects/Fin/demoData/amzn/amzn-20170630", "/media/sysadmin/projects/Fin/xbrl-parsers_scraps/XBRLparser/demo_data/0001558370-17-006547-xbrl/ktyb-20170630"};
    FactProcessor factProcessor = FactProcessor.build();
    FundamentalAccountingFacts fundamentalAccountingFacts;
    for(String f: filenames){
      fundamentalAccountingFacts = factProcessor.processAdditional(f, null);
      fundamentalAccountingFacts.process();
    }
    factProcessor.createExcel();
  }


}
