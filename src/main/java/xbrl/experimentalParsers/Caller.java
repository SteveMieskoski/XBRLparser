package xbrl.experimentalParsers;

import org.dom4j.Element;

public interface Caller {

  public void addItem(String element);

  void addArc(String from, String to, String order, Element element);

  void addLoc(String label, String href);
}
