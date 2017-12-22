package xbrl.experimentalParsers.currentExp;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import xbrl.elementTypes.ConstantValues;

/*
 * This is the XLink processor which extracts the tree labelnodes and its info
 * STEPS:(BRIEF)
 * -------------
 * 1.Load the xml file(having xlink tags).
 * 2.Extract all the 'locator' elements and store in 'locatorList'.
 * 3.Extract all the 'arc' elements and store in 'arcList'.
 * 4.Create a relationship b/w locators by reading each 'arc' elements from the 'arcList'.
 *
 * NOTE:LabelTree is accessed from here only!.
 */
public class LabelTreeProcessor {
  /* PRESENTATION LINK ELEMENTS */
  // list containing the extended link roles
  private Map<String, List<String>> extendedLinkRoles;
  private Map<String, String> tagMap;
  private String extendedLinkPrefix;
  // this list contains the locator nodes.Used for validating only.
  private LinkedList<String> locatorList;
  private LinkedList<String> hrefList;
  private LinkedHashMap<String, String> labelhrefMap;
  // this list contains the 'xlink:to' attrib values.
  // Used for subtraction with 'locatorList' list for finding the root node.
  private ArrayList<String> arcList_To;
  // this list contains the arc nodes.LabelNodes are created from here only.
  private ArrayList<Arc> arcList;
  private LabelTree labelTree;
  private Locator root_LocatorNode = null;
  // xml vars
  private Document document;

  /*
    public static void main(String[] args) {
      System.out.println("****LabelTree Processor****");

      LabelTreeProcessor processor = new LabelTreeProcessor();
      processor.loadFile(new File("testfiles\\custom_pre2.xml"));

      // process a single xlink:presentation node
      processor.processPresentationNode("two");

      // building the label tree from the processed data
      processor.buildLabelTree();

      // displaying the tree struture
      processor.viewTree();
    }
  */

