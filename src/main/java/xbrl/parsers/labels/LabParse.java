package xbrl.parsers.labels;

import org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import xbrl.elementTypes.FactElement;
import xbrl.elementTypes.LabelElement;
import xbrl.elementTypes.LabelsContainer;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;

import java.util.*;

public class LabParse implements LabCaller {

  public Map<String, Map<String, LabelsContainer>> arcs = new HashMap<>();
  public String currentLink;

  LinkedList<LabelsContainer> tlist;
  LinkedList<String> fromPresent;
  LinkedList<String> toPresent;

  DualLinkedHashBidiMap<UUID, Element> elementMap;
  DualLinkedHashBidiMap<UUID, String> locMap;

  public LabParse() {
    elementMap = new DualLinkedHashBidiMap<>();
    locMap = new DualLinkedHashBidiMap<>();

    fromPresent = new LinkedList<>();
    toPresent = new LinkedList<>();
  }

  public Map<String, Map<String, LabelsContainer>> parse(String url) throws Exception {
//    System.out.println(url);
//    System.out.println();
    SAXReader reader = new SAXReader();
    Document document = reader.read(url);
    tlist = new LinkedList<>();
    List<Node> arcNodes = document.getRootElement().selectNodes("//*[name()='labelArc']");
    for (Node n : arcNodes) {
      Element element = (Element) n;
      String arcrole = element.attributeValue("arcrole");
      String from = element.attributeValue("from");
      String to = element.attributeValue("to");
      LabelsContainer labelsContainer = new LabelsContainer(from, to, arcrole);
      fromPresent.add(from);
      toPresent.add(to);
      tlist.add(labelsContainer);
    }

    reader.addHandler("/linkbase", new Linkbase(this));

    reader.read(url);
    //    System.out.println(fromPresent);
//            display();
    return arcs;
  }

  public void addLabelsToFacts(SchemaContent schemaContent, List<FactElement> factItems) {

    for (FactElement fe : factItems) {
      if (fe.getSchemaId() == null) {
        SchemaElement se = schemaContent.getSchemaElementNameMap().get(fe.getTag());
        if (se != null) {
//          System.out.println(se);
          fe.setSchemaElement(se);
        }
      } else if(fe.getNameSpace().equals("dei")){
        fe.setFactLabel(fe.getTag());
      }
    }

    for (FactElement fe : factItems) {
      for (String ss : arcs.keySet()) {
//        System.out.println("================================");
        if (fe.getSchemaId() != null && fe.getFactLabels() == null) {
          if(arcs.get(ss).keySet().contains(fe.getSchemaId())){

            for (String sss : arcs.get(ss).keySet()) {
              if(sss.equals(fe.getSchemaId())){

                fe.setFactLabels((HashMap<String, LabelElement>) arcs.get(ss).get(sss).getRelatedLabels());
              }
            }
          }
        }
      }
    }



  }

  private LabelElement createLabelElement(Element element, String role, String arcrole) {
    try {
      LabelElement labelElement = new LabelElement();
      labelElement.setElementType(element.getName());
      labelElement.setOrder(element.attributeValue("order"));
      labelElement.setArcrole(arcrole);
      if (element.attributeValue("type").equals("resource")) {
        labelElement.setValue(element.getText());
      }
      if (role != null) {
        labelElement.setRelatedRole(role);
      }

      for (Iterator<Attribute> attr = element.attributeIterator(); attr.hasNext(); ) {
        Attribute attribute = attr.next();
        labelElement.setAttribute(attribute.getName(), attribute.getValue());
      }
      return labelElement;

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  private void appendLabelElement(Element element, LabelElement labelElement) {
    try {

      labelElement.setOrder(element.attributeValue("order"));
      if (element.getText().isEmpty()) {
        labelElement.setLabel(element.attributeValue("label"));
        labelElement.setHref(element.attributeValue("href"));
      } else {
        labelElement.setRole(element.attributeValue("role"));
        labelElement.setElementType(element.getName());
        labelElement.setType(element.attributeValue("type"));
        labelElement.setValue(element.getText());
        labelElement.setLang(element.attributeValue("lang"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void display() {
    for (String ss : arcs.keySet()) {
      System.out.println("================================");
      for (String sss: arcs.get(ss).keySet()) {
        LabelsContainer pe = arcs.get(ss).get(sss);
        System.out.println(sss);
//        for (String s : pe.getRelatedLabels().keySet()) {
//
//          System.out.println(pe.getRelatedLabels().get(s));
//        }
        System.out.println();
      }
    }
    System.out.println("display");
  }

  @Override
  public void addItem(String element) {
    currentLink = element;
    arcs.put(currentLink, new LinkedHashMap<>());
  }

  @Override
  public void addLabelList() {
    for(LabelsContainer lc: tlist){
      arcs.get(currentLink).put(lc.label, lc);
    }

  }

  @Override
  public void addLabel(Element element) {
    String to = element.attributeValue("label");
    for (LabelsContainer lc : tlist) {
      if (lc.to.equals(to)) {
        //        System.out.println("To: " + to);
        if (lc.getRelatedLabels().containsKey(lc.arcrole)) {
          appendLabelElement(element, lc.getRelatedLabels().get(lc.arcrole));
        } else {
          lc.addRelatedLabel(lc.arcrole, createLabelElement(element, currentLink, lc.arcrole));
        }
      }
    }
  }

  @Override
  public void addLoc(Element element) {
    String from = element.attributeValue("label");
    for (LabelsContainer lc : tlist) {
      if (lc.from.equals(from)) {
        //        System.out.println("From: " + from);
        if (lc.getRelatedLabels().containsKey(lc.arcrole)) {
          appendLabelElement(element, lc.getRelatedLabels().get(lc.arcrole));
        } else {
          lc.addRelatedLabel(lc.arcrole, createLabelElement(element, currentLink, lc.arcrole));
        }
      }
    }
  }

  class Linkbase implements ElementHandler {

    public LabCaller caller;

    public Linkbase(LabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();

      path.addHandler("labelLink", new Link(this.caller));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler("labelLink");
      element.detach();
    }
  }

  class Link implements ElementHandler {

    public LabCaller caller;

    public Link(LabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
      this.caller.addItem(element.attributeValue("role"));
      path.addHandler("label", new Label(this.caller));
      path.addHandler("loc", new Loc(this.caller));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      this.caller.addLabelList();
      path.removeHandler("label");
      path.removeHandler("loc");
      element.detach();
    }
  }

  class Arc implements ElementHandler {

    public LabCaller caller;

    public Arc(LabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      element.detach();
    }
  }

  class Loc implements ElementHandler {

    public LabCaller caller;

    public Loc(LabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      String lbl = element.attributeValue("label");

      if (fromPresent.contains(lbl)) {
        //        System.out.println("From check: " + lbl);
        this.caller.addLoc(element);
      }
      element.detach();
    }
  }

  class Label implements ElementHandler {

    public LabCaller caller;

    public Label(LabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      String lbl = element.attributeValue("label");
      if (toPresent.contains(lbl)) {
        this.caller.addLabel(element);
      }
      element.detach();
    }
  }
}
