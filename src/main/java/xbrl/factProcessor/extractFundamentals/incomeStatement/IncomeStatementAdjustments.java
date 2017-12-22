package xbrl.factProcessor.extractFundamentals.incomeStatement;

import java.util.Map;

public class IncomeStatementAdjustments {

  public static Map<String, Double> run(Map<String, Double> values) {


    // Adjustments to income statement information
    // IS-Impute-01: NonoperatingIncomeLossPlusInterestAndDebtExpense
        values.put("NonoperatingIncomeLossPlusInterestAndDebtExpense", values.get("NonoperatingIncomeLoss") - values.get("InterestAndDebtExpense"));

    // IS-Impute-03: NetIncomeLoss
    if (values.get("NetIncomeLoss") != 0d
        && values.get("IncomeLossFromContinuingOperationsAfterTax") == 0d) {
      values.put(
          "IncomeLossFromContinuingOperationsAfterTax",
          values.get("NetIncomeLoss")
              - values.get("IncomeLossFromDiscontinuedOperationsNetOfTax")
              - values.get("ExtraordinaryItemsOfIncomeExpenseNetOfTax"));
    }

    // IS-Impute-04: Net income attributable to parent if = 0 it does not exist
    if (values.get("NetIncomeLossAttributableToParent") == 0d
        && values.get("NetIncomeLossAttributableToNoncontrollingInterest") == 0d
        && values.get("NetIncomeLoss") != 0d) {
      values.put("NetIncomeLossAttributableToParent", values.get("NetIncomeLoss"));
    }

    // IS-Impute-02: Net income available to common stockholders  (if( values.get("it does not
    // exist)
    if (values.get("NetIncomeLossAvailableToCommonStockholdersBasic") == 0d
        && values.get("PreferredStockDividendsAndOtherAdjustments") == 0d
        && values.get("NetIncomeLossAttributableToParent") != 0d) {
      values.put(
          "NetIncomeLossAvailableToCommonStockholdersBasic",
          values.get("NetIncomeLossAttributableToParent"));
    }

    // IS-Impute-05: PreferredStockDividendsAndOtherAdjustments
    if (values.get("PreferredStockDividendsAndOtherAdjustments") == 0d
        && values.get("NetIncomeLossAttributableToParent") != 0d
        && values.get("NetIncomeLossAvailableToCommonStockholdersBasic") != 0d) {
      values.put(
          "PreferredStockDividendsAndOtherAdjustments",
          values.get("NetIncomeLossAttributableToParent")
              - values.get("NetIncomeLossAvailableToCommonStockholdersBasic"));
    }

    // IS-Impute-06: comprehensive income
    if (values.get("ComprehensiveIncomeLossAttributableToParent") == 0d
        && values.get("ComprehensiveIncomeLossAttributableToNoncontrollingInterest") == 0d
        && values.get("ComprehensiveIncomeLoss") == 0d
        && values.get("OtherComprehensiveIncomeLoss") == 0d) {
      values.put("ComprehensiveIncomeLoss", values.get("NetIncomeLoss"));
    }

    // IS-Impute-07: other comprehensive income
    if (values.get("ComprehensiveIncomeLoss") != 0d
        && values.get("OtherComprehensiveIncomeLoss") == 0d) {
      values.put(
          "OtherComprehensiveIncomeLoss",
          values.get("ComprehensiveIncomeLoss") - values.get("NetIncomeLoss"));
    }

    // IS-Impute-08: comprehensive income attributable to parent if( values.get("it does not exist
    if (values.get("ComprehensiveIncomeLossAttributableToParent") == 0d
        && values.get("ComprehensiveIncomeLossAttributableToNoncontrollingInterest") == 0d
        && values.get("ComprehensiveIncomeLoss") != 0d) {
      values.put(
          "ComprehensiveIncomeLossAttributableToParent", values.get("ComprehensiveIncomeLoss"));
    }

    // IS-Impute-09: IncomeLossBeforeEquityMethodInvestments
    if (values.get("IncomeLossBeforeEquityMethodInvestments") != 0d
        && values.get("IncomeLossFromEquityMethodInvestments") != 0d
        && values.get("IncomeLossFromContinuingOperationsBeforeTax") == 0d) {
      values.put(
          "IncomeLossFromContinuingOperationsBeforeTax",
          values.get("IncomeLossBeforeEquityMethodInvestments")
              + values.get("IncomeLossFromEquityMethodInvestments"));
    }

    // IS-Impute-10: IncomeFromContinuingOperations*Before*Tax2 (if( values.get("income before tax
    // is missing)
    if (values.get("IncomeLossFromContinuingOperationsBeforeTax") == 0d
        && values.get("IncomeLossFromContinuingOperationsAfterTax") != 0d) {
      values.put(
          "IncomeLossFromContinuingOperationsBeforeTax",
          values.get("IncomeLossFromContinuingOperationsAfterTax")
              + values.get("IncomeTaxExpenseBenefit"));
    }

    // IS-Impute-11: IncomeFromContinuingOperations*After*Tax
    if (values.get("IncomeLossFromContinuingOperationsAfterTax") == 0d
            && values.get("IncomeTaxExpenseBenefit") != 0d
        || values.get("IncomeTaxExpenseBenefit") == 0d
            && values.get("IncomeLossFromContinuingOperationsBeforeTax") != 0d) {
      values.put(
          "IncomeLossFromContinuingOperationsAfterTax",
          values.get("IncomeLossFromContinuingOperationsBeforeTax")
              - values.get("IncomeTaxExpenseBenefit"));
    }

    // IS-Impute-12: GrossProfit
    if (values.get("GrossProfit") == 0d
        && values.get("Revenues") != 0d
        && values.get("CostOfRevenue") != 0d) {
      values.put("GrossProfit", values.get("Revenues") - values.get("CostOfRevenue"));
    }

    // IS-Impute-13: GrossProfit (This is a DUPLICATE)
    if (values.get("GrossProfit") == 0d
        && values.get("Revenues") != 0d
        && values.get("CostOfRevenue") != 0d) {
      values.put("GrossProfit", values.get("Revenues") - values.get("CostOfRevenue"));
    }

    // IS-Impute-14: Revenues
    if (values.get("GrossProfit") != 0d
        && values.get("Revenues") == 0d
        && values.get("CostOfRevenue") != 0d) {
      values.put("Revenues", values.get("GrossProfit") + values.get("CostOfRevenue"));
    }

    // IS-Impute-15: CostOfRevenue
    if (values.get("GrossProfit") != 0d
        && values.get("Revenues") != 0d
        && values.get("CostOfRevenue") == 0d) {
      values.put("CostOfRevenue", values.get("GrossProfit") + values.get("Revenues"));
    }

    // IS-Impute-16: CostsAndExpenses (would NEVER have costs && values.get("expenses if(
    // values.get("has gross profit, gross profit is multi-step && values.get("costs &&
    // values.get("expenses is single-step)
    if (values.get("GrossProfit") == 0d
        && values.get("CostsAndExpenses") == 0d
        && values.get("CostOfRevenue") != 0d
        && values.get("OperatingExpenses") != 0d) {
      values.put("CostsAndExpenses", values.get("CostOfRevenue") + values.get("OperatingExpenses"));
    }

    // IS-Impute-17: CostsAndExpenses based on existance of both costs of revenues &&
    // values.get("operating expenses
    if (values.get("CostsAndExpenses") == 0d
        && values.get("OperatingExpenses") != 0d
        && values.get("CostOfRevenue") != 0d) {
      values.put("CostsAndExpenses", values.get("CostOfRevenue") + values.get("OperatingExpenses"));
    }

    // IS-Impute-18: CostsAndExpenses
    if (values.get("GrossProfit") == 0d
        && values.get("CostsAndExpenses") == 0d
        && values.get("Revenues") != 0d
        && values.get("OperatingIncomeLoss") != 0d
        && values.get("OtherOperatingIncomeExpenses") != 0d) {
      values.put(
          "CostsAndExpenses",
          values.get("Revenues")
              - values.get("OperatingIncomeLoss")
              - values.get("OtherOperatingIncomeExpenses"));
    }

    // IS-Impute-19: OperatingExpenses based on existance of costs && values.get("expenses &&
    // values.get("cost of revenues
    if (values.get("CostOfRevenue") != 0d
        && values.get("CostsAndExpenses") != 0d
        && values.get("OperatingExpenses") == 0d) {
      values.put("OperatingExpenses", values.get("CostsAndExpenses") - values.get("CostOfRevenue"));
    }

    // IS-Impute-20: CostOfRevenues single-step method
    if (values.get("Revenues") != 0d
        && values.get("GrossProfit") == 0d
        && (values.get("Revenues") - values.get("CostsAndExpenses"))
            == values.get("OperatingIncomeLoss")
        && values.get("OperatingExpenses") == 0d
        && values.get("OtherOperatingIncomeExpenses") == 0d) {
      values.put("CostOfRevenue", values.get("CostsAndExpenses") - values.get("OperatingExpenses"));
    }

    // IS-Impute-21: IncomeLossBeforeEquityMethodInvestments
    if (values.get("IncomeLossBeforeEquityMethodInvestments") == 0d
        && values.get("IncomeLossFromContinuingOperationsBeforeTax") != 0d) {
      values.put(
          "IncomeLossBeforeEquityMethodInvestments",
          values.get("IncomeLossFromContinuingOperationsBeforeTax")
              - values.get("IncomeLossFromEquityMethodInvestments"));
    }

    // IS-Impute-22: InterestAndDebtExpense
    if (values.get("OperatingIncomeLoss") != 0d
        && values.get("NonoperatingIncomeLoss") != 0d
        && values.get("InterestAndDebtExpense") == 0d
        && values.get("IncomeLossBeforeEquityMethodInvestments") != 0d) {
      values.put(
          "InterestAndDebtExpense",
          values.get("IncomeLossBeforeEquityMethodInvestments")
              - values.get("OperatingIncomeLoss")
              + values.get("NonoperatingIncomeLoss"));
    }

    // IS-Impute-23: OtherOperatingIncomeExpenses
    if (values.get("GrossProfit") != 0d
        && values.get("OperatingExpenses") != 0d
        && values.get("OperatingIncomeLoss") != 0d) {
      values.put(
          "OtherOperatingIncomeExpenses",
          values.get("OperatingIncomeLoss")
              - values.get("GrossProfit")
              - values.get("OperatingExpenses"));
    }

    // IS-Impute-24: Move IncomeLossFromEquityMethodInvestments
    if (values.get("IncomeLossFromEquityMethodInvestments") != 0d
        && values.get("IncomeLossBeforeEquityMethodInvestments") != 0d
        && values
            .get("IncomeLossBeforeEquityMethodInvestments")
            .equals(values.get("IncomeLossFromContinuingOperationsBeforeTax"))) {
      values.put(
          "IncomeLossBeforeEquityMethodInvestments",
          values.get("IncomeLossFromContinuingOperationsBeforeTax")
              - values.get("IncomeLossFromEquityMethodInvestments"));
    }
    // CSH001        OperatingIncomeLoss", values.get("OperatingIncomeLoss")  -
    // values.get("IncomeLossFromEquityMethodInvestments")); }

    // IS-Impute-25: OperatingIncomeLoss
    // DANGEROUS!!  May need to turn off. IS3 had 2085 PASSES WITHOUT this imputing. if(
    // values.get("it is higher, then keep the test
    if (values.get("OperatingIncomeLoss") == 0d
        && values.get("IncomeLossBeforeEquityMethodInvestments") != 0d) {
      values.put(
          "OperatingIncomeLoss",
          values.get("IncomeLossBeforeEquityMethodInvestments")
              + values.get("NonoperatingIncomeLoss")
              - values.get("InterestAndDebtExpense"));
    }

    // IS-Impute-26:
    // NonoperatingIncomePlusInterestAndDebtExpensePlusIncomeFromEquityMethodInvestments
      values.put("NonoperatingIncomePlusInterestAndDebtExpensePlusIncomeFromEquityMethodInvestments",  values.get("IncomeLossFromContinuingOperationsBeforeTax") - values.get("OperatingIncomeLoss"));

    // IS-Impute-27: NonoperatingIncomeLossPlusInterestAndDebtExpense
    if (values.get("NonoperatingIncomeLossPlusInterestAndDebtExpense") == 0d
        && values.get(
                "NonoperatingIncomePlusInterestAndDebtExpensePlusIncomeFromEquityMethodInvestments")
            != 0d) {
      values.put(
          "NonoperatingIncomeLossPlusInterestAndDebtExpense",
          values.get(
                  "NonoperatingIncomePlusInterestAndDebtExpensePlusIncomeFromEquityMethodInvestments")
              - values.get("IncomeLossFromEquityMethodInvestments"));
    }

    return values;
  }


}
