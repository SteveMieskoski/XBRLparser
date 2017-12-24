package xbrl.factProcessor.extractFundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.ResultSet;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetAdjustments;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetFundamentals;
import xbrl.factProcessor.extractFundamentals.cashFlow.CashFlowAdjustments;
import xbrl.factProcessor.extractFundamentals.cashFlow.CashFlowFundamentals;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementAdjustments;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementFundamentals;
import xbrl.factProcessor.extractFundamentals.ratios.CalculateRatios;
import xbrl.util.CommLine;

import java.lang.invoke.MethodHandles;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundamentalAccountingConcepts extends AbstractFundamentalAccountingConcepts {
  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private Map<String, String[]> mappings;
  private Period period;
  private CommLine commLine;
  private Map<String, String> details;
  private ResultSet resultSet;

  public FundamentalAccountingConcepts(
      Map<Period, Map<String, FactElement>> periodFactsByName,
      Period period,
      List<OrganizationElement> organizationElements,
      CommLine commLine) {
    //   logger.info("{}",periodFactsByName);
    this.periodFactsByName = periodFactsByName;
    this.commLine = commLine;
    this.focusPeriod = period;
    setFocusPeriod(this.focusPeriod);
    setFocusPeriodFactList(this.periodFactsByName);

    if (organizationElements != null) {
      setOrganizationElementsList(organizationElements);
    }
    resultSet = ResultSet.create(this.focusPeriod, getDetails());
  }

  public FundamentalAccountingConcepts(
      Map<Period, Map<String, FactElement>> periodFactsByName,
      Period period,
      List<OrganizationElement> organizationElements) {
    this.periodFactsByName = periodFactsByName;
    this.focusPeriod = period;

    setFocusPeriod(this.focusPeriod);
    setFocusPeriodFactList(periodFactsByName);

    if (organizationElements != null) {
      super.setOrganizationElementsList(organizationElements);
    }
    resultSet = ResultSet.create(this.focusPeriod, getDetails());
  }


  protected void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

  public void process(Map<String, String[]> mappings) {
    setMappings(mappings);
    doProcess();
  }

  public void process() {
    if (this.mappings != null) {
      doProcess();
    } else {
      setMappings(ConceptMappings.mappings);
      doProcess();
    }
  }

  public void process(String mapPreset) {
    if (mapPreset == null) mapPreset = "";
    switch (mapPreset) {
      case "experimental":
        Map<String, String[]> mappings = ConceptMappings.mappings;
        mappings.putAll(ConceptMappingsSubParAlts.mappingOther);
        setMappings(mappings);
        doProcess();
        break;
      default:
        setMappings(ConceptMappings.mappings);
        doProcess();
        break;
    }
  }

  public ResultSet processAndReturnResults() {
    if (this.mappings != null) {
      return doProcess();
    } else {
      setMappings(ConceptMappings.mappings);
      return doProcess();
    }
  }

  public ResultSet processAndReturnResults(Map<String, String[]> mappings) {
    setMappings(mappings);
    return doProcess();
  }

  public ResultSet processAndReturnResults(String mapPreset) {
    if (mapPreset == null) mapPreset = "";
    switch (mapPreset) {
      case "experimental":
        Map<String, String[]> mappings = ConceptMappings.mappings;
        mappings.putAll(ConceptMappingsSubParAlts.mappingOther);
        setMappings(mappings);
        return doProcess();
      default:
        setMappings(ConceptMappings.mappings);
        return doProcess();
    }
  }

  private ResultSet doProcess() {
    Map<String, Double> fundamentals = new HashMap<>();

    fundamentals = processBalanceSheet(fundamentals);
    fundamentals = processCashFlow(fundamentals);
    fundamentals = processIncomeStatement(fundamentals);

    logger.info("{}", "----------- Calculable Ratios  -------------");
    Map<String, Boolean> canCalculate = CalculateRatios.determineComputableRatios(fundamentals);
    logger.info("Calculable Ratios Check Results: ");
    for (String s : canCalculate.keySet()) {
           logger.info("{}",s + ": " + canCalculate.get(s));
    }

    if (this.resultSet != null && this.commLine != null) {
      if (this.resultSet.getTicker() == null && getMisc("customPrefix") != null) {
        this.resultSet.setTicker((String) getMisc("customPrefix"));
      }
      this.commLine.transmitResults(this.resultSet);
      return null;
    } else if (this.commLine == null) {
      return this.resultSet;
    }
    return null;
  }

  private Map<String, Double> processBalanceSheet(Map<String, Double> fundamentals) {
    Map<String, Double> bsValues = extractBalanceSheetConcepts(this.mappings);
    if (bsValues == null) return fundamentals;
    ;
    this.resultSet.setBalanceSheet(bsValues);
    // todo: convert to a stream collect operation
    for (String s : bsValues.keySet()) {
      if (bsValues.get(s) != 0d) {
        fundamentals.put(s, bsValues.get(s));
      }
    }
    return fundamentals;
  }

  private Map<String, Double> processCashFlow(Map<String, Double> fundamentals) {
    Map<String, Double> cfValues = extractCashFlowConcepts(this.mappings);
    if (cfValues == null) return fundamentals;
    this.resultSet.setCashFlow(cfValues);
    // todo: convert to a stream collect operation
    for (String s : cfValues.keySet()) {
      if (cfValues.get(s) != 0d) {
        fundamentals.put(s, cfValues.get(s));
      }
    }
    return fundamentals;
  }

  private Map<String, Double> processIncomeStatement(Map<String, Double> fundamentals) {
    Map<String, Double> isValues = extractIncomeStatementConcepts(this.mappings);
    if (isValues == null) return fundamentals;
    this.resultSet.setIncomeStatement(isValues);
    // todo: convert to a stream collect operation
    for (String s : isValues.keySet()) {
      if (isValues.get(s) != 0d) {
        fundamentals.put(s, isValues.get(s));
      }
    }
    return fundamentals;
  }

  public Map<String, Double> extractBalanceSheetConcepts() {
    Map<String, Double> fundamentals;

    fundamentals =
        BalanceSheetFundamentals.build()
            .extractDataPoints(super.getInstantOrDurationFacts("instant"));

    logger.info("{}", "----------- Balance Sheet -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractBalanceSheetConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        BalanceSheetFundamentals.build(mapping)
            .extractDataPoints(super.getInstantOrDurationFacts("instant"));

    logger.info("{}", "----------- Balance Sheet -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractCashFlowConcepts() {
    Map<String, Double> fundamentals;

    fundamentals =
        CashFlowFundamentals.build().extractDataPoints(super.getInstantOrDurationFacts("duration"));

    logger.info("{}", "----------- Cash Flow -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractCashFlowConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        CashFlowFundamentals.build(mapping)
            .extractDataPoints(super.getInstantOrDurationFacts("duration"));

    logger.info("{}", "----------- Cash Flow -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractIncomeStatementConcepts() {
    Map<String, Double> fundamentals;

    fundamentals =
        IncomeStatementFundamentals.build()
            .extractDataPoints(super.getInstantOrDurationFacts("duration"));

    logger.info("{}", "---------- Income Statement --------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  public Map<String, Double> extractIncomeStatementConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        IncomeStatementFundamentals.build(mapping)
            .extractDataPoints(super.getInstantOrDurationFacts("duration"));

    logger.info("{}", "---------- Income Statement --------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  @Override
  public String toString() {
    return "FundamentalAccountingConcepts{"
        + "factByName="
        + factByName
        + "details= "
        + details
        + ", focusPeriod="
        + focusPeriod
        + ", focusInstant="
        + focusInstant
        + ", mappings="
        + mappings
        + '}';
  }
}
