package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import xbrl.elementTypes.ConstantValues;

import java.io.File;
import java.util.*;

public class ExtendedLink {
  public Map<String, List<String>> extendedLinkRoles;
  private Map<String, String> tagMap;
  private String extendedLinkPrefix;
  // this list contains the locator nodes.Used for validating only.
  private LinkedList<Locator> locatorList;
  private LinkedList<String> locatorLabelList;
  private LinkedHashMap<String, String> labelhrefMap;
  // this list contains the 'xlink:to' attrib values.
  // Used for subtraction with 'locatorList' list for finding the root node.
  private LinkedList<String> arcList_To;
  // this list contains the arc nodes.LabelNodes are created from here only.
  private LinkedList<Arc> arcList;
  private LabelTree labelTree;
  private Locator root_LocatorNode = null;
  // xml vars
  private Document document;

  public void loadFile(File xmlFile) {
    try {
      SAXReader reader = new SAXReader();
      document = reader.read(xmlFile);
      extendedLinkRoles = ExtendedLinkUtils.identifyExtendedLinks(document);

    } catch (DocumentException e) {
      System.out.println("Error while reading XML file!!" + e);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
  }

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
          AggregateLocators.LocReturn locReturn = AggregateLocators.populateLocatorList(roleNode);
          AggregateArcs.ArcReturn arcReturn = AggregateArcs.populateArcList(roleNode, tagMap);

          locatorList = locReturn.locatorList;
          locatorLabelList = locReturn.locatorLabels;

          arcList_To = arcReturn.arcList_To;
          arcList = arcReturn.arcList;
          // find the root node
          root_LocatorNode = getRootNode();

          break;
        }
      }
    } else {
      System.out.println("[ERROR] : Node \'" + tagMap.get("link") + "\' not found!");
    }
  }

  public Locator getRootNode() throws NullPointerException {
    LinkedList<String> tempArrayList = new LinkedList<>(this.locatorLabelList);
    ArrayList<Locator> shouldonlybeone = new ArrayList<>();
    // removes all the elements except one which should be the ROOTNODE
    if (arcList_To.size() != 0 && tempArrayList.removeAll(arcList_To)) {
      // only one element exists if everything is correct...
      String tempLoc = tempArrayList.iterator().next();
      for (Locator loc : locatorList) {
        if (loc.getLabel().equalsIgnoreCase(tempLoc)) {
          //                    System.out.println(loc);
          shouldonlybeone.add(loc);
        }
      }
      // create a root locator
      if (shouldonlybeone.size() == 1) {
        Locator rootNode = shouldonlybeone.get(0);
        rootNode.setSiblingOrder(0);
        System.out.println("RootNode: " + rootNode.getLabel());
        return rootNode;
      } else if (shouldonlybeone.size() > 1) {
        System.out.println("too many roots...?"); // figure out something to do if this happens.
      }

      return null;
    } else {
      throw new NullPointerException("Unable to find the Root Node!");
    }
  }

  public void buildLabelTree() {
    try {
      if (root_LocatorNode == null) throw new NullPointerException("Root Node is null.");
      // creates the labeltree with this rootnode
      labelTree = new LabelTree(new LabelNode(root_LocatorNode));
        AggregateStructure.importArcsIntoLabelTree(arcList, labelTree, locatorList );
    } catch (NullPointerException e) {
      System.out.println("Unable to create LabelTree!! " + e);
    }
  }

  public void setTagSet(String contentKey) {
    System.out.println("CURRENT EXTENDED LINK MAPPING: " + contentKey);
    this.extendedLinkPrefix = contentKey;
    this.tagMap = ConstantValues.linkNameForRelLinkbases(contentKey);
  }

  private List<Element> getEntireNodeList(String t_node) {
    List<Element> t_nodeList = document.getRootElement().elements(t_node);

    if (t_nodeList.size() > 0) return t_nodeList;
    else return null;
  }

    public Map<String, List<String>> getExtendedLinkRoles() {
        return extendedLinkRoles;
    }

    public void viewTree() {
        //    System.out.println(labelTree);
        labelTree.displayEntireTree();
    }
}
