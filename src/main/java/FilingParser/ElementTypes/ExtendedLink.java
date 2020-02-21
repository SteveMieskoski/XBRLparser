package FilingParser.ElementTypes;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.*;

public class ExtendedLink {
  public String uuid;
  public String tag;
  public String type;
  public String role;
  public String title;
  public String schema;
  public Map<String, String> additional = null;

  public List<Arc> arcs = new ArrayList<>();
  public List<Loc> locs = new ArrayList<>();

  public ExtendedLink() {}

  //  public ExtendedLink(List<Element> elements){
  //    this(elements, "default");
  //  }

  public ExtendedLink(List<Element> elements) {
    uuid = UUID.randomUUID().toString();
    Element parent = elements.get(0);
    this.tag = parent.getName();
    String arcName = parent.getName().replace("Link", "Arc");
    for (Iterator<Attribute> attrIter = parent.attributeIterator(); attrIter.hasNext(); ) {
      Attribute attribute = attrIter.next();
      if (attribute != null) {
        switch (attribute.getName()) {
          case "type":
            this.type = attribute.getValue();
            break;
          case "role":
            this.role = attribute.getValue();
            break;
          case "title":
            this.title = attribute.getValue();
            break;
          case "xmlns":
            this.schema = attribute.getValue();
            break;
          default:
            if (additional == null) {
              additional = new HashMap<>();
              additional.put(attribute.getName(), attribute.getValue());
            }
        }
      }
    }
    for (Element element : elements) {
      if (element.getName().equals(arcName)) {
        arcs.add(new Arc(element));
      }

      if (element.getName().equals("loc")) {
        locs.add(new Loc(element));
      }
    }
  }

  public void parseHandler(List<Element> elements) {
    Element parent = elements.get(0);
    this.tag = parent.getName();
    String arcName = parent.getName().replace("Link", "Arc");
    for (Iterator<Attribute> attrIter = parent.attributeIterator(); attrIter.hasNext(); ) {
      Attribute attribute = attrIter.next();
      if (attribute != null) {
        switch (attribute.getName()) {
          case "type":
            this.type = attribute.getValue();
            break;
          case "role":
            this.role = attribute.getValue();
            break;
          case "title":
            this.title = attribute.getValue();
            break;
          default:
            if (additional == null) {
              additional = new HashMap<>();
              additional.put(attribute.getName(), attribute.getValue());
            }
        }
      }
    }
    for (Element element : elements) {
      if (element.getName().equals(arcName)) {
        arcs.add(new Arc(element));
      }

      if (element.getName().equals("loc")) {
        locs.add(new Loc(element));
      }
    }
  }

  public class Arc {
    public String type;
    public String from;
    public String to;
    public String arcrole;
    public String order;
    public String use;
    public String weight;
    public String priority;
    public Map<String, String> additional = null;

    public Arc(Element element) {
      parseHandler(element);
    }

    public void parseHandler(Element element) {
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          switch (attribute.getName()) {
            case "type":
              this.type = attribute.getValue();
              break;
            case "from":
              this.from = attribute.getValue();
              break;
            case "to":
              this.to = attribute.getValue();
              break;
            case "arcrole":
              this.arcrole = attribute.getValue();
              break;
            case "order":
              this.order = attribute.getValue();
              break;
            case "use":
              this.use = attribute.getValue();
              break;
            case "weight":
              this.weight = attribute.getValue();
              break;
            case "priority":
              this.priority = attribute.getValue();
              break;
            default:
              if (additional == null) {
                additional = new HashMap<>();
                additional.put(attribute.getName(), attribute.getValue());
              }
          }
        }
      }
    }

    @Override
    public String toString() {
      return "\n\tArc{"
          + "type='"
          + type
          + '\''
          + ", from='"
          + from
          + '\''
          + ", to='"
          + to
          + '\''
          + ", arcrole='"
          + arcrole
          + '\''
          + ", order='"
          + order
          + '\''
          + ", use='"
          + use
          + '\''
          + ", weight='"
          + weight
          + '\''
          + ", priority='"
          + priority
          + '\''
          + ", additional="
          + additional
          + '}';
    }
  }

  public class Loc {
    public String href;
    public String type;
    public String label;
    public String role; // Optional
    public String title; // Optional
    public Map<String, String> additional = null;

    public Loc(Element element) {
      parseHandler(element);
    }

    public void parseHandler(Element element) {
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          switch (attribute.getName()) {
            case "href":
              this.href = attribute.getValue();
              break;
            case "label":
              this.label = attribute.getValue();
              break;
            case "role":
              this.role = attribute.getValue();
              break;
            case "title":
              this.title = attribute.getValue();
              break;
            case "type":
              this.type = attribute.getValue();
              break;
            default:
              if (additional == null) {
                additional = new HashMap<>();
                additional.put(attribute.getName(), attribute.getValue());
              }
          }
        }
      }
    }

    @Override
    public String toString() {
      return "\n\tLoc{"
          + "href='"
          + href
          + '\''
          + ", label='"
          + label
          + '\''
          + ", role='"
          + role
          + '\''
          + ", title='"
          + title
          + '\''
          + ", additional="
          + additional
          + '}';
    }
  }

  @Override
  public String toString() {
    return "\nExtendedLink{"
        + "tag='"
        + tag
        + '\''
        + ", type='"
        + type
        + '\''
        + ", role='"
        + role
        + '\''
        + ", title='"
        + title
        + '\''
        + ", additional="
        + additional
        + ", arcs="
        + arcs
        + ", locs="
        + locs
        + '}';
  }
}
