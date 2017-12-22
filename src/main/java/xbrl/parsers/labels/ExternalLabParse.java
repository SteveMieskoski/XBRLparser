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

public class ExternalLabParse implements ExternalLabCaller {
  String baseHrefResourceFile;
  SchemaContent schemaContent;
  public Map<String, LinkedList<LabelsContainer>> arcs = new HashMap<>();
  public String currentLink;
  List<FactElement> factItems;
  LinkedList<LabelsContainer> tlist;
  LinkedList<String> present;
  LinkedList<String> toPresent;
  Map<String, FactElement> factHolder;

  DualLinkedHashBidiMap<UUID, Element> elementMap;
  DualLinkedHashBidiMap<UUID, String> locMap;
  DualLinkedHashBidiMap<UUID, UUID> arcMap;
  Map<String, UUID> toMap;


  public ExternalLabParse(SchemaContent schemaContent, List<FactElement> factItems) {
    this.factItems = factItems;
    this.schemaContent = schemaContent;
    this.baseHrefResourceFile = "us-gaap-2017-01-31.xsd";
    elementMap = new DualLinkedHashBidiMap<>();
    arcMap = new DualLinkedHashBidiMap<>();
    toMap = new LinkedHashMap<>();

    locMap = new DualLinkedHashBidiMap<>();
    factHolder = new HashMap<>();
    present = new LinkedList<>();
    toPresent = new LinkedList<>();
  }

  public void parse(String url) throws Exception {
    System.out.println(" BEGIN PROCESSING EXTERNAL LABELS FOR FACTS");
        tlist = new LinkedList<>();
    processSchemas();
    for(FactElement fe: this.factItems){
      String label = fe.getSchemaId();
      if(label != null){
        present.add(label);
        factHolder.put(label, fe);
      }
      
    }
    processExternalLabels(url);
//    display();
  }

  private void processExternalLabels(String url){
    try {
      SAXReader reader = new SAXReader();
      Document document = reader.read(url);
      reader.addHandler("/linkbase", new Linkbase(this, 1));
      reader.read(url);
      System.out.println("*");
      reader.removeHandler("/linkbase");
      reader.addHandler("/linkbase", new Linkbase(this, 2));
      reader.read(url);
      System.out.println("*");
      reader.removeHandler("/linkbase");
      reader.addHandler("/linkbase", new Linkbase(this, 3));
      reader.read(url);
      System.out.println("*");
//      System.out.println(present);
    } catch (DocumentException e) {
      e.printStackTrace();
    }
  }


  public void processSchemas() {
    List<FactElement> facts = this.factItems;
//    List<SchemaContent> elements = this.schemaContents;
//    Map<String, SchemaElement> combinedSchema = new HashMap<>();
//    for (SchemaContent sc : elements) {
//      Map<String, SchemaElement> oneSchema = sc.getSchemaElementNameMap();
//      combinedSchema.putAll(oneSchema);
//    }
    for (FactElement fe : facts) {
      if (fe.getSchemaId() == null) {
        SchemaElement se = schemaContent.getSchemaElementNameMap().get(fe.getTag());
        if (se != null) {
          fe.setSchemaElement(se);
        } else if(fe.getNameSpace().equals("dei")){
          fe.setFactLabel(fe.getTag());
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
    for (FactElement ss : this.factItems) {
      System.out.println("================================");
        System.out.println(ss.getFactLabels());
    }
    System.out.println("display");
  }

  @Override
  public void constructLabel(Element element, UUID current, UUID prior) {
    String lbl = element.attributeValue("label");
    Element href = elementMap.get(arcMap.get(toMap.get(lbl)));
    String arcrole = elementMap.get(toMap.get(lbl)).attributeValue("arcrole");
    LabelElement le =createLabelElement(href, currentLink, arcrole);
    appendLabelElement(element, le);
    String[] split = href.attributeValue("href").split("#");
    HashMap<String, LabelElement> tmp = new HashMap<>();
    tmp.put(arcrole, le);
    factHolder.get(split[1]).setFactLabels(tmp);
  }

  @Override
  public void addItem(String element) {
  }

  @Override
  public void addLabelList() {
  }

  @Override
  public void addLabel(Element element) {
  }

  @Override
  public void addLoc(Element element) {
  }


  class Linkbase implements ElementHandler {

    public ExternalLabCaller caller;
    public Integer round;

    public Linkbase(ExternalLabCaller caller, Integer round) {
      this.round = round;
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();

      path.addHandler("labelLink", new Link(this.caller, this.round));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler("labelLink");
      element.detach();
    }
  }

  class Link implements ElementHandler {

    public ExternalLabCaller caller;
    public Integer round;

    public Link(ExternalLabCaller caller, Integer round) {
      this.round = round;
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();

      if(round == 1){
        path.addHandler("loc", new Loc(this.caller));
      } else if(round == 2){
        path.addHandler("labelArc", new Arc(this.caller));
      } else {
        this.caller.addItem(element.attributeValue("role"));
        path.addHandler("label", new Label(this.caller));
      }


    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      this.caller.addLabelList();
      if(round == 1){
        path.removeHandler("loc");
      } else if(round == 2){
        path.removeHandler("labelArc");
      } else {
        path.removeHandler("label");
      }
      element.detach();
    }
  }

  class Arc implements ElementHandler {

    public ExternalLabCaller caller;
    public Integer round;

    public Arc(ExternalLabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      String from = element.attributeValue("from");
      if(locMap.inverseBidiMap().containsKey(from)){
        System.out.print("*");
        UUID idval = UUID.randomUUID();
        arcMap.put(idval, locMap.inverseBidiMap().get(from));
        toMap.put(element.attributeValue("to"), idval);
        elementMap.put(idval, element);
      }
      element.detach();
    }
  }

  class Loc implements ElementHandler {

    public ExternalLabCaller caller;
    public Integer round;

    public Loc(ExternalLabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      String lbl = element.attributeValue("href");
      String[] split = lbl.split("#");
      if(present.contains(split[1])){
        System.out.print("*");
        UUID idval = UUID.randomUUID();
        locMap.put(idval, element.attributeValue("label"));
        elementMap.put(idval, element);
      }

      element.detach();
    }
  }

  class Label implements ElementHandler {

    public ExternalLabCaller caller;
    public Integer round;

    public Label(ExternalLabCaller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      String lbl = element.attributeValue("label");;
      if(toMap.containsKey(lbl)){
        System.out.print("*");
        UUID idval = UUID.randomUUID();
        elementMap.put(idval, element);
        this.caller.constructLabel(element, idval, toMap.get(lbl));
      }
      element.detach();
    }
  }
}
