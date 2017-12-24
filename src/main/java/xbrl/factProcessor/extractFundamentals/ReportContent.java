package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.ResultSet;
import xbrl.factProcessor.extractFundamentals.constants.CikToTicker;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ReportContent extends AbstractReportContent{

  public ReportContent() {}

  public void addProcessedResults(ResultSet resultSet) {
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
