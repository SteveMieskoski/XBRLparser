package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Element;
import xbrl.elementTypes.ConstantValues;

import java.util.*;

public class AggregateLocators {

  public static LocReturn populateLocatorList(Element t_roleNode) {
    System.out.println("[POPULATE_LocatorList]:Extracting Locators");
    LinkedHashSet<Locator> locatorList = new LinkedHashSet<>();
    LinkedList<String> locatorLabels = new LinkedList<>();
    if (t_roleNode.elements().size() > 0) {

      LinkedList<String> hrefList = new LinkedList<>();
      // getting the child nodes of this particulat presentation node
      List<Element> nodeList = t_roleNode.elements();

      // extracting only locator(link:loc) nodes from the nodeList
      LinkedList<Element> list_LocatorNodeList =
          ExtendedLinkUtils.extractNodes(nodeList, ConstantValues.loc_tag);

      // extracting Locator attribute:labels
      String[] locatorLabelArray =
          ExtendedLinkUtils.extractNodesAttributes(list_LocatorNodeList, ConstantValues.label_tag);

      // extracting Locator attribute:href
      String[] locatorhrefs =
          ExtendedLinkUtils.extractNodesAttributes(list_LocatorNodeList, ConstantValues.href);
      // adding to locatorList(ArrayList)
      //            Collections.addAll(locatorList, locatorLabels);
      //            Collections.addAll(hrefList, locatorhrefs);
      //            labelhrefMap = new LinkedHashMap<>();
      for (int i = 0; i < locatorLabelArray.length; i++) {
        locatorList.add(new Locator(locatorLabelArray[i], locatorhrefs[i], i));
        locatorLabels.add(locatorLabelArray[i]);
      }

      System.out.println("[POPULATE_LocatorList]:Completed.List size:" + locatorList.size());
      return new LocReturn(locatorLabels, new LinkedList<>(locatorList));
    } else {
      System.out.println("ERROR[POPULATE_LocatorList]:Given Role Node has no childs! ");
      return new LocReturn(locatorLabels, new LinkedList<>(locatorList));
    }
  }

  static class LocReturn {
    public LinkedList<String> locatorLabels;
    public LinkedList<Locator> locatorList;

    public LocReturn(LinkedList<String> locatorLabels, LinkedList<Locator> locatorList) {
      this.locatorLabels = locatorLabels;
      this.locatorList = locatorList;
    }
  }
}
