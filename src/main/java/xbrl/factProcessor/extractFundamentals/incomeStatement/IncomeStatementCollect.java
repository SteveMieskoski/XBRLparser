package xbrl.factProcessor.extractFundamentals.incomeStatement;

import xbrl.elementTypes.FactElement;

import java.util.HashMap;
import java.util.Map;

public class IncomeStatementCollect {

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


    values.put("CostOfRevenue", 0d);
    values.put("CostOfRevenueGoods", 0d);
    values.put("CostOfRevenueServices", 0d);
    values.put("CostsAndExpenses", 0d);
    values.put("ExtraordinaryItemsOfIncomeExpenseNetOfTax", 0d);
    values.put("GrossProfit", 0d);
    values.put("IncomeLossBeforeEquityMethodInvestments", 0d);
    values.put("IncomeLossFromContinuingOperationsAfterTax", 0d);
    values.put("IncomeLossFromContinuingOperationsBeforeTax", 0d);
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTax", 0d);
    values.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal", 0d);
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut", 0d);
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTaxGainLossOnDisposal", 0d);
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal", 0d);
    values.put("IncomeLossFromEquityMethodInvestments", 0d);
    values.put("IncomeTaxExpenseBenefit", 0d);
    values.put("IncomeTaxExpenseBenefitCurrent", 0d);
    values.put("IncomeTaxExpenseBenefitDeferred", 0d);
    values.put("InterestAndDebtExpense", 0d);
    values.put("InterestAndDividendIncomeOperating", 0d);
    values.put("InterestExpenseOperating", 0d);
    values.put("NetIncomeLoss", 0d);
    values.put("NetIncomeLossAttributableToNoncontrollingInterest", 0d);
    values.put("NetIncomeLossAttributableToNonredeemableNoncontrollingInterest", 0d);
    values.put("NetIncomeLossAttributableToParent", 0d);
    values.put("NetIncomeLossAttributableToRedeemableNoncontrollingInterest", 0d);
    values.put("NetIncomeLossAvailableToCommonStockholdersBasic", 0d);
    values.put("NonoperatingIncomeLoss", 0d);
    values.put("OperatingExpenses", 0d);
    values.put("OperatingIncomeLoss", 0d);
    values.put("PreferredStockDividendsAndOtherAdjustments", 0d);
    values.put("Revenues", 0d);

    values.put("ComprehensiveIncomeLossAttributableToNoncontrollingInterest", 0d);
    values.put("ComprehensiveIncomeLoss", 0d);
    values.put("OtherComprehensiveIncomeLoss", 0d);
    values.put("ComprehensiveIncomeLossAttributableToParent", 0d);

    int countall = 0;
    int countused = 0;
    for(String s: values.keySet()){
      ++countall;
      if(mappings.get(s) != null){
        ++countused;
        values = doCheck(factByName, mappings.get(s), s, values);
      } else {
        System.out.println("Income Statement Missing: " + s);
      }
    }
    System.out.println(countall);
    System.out.println(countused);

    // =============

    return values;
  }



}
