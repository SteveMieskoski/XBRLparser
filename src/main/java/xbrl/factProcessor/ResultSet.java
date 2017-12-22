package xbrl.factProcessor;

import xbrl.elementTypes.subTypes.Period;

import java.util.Map;

public class ResultSet {

  Period period;
  String ticker;
  String cik;
  String periodFocus;
  String name;
  Map<String, String> companyDetails;
  Map<String, Double> balanceSheet;
  Map<String, Double> cashFlow;
  Map<String, Double> incomeStatement;

  public ResultSet(
      Period period,
      Map<String, Double> balanceSheet,
      Map<String, Double> cashFlow,
      Map<String, Double> incomeStatement) {
    this.period = period;
    this.balanceSheet = balanceSheet;
    this.cashFlow = cashFlow;
    this.incomeStatement = incomeStatement;
  }

  public ResultSet(
      Period period,
      Map<String, String> details,
      Map<String, Double> balanceSheet,
      Map<String, Double> cashFlow,
      Map<String, Double> incomeStatement) {
    this.period = period;
    this.balanceSheet = balanceSheet;
    this.cashFlow = cashFlow;
    this.incomeStatement = incomeStatement;
    if(details != null){
      this.companyDetails = details;
        for(String s: details.keySet()){
            System.out.println(details.get(s));
            switch (s){
                case "EntityCentralIndexKey":
                    setCik(details.get(s));
                    break;
                case "EntityRegistrantName":
                    setName(details.get(s));
                    break;
                case "FiscalPeriodFocus":
                    setPeriodFocus(details.get(s));
                    break;
                case "TradingSymbol":
                    setTicker(details.get(s));
                    break;

            }
        }
    }

  }

  public static ResultSet create(
      Period period,
      Map<String, Double> balanceSheet,
      Map<String, Double> cashFlow,
      Map<String, Double> incomeStatement) {
    return new ResultSet(period, balanceSheet, cashFlow, incomeStatement);
  }

    public static ResultSet create(
            Period period,
            Map<String, String> details,
            Map<String, Double> balanceSheet,
            Map<String, Double> cashFlow,
            Map<String, Double> incomeStatement) {
        return new ResultSet(period, details, balanceSheet, cashFlow, incomeStatement);
    }

  public Map<String, String> getCompanyDetails() {
    return companyDetails;
  }

  public void setCompanyDetails(Map<String, String> companyDetails) {
    this.companyDetails = companyDetails;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public String getPeriodFocus() {
    return periodFocus;
  }

  public void setPeriodFocus(String periodFocus) {
    this.periodFocus = periodFocus;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, Double> getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(Map<String, Double> balanceSheet) {
    this.balanceSheet = balanceSheet;
  }

  public Map<String, Double> getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(Map<String, Double> cashFlow) {
    this.cashFlow = cashFlow;
  }

  public Map<String, Double> getIncomeStatement() {
    return incomeStatement;
  }

  public void setIncomeStatement(Map<String, Double> incomeStatement) {
    this.incomeStatement = incomeStatement;
  }

    @Override
    public String toString() {
        return "ResultSet{" +
//                "period=" + period +
                ", ticker='" + ticker + '\'' +
                ", cik='" + cik + '\'' +
                ", periodFocus='" + periodFocus + '\'' +
                ", name='" + name + '\'' +
//                ", balanceSheet=" + balanceSheet +
//                ", cashFlow=" + cashFlow +
//                ", incomeStatement=" + incomeStatement +
                '}';
    }
}
