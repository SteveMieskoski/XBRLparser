package xbrl.experimentalParsers.extendedLink;


import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * This represents a node in 'LabelTree'.
 * It encapsulates the 'Locator'.
 */
public class LabelNode implements Comparable<LabelNode> {
  // holds the childnodes
  private SortedSet<LabelNode> childNodes = null;
  private Locator locator = null;
  private Boolean rootNode = false;

  LabelNode(Locator t_node) {
    locator = t_node;
  }

    public Boolean isRootNode() {
        return rootNode;
    }

    public void setRootNode(Boolean rootNode) {
        this.rootNode = rootNode;
    }

    public Locator getLocator() {
        return locator;
    }

    public int getOrder() {
    return (int) this.locator.getSiblingOrder();
  }

  public String getNodeName() {
    if (locator != null) return locator.getLabel();
    else return null;
  }

  public Set<LabelNode> getChildNodes() {
    if (childNodes != null) return childNodes;
    else return null;
  }

  // checks whether it has child nodes
  public boolean hasChilds() {
    if (childNodes == null) return false;
    else return true;
  }

  /*
   * Adding a child to this node
   */
  public void addChildNode(LabelNode t_childNode) {
    if (childNodes == null) childNodes = new TreeSet<LabelNode>();

    // creating a new LabelNode top hold the 'locator' obj
    // The 'locator' obj contains the 'order' variable
    childNodes.add(t_childNode);
  }

  @Override
  public int compareTo(LabelNode o) {
    LabelNode temp = o;
    int currentOrder = this.getOrder();
    int checkOrder = temp.getOrder();

    if (currentOrder < checkOrder) return -1;
    else return 1;
  }

    @Override
    public String toString() {
        return "LabelNode{" +
//                "childNodes=" + childNodes +
                ", locator=" + locator +
                ", rootNode=" + rootNode +
                '}';
    }

  /*    @Override
    public String toString() {
        return "LabelNode:" +
                "\n locator=" + locator +
                "\n childNodes=" + childNodes +
                '\n';
    }*/
}
