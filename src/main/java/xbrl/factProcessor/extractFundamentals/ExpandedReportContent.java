package xbrl.factProcessor.extractFundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.ResultSet;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ExpandedReportContent extends ReportContent {
  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private Map<Period, Map<String, Double>> factsGroupedByPeriod;

  public ExpandedReportContent() {}

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


  protected void mapFactsByPeriodAndTag(List<FactElement> facts) {
    factsGroupedByPeriod = new HashMap<>();
    for (FactElement fe : facts) {

      if (factsGroupedByPeriod.containsKey(fe.getPeriod())) {
        try {
          factsGroupedByPeriod.get(fe.getPeriod()).put(fe.getTag(), Double.parseDouble(fe.getValue()));
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
        factsGroupedByPeriod.put(fe.getPeriod(), tmp);
      }
    }
  }

  public Map<Period, Map<String, Double>> getFactsGroupedByPeriod() {
    return factsGroupedByPeriod;
  }

  public void setFactsGroupedByPeriod(List<FactElement> facts) {
    mapFactsByPeriodAndTag(facts);
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
