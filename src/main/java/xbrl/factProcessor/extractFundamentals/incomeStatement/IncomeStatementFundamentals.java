package xbrl.factProcessor.extractFundamentals.incomeStatement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.IFundamentals;

import java.lang.invoke.MethodHandles;
import java.util.Map;

public class IncomeStatementFundamentals {

  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private Map<String, String[]> mappings = ConceptMappings.mappings;

  public IncomeStatementFundamentals() {}

  public IncomeStatementFundamentals(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

  public static IncomeStatementFundamentals build() {
    return new IncomeStatementFundamentals();
  }

  public static IncomeStatementFundamentals build(Map<String, String[]> mappings) {
    return new IncomeStatementFundamentals(mappings);
  }

  public Map<String, Double> extractDataPoints(Map<String, FactElement> rawData) {
    return extract(rawData, this.mappings);
  }

  public Map<String, Double> extractDataPoints(
      Map<String, FactElement> rawData, Map<String, String[]> mappings) {
    return extract(rawData, mappings);
  }


  private Map<String, Double> extract(
      Map<String, FactElement> rawData, Map<String, String[]> mappings) {

    Map<String, Double> isValues = IncomeStatementCollect.findAndExtractValues(rawData, mappings);
    if(isValues == null) return null;
    return IncomeStatementAdjustments.run(isValues);
  }


  public Map<String, String[]> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

}
