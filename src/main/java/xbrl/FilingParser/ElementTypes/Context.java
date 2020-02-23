package xbrl.FilingParser.ElementTypes;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Context {
  public String id;
  public String entityIdentifier;
  public  String identifierSchema;
  public  List<XmlEntry> segments = new ArrayList<>();
  public String periodStart;
  public String periodEnd = null;
  public Boolean isInstant;
  public Boolean isForever = false;
  public String scenario;

  public Context() {}

  public Context(List<Element> elements) {
    for (Element element : elements) {
      parseHandler(element, element.getName());
    }
  }

  public void parseHandler(Element element, String name) {
    boolean withAttributes = false;
    XmlEntry xmlEntry = null;
    if (name.equals("context")) {
      this.id = element.attributeValue("id");
    } else if (name.equals("identifier")) {
      this.entityIdentifier = element.getText();
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          if (attribute.getName().equals("scheme")) {
            this.identifierSchema = attribute.getValue();
          }
        }
      }
    } else if (name.equals("startDate")) {
      this.periodStart = element.getText();

    } else if (name.equals("endDate")) {
      this.periodEnd = element.getText();

    } else if (name.equals("instant")) {
      this.periodStart = element.getText();
      this.isInstant = true;
    } else if (name.equals("explicitMember")) {
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          withAttributes = true;
//          System.out.println("Context.parseHandler"); // todo remove dev item
//          System.out.print(attribute.getName() + " : "); // todo remove dev item
//          System.out.println(attribute.getValue()); // todo remove dev item
          xmlEntry = new XmlEntry();
          xmlEntry.setAttribute(attribute.getName(), attribute.getValue());
        }
      }
      if (withAttributes) {
        xmlEntry.setTag(element.getName());
        xmlEntry.setText(element.getText());
        segments.add(xmlEntry);
      }
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEntityIdentifier() {
    return entityIdentifier;
  }

  public void setEntityIdentifier(String entityIdentifier) {
    this.entityIdentifier = entityIdentifier;
  }

  public List<XmlEntry> getSegments() {
    return segments;
  }

  public void setSegment(XmlEntry segment) {
    this.segments.add(segment);
  }

//  public boolean isInstant() {
//    return periodEnd == null;
//  }

  public String getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(String periodStart) {
    this.periodStart = periodStart;
  }

  public String getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
  }

  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public String getIdentifierSchema() {
    return identifierSchema;
  }

  public Boolean getInstant() {
    return isInstant;
  }

  public Boolean getForever() {
    return isForever;
  }

  @Override
    public String toString() {
        return "\nContext{" +
                "id='" + id + '\'' +
                ", entityIdentifier='" + entityIdentifier + '\'' +
                ", identifierSchema='" + identifierSchema + '\'' +
                ", segments=" + segments +
                ", periodStart='" + periodStart + '\'' +
                ", periodEnd='" + periodEnd + '\'' +
                ", scenario='" + scenario + '\'' +
                '}';
    }
}
