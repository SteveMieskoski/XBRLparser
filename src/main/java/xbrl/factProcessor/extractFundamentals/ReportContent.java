package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.ResultSet;
import xbrl.factProcessor.extractFundamentals.constants.CikToTicker;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ReportContent {

  Map<String, Map<Integer, Double>> balanceSheet;
  Map<String, Map<Integer, Double>> cashFlow;
  Map<String, Map<Integer, Double>> incomeStatement;
  Map<String, Map<Integer, String>> companyDetails;
  Map<Integer, String> ticker;
  Map<Integer, Period> entityPeriod;
  Map<Integer, Integer> reportingOrder;

  public ReportContent() {}

  public void addProcessedResults(ResultSet resultSet) {
    UUID uuid = UUID.randomUUID();
    Integer cik = Integer.parseInt(resultSet.getCompanyDetails().get("EntityCentralIndexKey"));
    addAllBalanceSheet(cik, resultSet.getBalanceSheet());
    addAllCashFlow(cik, resultSet.getCashFlow());
    addAllIncomeStatement(cik, resultSet.getIncomeStatement());
    addAllCompanyDetails(cik, resultSet.getCompanyDetails());
    addTicker(cik);
    addReportingOrder(cik, this.ticker.size());
  }

  public void addProcessedResults(
      Map<String, Double> bsValues,
      Map<String, Double> cfValues,
      Map<String, Double> isValues,
      Map<String, String> entityData) {
    UUID uuid = UUID.randomUUID();
    Integer cik = Integer.parseInt(entityData.get("EntityCentralIndexKey"));
    addAllBalanceSheet(cik, bsValues);
    addAllCashFlow(cik, cfValues);
    addAllIncomeStatement(cik, isValues);
    addAllCompanyDetails(cik, entityData);
    addTicker(cik);
    addReportingOrder(cik, this.ticker.size());
  }

  public void addTicker(Integer key) {
    if (this.ticker == null) {
      this.ticker = new HashMap<>();
    }
    String value = CikToTicker.find(key.toString());
    this.ticker.put(key, value);
  }

  private void addReportingOrder(Integer key, Integer value) {
    if (this.reportingOrder == null) {
      this.reportingOrder = new HashMap<>();
    }
    this.reportingOrder.put(key, value);
  }

  private void addAllBalanceSheet(Integer key, Map<String, Double> valueMap) {
    if (this.balanceSheet == null) {
      this.balanceSheet = new HashMap<>();
    }
    addValues(this.balanceSheet, key, valueMap);
  }

  private void addAllCashFlow(Integer key, Map<String, Double> valueMap) {
    if (this.cashFlow == null) {
      this.cashFlow = new HashMap<>();
    }
    addValues(this.cashFlow, key, valueMap);
  }

  private void addAllIncomeStatement(Integer key, Map<String, Double> valueMap) {
    if (this.incomeStatement == null) {
      this.incomeStatement = new HashMap<>();
    }
    addValues(this.incomeStatement, key, valueMap);
  }

  private void addValues(
      Map<String, Map<Integer, Double>> component, Integer key, Map<String, Double> valueMap) {
    // no updates to concepts not included
    if(valueMap == null) return;
    for (String s : valueMap.keySet()) {
      if (valueMap.get(s) > 0d) {
        if (component.containsKey(s)) {
          component.get(s).put(key, valueMap.get(s));
        } else {
          HashMap<Integer, Double> tmp = new HashMap<>();
          tmp.put(key, valueMap.get(s));
          component.put(s, tmp);
        }
      }
    }
  }

  private void addAllCompanyDetails(Integer key, Map<String, String> valueMap) {
    if (this.companyDetails == null) {
      this.companyDetails = new HashMap<>();
    }
    // no updates to concepts not included
    for (String s : valueMap.keySet()) {
      if (this.companyDetails.containsKey(s)) {
        this.companyDetails.get(s).put(key, valueMap.get(s));
      } else {
        HashMap<Integer, String> tmp = new HashMap<>();
        tmp.put(key, valueMap.get(s));
        this.companyDetails.put(s, tmp);
      }
    }
  }

  public Map<Integer, String> getTicker() {
    return ticker;
  }

  public Map<Integer, Integer> getReportingOrder() {
    return reportingOrder;
  }

  public Map<String, Map<Integer, Double>> getBalanceSheet() {
    return balanceSheet;
  }

  public Map<String, Map<Integer, Double>> getCashFlow() {
    return cashFlow;
  }

  public Map<String, Map<Integer, Double>> getIncomeStatement() {
    return incomeStatement;
  }

  public Map<String, Map<Integer, String>> getCompanyDetails() {
    return companyDetails;
  }

  public Map<Integer, Period> getEntityPeriod() {
    return entityPeriod;
  }
}
