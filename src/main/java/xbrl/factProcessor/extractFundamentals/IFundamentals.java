package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.FactElement;

import java.util.Map;

public interface IFundamentals {

  Map<String, Double> extractDataPoints(Map<String, FactElement> rawData);

  Map<String, Double> extractDataPoints(
      Map<String, FactElement> rawData, Map<String, String[]> mappings);

  Map<String, Double> extractDataPoints(Map<String, FactElement> rawData, Boolean Strict);

  Map<String, Double> applyAdjustments(Map<String, Double> values);
}
