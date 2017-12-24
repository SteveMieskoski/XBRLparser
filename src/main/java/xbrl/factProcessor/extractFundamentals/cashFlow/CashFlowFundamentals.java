package xbrl.factProcessor.extractFundamentals.cashFlow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.IFundamentals;

import java.lang.invoke.MethodHandles;
import java.util.Map;

public class CashFlowFundamentals {
  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
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

  public Map<String, Double> extractDataPoints(Map<String, FactElement> rawData) {
    return extract(rawData, this.mappings);
  }

  public Map<String, Double> extractDataPoints(
      Map<String, FactElement> rawData, Map<String, String[]> mappings) {
    return extract(rawData, mappings);
  }

  private Map<String, Double> extract(
      Map<String, FactElement> rawData, Map<String, String[]> mappings) {
    Map<String, Double> cfValues = CashFlowCollect.findAndExtractValues(rawData, mappings);
    if (cfValues == null) {
      logger.warn("Cash Flow Collect Received null as input");
      return null;
    }
    return CashFlowAdjustments.run(cfValues);
  }

  public Map<String, String[]> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

}
