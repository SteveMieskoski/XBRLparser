package xbrl.util;

import xbrl.factProcessor.ResultSet;

import java.util.HashMap;
import java.util.Map;

public interface CommLine {

    void transmitResults(ResultSet resultSet);

    default void transmitFileMap() {
        transmitFileMap(new HashMap<>());
    }

    void transmitFileMap(Map<String, String> componentFiles);

}
