package xbrl.factProcessor.extractFundamentals.balanceSheet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class BalanceSheetCollect {
  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  public static Map<String, Double> doCheck(
          Map<String, FactElement> factByName,
          String[] check,
          String add,
          Map<String, Double> values) {
    if(factByName == null) return null;
    for (String s : check) {
      if (factByName.get(s) != null) {
        String value = factByName.get(s).getValue();
        if(value != null && !value.isEmpty()) {
          values.put(add, Double.parseDouble(factByName.get(s).getValue()));
          return values;
        }
      }
    }
    values.put(add, 0d);
    return values;
  }

  public static Map<String, Double> findAndExtractValues(
      Map<String, FactElement> factByName, Map<String, String[]> mappings) {
    Map<String, Double> values = new HashMap<>();


    values.put("Assets", 0d);
    values.put("CommitmentsAndContingencies", 0d);
    values.put("CurrentAssets", 0d);
    values.put("CurrentLiabilities", 0d);
    values.put("Equity", 0d);
    values.put("EquityAttributableToNoncontrollingInterest", 0d);
    values.put("EquityAttributableToParent", 0d);
    values.put("Liabilities", 0d);
    values.put("LiabilitiesAndEquity", 0d);
    values.put("NoncurrentAssets", 0d);
    values.put("RedeemableNoncontrollingInterest", 0d);
    values.put("RedeemableNoncontrollingInterestCommon", 0d);
    values.put("RedeemableNoncontrollingInterestOther", 0d);
    values.put("TemporaryEquity", 0d);
    values.put("TemporaryEquityAttributableToParent", 0d);
    values.put("OtherThanFixedNoncurrentAssets", 0d);
    values.put("FixedAssets", 0d);
    values.put("NoncurrentLiabilities", 0d);
    values.put("RedeemableNoncontrollingInterestPreferred", 0d);
    //---------- Extended -------------
    values.put("Cash", 0d);
    //==================

    int countall = 0;
    int countused = 0;
    for(String s: values.keySet()){
      ++countall;
      if(mappings.get(s) != null){
        ++countused;
        values = doCheck(factByName, mappings.get(s), s, values);
      } else {
       logger.info("{}","Balance Sheet Missing: " + s);
      }
    }
   logger.info("{}",countall);
   logger.info("{}",countused);

    //===========
    return values;
  }


}
