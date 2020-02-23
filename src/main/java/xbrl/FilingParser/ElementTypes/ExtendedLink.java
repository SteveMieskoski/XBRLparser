package xbrl.FilingParser.ElementTypes;

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
