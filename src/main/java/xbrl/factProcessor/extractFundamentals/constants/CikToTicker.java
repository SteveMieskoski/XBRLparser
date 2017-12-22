package xbrl.factProcessor.extractFundamentals.constants;

import java.util.HashMap;
import java.util.Map;

public class CikToTicker {

  //  CikToTicker1 => 727273 or less
  //  CikToTicker2 => 727303 to 879357
  //  CikToTicker3 => 879361 to 1016289
  //  CikToTicker4 => 1016439 to 1093902
  //  CikToTicker5 => 1093903 to 1227282
  //  CikToTicker6 => 1227476 to 1383571
  //  CikToTicker7 => 1383637 to 1552719
  //  CikToTicker8 => 1552797 to 1660719

  public static String find(String cikStr) {
    try {
      Integer cik = Integer.parseInt(cikStr);
      if (cik <= 727273) {
        return CikToTicker1.mapping.get(cik);
      } else if (cik >= 727303 && cik <= 879357) {
        return CikToTicker2.mapping.get(cik);
      } else if (cik >= 879361 && cik <= 1016289) {
        return CikToTicker3.mapping.get(cik);
      } else if (cik >= 1016439 && cik <= 1093902) {
        return CikToTicker4.mapping.get(cik);
      } else if (cik >= 1093903 && cik <= 1227282) {
        return CikToTicker5.mapping.get(cik);
      } else if (cik >= 1227476 && cik <= 1383571) {
        return CikToTicker6.mapping.get(cik);
      } else if (cik >= 1383637 && cik <= 1552719) {
        return CikToTicker7.mapping.get(cik);
      } else if (cik <= 1552797) {
        return CikToTicker8.mapping.get(cik);
      } else {
        return null;
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
      return null;
    }
  }
}
