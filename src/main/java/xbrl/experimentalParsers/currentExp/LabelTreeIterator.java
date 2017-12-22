package xbrl.experimentalParsers.currentExp;

import java.awt.geom.AffineTransform;
import java.util.*;

public class LabelTreeIterator {

  public static void makeHierarchyMap(LabelNode rootNode) {
    try {
      LinkedList<LabelNode> base = simpleTreeIterator(rootNode);
      ListIterator<LabelNode> listIterator = base.listIterator();

      LinkedHashMap<String, LinkedHashSet<LabelNode>> hierarchyMap = new LinkedHashMap<>();
      LinkedHashSet<LabelNode> hierarcySet = null;
      String lastRoot = null;

      LinkedHashMap<String, LinkedList<String>> detailedMap = new LinkedHashMap<>();
      LinkedList<LabelNode> list = null;
      String lastSet = null;

        Boolean afterStart = false;
        Boolean afterEnd = false;
      while (listIterator.hasNext()) {
        LabelNode ln = listIterator.next();
        if (ln.isRootNode()) {
          if (hierarcySet != null && lastRoot != null) {
            hierarchyMap.put(lastRoot, hierarcySet);
            hierarcySet = new LinkedHashSet<>();
            hierarcySet.add(ln);
          } else {
            hierarcySet = new LinkedHashSet<>();
            hierarcySet.add(ln);
          }
          lastRoot = ln.getNodeName();
        }


        if (listIterator.hasPrevious() && listIterator.hasNext()) {
          int prior = listIterator.previousIndex();
          int next = listIterator.nextIndex();
          LabelNode priorNode = base.get(prior);
          LabelNode nextNode = base.get(next);
          if (priorNode.getOrder() == ln.getOrder()) {
            if (ln.hasChilds()) {
              System.out.println(
                  "hierarchy progression will start (collect into label): "
                      + ln.getNodeName()
                      + " "
                      + ln.getOrder());
              afterStart = true;
              afterEnd = false;
              lastSet = ln.getNodeName();
              detailedMap.put(lastSet, new LinkedList<>());
              detailedMap.get(lastSet).add(ln.getNodeName());
            } else {
              if (nextNode.getOrder() == ln.getOrder()) {
                afterEnd = true;
                afterStart = false;
                detailedMap.get(lastSet).add(ln.getNodeName());
                System.out.println(
                    "hierarchy progression end (last label of collection): "
                        + ln.getNodeName()
                        + " "
                        + ln.getOrder());
              } else {
                  System.out.println("afterEnd: " + afterEnd + " afterStart: " + afterStart);
                if (afterEnd) {
                  detailedMap.put(ln.getNodeName(), new LinkedList<>());
                  detailedMap.get(ln.getNodeName()).add(ln.getNodeName());
                  System.out.println(
                      "(if after a end and not new start, independent):  "
                          + ln.getNodeName()
                          + " "
                          + ln.getOrder());
                } else {
                  System.out.println(ln.getNodeName() + " " + ln.getOrder());
                  detailedMap.get(lastSet).add(ln.getNodeName());
                }
              }
            }
          }
        }
      }
      for (String ss : detailedMap.keySet()) {
        System.out.println("--------------------------");
        System.out.println(ss);
        System.out.println(detailedMap.get(ss));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static LinkedList<LabelNode> simpleTreeIterator(LabelNode rootNode) {
    try {
      if (rootNode == null) throw new NullPointerException("Root Node is null.");

      return dumbTreeIterator(rootNode);
    } catch (NullPointerException e) {
      System.out.println("Error while trying to display LabelTree!" + e);
      return new LinkedList<>();
    }
  }

  private static LinkedList<LabelNode> dumbTreeIterator(LabelNode t_rootNode) {
    LinkedList<LabelNode> collect = new LinkedList<>();
    if (t_rootNode.getOrder() < 1 || t_rootNode.getOrder() >= 99999) {
      t_rootNode.setRootNode(true);
    }
    collect.add(t_rootNode);
    if (t_rootNode.hasChilds()) {
      Set<LabelNode> tempChilds = t_rootNode.getChildNodes();
      Iterator<LabelNode> itr = tempChilds.iterator();

      while (itr.hasNext()) {
        collect.addAll(dumbTreeIterator(itr.next()));
      }
    }
    return collect;
  }
}
