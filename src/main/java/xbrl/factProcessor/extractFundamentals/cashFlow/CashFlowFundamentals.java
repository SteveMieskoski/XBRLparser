package xbrl.factProcessor.extractFundamentals.cashFlow;

import xbrl.elementTypes.FactElement;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.IFundamentals;

import java.util.Map;

public class CashFlowFundamentals implements IFundamentals {

  private Map<String, String[]> mappings = ConceptMappings.mappings;

  public CashFlowFundamentals() {}

  public CashFlowFundamentals(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

  public static CashFlowFundamentals build() {
    return new CashFlowFundamentals();
  }

  public static CashFlowFundamentals build(Map<String, String[]> mappings) {
    return new CashFlowFundamentals(mappings);
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
      mappings = this.mappings;
      if (strict != null && !strict) {
        mappings.putAll(ConceptMappingsSubParAlts.mappingOther);
      }
    }
    Map<String, Double> bsValues = CashFlowCollect.findAndExtractValues(rawData, mappings);
    return applyAdjustments(bsValues);
  }

  @Override
  public Map<String, Double> applyAdjustments(Map<String, Double> values) {
    return CashFlowAdjustments.run(values);
  }
}