  /*
     INPUT:an XML file
     OUTPUT:none

     Gets the element labels from the XML file and stores in arraylist.
     populates the arcList,locatorList,arcList_To
  */
  public void loadFile(File xmlFile) {
    try {
      SAXReader reader = new SAXReader();
      document = reader.read(xmlFile);
      identifyExtendedLinks();

    } catch (DocumentException e) {
      System.out.println("Error while reading XML file!!" + e);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
  }

  public void setTagSet(String contentKey) {
    System.out.println("CURRENT EXTENDED LINK MAPPING: " + contentKey);
    this.extendedLinkPrefix = contentKey;
    this.tagMap = ConstantValues.linkNameForRelLinkbases(contentKey);
  }

  private void identifyExtendedLinks() {
    extendedLinkRoles = new HashMap<>();
    List<Element> presentationNodes =
        document.getRootElement().elements(ConstantValues.presentationLink_tag);
    List<String> presentationRoles =
        presentationNodes
            .stream()
            .map(element -> element.attributeValue("role"))
            .collect(Collectors.toList());
    if (presentationRoles.size() > 0) extendedLinkRoles.put("pre", presentationRoles);

    List<Element> definitionNodes =
        document.getRootElement().elements(ConstantValues.definitionLink_tag);
    List<String> definitionRoles =
        definitionNodes
            .stream()
            .map(element -> element.attributeValue("role"))
            .collect(Collectors.toList());
    if (definitionRoles.size() > 0) extendedLinkRoles.put("def", definitionRoles);

    List<Element> labelNodes = document.getRootElement().elements(ConstantValues.labelLink_tag);
    List<String> labelRoles =
        labelNodes
            .stream()
            .map(element -> element.attributeValue("role"))
            .collect(Collectors.toList());
    if (labelRoles.size() > 0) extendedLinkRoles.put("lab", labelRoles);

    List<Element> calculationNodes =
        document.getRootElement().elements(ConstantValues.calculationLink_tag);
    List<String> calculationRoles =
        calculationNodes
            .stream()
            .map(element -> element.attributeValue("role"))
            .collect(Collectors.toList());
    if (calculationRoles.size() > 0) extendedLinkRoles.put("cal", calculationRoles);

    System.out.println(presentationNodes);
  }

  // RETURNS:NodeList of the input node
  private List<Element> getEntireNodeList(String t_node) {
    List<Element> t_nodeList = document.getRootElement().elements(t_node);

    if (t_nodeList.size() > 0) return t_nodeList;
    else return null;
  }

  /*
   * Prints the node name of the given NodeList
   */
  /*  private void printNodeList(List<Element> nodeList) {
    System.out.println("NodeList Details:LENGTH=" + nodeList.size());
    System.out.println("----------------");
    for (int i = 0; i < nodeList.size(); i++) {
      System.out.println("node[" + i + "] : " + nodeList.get(i).getName());
    }
  }*/

  /*
   * Extracts nodes of given name from the nodeList.
   * Returns:Node[] containing req.nodes
   */
  private List<Element> extractNodes(List<Element> nodeList, String nodeToExtract) {
    List<Element> list_nodeList = new ArrayList<Element>();
    Element tempNode = null;

    System.out.println("Extracting Node of name  :  " + nodeToExtract);
    System.out.println("-----------------------------");
    for (int i = 0; i < nodeList.size(); i++) {
      tempNode = nodeList.get(i);
      if (tempNode.getName().equals(nodeToExtract)) {
        // add to List<Node>
        list_nodeList.add(tempNode);
      }
    }
    return list_nodeList;
  }

  /*
   * Extracts a specific attribute values from the given nodeList.
   * Return:String[] containing attribute values
   */
  private String[] extractNodesAttributes(List<Element> list_nodeList, String attribName) {
    Iterator<Element> itr = list_nodeList.iterator();
    String[] attribValues = new String[list_nodeList.size()];
    int count = 0;

    while (itr.hasNext()) {
      attribValues[count] = itr.next().attributeValue(attribName);
      count++;
    }
    System.out.println("Attribute values Count: " + attribValues.length);

    return attribValues;
  }

  // should populate locators within a single 'presentationLink" node only!
  // Extracts all locator nodes under the given 'role' node.
  private void populateLocatorList(Element t_roleNode) {
    System.out.println("[POPULATE_LocatorList]:Extracting Locators");
    if (t_roleNode.elements().size() > 0) {
      locatorList = new LinkedList<>();
      hrefList = new LinkedList<>();
      // getting the child nodes of this particulat presentation node
      List<Element> nodeList = t_roleNode.elements();

      // extracting only locator(link:loc) nodes from the nodeList
      List<Element> list_LocatorNodeList = this.extractNodes(nodeList, ConstantValues.loc_tag);

      // extracting Locator attribute:labels
      String[] locatorLabels =
          this.extractNodesAttributes(list_LocatorNodeList, ConstantValues.label_tag);

      // extracting Locator attribute:href
      String[] locatorhrefs =
          this.extractNodesAttributes(list_LocatorNodeList, ConstantValues.href);
      // adding to locatorList(ArrayList)
      Collections.addAll(locatorList, locatorLabels);
      Collections.addAll(hrefList, locatorhrefs);
      labelhrefMap = new LinkedHashMap<>();
      for (int i = 0; i < locatorLabels.length; i++) {
        labelhrefMap.put(locatorList.get(i), hrefList.get(i));
      }

      System.out.println("[POPULATE_LocatorList]:Completed.List size:" + locatorList.size());
    } else {
      System.out.println("ERROR[POPULATE_LocatorList]:Given Role Node has no childs! ");
    }
  } // populateList

  // should populate arcs within a single 'presentationLink" node only!
  // Extracts all arc nodes under the given 'role' node.
  private void populateArcList(Element t_roleNode) {
    String[] Arc_From_Values = null;
    String[] Arc_To_Values = null;
    String[] orders = null;
    String[] arcrole = null;

    System.out.println("[POPULATE_ArcList]:Extracting arcs");
    if (t_roleNode.elements().size() > 0) {
      // initializing arclist and arcTo list
      arcList_To = new ArrayList<>();
      arcList = new ArrayList<>();

      // getting the child nodes of this particulat presentation node
      List<Element> nodeList = t_roleNode.elements();

      // extracting only arc(link:presentationArc) nodes from the nodeList
      List<Element> list_ArcNodeList = this.extractNodes(nodeList, tagMap.get("arc"));

      // extracting xlink:from, xlink:to and order attribute from the list_ArcNodeList..
      Arc_From_Values = this.extractNodesAttributes(list_ArcNodeList, ConstantValues.from);
      Arc_To_Values = this.extractNodesAttributes(list_ArcNodeList, ConstantValues.to);
      orders = this.extractNodesAttributes(list_ArcNodeList, ConstantValues.order);
      arcrole = this.extractNodesAttributes(list_ArcNodeList, ConstantValues.arcrole);

      System.out.println("Extracted Arc Info:");
      System.out.println("  COUNTS::  Arc_From:" + Arc_From_Values.length);
      System.out.println("            Arc_From:" + Arc_To_Values.length);
      System.out.println("            Order:" + orders.length);
      System.out.println("            Arcrole:" + arcrole.length);

      // creating 'arc' object and inserting 'from' , 'to' ,'order' values.
      for (int i = 0; i < list_ArcNodeList.size(); i++) {
        arcList.add(new Arc(Arc_From_Values[i], Arc_To_Values[i], Float.parseFloat(orders[i]), arcrole[i]));

        // also populate 'arcList_To' arraylist
        arcList_To.add(Arc_To_Values[i]);
      }

      System.out.println("[POPULATE_ArcList]:Completed.List size:" + arcList.size());
      System.out.println("[POPULATE_Arc_To_List]:Completed.List size:" + arcList_To.size());
    } else {
      System.out.println("ERROR[POPULATE_ArcList]:Given Role Node has no childs! ");
    }
  }

  /*
   * Extracts the xlink(locators,arcs) node information under the given 'presentationrole'.
   * Inner process:
   * --------------
   * 1.populates LocatorList.
   * 2.populates ArcList(also arcTo list).
   * 3.Finds the rootNode of this particular presentation.
   */
  public void processPresentationNode(String t_role) {
    System.out.println(t_role);
    // getting all 'link:presentationLink' nodes
    List<Element> nodeList_PresentationLink = getEntireNodeList(tagMap.get("link"));
    if (nodeList_PresentationLink != null) {
      String roleNodeName = null;
      Element roleNode = null;

      // checking the 'role' attribute of all the retrieved 'link:presentation' nodes
      for (int i = 0; i < nodeList_PresentationLink.size(); i++) {
        // storing the rolenode
        roleNode = nodeList_PresentationLink.get(i);
        // getting the value of 'xlink:role' attr
        roleNodeName = nodeList_PresentationLink.get(i).attributeValue(ConstantValues.role);

        // checking whether 't_role' exists
        if (roleNodeName.equals(t_role)) {
          System.out.println(
              "ROLE: " + t_role + " exists!.Populating \'Locator\' and \'Arc\' List");

          // passing the roleNode itself .
          populateLocatorList(roleNode);
          populateArcList(roleNode);

          // find the root node
          root_LocatorNode = getRootNode();

          break;
        }
      }
    } else {
      System.out.println("[ERROR] : Node \'" + tagMap.get("link") + "\' not found!");
    }
  }

  /*
   * Finds the root node in the XLink document.
   */
  public Locator getRootNode() throws NullPointerException {
    ArrayList<String> tempArrayList = new ArrayList<String>(locatorList);

    // removes all the elements except one which should be the ROOTNODE
    if (arcList_To.size() != 0 && tempArrayList.removeAll(arcList_To)) {
      // only one element exists if everything is correct...
      String tempLoc = tempArrayList.iterator().next();
      System.out.println(tempLoc);
      // create a root locator
      Locator rootNode = new Locator(tempLoc, 0);
      System.out.println("RootNode: " + rootNode.getLabel());
      return rootNode;
    } else {
      throw new NullPointerException("Unable to find the Root Node!");
    }
  }

  /*
   * Imports the parentlabel and childlabel from arclist into the tree.
   * Steps:
   * -----
   * 1.First ,the parentLabel and childLabel from arcList are converted into LabelNode.
   * 2.then,it is passed to "insertNode(LabelNode t_parentNode,LabelNode t_childnode)".
   *
   * The entire arclist is iterated until all the labels are stored.
   */

  public void buildLabelTree() {
    try {
      if (root_LocatorNode == null) throw new NullPointerException("Root Node is null.");
      // creates the labeltree with this rootnode
      labelTree = new LabelTree(new LabelNode(root_LocatorNode));
      this.importArcsIntoLabelTree();
    } catch (NullPointerException e) {
      System.out.println("Unable to create LabelTree!! " + e);
    }
  }

  public void buildLabelTree(String prefix) {
    try {
      if (root_LocatorNode == null) throw new NullPointerException("Root Node is null.");
      // creates the labeltree with this rootnode

      // Only useful in very very limited circumstances
      if (this.extendedLinkPrefix.equalsIgnoreCase("cal")) {
        labelTree = BuildLabelTree.buildLabelTree(root_LocatorNode, arcList);
      } else {
        // creates the labeltree with this rootnode
        labelTree = new LabelTree(new LabelNode(root_LocatorNode));
        this.importArcsIntoLabelTree();
      }

    } catch (NullPointerException e) {
      System.out.println("Unable to create LabelTree!! " + e);
    }
  }

  public void importArcsIntoLabelTree() {
    Iterator<Arc> itr = null;
    Arc tempArc = null;
    String parentLabel = null;
    String childLabel = null;
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
          // not accurate means of connecting href to tree locator item.
          String childHref = labelhrefMap.get(childLabel);
          String parentHref = labelhrefMap.get(parentLabel);
          // start inserting each arc element to the LabelTree.
          // inf loop if this never returns true
          if (labelTree.insertNode(
              new LabelNode(new Locator(parentLabel, 0, parentHref)),
              new LabelNode(new Locator(childLabel, order, childHref)))) {
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
  }

  public LinkedList<String> getLocatorList() {
    return locatorList;
  }

  public Map<String, List<String>> getExtendedLinkRoles() {
    return extendedLinkRoles;
  }

  public void viewTree() {
    //    System.out.println(labelTree);
    labelTree.displayEntireTree();
  }

  public LabelNode getTreeRootNode() {
    return labelTree.getRootNode();
  }

  public LinkedList<LabelNode> simpleTreeIterator() {
    return labelTree.simpleTreeIterator();
  }

  @Override
  public String toString() {
    return "LabelTreeProcessor{"
        + "locatorList="
        + locatorList
        + ", arcList_To="
        + arcList_To
        + ", arcList="
        + arcList
        + ", labelTree="
        + labelTree
        + ", root_LocatorNode="
        + root_LocatorNode
        + '}';
  }
}
