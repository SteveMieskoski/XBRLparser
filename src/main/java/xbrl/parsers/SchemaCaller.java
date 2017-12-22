package xbrl.parsers;

import org.dom4j.Element;

public interface SchemaCaller {

  void createElement(Element element);

  void addDefinition(String def);

  void addUsedOn(String usedOn);

}
