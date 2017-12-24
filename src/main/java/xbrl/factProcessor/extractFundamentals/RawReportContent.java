package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.ResultSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class RawReportContent extends ReportContent {

    private Map<Period, Map<String, Double>> factsGroupedByPeriod;
    private List<FactElement> factElements;

  public RawReportContent() {}

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

  private void mapFactsByPeriodAndTag(List<FactElement> facts) {
    this.factElements = facts;
    this.factsGroupedByPeriod = new HashMap<>();
    for (FactElement fe : facts) {

      if (this.factsGroupedByPeriod.containsKey(fe.getPeriod())) {
        try {
          this.factsGroupedByPeriod.get(fe.getPeriod()).put(fe.getTag(), Double.parseDouble(fe.getValue()));
        } catch (NumberFormatException e) {
          e.printStackTrace();
        }
      } else {
        HashMap<String, Double> tmp = new HashMap<>();
        try {
          tmp.put(fe.getTag(), Double.parseDouble(fe.getValue()));
        } catch (NumberFormatException e) {
          e.printStackTrace();
        }
        this.factsGroupedByPeriod.put(fe.getPeriod(), tmp);
      }
    }
  }

  public List<FactElement> getFactElements() {
    return factElements;
  }

  public void setFactElements(List<FactElement> factElements) {
    this.factElements = factElements;
    mapFactsByPeriodAndTag(factElements);
  }

  public Map<Period, Map<String, Double>> getFactsGroupedByPeriod() {
    return factsGroupedByPeriod;
  }

  public void setFactsGroupedByPeriod(Map<Period, Map<String, Double>> factsGroupedByPeriod) {
    this.factsGroupedByPeriod = factsGroupedByPeriod;
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
