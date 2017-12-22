package xbrl.experimentalParsers.extendedLink;

import org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import xbrl.elementTypes.ConstantValues;
import xbrl.experimentalParsers.Caller;

import java.util.*;

/**
 * WARNING: this implementation and related classes are very experimental and primarily a trial demonstration
* */
public class ExtendedLinkOrig implements Caller {

  private Map<String, ArcNode> roots = new HashMap<>();
  private Map<String, ArcNodeIter> iters = new HashMap<>();

  private String currentLink;
  private DualLinkedHashBidiMap<UUID, Element> elementMap;
    //locMap:  relates element in element map to the label string value here by a uuid
  private DualLinkedHashBidiMap<UUID, String> locMap;
  private DualLinkedHashBidiMap<UUID, String> arcMap;

  private Map<String, String> tagMap;
  private LinkedHashMap<String, LinkedHashSet<Element>> elementsInOrder;

  public ExtendedLinkOrig(String type) {
    tagMap = ConstantValues.linkNameForRelLinkbases(type);
    elementMap = new DualLinkedHashBidiMap<>();
    locMap = new DualLinkedHashBidiMap<>();
    arcMap = new DualLinkedHashBidiMap<>();
    elementsInOrder = new LinkedHashMap<>();
  }

  public void parse(String url) throws Exception {
    SAXReader reader = new SAXReader();

    reader.addHandler("/linkbase", new Linkbase(this));

    Document document = reader.read(url);


    for (String ss : this.roots.keySet()) {

      ArcNodeIter arcNodeIter = new ArcNodeIter(this.roots.get(ss));
      this.iters.put(ss, arcNodeIter);
    }
    for (String ss : this.roots.keySet()) {

      ArcNodeIter arcNodeIter = new ArcNodeIter(this.roots.get(ss));
      this.iters.put(ss, arcNodeIter);
    }
    for (String ss : this.roots.keySet()) {
      System.out.println("================================");
      ArcNodeIter arcNodeIter = new ArcNodeIter(this.roots.get(ss));
      for(UUID el: arcNodeIter.getMarked()){
        System.out.println(el);
//        System.out.println(el.attributeValue("to") + " : " + el.attributeValue("order"));
      }


    }
//    displayDemoTwo();
//    displayDemo();
  }

  private void displayDemo() {
    for (String ss : this.elementsInOrder.keySet()) {
      ArcProcessor.process(new LinkedList<>(this.elementsInOrder.get(ss)));
    }
  }

  private void displayDemoTwo() {
    for (String ss : this.roots.keySet()) {
      System.out.println("================================");
      ArcNodeIter arcNodeIter = new ArcNodeIter(this.roots.get(ss));
      Boolean initialItem = true;
      Integer offset = 1;
      Integer priorOrder = 0;
      String rootString = arcNodeIter.getStack().peekFirst();
      LinkedHashSet<Element> collectElements = new LinkedHashSet<>();
      String[] rootParts = rootString.split("@@");
      System.out.println(rootParts[0]);
      Element root = arcNodeIter.getElements().peekFirst();
      if (root == null) {
        arcNodeIter.getElements().pollFirst();
        root = arcNodeIter.getElements().peekFirst();
        collectElements.add(root);
      } else {
        collectElements.add(root);
      }
      LinkedList<String> doubleCheck = new LinkedList<>();
      for (Element uuid : arcNodeIter.getElements()) {
        if (uuid != null) {
          if (uuid.equals(root)) {
            offset = 1;
            if (initialItem) {
              initialItem = false;
            } else {
              priorOrder = Integer.parseInt(uuid.attributeValue("order"));
            }
          } else {
            if (!doubleCheck.contains(
                uuid.attributeValue("from") + " " + uuid.attributeValue("to"))) {
              doubleCheck.add(uuid.attributeValue("from") + " " + uuid.attributeValue("to"));
              Integer currentOrder = Integer.parseInt(uuid.attributeValue("order"));
              if (priorOrder >= currentOrder) {
                offset += 1;
              }
              priorOrder = currentOrder;
              String buffer = "\t";
              for (int i = 0; i <= offset; i++) {
                buffer += "\t";
              }
              collectElements.add(uuid);
              System.out.println(buffer + uuid.attributeValue("to") + " : " + uuid.attributeValue("order"));
//              System.out.println(buffer + uuid.attributeValue("to"));
            } else {
              offset = 2;
              Integer currentOrder = Integer.parseInt(uuid.attributeValue("order"));
              if (priorOrder >= currentOrder) {
                offset += 1;
              }
              priorOrder = currentOrder;
              String buffer = "\t";
              for (int i = 0; i <= offset; i++) {
                buffer += "\t";
              }
              collectElements.add(uuid);
            }
          }
        } else {
          offset = 1;
          System.out.println(root.attributeValue("from"));
        }
      }
      elementsInOrder.put(ss, collectElements);
    }
    System.out.println("display Two");
  };

