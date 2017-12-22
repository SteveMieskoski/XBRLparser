package xbrl.factProcessor.extractFundamentals.balanceSheet;

import java.util.Map;

public class BalanceSheetAdjustments {

  public static Map<String, Double> run(Map<String, Double> values) {

    //	BS-Impute-01
    if (values.get("Assets") == 0d
        && values.get("NoncurrentAssets") == 0d
        && !values.get("Assets").equals(values.get("LiabilitiesAndEquity"))
        && values.get("CurrentAssets").equals(values.get("LiabilitiesAndEquity"))) {
      values.put("Assets", values.get("CurrentAssets"));
    }

    // BS-Impute-02
    if (values.get("Assets") == 0d
        && values.get("LiabilitiesAndEquity") != 0d
        && values.get("CurrentAssets").equals(values.get("LiabilitiesAndEquity"))) {
      values.put("Assets", values.get("CurrentAssets"));
    }

    // BS-Impute-03
    if (values.get("Assets") == 0d
        && values.get("NoncurrentAssets") == 0d
        && values.get("LiabilitiesAndEquity") != 0d
        && values
            .get("LiabilitiesAndEquity")
            .equals(values.get("Liabilities") + values.get("Equity"))) {
      values.put("Assets", values.get("CurrentAssets"));
    }

    // BS-Impute-04
      if (values.get("Assets") != 0d
              && values.get("NoncurrentAssets") == 0d
              && values.get("CurrentAssets") != 0d) {
          values.put("NoncurrentAssets", values.get("Assets") - values.get("CurrentAssets"));
      }

    // BS-Impute-05
      if (values.get("LiabilitiesAndEquity") == 0d && values.get("Assets") != 0d) {
          values.put("LiabilitiesAndEquity", values.get("Assets"));
      }

    // BS-Impute-06
      if (values.get("Equity") == 0d
              && values.get("EquityAttributableToNoncontrollingInterest") != 0d
              && values.get("EquityAttributableToParent") != 0d) {
          values.put(
                  "Equity",
                  values.get("EquityAttributableToNoncontrollingInterest")
                          + values.get("EquityAttributableToParent"));
      }

    // BS-Impute-07
      if (values.get("Equity") == 0d
              && values.get("EquityAttributableToNoncontrollingInterest") == 0d
              && values.get("EquityAttributableToParent") != 0d) {
          values.put("Equity", values.get("EquityAttributableToParent"));
      }

    // BS-Impute-08
      if (values.get("Equity") == 0d) {
          values.put("Equity", values.get("EquityAttributableToParent") + values.get("EquityAttributableToNoncontrollingInterest"));
      }

    // BS-Impute-09
      if (values.get("EquityAttributableToNoncontrollingInterest") != 0d
              && values.get("EquityAttributableToParent") == 0d
              && values.get("Equity") != 0d) {
          values.put(
                  "EquityAttributableToParent",
                  values.get("EquityAttributableToNoncontrollingInterest")
                          + values.get("Equity"));
      }

    // BS-Impute-10
      if (values.get("Equity") != 0d
              && values.get("EquityAttributableToNoncontrollingInterest") == 0d
              && values.get("EquityAttributableToParent") == 0d) {
          values.put("EquityAttributableToParent", values.get("Equity"));
      }

    // BS-Impute-11
      if (values.get("Liabilities") == 0d
              && (values.get("CurrentLiabilities") == 0d
              || values.get("NoncurrentLiabilities") == 0d)
              && values.get("Equity") != 0d
              && values.get("LiabilitiesAndEquity") != 0d
              && values.get("TemporaryEquity") != 0d) {
          values.put("Liabilities",
                  values.get("LiabilitiesAndEquity")
          - (values.get("CommitmentsAndContingencies")
          + values.get("TemporaryEquity")
          + values.get("Equity"))
          );
      }

    // BS-Impute-12
      if (values.get("Liabilities") != 0d
              && values.get("CurrentLiabilities") != 0d
              && values.get("NoncurrentLiabilities") == 0d) {
          System.out.println("");
          values.put(
                  "NoncurrentLiabilities", values.get("Liabilities") - values.get("CurrentLiabilities"));
      }

    // BS-Impute-13
      if (values.get("Liabilities") == 0d
              && (values.get("CurrentLiabilities") != 0d
              || values.get("NoncurrentLiabilities") == 0d)
              && values.get("Equity") != 0d
              && values.get("LiabilitiesAndEquity") != 0d
              && values.get("TemporaryEquity") != 0d) {
          values.put("Liabilities",
                  values.get("CurrentLiabilities")
          );
      }

    // BS-Impute-14
      if (values.get("Liabilities") == 0d
              && (values.get("CurrentLiabilities") != 0d
              || values.get("NoncurrentLiabilities") != 0d)
              && values.get("Equity") != 0d
              && values.get("LiabilitiesAndEquity") != 0d
              && values.get("TemporaryEquity") != 0d) {
          values.put("Liabilities",
                  values.get("CurrentLiabilities")
                  + values.get("NoncurrentLiabilities")
          );
      }

    // BS-Impute-15
      if (values.get("EquityAttributableToParent") != 0d
              && values.get("Equity") != 0d
              && values.get("EquityAttributableToNoncontrollingInterest") != 0d
              && values.get("EquityAttributableToParent").equals(values.get("Equity"))) {
          values.put(
                  "EquityAttributableToParent",
                  values.get("Equity")
                          - values.get("EquityAttributableToNoncontrollingInterest"));
      }

    // BS-Impute-16
      if (values.get("Liabilities") != 0d
              && values.get("CurrentLiabilities") == 0d
              && values.get("NoncurrentLiabilities") == 0d) {
          values.put("CurrentLiabilities",
                  values.get("Liabilities")
          );
      }

    // BS-Impute-17
      if (values.get("Equity") != 0d
              && values.get("EquityAttributableToNoncontrollingInterest") == 0d
              && values.get("EquityAttributableToParent") != 0d) {
          values.put(
                  "EquityAttributableToNoncontrollingInterest",
                  values.get("Equity") - values.get("EquityAttributableToParent"));
      }

    // BS-Impute-18
      if (values.get("Assets") != 0d
              && values.get("CurrentAssets") == 0d
              && values.get("LiabilitiesAndEquity") != 0d
              && values
              .get("LiabilitiesAndEquity")
              .equals(values.get("Equity"))) {
          values.put("CurrentAssets", values.get("Assets"));
      }

    // BS-Impute-56
      if (values.get("NoncurrentLiabilities") == 0d
              && values.get("CurrentLiabilities") != 0d
              && values.get("Liabilities") != 0d) {
          values.put("NoncurrentLiabilities", values.get("Liabilities") - values.get("CurrentLiabilities"));
      }

    // BS-Impute-91
      if (values.get("RedeemableNoncontrollingInterest") == 0d) {
          values.put(
                  "RedeemableNoncontrollingInterest",
                  values.get("RedeemableNoncontrollingInterestCommon")
                          + values.get("RedeemableNoncontrollingInterestPreferred")
                          + values.get("RedeemableNoncontrollingInterestOther"));
      }

    // BS-Impute-92
      if (values.get("TemporaryEquity") == 0d) {
          values.put(
                  "TemporaryEquity",
                  values.get("TemporaryEquityAttributableToParent") + values.get("RedeemableNoncontrollingInterest"));
      }
    // BS-Impute-94
      if (values.get("OtherThanFixedNoncurrentAssets") == 0d
              && values.get("Assets") != 0d
              && values.get("CurrentAssets") != 0d
              && values.get("FixedAssets") != 0d) {
          values.put("OtherThanFixedNoncurrentAssets", values.get("Assets") - values.get("CurrentAssets") - values.get("FixedAssets"));
      }


    return values;
  }

}
