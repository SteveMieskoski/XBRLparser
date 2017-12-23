package xbrl.util;

import xbrl.factProcessor.ResultSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommLine {

    default void transmitResults() {
      transmitResults(null);
  }

    void transmitResults(ResultSet resultSet);


  default void transmitFileMap() {
    transmitFileMap(new HashMap<>());
  }

  void transmitFileMap(Map<String, String> componentFiles);

  void transmitFileResource(Map<String, String> linkbases, List<String> schemaRefs);
}