  @Override
  public void addItem(String element) {
    this.currentLink = element;
    System.out.println("======================================");
  }

  @Override
  public void addArc(String from, String to, String order, Element element) {

    if (this.roots.containsKey(currentLink)) {

      UUID preId = UUID.randomUUID();


      ArcNode an = this.roots.get(currentLink).find(from);

      UUID uid = arcMap.inverseBidiMap().get(element.attributeValue("from"));
      Element fromElement = elementMap.get(uid);
      if (fromElement != null) {

        an.findParentAddChild(
            element.attributeValue("from"),
            fromElement.attributeValue("order"),
            to,
            order,
            preId,
            element);
      } else {
        System.out.println("from element = null");
        an.findParentAddChild(
            element.attributeValue("from"),
            element.attributeValue("order"),
            to,
            order,
            preId,
            element);
      }

    } else {

      UUID preFromId = UUID.randomUUID();

      ArcNode arcNode = new ArcNode(null, from, order, preFromId);
      System.out.println(element);

      UUID preToId = UUID.randomUUID();

      arcNode.findParentAddChild(
          element.attributeValue("from"),
          element.attributeValue("order"),
          to,
          order,
          preToId,
          element);

      this.roots.put(currentLink, arcNode);
    }
  }

  private LinkedList<String> arrayToList(String[] pathParts) {
    LinkedList<String> transferlist = new LinkedList<>();
    transferlist.addAll(Arrays.asList(pathParts));
    return transferlist;
  }

  @Override
  public void addLoc(String label, String href) {
  }

  class Linkbase implements ElementHandler {

    public Caller caller;

    public Linkbase(Caller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      path.addHandler(tagMap.get("link"), new Link(this.caller));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler(tagMap.get("link"));
      element.detach();
    }
  }

  class Link implements ElementHandler {

    public Caller caller;

    public Link(Caller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
      this.caller.addItem(element.attributeValue("role"));
      path.addHandler(tagMap.get("arc"), new Arc(this.caller));
      path.addHandler(tagMap.get("loc"), new Loc(this.caller));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler(tagMap.get("arc"));
      path.removeHandler(tagMap.get("loc"));
      element.detach();
    }
  }

  class Arc implements ElementHandler {

    public Caller caller;

    public Arc(Caller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      UUID idval = UUID.randomUUID();
      elementMap.put(idval, element);
      String from = element.attributeValue("from");

      String to = element.attributeValue("to");
      arcMap.put(idval, to);
      String order = element.attributeValue("order");
      this.caller.addArc(from, to, order, element);
      element.detach();
    }
  }

  class Loc implements ElementHandler {

    public Caller caller;

    public Loc(Caller caller) {
      this.caller = caller;
    }

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      UUID idval = UUID.randomUUID();
      locMap.put(idval, element.attributeValue("label"));
      elementMap.put(idval, element);
      element.detach();
    }
  }

  class Label implements ElementHandler {
    @Override
    public void onStart(ElementPath elementPath) {}

    @Override
    public void onEnd(ElementPath elementPath) {}
  }
}
