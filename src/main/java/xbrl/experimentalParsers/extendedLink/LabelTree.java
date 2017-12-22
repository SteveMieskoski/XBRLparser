package xbrl.experimentalParsers.extendedLink;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/*
 * This is a Tree data-structure for representing label hierarchies.
 * Node type:LabelNode(which contains 'Locator').
 */
class LabelTree {
  private static int NODES_COUNT = 0;
  private static String TAB_SPACE = "";
  private LabelNode rootNode;

  // always specify the rootnode!
  LabelTree(LabelNode t_rootNode) {
    rootNode = t_rootNode;
    System.out.println("Created a LabelTree with ROOTNODE:" + t_rootNode.getNodeName());
    NODES_COUNT++;
  }

  public int getNodeCount() {
    return NODES_COUNT;
  }

  /*INSERTS THE GIVEN 'LABEL NODE' UNDER THE SPECIFIED 'PARENT NODE'
   * Steps in inserting a node into this tree
   * ------------------------------------------
   * 1.Get the 't_parentNode' name and check whether it exists.
   *   *IF-EXISTS:
   *   	a.)add the 't_childnode' to it .[Eg: t_parentNode.addChildNode(t_childnode)].
   * 			NOTE:It is not possible to add childnodes having same labelname.
   *   *IF-NOTEXISTS:(this step is omitted for now)
   *   	a.)Create the parent node 't_parentNode' and add to the ROOT Node.
   *      b.)Then,add the childnode 't_childnode' to this new parent node.
   */
  public boolean insertNode(LabelNode t_parentNode, LabelNode t_childnode) {
    if (rootNode == null) {
//        System.out.println(t_parentNode);
      rootNode = t_parentNode;
      t_parentNode.addChildNode(t_childnode);
      return true;
    } else { // if rootnode exist.
      // start searching the parentnode in the entire tree from ROOTNODE.
      // returns the parentnode.
      LabelNode t_node = searchNode(rootNode, t_parentNode);

      // check whether the parentNode is found
      if (t_node == null) { // if not found
        // PARENTNODE DOES NOT EXIST!
        return false;
      } else { // if the req.parent is found.
        // adding the child node under parentNode(which exists)...
        t_node.addChildNode(t_childnode);

        System.out.println(
            "	Node[ "
                + t_childnode.getNodeName()
                + " ] added to ParentNode[ "
                + t_node.getNodeName()
                + " ]");

        // increment nodes_count
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
    if (t_startNode.getNodeName().equals(t_nodeToFind.getNodeName())) {
      return t_startNode;
    } else { // search its childnodes
      // check whether it has child nodes

      if (t_startNode.hasChilds()) { // if childnodes present
        Set<LabelNode> childNodes = t_startNode.getChildNodes();
        Iterator<LabelNode> itr = childNodes.iterator();
        LabelNode tempNode = null;

        // start searching in each childnodes also
        while (itr.hasNext()) {
          tempNode = searchNode(itr.next(), t_nodeToFind);
          if (tempNode != null) {
            // the required node is found,so return it and end the search
            return tempNode;
          }
        }
      } // do something or check for in caller

      // if nothing is found in childnode also,then return null
      return null;
    }
  }


    public void removeNode(LabelNode t_node) {
        // removes the node{not needed for now}
    }

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
        // recursive
        System.out.println(TAB_SPACE + t_rootNode.getNodeName() + " : " + t_rootNode.getOrder());
//        System.out.println(TAB_SPACE + t_rootNode.getLocator().getHref());
        if (t_rootNode.hasChilds()) {
            Set<LabelNode> tempChilds = t_rootNode.getChildNodes();
            Iterator<LabelNode> itr = tempChilds.iterator();

            TAB_SPACE = TAB_SPACE + "\t";

            // print the child node contents
            while (itr.hasNext()) {
                display(itr.next());
            }
            TAB_SPACE = TAB_SPACE.substring(0, TAB_SPACE.length() - 1);
        }
    }


    public LinkedList<LabelNode> simpleTreeIterator() {
        try {
            if (rootNode == null) throw new NullPointerException("Root Node is null.");

//            System.out.println("[DISPLAYING TREE]:RootNode:" + rootNode.getNodeName());
            return dumbTreeIterator(rootNode);
//            System.out.println("***FINISHED DISPLAYING ENTIRE TREE***");
        } catch (NullPointerException e) {
            System.out.println("Error while trying to display LabelTree!" + e);
            return new LinkedList<>();
        }
    }

    /*
     * Displays the child nodes under the specified node.
     * Steps in displaying child nodes
     * -------------------------------
     */
    private LinkedList<LabelNode> dumbTreeIterator(LabelNode t_rootNode) {
        LinkedList<LabelNode> collect = new LinkedList<>();
//        System.out.println(TAB_SPACE + t_rootNode.getNodeName() + " : " + t_rootNode.getOrder());
        if(t_rootNode.getOrder() < 1 || t_rootNode.getOrder() >= 99999){
            t_rootNode.setRootNode(true);
        }
        collect.add(t_rootNode);
        if (t_rootNode.hasChilds()) {
            Set<LabelNode> tempChilds = t_rootNode.getChildNodes();
            Iterator<LabelNode> itr = tempChilds.iterator();

//            TAB_SPACE = TAB_SPACE + " ";

            while (itr.hasNext()) {
                collect.addAll(dumbTreeIterator(itr.next()));
            }
//            TAB_SPACE = TAB_SPACE.substring(0, TAB_SPACE.length() - 1);
        }
        return collect;
    }

    public LabelNode getRootNode() {
        return rootNode;
    }
}
