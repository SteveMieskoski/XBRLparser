package xbrl.experimentalParsers.priorExps.currentExp;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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
//  // Root tag
//  private static final String ext_PresentationLink = "link:presentationLink";
//  private static final String ext_PresentationLinkAttrib_role = "xlink:role";
//  // Locator tag
//  private static final String loc_Presentation = "link:loc";
//  private static final String loc_Presentation_Label = "xlink:label";
//  // Arc tag
//  private static final String arc_Presentation = "link:presentationArc";
//  private static final String arc_Presentation_From = "xlink:from";
//  private static final String arc_Presentation_To = "xlink:to";
//  private static final String arc_Presentation_Order = "order";

  // Root tag
  private static final String ext_PresentationLink = "presentationLink";
  private static final String ext_PresentationLinkAttrib_role = "role";
  // Locator tag
  private static final String loc_Presentation = "loc";
  private static final String loc_Presentation_Label = "label";
  // Arc tag
  private static final String arc_Presentation = "presentationArc";
  private static final String arc_Presentation_From = "from";
  private static final String arc_Presentation_To = "to";
  private static final String arc_Presentation_Order = "order";
  // list containing the extended link roles
  private List<String> extendedLinkRoles;
  // this list contains the locator nodes.Used for validating only.
  private ArrayList<String> locatorList;
  // this list contains the 'xlink:to' attrib values.Used for subtraction with 'locatorList' list
  // for
  // finding the root node.
  private ArrayList<String> arcList_To;
  // this list contains the arc nodes.LabelNodes are created from here only.
  private ArrayList<Arc> arcList;
  private LabelTree labelTree;
  private Locator root_LocatorNode = null;
  // xml vars
  private DocumentBuilderFactory db_factory;
  private DocumentBuilder doc_builder;
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
      List<Element> linkNodes = document.getRootElement().elements(ext_PresentationLink);
      extendedLinkRoles = linkNodes.stream().map(element -> element.attributeValue("role")).collect(Collectors.toList());
//      db_factory = DocumentBuilderFactory.newInstance();
//      doc_builder = db_factory.newDocumentBuilder();
//      document = doc_builder.parse(xmlFile);
/*    } catch (ParserConfigurationException e) {
      System.out.println("Error while initializing document builders!!" + e);
    } catch (SAXException e) {
      System.out.println("Error while reading XML file!!" + e);*/
    } catch (DocumentException e) {
      System.out.println("Error while reading XML file!!" + e);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
//    return document;
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
  private void printNodeList(List<Element> nodeList) {
    System.out.println("NodeList Details:LENGTH=" + nodeList.size());
    System.out.println("----------------");
    for (int i = 0; i < nodeList.size(); i++) {
      System.out.println("node[" + i + "] : " + nodeList.get(i).getName());
    }
  }

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
              //.a().getNamedItem().getNodeValue();
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
      locatorList = new ArrayList<String>();

      // getting the child nodes of this particulat presentation node
      List<Element> nodeList = t_roleNode.elements();
      // System.out.println("Received Locators count:"+nodeList.getLength());
      // this.printNodeList(nodeList);

      // extracting only locator(link:loc) nodes from the nodeList
      List<Element> list_LocatorNodeList = this.extractNodes(nodeList, loc_Presentation);

      // extracting Locator attribute:labels
      String[] locatorLabels =
          this.extractNodesAttributes(list_LocatorNodeList, loc_Presentation_Label);

      // adding to locatorList(ArrayList)
      Collections.addAll(locatorList, locatorLabels);

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

    System.out.println("[POPULATE_ArcList]:Extracting arcs");
    if (t_roleNode.elements().size() > 0) {
      // initializing arclist and arcTo list
      arcList_To = new ArrayList<String>();
      arcList = new ArrayList<Arc>();

      // getting the child nodes of this particulat presentation node
      List<Element> nodeList = t_roleNode.elements();

      // extracting only arc(link:presentationArc) nodes from the nodeList
      List<Element> list_ArcNodeList =
          this.extractNodes(nodeList, LabelTreeProcessor.arc_Presentation);

      // extracting xlink:from, xlink:to and order attribute from the list_ArcNodeList..
      Arc_From_Values = this.extractNodesAttributes(list_ArcNodeList, arc_Presentation_From);
      Arc_To_Values = this.extractNodesAttributes(list_ArcNodeList, arc_Presentation_To);
      orders = this.extractNodesAttributes(list_ArcNodeList, arc_Presentation_Order);

      System.out.println("Extracted Arc Info:");
      System.out.println("  COUNTS::  Arc_From:" + Arc_From_Values.length);
      System.out.println("            Arc_From:" + Arc_To_Values.length);
      System.out.println("            Order:" + orders.length);

      // creating 'arc' object and inserting 'from' , 'to' ,'order' values.
      for (int i = 0; i < list_ArcNodeList.size(); i++) {
        arcList.add(new Arc(Arc_From_Values[i], Arc_To_Values[i], Float.parseFloat(orders[i])));

        // also populate 'arcList_To' arraylist
        arcList_To.add(Arc_To_Values[i]);
      } // outer-for

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
    List<Element> nodeList_PresentationLink = getEntireNodeList(ext_PresentationLink);
    if (nodeList_PresentationLink != null) {
      String roleNodeName = null;
      Element roleNode = null;

      // checking the 'role' attribute of all the retrieved 'link:presentation' nodes
      for (int i = 0; i < nodeList_PresentationLink.size(); i++) {
        // storing the rolenode
        roleNode = nodeList_PresentationLink.get(i);
        // getting the value of 'xlink:role' attr
        roleNodeName =
            nodeList_PresentationLink.get(i).attributeValue(ext_PresentationLinkAttrib_role);

         System.out.println("Debug:"+roleNodeName);
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
        } // if
      } // for
    } else {
      System.out.println("[ERROR] : Node \'" + ext_PresentationLink + "\' not found!");
    }
  }

  /*
   * Finds the root node in the XLink document.
   *
   *
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
  public void importArcsIntoLabelTree() {
    Iterator<Arc> itr = null;
    Arc tempArc = null;

    String parentLabel = null;
    String childLabel = null;
    float order = 0F;
    try {
      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Started.Current Node Count in Tree="
              + labelTree.getNodeCount());
      if (arcList == null) throw new NullPointerException();

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

          // start inserting each arc element to the LabelTree.
          if (labelTree.insertNode(
              new LabelNode(new Locator(parentLabel, 0)),
              new LabelNode(new Locator(childLabel, order))))
            itr.remove(); // removes the element if successfully inserted into tree.
        } // inner-while
        passCount++;
      } // while

      System.out.println(
          "[IMPORT:ArcList-->LabelTree]:Completed.Node Count in Tree=" + labelTree.getNodeCount());
    } catch (NullPointerException e) {
      System.out.println("ERROR:Unable to import ArcList into Tree. ArcList is not created! " + e);
    }
  }

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

  public ArrayList<String> getLocatorList() {
    return locatorList;
  }

  public List<String> getExtendedLinkRoles() {
    return extendedLinkRoles;
  }

  public void viewTree() {
    System.out.println(labelTree);
    labelTree.displayEntireTree();
  }
}
