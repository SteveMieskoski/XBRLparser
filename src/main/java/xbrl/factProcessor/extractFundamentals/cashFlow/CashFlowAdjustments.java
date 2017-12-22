package xbrl.factProcessor.extractFundamentals.cashFlow;

import java.util.Map;

public class CashFlowAdjustments {

  // NOTE: copied in, but Unchecked
  public static Map<String, Double> run(Map<String, Double> values) {



    // CF-Impute-01
    if (values.get("NetCashFlowFromOperatingActivitiesDiscontinued") == 0d
        && values.get("NetCashFlowFromInvestingActivitiesDiscontinued") == 0d
        && values.get("NetCashFlowFromFinancingActivitiesDiscontinued") == 0d
        && values.get("NetCashFlowDiscontinued") == 0d) {
      values.put(
          "NetCashFlowFromOperatingActivitiesDiscontinued", values.get("NetCashFlowDiscontinued"));
    }

    // CF-Impute-02
    if (values.get("NetCashFlowFromOperatingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromOperatingActivities") == 0d) {
      values.put(
          "NetCashFlowFromOperatingActivitiesContinuing",
          values.get("NetCashFlowFromOperatingActivities")
              - values.get("NetCashFlowFromOperatingActivitiesDiscontinued"));
    }

    // CF-Impute-03
    if (values.get("NetCashFlowFromInvestingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromInvestingActivities") == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivitiesContinuing",
          values.get("NetCashFlowFromInvestingActivities")
              - values.get("NetCashFlowFromInvestingActivitiesDiscontinued"));
    }

