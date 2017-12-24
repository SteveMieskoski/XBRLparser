package xbrl.factProcessor.extractFundamentals.balanceSheet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.FactElement;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappings;
import xbrl.factProcessor.extractFundamentals.constants.ConceptMappingsSubParAlts;
import xbrl.factProcessor.extractFundamentals.IFundamentals;

import java.lang.invoke.MethodHandles;
import java.util.Map;

public class BalanceSheetFundamentals {
  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private Map<String, String[]> mappings  = ConceptMappings.mappings;

  public BalanceSheetFundamentals() {}

  public BalanceSheetFundamentals(Map<String, String[]> mappings) {
    this.mappings = mappings;
  }

  public static BalanceSheetFundamentals build() {
    return new BalanceSheetFundamentals();
  }

  public static BalanceSheetFundamentals build(Map<String, String[]> mappings) {
    return new BalanceSheetFundamentals(mappings);
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

    Map<String, Double> bsValues = BalanceSheetCollect.findAndExtractValues(rawData, mappings);
    if (bsValues == null) return null;
    return BalanceSheetAdjustments.run(bsValues);
  }

}
