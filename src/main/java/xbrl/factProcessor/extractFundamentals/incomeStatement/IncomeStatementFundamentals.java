package xbrl.factProcessor.extractFundamentals.incomeStatement;

import xbrl.elementTypes.FactElement;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.IFundamentals;

import java.util.Map;

public class IncomeStatementFundamentals implements IFundamentals {

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

  @Override
  public Map<String, Double> extractDataPoints(Map<String, FactElement> rawData) {
    return extract(rawData, this.mappings, null);
  }

  @Override
  public Map<String, Double> extractDataPoints(
      Map<String, FactElement> rawData, Map<String, String[]> mappings) {
    return extract(rawData, mappings, null);
  }

  @Override
  public Map<String, Double> extractDataPoints(Map<String, FactElement> rawData, Boolean strict) {
    return extract(rawData, this.mappings, strict);
  }

  private Map<String, Double> extract(
      Map<String, FactElement> rawData, Map<String, String[]> mappings, Boolean strict) {
    if (mappings == null) {
      mappings = ConceptMappings.mappings;
      if (strict != null && !strict) {
        mappings.putAll(ConceptMappingsSubParAlts.mappingOther);
      }
    }
    Map<String, Double> bsValues = IncomeStatementCollect.findAndExtractValues(rawData, mappings);
    if(bsValues == null) return null;
    return applyAdjustments(bsValues);
  }

  @Override
  public Map<String, Double> applyAdjustments(Map<String, Double> values) {
    return IncomeStatementAdjustments.run(values);
  }

  public Map<String, String[]> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }
}
