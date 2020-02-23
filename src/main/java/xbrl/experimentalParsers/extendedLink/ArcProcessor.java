package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Element;

import java.util.LinkedList;

/**
 * WARNING: this implementation and related classes are very experimental and primarily a trial
 * demonstration
 */
public class ArcProcessor {

  // right order linearly, wrong offset
  public static void process(LinkedList<Element> elementsIn) {
    LinkedList<String> doubleCheck = new LinkedList<>();
    System.out.println("================================");
    System.out.println("================================");
    Boolean initialItem = true;
    Integer offset = 1;
    Integer priorOrder = 0;
    Boolean started = true;
    Element root = null;
    for (Element element : elementsIn) {
      if (started) {
        root = element;
        started = false;
      }
//      System.out.println(element.attributeValue("from") + "  " + element.attributeValue("to"));
      if (element.equals(root)) {
        offset = 1;
        if (initialItem) {
          initialItem = false;
        } else {
          priorOrder = Integer.parseInt(element.attributeValue("order"));
        }
      } else {
        if (!doubleCheck.contains(
            element.attributeValue("from") + " " + element.attributeValue("to"))) {
          doubleCheck.add(element.attributeValue("from") + " " + element.attributeValue("to"));
          Integer currentOrder = Integer.parseInt(element.attributeValue("order"));
          if (priorOrder >= currentOrder) {
            offset += 1;
          }
          priorOrder = currentOrder;
          String buffer = "\t";
          for (int i = 0; i <= offset; i++) {
            buffer += "\t";
          }
          System.out.println(buffer + element.attributeValue("from") + " : " + element.attributeValue("order"));
        } else {
          offset = 2;
          Integer currentOrder = Integer.parseInt(element.attributeValue("order"));
          if (priorOrder >= currentOrder) {
            offset += 1;
          }
          priorOrder = currentOrder;
          String buffer = "\t";
          for (int i = 0; i <= offset; i++) {
            buffer += "\t";
          }
        }
      }
    }
  }
}
