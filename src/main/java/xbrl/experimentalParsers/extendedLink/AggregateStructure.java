package xbrl.experimentalParsers.extendedLink;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AggregateStructure {

  public static LabelTree importArcsIntoLabelTree(
      LinkedList<Arc> arcList, LabelTree labelTree, LinkedList<Locator> locatorList) {

    Iterator<Arc> itr = null;
    Arc tempArc = null;
    String parentLabel = null;
    String childLabel = null;
    Locator parentLocator = null;
    Locator childLocator = null;
    double order = 0d;

    try {
      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Started.Current Node Count in Tree="
              + labelTree.getNodeCount());
      if (arcList == null) throw new NullPointerException();

      final int breakCount = arcList.size() * arcList.size();
      int passCount = 1;

      while (arcList.size() != 0) {
        System.out.println("PASS :" + passCount + " , ArcList size:" + arcList.size());
        itr = arcList.iterator();
        while (itr.hasNext()) {
          tempArc = itr.next();

          // get the parent and child labels & its order
          parentLabel = tempArc.getParentLabel();
          childLabel = tempArc.getChildLabel();
          order = tempArc.getOrder();
System.out.println(order);
          // not accurate means of connecting href to tree locator item.
          for (Locator loc : locatorList) {
            if (loc.getLabel().equals(parentLabel)) {
//                                  System.out.println(loc);
              parentLocator = loc.copy(0);
            }
            if (loc.getLabel().equals(childLabel)) {
//                                  System.out.println(loc);
              childLocator = loc.copy(order);
            }
          }
          // start inserting each arc element to the LabelTree.
          // inf loop if this never returns true
          if (labelTree.insertNode(new LabelNode(parentLocator), new LabelNode(childLocator))) {
            itr.remove(); // removes the element if successfully inserted into tree.
          }
        }
        if (passCount > breakCount) {
          break;
        }
        passCount++;
      }

      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Completed.Node Count in Tree=" + labelTree.getNodeCount());
    } catch (NullPointerException e) {
      System.out.println("ERROR:Unable to import ArcList into Tree. ArcList is not created! " + e);
    }
    return labelTree;
  }
}
