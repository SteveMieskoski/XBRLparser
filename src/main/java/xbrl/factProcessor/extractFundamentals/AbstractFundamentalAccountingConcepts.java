package xbrl.factProcessor.extractFundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetFundamentals;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementFundamentals;
import xbrl.factProcessor.extractFundamentals.ratios.CalculateRatios;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class AbstractFundamentalAccountingConcepts {
    private static final Logger logger =
            LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  protected Map<String, List<FactElement>> factByName;
  protected Map<String, FactElement> periodFactMap;
  protected Map<String, FactElement> instantFactMap;
  protected Map<String, String> details;
  protected List<OrganizationElement> organizationElements;
  protected Period focusPeriod;
  protected Period focusInstant;
  protected Map<Period, Map<String, FactElement>> periodFactsByName;
  protected Map<String, String[]> mappings;
  protected Map<String, Object> misc;

//  public AbstractFundamentalAccountingConcepts() {}


  protected void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
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
//      logger.info("{}",periodFactsByName);
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

  public void process(Map<String, String[]> mappings) {
    doProcess(mappings);
  }

  public void process() {
    if (this.mappings != null) {
      doProcess(this.mappings);
    } else {
      doProcess(null);
    }
  }

  void doProcess(Map<String, String[]> mappings) {
    Map<String, Double> bsValues;
    Map<String, Double> cfValues;
    Map<String, Double> isValues;

    if (mappings == null) {
      bsValues = BalanceSheetFundamentals.build().extractDataPoints(this.instantFactMap);
      cfValues = IncomeStatementFundamentals.build().extractDataPoints(this.periodFactMap);
      isValues = IncomeStatementFundamentals.build().extractDataPoints(this.periodFactMap);
    } else {
      bsValues = BalanceSheetFundamentals.build(mappings).extractDataPoints(this.instantFactMap);
      cfValues = IncomeStatementFundamentals.build(mappings).extractDataPoints(this.periodFactMap);
      isValues = IncomeStatementFundamentals.build(mappings).extractDataPoints(this.periodFactMap);
    }
    logger.info("{}","----------- Balance Sheet -------------");
    printFundamentals(bsValues);
    logger.info("{}","----------- Cash Flow -------------");
    printFundamentals(cfValues);
    logger.info("{}","---------- Income Statement --------------");
    printFundamentals(isValues);
    // todo: convert to a stream collect operation
    //    fundamentals.putAll(bsValues);
    Map<String, Double> fundamentals = new HashMap<>();
    for (String s : bsValues.keySet()) {
      if (bsValues.get(s) != 0d) {
        fundamentals.put(s, bsValues.get(s));
      }
    }
    for (String s : cfValues.keySet()) {
      if (cfValues.get(s) != 0d) {
        fundamentals.put(s, cfValues.get(s));
      }
    }

    for (String s : isValues.keySet()) {
      if (isValues.get(s) != 0d) {
        fundamentals.put(s, isValues.get(s));
      }
    }

    logger.info("{}","----------- Calculable Ratios  -------------");
    Map<String, Boolean> canCalculate = CalculateRatios.determineComputableRatios(fundamentals);
    for (String s : canCalculate.keySet()) {
      logger.info("{}",s + ": " + canCalculate.get(s));
    }
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

  public void addMisc(String key, Object value){
    if(this.misc == null){
      this.misc = new HashMap<>();
    }
    this.misc.put(key, value);
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
            + details +
        ", focusPeriod="
        + focusPeriod
        + ", focusInstant="
        + focusInstant
        +
        ", mappings="
        + mappings
        + '}';
  }
}
