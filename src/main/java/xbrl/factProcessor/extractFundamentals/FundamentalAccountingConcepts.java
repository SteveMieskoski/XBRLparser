package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.elementTypes.subTypes.Period;
import xbrl.export.ToExcel;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetAdjustments;
import xbrl.factProcessor.extractFundamentals.balanceSheet.BalanceSheetFundamentals;
import xbrl.factProcessor.extractFundamentals.cashFlow.CashFlowAdjustments;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementAdjustments;
import xbrl.factProcessor.extractFundamentals.incomeStatement.IncomeStatementFundamentals;
import xbrl.factProcessor.extractFundamentals.ratios.CalculateRatios;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundamentalAccountingConcepts {

  protected Map<String, List<FactElement>> factByName;
  protected Map<String, FactElement> periodFactMap;
  protected Map<String, FactElement> instantFactMap;
  protected Map<String, String> details;
  protected List<OrganizationElement> organizationElements;
  protected Period focusPeriod;
  protected Period focusInstant;
  protected Map<Period, Map<String, FactElement>> periodFactsByName;
  private Map<String, String[]> mappings;
  private Map<String, Object> misc;

  public FundamentalAccountingConcepts() {}

  public FundamentalAccountingConcepts(
      Map<Period, Map<String, FactElement>> periodFactsByName, Period period) {
    this.periodFactsByName = periodFactsByName;
    this.focusPeriod = period;

    if (this.focusPeriod != null) {
      setFocusPeriod(this.focusPeriod);
      setFocusPeriodFactList(periodFactsByName);
    }
  }

  // For use by the "Full" XBRL parser
  //  public FundamentalAccountingConcepts(FactDataContainer factDataContainer) {
  //    this.factDataContainer = factDataContainer;
  //    if (this.focusPeriod != null) {
  //      setFocusPeriodFactList(this.factDataContainer.getPeriodFactsByName());
  //    }
  //    this.values = new HashMap<>();
  //  }

  protected void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

  public void setOrganizationElementsList(List<OrganizationElement> organizationElements) {
    this.organizationElements = organizationElements;
    details = CompanyDetailsCollect.findAndExtractValues(organizationElements);
  }

  public void setFocusPeriod(Period focusPeriod) {
    this.focusPeriod = focusPeriod;
    this.focusInstant = new Period();
    this.focusInstant.setTemporalType("Instant");
    this.focusInstant.setInstant(this.focusPeriod.getPeriodEnd());
    if (this.periodFactsByName != null) {
      setFocusPeriodFactList(this.periodFactsByName);
    }
  }

  private void setFocusPeriodFactList(Map<Period, Map<String, FactElement>> periodFactsByName) {
    for (Period period : periodFactsByName.keySet()) {
      if (period.equals(this.focusPeriod)) {
        System.out.println("focusPeriod: " + period);
        this.periodFactMap = periodFactsByName.get(period);
      } else if (period.equals(this.focusInstant)) {
        System.out.println("focusInstant: " + period);
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

  private void doProcess(Map<String, String[]> mappings) {
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
    System.out.println("----------- Balance Sheet -------------");
    printFundamentals(bsValues);
    System.out.println("----------- Cash Flow -------------");
    printFundamentals(cfValues);
    System.out.println("---------- Income Statement --------------");
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

    System.out.println("----------- Calculable Ratios  -------------");
    Map<String, Boolean> canCalculate = CalculateRatios.determineComputableRatios(fundamentals);
    for (String s : canCalculate.keySet()) {
      System.out.println(s + ": " + canCalculate.get(s));
    }
  }

  private void printFundamentals(Map<String, Double> fundamentals) {
    System.out.println("=================================");
    for (String s : fundamentals.keySet()) {

      if (!fundamentals.get(s).equals(0d)) {
        System.out.println(s + ": " + fundamentals.get(s));
      }
      //      System.out.println(fundamentals.get(s));
    }
  }

  private FactElement getLatestInstantValue(List<FactElement> values) {
    LocalDate latestInstant = null;
    FactElement hold = null;
    for (FactElement fe : values) {
      Period period = fe.getPeriod();
      if (period != null) {
        if (period.isInstant()) {
          if (this.focusPeriod.getInstantOrEndAsDate().equals(period.getPeriodInstant())) {
            latestInstant = period.getPeriodStart();
            System.out.println(latestInstant);
            hold = fe;
          }
        }
      }
    }
    return hold;
  }

  private FactElement getLatestDurationValue(List<FactElement> values) {
    LocalDate latestInstant = null;
    FactElement hold = null;
    for (FactElement fe : values) {
      Period period = fe.getPeriod();
      if (period != null) {
        if (!period.isInstant()) {
          if (this.focusPeriod.getInstantOrStartAsDate().equals(period.getInstantOrStartAsDate())) {
            latestInstant = period.getPeriodStart();
            System.out.println(fe);
            hold = fe;
          }
        }
      }
    }
    System.out.println(latestInstant);
    return hold;
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
        //            ", periodFactMap=" + periodFactMap +
        //            ", instantFactMap=" + instantFactMap +
        //            ", values=" + values +
        //            ", organizationElements=" + organizationElements +
        ", focusPeriod="
        + focusPeriod
        + ", focusInstant="
        + focusInstant
        +
        //            ", periodFactsByName=" + periodFactsByName +
        ", mappings="
        + mappings
        + '}';
  }
}
