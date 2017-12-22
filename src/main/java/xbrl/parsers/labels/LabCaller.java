package xbrl.parsers.labels;

import org.dom4j.Element;

public interface LabCaller {

  public void addItem(String element);

  public void addLabelList();

  void addLabel(Element element);

  void addLoc(Element element);
}
