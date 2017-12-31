package xbrl.factProcessor.extractFundamentals.ratios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CalculateRatios {
  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public static Map<String, Double> calculateRatios(
      Map<String, Boolean> canCalculate, Map<String, Double> values) {
    Map<String, Double> calculated = new HashMap<>();
    if (canCalculate.get("ROE")) {
      calculated.put("ROE", ROE(values));
    }
    ;
    if (canCalculate.get("ROA")) {
      calculated.put("ROA", ROA(values));
    }
    ;
    if (canCalculate.get("CurrentRatio")) {
      DecimalFormat df = new DecimalFormat("#.####");
      df.setRoundingMode(RoundingMode.DOWN);
      calculated.put("CurrentRatio", new Double(df.format(CurrentRatio(values))));
    }
    ;
//    if (canCalculate.get("EfficiencyRatio")) {
//      calculated.put("EfficiencyRatio", EfficiencyRatio(values));
//    }
    ;
    if (canCalculate.get("WorkingCapitalToSales")) {
      calculated.put("WorkingCapitalToSales", WorkingCapitalToSales(values));
    }
    ;
    if (canCalculate.get("CashRatio")) {
      DecimalFormat df = new DecimalFormat("#.####");
      df.setRoundingMode(RoundingMode.DOWN);
      calculated.put("CashRatio", new Double(df.format(CashRatio(values))));
    }
    ;
    //        if(canCalculate.get("AssetTurnover")){
    //            calculated.put("AssetTurnover", AssetTurnover(values));
    //        };
    if (canCalculate.get("DebtRatio")) {
      calculated.put("DebtRatio", DebtRatio(values));
    }
    ;
    if (canCalculate.get("SGR")) {
      calculated.put("SGR", SGR(values));
    }
    ;
    if (canCalculate.get("ROS")) {
      calculated.put("ROS", ROS(values));
    }
    ;
    if (canCalculate.get("OperatingProfit")) {
      calculated.put("OperatingProfit", OperatingProfit(values));
    }
    ;
//    if (canCalculate.get("NetProfitMargin")) {
//      calculated.put("NetProfitMargin", NetProfitMargin(values));
//    }
    return calculated;
  }

  public static Double ROE(Map<String, Double> values) {
    return values.get("NetIncomeLoss") / values.get("Equity");
  }

  public static Double ROA(Map<String, Double> values) {
    return values.get("NetIncomeLoss") / values.get("Assets");
  }

  public static Double ROS(Map<String, Double> values) {
    return values.get("NetIncomeLoss") / values.get("Revenues");
  }

  public static Double SGR(Map<String, Double> values) {
    return ((values.get("NetIncomeLoss") / values.get("Revenues"))
            * (1 + ((values.get("Assets") - values.get("Equity")) / values.get("Equity"))))
        / ((1 / (values.get("Revenues") / values.get("Assets")))
            - (((values.get("NetIncomeLoss") / values.get("Revenues"))
                * (1 + (((values.get("Assets") - values.get("Equity")) / values.get("Equity")))))));
  }

  public static Double OperatingProfit(Map<String, Double> values) {
    return values.get("Revenues") - (values.get("CostOfRevenue") + values.get("OperatingExpenses"));
  }

  public static Double CurrentRatio(Map<String, Double> values) {
    return values.get("CurrentAssets") / values.get("CurrentLiabilities");
  }

  public static Double WorkingCapitalToSales(Map<String, Double> values) {
    return (values.get("CurrentAssets") - values.get("CurrentLiabilities")) / values.get("Revenues");
  }

//  public static Double EfficiencyRatio(Map<String, Double> values) {
//    return values.get("NetIncomeLoss") / values.get("Equity");
//  }

  public static Double CashRatio(Map<String, Double> values) {
    return values.get("Cash") / values.get("CurrentLiabilities");
  }

  public static Double DebtRatio(Map<String, Double> values) {
    return values.get("Liabilities") / values.get("Assets");
  }

//  public static Double NetProfitMargin(Map<String, Double> values) {
//    return values.get("NetIncomeLoss") / values.get("Equity");
//  }
}
