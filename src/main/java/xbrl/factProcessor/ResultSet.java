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
          Map<String, String> details) {
    this.period = period;
    setCompanyDetails(details);

  }

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
    setCompanyDetails(details);
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

  public static ResultSet create(
          Period period,
          Map<String, String> details) {
    return new ResultSet(period, details);
  }

  public Map<String, String> getCompanyDetails() {
    return companyDetails;
  }

  public void setCompanyDetails(Map<String, String> companyDetails) {
    if(companyDetails != null){
      for(String s: companyDetails.keySet()){
        System.out.println(companyDetails.get(s));
        switch (s){
          case "EntityCentralIndexKey":
            setCik(companyDetails.get(s));
            break;
          case "EntityRegistrantName":
            setName(companyDetails.get(s));
            break;
          case "FiscalPeriodFocus":
            setPeriodFocus(companyDetails.get(s));
            break;
          case "TradingSymbol":
            setTicker(companyDetails.get(s));
            break;

        }
      }
    }
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
