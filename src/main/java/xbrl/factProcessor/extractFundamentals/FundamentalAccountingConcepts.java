package xbrl.factProcessor.extractFundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.ResultSet;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetFundamentals;
import xbrl.factProcessor.extractFundamentals.cashFlow.CashFlowFundamentals;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.entityInformation.CompanyDetailsCollect;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementFundamentals;
import xbrl.factProcessor.extractFundamentals.ratios.CalculateRatios;
import xbrl.factProcessor.extractFundamentals.ratios.ComputableRatiosCheck;
import xbrl.util.CommLine;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundamentalAccountingConcepts {
  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  protected Map<String, List<FactElement>> factByName;
  protected Map<String, FactElement> periodFactMap;
  protected Map<String, FactElement> instantFactMap;
  protected List<OrganizationElement> organizationElements;
  protected Period focusPeriod;
  protected Period focusInstant;
  protected Map<Period, Map<String, FactElement>> periodFactsByName;
  protected Map<String, Object> misc;
  
  
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
      setOrganizationElementsList(organizationElements);
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

  public void setOrganizationElementsList(List<OrganizationElement> organizationElements) {
    this.organizationElements = organizationElements;
    details = CompanyDetailsCollect.findAndExtractValues(organizationElements);
  }

  void setFocusPeriod(Period focusPeriod) {
    this.focusPeriod = focusPeriod;
    this.focusInstant = new Period();
    this.focusInstant.setTemporalType("Instant");
    this.focusInstant.setInstant(this.focusPeriod.getPeriodEnd());
    if (this.periodFactsByName != null) {
      setFocusPeriodFactList(this.periodFactsByName);
    }
  }

  protected Map<String, FactElement> getInstantOrDurationFacts(String currentInstantOrDuration){
    if(currentInstantOrDuration.equals("instant")){
      return getInstantFactMap();
    } else {
      return getPeriodFactMap();
    }
  }

  void setFocusPeriodFactList(Map<Period, Map<String, FactElement>> periodFactsByName) {
    for (Period period : periodFactsByName.keySet()) {
      if (period.equals(this.focusPeriod)) {
        logger.info("{}","focusPeriod: " + period);
        this.periodFactMap = periodFactsByName.get(period);
      } else if (period.equals(this.focusInstant)) {
        logger.info("{}","focusInstant: " + period);
        this.instantFactMap = periodFactsByName.get(period);
      }
    }
  }

  private ResultSet doProcess() {
    Map<String, Double> fundamentals = new HashMap<>();

    fundamentals = processBalanceSheet(fundamentals);
    fundamentals = processCashFlow(fundamentals);
    fundamentals = processIncomeStatement(fundamentals);

    logger.info("{}", "----------- Calculable Ratios  -------------");
    Map<String, Boolean> canCalculate = ComputableRatiosCheck.determineComputableRatios(fundamentals);
    logger.info("Calculable Ratios Check Results: ");
    for (String s : canCalculate.keySet()) {
           logger.info("{}",s + ": " + canCalculate.get(s));
    }

    Map<String, Double> ratos = CalculateRatios.calculateRatios(canCalculate, fundamentals);
    for (String s : ratos.keySet()) {
      logger.info("{}",s + ": " + ratos.get(s));
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

  public Map<String, Double> extractBalanceSheetConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        BalanceSheetFundamentals.build(mapping)
            .extractDataPoints(getInstantOrDurationFacts("instant"));

    logger.info("{}", "----------- Balance Sheet -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  
  public Map<String, Double> extractCashFlowConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        CashFlowFundamentals.build(mapping)
            .extractDataPoints(getInstantOrDurationFacts("duration"));

    logger.info("{}", "----------- Cash Flow -------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  
  public Map<String, Double> extractIncomeStatementConcepts(Map<String, String[]> mapping) {
    Map<String, Double> fundamentals;

    fundamentals =
        IncomeStatementFundamentals.build(mapping)
            .extractDataPoints(getInstantOrDurationFacts("duration"));

    logger.info("{}", "---------- Income Statement --------------");
    printFundamentals(fundamentals);
    return fundamentals;
  }

  protected static void printFundamentals(Map<String, Double> fundamentals) {
    logger.info("{}","=================================");
    for (String s : fundamentals.keySet()) {

      if (!fundamentals.get(s).equals(0d)) {
        logger.info("{}",s + ": " + fundamentals.get(s));
      }
      //      logger.info("{}",fundamentals.get(s));
    }
  }


  public Map<String, Object> getAllMisc() {
    return misc;
  }

  public Object getMisc(String key) {
    return this.misc != null ? this.misc.get(key): null;
  }

  public void setMisc(Map<String, Object> misc) {
    this.misc = misc;
  }

  public Map<String, FactElement> getPeriodFactMap() {
    return periodFactMap;
  }

  public void setPeriodFactMap(Map<String, FactElement> periodFactMap) {
    this.periodFactMap = periodFactMap;
  }

  public Map<String, FactElement> getInstantFactMap() {
    return instantFactMap;
  }

  public void setInstantFactMap(Map<String, FactElement> instantFactMap) {
    this.instantFactMap = instantFactMap;
  }

  public Map<String, String> getDetails() {
    return details;
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
