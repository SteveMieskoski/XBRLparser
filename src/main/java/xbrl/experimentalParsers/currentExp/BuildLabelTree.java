package xbrl.experimentalParsers.currentExp;

import java.util.*;

// for calculationLink ExtendedLinks
public class BuildLabelTree {

  public static LabelTree buildLabelTree(Locator root_LocatorNode, ArrayList<Arc> arcList) {
    return runbuildLabelTree(root_LocatorNode, arcList);
  }

  public static LabelTree runbuildLabelTree(Locator root_LocatorNode, ArrayList<Arc> arcList) {
    try {
      if (root_LocatorNode == null) throw new NullPointerException("Root Node is null.");

      // creates the labeltree with this rootnode
      LabelTreeCal labelTree = new LabelTreeCal(new LabelNode(root_LocatorNode));
        Set<String> altRootCheck = importArcsIntoLabelTree(arcList, labelTree);
        if (altRootCheck.size() > 0) {
            List<String> tmp = new ArrayList<>(altRootCheck);
            for(int i=0; i<tmp.size(); i++){
                // in a post possessing step values of 99999 or larger would get dropped down to an order = 0 (root item)
                int dummyOrderVal = 99999 + i;
                labelTree.addDetachedSubTree(new LabelNode(new Locator(tmp.get(i), dummyOrderVal)));
                altRootCheck =  importArcsIntoLabelTree(arcList, labelTree); //should make this into a recursive function.
                if(!(altRootCheck.size() > 0)){
                    break;
                }
            }

        }

      return labelTree;
    } catch (NullPointerException e) {
      System.out.println("Unable to create LabelTree!! " + e);
      return null;
    }
  }

//  public static LabelTree detachedBranches(Set<String> altRootCheck, LabelTreeCal labelTree, ArrayList<Arc> arcList){
//
//  }

  public static Set<String> importArcsIntoLabelTree(ArrayList<Arc> arcList, LabelTree labelTree) {
    Iterator<Arc> itr = null;
    Arc tempArc = null;
    String parentLabel = null;
    String childLabel = null;
    double order = 0d;

    Set<String> altRootCheck = new HashSet<>();
    try {
      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Started.Current Node Count in Tree="
              + labelTree.getNodeCount());
      if (arcList == null) throw new NullPointerException();

      for (Arc arc : arcList) {
        altRootCheck.add(arc.getParentLabel());
      }
      final int breakCount = arcList.size() * arcList.size();
        System.out.println("BREAKCOUNT: " + breakCount);
      System.out.println(arcList);
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
          if (altRootCheck.contains(childLabel)) altRootCheck.remove(childLabel);
          //          System.out.println("LTP::tempArc: " + parentLabel + " " + childLabel + " " +
          // order);
          // start inserting each arc element to the LabelTree.

          // inf loop if this never returns true
          if (labelTree.insertNode(
              new LabelNode(new Locator(parentLabel, 0)),
              new LabelNode(new Locator(childLabel, order)))) {
            itr.remove(); // removes the element if successfully inserted into tree.
            if (altRootCheck.contains(parentLabel)) altRootCheck.remove(parentLabel);
          } else {
              System.out.println(altRootCheck);
            System.out.println("no match found-- parent: " + parentLabel + " :  child:" + childLabel);
          }
        }
        if (passCount >= breakCount) {
            System.out.println("BREAKCOUNT: " + passCount);

          break;
        }
        System.out.println(order);
        passCount++;
      }

      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Completed.Node Count in Tree=" + labelTree.getNodeCount());
      return altRootCheck;
    } catch (NullPointerException e) {
      System.out.println("ERROR:Unable to import ArcList into Tree. ArcList is not created! " + e);
      return new HashSet<>();
    }
  }

  //
  //    public void viewTree() {
  //        System.out.println(labelTree);
  //        labelTree.displayEntireTree();
  //    }
}
