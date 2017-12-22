package xbrl.parsers.labels;

import org.dom4j.*;
import xbrl.elementTypes.ConstantValues;
import xbrl.elementTypes.LabelElement;
import xbrl.parsers.AbstractParser;
import xbrl.parsers.ILinkbaseParser;

import java.util.*;

public class LabelParser implements ILinkbaseParser, AbstractParser {

  public List<LabelElement> relationElements;
//  private Class<T> cls;
  private Integer index = 0;
  private boolean show = false;
  private String customPrefix;
  private String defaultPrefix;
  private String linkTypeRoleRef;
  private String linkType;

  public LabelParser() {
//    this.cls = cls;
    relationElements = new LinkedList<>();
  }

  public LabelParser(String customPrefix, String defaultPrefix, String linkType) {
//    this.cls = cls;
    linkNameForRelLinkbases(linkType);
    this.customPrefix = customPrefix;
    this.defaultPrefix = defaultPrefix;
    relationElements = new LinkedList<>();

  }

  @Override
  public List<LabelElement> parse(Document xmlDocument) {
    try {
      Element root = xmlDocument.getRootElement();
      String role;
      for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
        Element element = it.next();
        if (element.getName().equals(this.linkType)) {
          relationElements.add(createRelationElement(element, null, xmlDocument));
          role = element.attribute("role").getValue();

          for (Iterator<Element> nit = element.elementIterator(); nit.hasNext(); ) {
            Element node = nit.next();
            relationElements.add(createRelationElement(node, role, xmlDocument));
          }
        } else if (element.getName().equals("roleRef")) {
//          RoleRef roleRef = createRoleRef(element);
//          if (this.roleRefs == null) {
//            roleRefs = new HashMap<>();
//          }
//          roleRefs.put(roleRef.getRoleURI(), roleRef);
        } else if (element.getName().equals("arcroleRef")) {
          System.out.println("Arc role... Need to implement");
        }
      }
      return relationElements;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  private LabelElement createRelationElement(Element element, String role, Document document) {
    try {
      LabelElement relationElement = new LabelElement();
      relationElement.setDefaultPrefix(this.defaultPrefix);
      relationElement.setCustomPrefix(this.customPrefix);
      ++index;
      relationElement.setIndex(index);
      relationElement.setElementType(element.getName());
      if (element.attribute("type").getValue().equals("locator")) {
        relationElement = getArcDetails(relationElement, element, role, document);
      }
      if (role != null) {
        relationElement.setRelatedRole(role);
      }
      if (element.attributeValue("type").equals("resource")) {
        relationElement.setValue(element.getText());
      }
      for (Iterator<Attribute> attr = element.attributeIterator(); attr.hasNext(); ) {
        Attribute attribute = attr.next();
        relationElement.setAttribute(attribute.getName(), attribute.getValue());
      }
      return relationElement;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

//  private RoleRef createRoleRef(Element element) {
//    RoleRef roleRef = new RoleRef();
//    roleRef.setAssociatedLinkbaseType(this.linkTypeRoleRef);
//    for (Iterator<Attribute> attr = element.attributeIterator(); attr.hasNext(); ) {
//      Attribute attribute = attr.next();
//      roleRef.setAttribute(attribute.getName(), attribute.getValue());
//    }
//    return roleRef;
//  }

  private LabelElement getArcDetails(LabelElement item, Element element, String role, Document document) {
    String label = element.attributeValue("label");
    String xpath =
        "//*[normalize-space(@role)='" + role + "']/*[normalize-space(@to)='" + label + "']";
    XPath xpathSelector = DocumentHelper.createXPath(xpath);
    List results = xpathSelector.selectNodes(document);
    if (results.size() > 1) {
      LinkedList<LabelElement> checkedList = new LinkedList<>();
      for (LabelElement pe : relationElements) {
        if (pe.getLabel() != null) {
          if (pe.getLabel().equals(label)) {
            checkedList.add(pe);
          }
        }
      }
      if (checkedList.size() > 0) {
        for (Iterator iter = results.iterator(); iter.hasNext(); ) {
          Element element2 = (Element) iter.next();
          System.out.println(element2.attributeValue("to"));
          if (!checkedList.isEmpty()) {
            checkedList.pollFirst().setOrder(element2.attributeValue("order"));
          } else {
            item.setOrder(element2.attributeValue("order"));
            return item;
          }
        }
      }

    } else if (results.size() != 0) {
      for (Iterator iter = results.iterator(); iter.hasNext(); ) {
        Element element2 = (Element) iter.next();
        item.setOrder(element2.attributeValue("order"));
        return item;
      }
    }
    return item;
  }

  private void linkNameForRelLinkbases(String linkType) {
    switch (linkType) {
      case "calculation":
      case "calc":
      case "cal":
        this.linkType = ConstantValues.calculationLink_tag;
        this.linkTypeRoleRef = "cal";
        break;
      case "definition":
      case "def":
        this.linkType = ConstantValues.definitionLink_tag;
        this.linkTypeRoleRef = "def";
        break;
      case "newparse":
      case "pre":
        this.linkType = ConstantValues.presentationLink_tag;
        this.linkTypeRoleRef = "pre";
        break;
      case "reference":
      case "ref":
        this.linkType = "referenceLink";
        this.linkTypeRoleRef = "ref";
        break;
      case "label":
      case "lab":
      case "lbl":
        this.linkType = ConstantValues.labelLink_tag;
        this.linkTypeRoleRef = "lab";
        break;
    }
  }

//  public Map<String, RoleRef> getRoleRefs() {
//    return roleRefs;
//  }

  @Override
  public String toString() {
    return "LabelParser{"
        + ", index="
        + index
        + ", show="
        + show
        + ", customPrefix='"
        + customPrefix
        + '\''
        + ", defaultPrefix='"
        + defaultPrefix
        + '\''
        + ", linkTypeRoleRef='"
        + linkTypeRoleRef
        + '\''
        + ", linkType='"
        + linkType
        + '\''
        + ", relationElements="
        + relationElements
//        + ", roleRefs="
//        + roleRefs
        + '}';
  }
}
