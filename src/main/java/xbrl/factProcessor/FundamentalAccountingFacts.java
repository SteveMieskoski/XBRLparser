package xbrl.factProcessor;

import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.extractFundamentals.*;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetFundamentals;
import xbrl.factProcessor.extractFundamentals.cashFlow.CashFlowFundamentals;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementFundamentals;
import xbrl.factProcessor.extractFundamentals.ratios.CalculateRatios;
import xbrl.util.CommLine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundamentalAccountingFacts {

  private FundamentalAccountingConcepts accountingConcepts;
  private Period period;
  private CommLine commLine;
  private Map<String, String> details;

  FundamentalAccountingFacts(
      CommLine commLine,
      Period period,
      FundamentalAccountingConcepts accountingConcepts,
      List<OrganizationElement> organizationElements) {
    this.commLine = commLine;
    this.accountingConcepts = accountingConcepts;
    this.period = period;
    if (organizationElements != null) {
      accountingConcepts.setOrganizationElementsList(organizationElements);
    }
  }

  public void process() {
    Map<String, Double> bsValues = extractBalanceSheetConcepts();
    Map<String, Double> cfValues = extractCashFlowConcepts();
    Map<String, Double> isValues = extractIncomeStatementConcepts();
    // todo: convert to a stream collect operation
    //    fundamentals.putAll(bsValues);
    Map<String, Double> fundamentals = new HashMap<>();
    for (String s : bsValues.keySet()) {
      if (bsValues.get(s) != 0d) {
        fundamentals.put(s, bsValues.get(s));
      }
    }
    for (String s : cfValues.keySet()) {
      if (cfValues.get(s) != 0d) {
        fundamentals.put(s, cfValues.get(s));
      }
    }

    for (String s : isValues.keySet()) {
      if (isValues.get(s) != 0d) {
        fundamentals.put(s, isValues.get(s));
      }
    }

    System.out.println("----------- Calculable Ratios  -------------");
    Map<String, Boolean> canCalculate = CalculateRatios.determineComputableRatios(fundamentals);
    for (String s : canCalculate.keySet()) {
      System.out.println(s + ": " + canCalculate.get(s));
    }


    ResultSet rs = ResultSet.create(
            this.period, this.accountingConcepts.getDetails(), bsValues, cfValues, isValues);
    if(rs.getTicker() == null && this.accountingConcepts.getMisc("customPrefix") != null){
      rs.setTicker((String) this.accountingConcepts.getMisc("customPrefix"));
    }
    this.commLine.transmitResults(rs);
  }

  public Map<String, Double> extractBalanceSheetConcepts() {
    BalanceSheetFundamentals balanceSheetFundamentals = BalanceSheetFundamentals.build();
    Map<String, Double> fundamentals =
        balanceSheetFundamentals.extractDataPoints(accountingConcepts.getInstantFactMap());
    System.out.println("----------- Balance Sheet -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractBalanceSheetConcepts(Map<String, String[]> mapping) {
    BalanceSheetFundamentals balanceSheetFundamentals = BalanceSheetFundamentals.build(mapping);
    Map<String, Double> fundamentals =
        balanceSheetFundamentals.extractDataPoints(accountingConcepts.getInstantFactMap());
    System.out.println("----------- Balance Sheet -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractCashFlowConcepts() {
    CashFlowFundamentals cashFlowFundamentals = CashFlowFundamentals.build();
    Map<String, Double> fundamentals =
        cashFlowFundamentals.extractDataPoints(accountingConcepts.getPeriodFactMap());
    System.out.println("----------- Cash Flow -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractCashFlowConcepts(Map<String, String[]> mapping) {
    CashFlowFundamentals cashFlowFundamentals = CashFlowFundamentals.build(mapping);
    Map<String, Double> fundamentals =
        cashFlowFundamentals.extractDataPoints(accountingConcepts.getPeriodFactMap());
    System.out.println("----------- Cash Flow -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractIncomeStatementConcepts() {
    IncomeStatementFundamentals incomeStatementFundamentals = IncomeStatementFundamentals.build();
    Map<String, Double> fundamentals =
        incomeStatementFundamentals.extractDataPoints(accountingConcepts.getPeriodFactMap());
    System.out.println("---------- Income Statement --------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractIncomeStatementConcepts(Map<String, String[]> mapping) {
    IncomeStatementFundamentals incomeStatementFundamentals =
        IncomeStatementFundamentals.build(mapping);
    Map<String, Double> fundamentals =
        incomeStatementFundamentals.extractDataPoints(accountingConcepts.getPeriodFactMap());
    System.out.println("---------- Income Statement --------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  private void printFundamentals(Map<String, Double> fundamentals) {
    System.out.println("=================================");
    for (String s : fundamentals.keySet()) {

      if (!fundamentals.get(s).equals(0d)) {
        System.out.println(s + ": " + fundamentals.get(s));
      }
      //      System.out.println(fundamentals.get(s));
    }
  }
}
