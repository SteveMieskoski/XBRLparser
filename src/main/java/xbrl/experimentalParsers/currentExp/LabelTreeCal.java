package xbrl.experimentalParsers.currentExp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/*
 * This is a Tree data-structure for representing label hierarchies.
 * Node type:LabelNode(which contains 'Locator').
 */
class LabelTreeCal extends LabelTree {
  private static int NODES_COUNT = 0;
  private static String TAB_SPACE = "";
  private LabelNode rootNode;

  LabelTreeCal(LabelNode t_rootNode) {
    super(t_rootNode);
    rootNode = t_rootNode;
    System.out.println("Created a LabelTree with ROOTNODE:" + t_rootNode.getNodeName());
    NODES_COUNT++;
  }

  public void addDetachedSubTree(LabelNode t_childnode){
      rootNode.addChildNode(t_childnode);
  }

  public int getNodeCount() {
    return NODES_COUNT;
  }

  public boolean insertNode(LabelNode t_parentNode, LabelNode t_childnode) {
//    System.out.println("ROOTNODE: " + rootNode.getNodeName());
    if (rootNode == null) {
      System.out.println(t_parentNode);
      rootNode = t_parentNode;
      t_parentNode.addChildNode(t_childnode);
      return true;
    } else {

      LabelNode t_node = searchNode(rootNode, t_parentNode);

      if (t_node == null) {

        return false;
      } else {

        t_node.addChildNode(t_childnode);

        System.out.println(
            "	Node[ "
                + t_childnode.getNodeName()
                + " ] added to ParentNode[ "
                + t_node.getNodeName()
                + " ]");

        NODES_COUNT++;

        return true;
      }
    }
  }

  /*
   * Searches a given node 't_node' from a given starting node 't_parentNode' and its childnodes.
   * if childnodes has its own childs, then it is searched recursively
   */
  public LabelNode searchNode(LabelNode t_startNode, LabelNode t_nodeToFind) {
//    System.out.println(
//        "start: " + t_startNode.getNodeName() + " :  find:" + t_nodeToFind.getNodeName());
    if (t_startNode.getNodeName().equals(t_nodeToFind.getNodeName())) {
      return t_startNode;
    } else {

      if (t_startNode.hasChilds()) {
        Set<LabelNode> childNodes = t_startNode.getChildNodes();
        Iterator<LabelNode> itr = childNodes.iterator();
        LabelNode tempNode = null;

        while (itr.hasNext()) {
          tempNode = searchNode(itr.next(), t_nodeToFind);
          if (tempNode != null) {

            return tempNode;
          }
        }
      }

      /*System.out.println("NULL searchNode");*/
      return null;
    }
  }

  public void removeNode(LabelNode t_node) {}

  public void displayEntireTree() {
    try {
      if (rootNode == null) throw new NullPointerException("Root Node is null.");

      System.out.println("[DISPLAYING TREE]:RootNode:" + rootNode.getNodeName());
      display(rootNode);
      System.out.println("***FINISHED DISPLAYING ENTIRE TREE***");
    } catch (NullPointerException e) {
      System.out.println("Error while trying to display LabelTree!" + e);
    }
  }

  /*
   * Displays the child nodes under the specified node.
   * Steps in displaying child nodes
   * -------------------------------
   */
  private void display(LabelNode t_rootNode) {

    System.out.println(TAB_SPACE + t_rootNode.getNodeName() + " : " + t_rootNode.getOrder());

    if (t_rootNode.hasChilds()) {
      Set<LabelNode> tempChilds = t_rootNode.getChildNodes();
      Iterator<LabelNode> itr = tempChilds.iterator();

      TAB_SPACE = TAB_SPACE + " ";

      while (itr.hasNext()) {
        display(itr.next());
      }
      TAB_SPACE = TAB_SPACE.substring(0, TAB_SPACE.length() - 1);
    }
  }

}
