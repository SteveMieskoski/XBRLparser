package xbrl.factProcessor.extractFundamentals.cashFlow;

import xbrl.elementTypes.FactElement;

import java.util.HashMap;
import java.util.Map;

public class CashFlowCollect {

  public Map<String, Double> concepts = new HashMap<>();


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

  public static Map<String, Double> findAndExtractValues(Map<String, FactElement> factByName, Map<String, String[]> mappings) {
    Map<String, Double> values = new HashMap<>();

    values.put("NetCashFlow", 0d);
    values.put("NetCashFlowFromOperatingActivities", 0d);
    values.put("NetCashFlowFromInvestingActivities", 0d);
    values.put("NetCashFlowFromFinancingActivities", 0d);
    values.put("NetCashFlowFromOperatingActivitiesContinuing", 0d);
    values.put("NetCashFlowFromInvestingActivitiesContinuing", 0d);
    values.put("NetCashFlowFromFinancingActivitiesContinuing", 0d);
    values.put("NetCashFlowFromOperatingActivitiesDiscontinued", 0d);
    values.put("NetCashFlowFromInvestingActivitiesDiscontinued", 0d);
    values.put("NetCashFlowFromFinancingActivitiesDiscontinued", 0d);
    values.put("NetCashFlowContinuing", 0d);
    values.put("NetCashFlowDiscontinued", 0d);
    values.put("ExchangeGainsLosses", 0d);


    int countall = 0;
    int countused = 0;
    for(String s: values.keySet()){
      ++countall;
      if(mappings.get(s) != null){
        ++countused;
        values = doCheck(factByName, mappings.get(s), s, values);
      } else {
        System.out.println("Cash Flow Missing: " + s);
      }
    }
    System.out.println(countall);
    System.out.println(countused);

    return values;
  }


}