    // CF-Impute-04
    if (values.get("NetCashFlowFromFinancingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromFinancingActivities") == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivitiesContinuing",
          values.get("NetCashFlowFromFinancingActivities")
              - values.get("NetCashFlowFromFinancingActivitiesDiscontinued"));
    }

    // CF-Impute-05
    if (values.get("NetCashFlowFromOperatingActivities") == 0d) {
      values.put(
          "NetCashFlowFromOperatingActivities",
          values.get("NetCashFlowFromOperatingActivitiesContinuing")
              + values.get("NetCashFlowFromOperatingActivitiesDiscontinued"));
    }

    // CF-Impute-06
    if (values.get("NetCashFlowFromInvestingActivities") == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivities",
          values.get("NetCashFlowFromInvestingActivitiesContinuing")
              + values.get("NetCashFlowFromInvestingActivitiesDiscontinued"));
    }

    // CF-Impute-07
    if (values.get("NetCashFlowFromFinancingActivities") == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivities",
          values.get("NetCashFlowFromFinancingActivitiesContinuing")
              + values.get("NetCashFlowFromFinancingActivitiesDiscontinued"));
    }

    // CF-Impute-08
    if (values.get("NetCashFlowDiscontinued") == 0d) {
      values.put(
          "NetCashFlowDiscontinued",
          values.get("NetCashFlowFromOperatingActivitiesDiscontinued")
              + values.get("NetCashFlowFromInvestingActivitiesDiscontinued")
              + values.get("NetCashFlowFromFinancingActivitiesDiscontinued"));
    }

    // CF-Impute-09
    if (values.get("NetCashFlowContinuing") == 0d && values.get("NetCashFlow") == 0d) {
      values.put(
          "NetCashFlowContinuing",
          values.get("NetCashFlow")
              - values.get("NetCashFlowDiscontinued")
              - values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-09B
    if (values.get("NetCashFlowContinuing") == 0d && values.get("NetCashFlow") == 0d) {
      values.put(
          "NetCashFlowContinuing",
          values.get("NetCashFlow") - values.get("NetCashFlowDiscontinued"));
    }

    // CF-Impute-10
    if (values.get("NetCashFlow") == 0d && values.get("NetCashFlowContinuing") == 0d) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowContinuing")
              + values.get("NetCashFlowDiscontinued")
              + values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-10B
    if (values.get("NetCashFlow") == 0d && values.get("NetCashFlowContinuing") == 0d) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowContinuing") + values.get("NetCashFlowDiscontinued"));
    }

    // CF-Impute-11
    if (values.get("NetCashFlowFromInvestingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromOperatingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromFinancingActivitiesContinuing") == 0d
        && values.get("NetCashFlowContinuing")
                - values.get("NetCashFlowFromOperatingActivitiesContinuing")
                + values.get("NetCashFlowFromInvestingActivitiesContinuing")
                + values.get("NetCashFlowFromFinancingActivitiesContinuing")
            == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivitiesContinuing",
          values.get("NetCashFlowContinuing")
              - values.get("NetCashFlowFromOperatingActivitiesContinuing")
              + values.get("NetCashFlowFromFinancingActivitiesContinuing"));
    }

    // CF-Impute-12
    if (values.get("NetCashFlowFromFinancingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromOperatingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromInvestingActivitiesContinuing") == 0d
        && (values.get("NetCashFlowContinuing")
                - values.get("NetCashFlowFromOperatingActivitiesContinuing")
                + values.get("NetCashFlowFromInvestingActivitiesContinuing")
                + values.get("NetCashFlowFromFinancingActivitiesContinuing"))
            == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivitiesContinuing",
          values.get("NetCashFlowContinuing")
              - values.get("NetCashFlowFromOperatingActivitiesContinuing")
              + values.get("NetCashFlowFromInvestingActivitiesContinuing"));
    }

    // CF-Impute-13
    if (values.get("NetCashFlowFromInvestingActivities") == 0d
        && values.get("NetCashFlowFromOperatingActivities") == 0d
        && values.get("NetCashFlowFromFinancingActivities") == 0d
        && (values.get("NetCashFlow")
                - values.get("NetCashFlowFromOperatingActivities")
                + values.get("NetCashFlowFromInvestingActivities")
                + values.get("NetCashFlowFromFinancingActivities")
                + values.get("ExchangeGainsLosses"))
            == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivities",
          values.get("NetCashFlow")
              - values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromFinancingActivities")
              + values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-13B
    if (values.get("NetCashFlowFromInvestingActivities") == 0d
        && values.get("NetCashFlowFromOperatingActivities") == 0d
        && values.get("NetCashFlowFromFinancingActivities") == 0d
        && (values.get("NetCashFlow")
                - values.get("NetCashFlowFromOperatingActivities")
                + values.get("NetCashFlowFromInvestingActivities")
                + values.get("NetCashFlowFromFinancingActivities"))
            == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivities",
          values.get("NetCashFlow")
              - values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromFinancingActivities"));
    }

    // CF-Impute-14
    if (values.get("NetCashFlowFromFinancingActivities") == 0d
        && values.get("NetCashFlowFromOperatingActivities") == 0d
        && values.get("NetCashFlowFromInvestingActivities") == 0d
        && (values.get("NetCashFlow")
                - values.get("NetCashFlowFromOperatingActivities")
                + values.get("NetCashFlowFromInvestingActivities")
                + values.get("NetCashFlowFromFinancingActivities")
                + values.get("ExchangeGainsLosses"))
            == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivities",
          values.get("NetCashFlow")
              - values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromInvestingActivities")
              + values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-14B
    if (values.get("NetCashFlowFromFinancingActivities") == 0d
        && values.get("NetCashFlowFromOperatingActivities") == 0d
        && values.get("NetCashFlowFromInvestingActivities") == 0d
        && (values.get("NetCashFlow")
                - values.get("NetCashFlowFromOperatingActivities")
                + values.get("NetCashFlowFromInvestingActivities")
                + values.get("NetCashFlowFromFinancingActivities"))
            == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivities",
          values.get("NetCashFlow")
              - values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromInvestingActivities"));
    }

    // CF-Impute-15
    if (values.get("NetCashFlowContinuing") == 0d) {
      values.put(
          "NetCashFlowContinuing",
          values.get("NetCashFlowFromOperatingActivitiesContinuing")
              + values.get("NetCashFlowFromInvestingActivitiesContinuing")
              + values.get("NetCashFlowFromFinancingActivitiesContinuing"));
    }

    // CF-Impute-16
    if (values.get("NetCashFlowFromOperatingActivities") == 0d
        && values.get("NetCashFlowFromOperatingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromOperatingActivitiesDiscontinued") == 0d) {
      values.put(
          "NetCashFlowFromOperatingActivities",
          values.get("NetCashFlowFromOperatingActivitiesContinuing"));
    }

    // CF-Impute-17
    if (values.get("NetCashFlowFromInvestingActivities") == 0d
        && values.get("NetCashFlowFromInvestingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromInvestingActivitiesDiscontinued") == 0d) {
      values.put(
          "NetCashFlowFromInvestingActivities",
          values.get("NetCashFlowFromInvestingActivitiesContinuing"));
    }

    // CF-Impute-18
    if (values.get("NetCashFlowFromFinancingActivities") == 0d
        && values.get("NetCashFlowFromFinancingActivitiesContinuing") == 0d
        && values.get("NetCashFlowFromFinancingActivitiesDiscontinued") == 0d) {
      values.put(
          "NetCashFlowFromFinancingActivities",
          values.get("NetCashFlowFromFinancingActivitiesContinuing"));
    }

    // CF-Impute-19
    if (values.get("NetCashFlow") == 0d
        && values.get("NetCashFlowContinuing") == 0d
        && values.get("NetCashFlowDiscontinued") == 0d
        && values.get("NetCashFlowFromOperatingActivitiesDiscontinued") == 0d
        && values.get("NetCashFlowFromInvestingActivitiesDiscontinued") == 0d
        && values.get("NetCashFlowFromFinancingActivitiesDiscontinued") == 0d
        && values.get("ExchangeGainsLosses") == 0d) {
      values.put("NetCashFlow", values.get("NetCashFlowContinuing"));
    }

    // CF-Impute-20
    if (values.get("NetCashFlow") == 0d
        && (values.get("NetCashFlowFromOperatingActivities") == 0d
            || values.get("NetCashFlowFromInvestingActivities") == 0d
            || values.get("NetCashFlowFromFinancingActivities") == 0d)) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromInvestingActivities")
              + values.get("NetCashFlowFromFinancingActivities")
              + values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-20B
    if (values.get("NetCashFlow") == 0d
        && (values.get("NetCashFlowFromOperatingActivities") == 0d
            || values.get("NetCashFlowFromInvestingActivities") == 0d
            || values.get("NetCashFlowFromFinancingActivities") == 0d)) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowFromOperatingActivities")
              + values.get("NetCashFlowFromInvestingActivities")
              + values.get("NetCashFlowFromFinancingActivities"));
    }

    // CF-Impute-21
    if (values.get("NetCashFlow") == 0d
        && values.get("NetCashFlowContinuing") == 0d
        && values.get("NetCashFlowDiscontinued") == 0d) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowContinuing")
              + values.get("NetCashFlowDiscontinued")
              + values.get("ExchangeGainsLosses"));
    }

    // CF-Impute-21B
    if (values.get("NetCashFlow") == 0d
        && values.get("NetCashFlowContinuing") == 0d
        && values.get("NetCashFlowDiscontinued") == 0d) {
      values.put(
          "NetCashFlow",
          values.get("NetCashFlowContinuing") + values.get("NetCashFlowDiscontinued"));
    }

    return values;
  }

}
