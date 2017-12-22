package xbrl.elementTypes;

import org.apache.commons.lang3.NotImplementedException;
import xbrl.exceptions.AttributeFormatException;

import java.util.ArrayList;
import java.util.HashMap;

public class FactElement extends AbstractFact {

  private Boolean hasTotalLabel;
  private String temporalType;
  private String schemaName;

  @Override
  public String getTag() {
    return tag;
  }

  @Override
  public void setTag(String tag) {
    try {
      if (tag.contains(":")) {
        String[] tagParts = tag.split(":");
        if (tagParts.length > 1) {
          setConceptTag(tagParts[1]);
        } else {
          throw new AttributeFormatException(
              "AttributeParseException: Failed to extract tag from fact element - " + tag);
        }
        setNameSpace(tagParts[0]);
        this.tag = tag;
      } else {
        this.tag = tag;
      }
    } catch (AttributeFormatException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void setAttributes(String name, String value) {
    switch (name) {
      case "xbrli:contextRef":
      case "contextRef":
        setContextRef(value);
        break;
      case "xbrli:id":
      case "id":
        setId(value);
        break;
      case "xbrli:decimals":
      case "decimals":
        setDecimals(value);
        break;
      case "xbrli:unitRef":
      case "unitRef":
        setUnitRef(value);
        break;
      default:
        if (this.additionalAttributes == null) {
          this.additionalAttributes = new HashMap<>();
        }
        this.additionalAttributes.put(name, value);
        break;
    }
  }

  @Override
  public void setFactLabels(HashMap<String, LabelElement> factLabels) {
    for(String s: factLabels.keySet()){
      if("http://www.xbrl.org/2003/role/label".equals(factLabels.get(s).getRole())){
        setFactLabel(factLabels.get(s).getValue());
      } /*else if("http://www.xbrl.org/2003/role/totalLabel".equals(factLabels.get(s).getRole())){
        setFactLabel(factLabels.get(s).getValue());
        break;
      }*/
    }
    super.setFactLabels(factLabels);
  }

  @Override
  public void processContextRef(String context) {
    throw new NotImplementedException("processContextRef is not currently available");
  }

  @Override
  public void addAxis(String ax) {
    if (this.axis == null) {
      this.axis = new ArrayList<>();
    }
    this.axis.add(ax.replace("Axis", ""));
  }

  @Override
  public void addMember(String ax) {
    if (this.member == null) {
      this.member = new ArrayList<>();
    }
    this.member.add(ax.replace("Member", ""));
  }

  @Override
  public SchemaElement getSchemaElement() {
    return schemaElement;
  }

  @Override
  public void setSchemaElement(SchemaElement schemaElement) {
    if (schemaElement != null) {
      this.schemaId = schemaElement.getId();
      this.schemaName = schemaElement.getName();
    }
    this.schemaElement = schemaElement;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public String getTemporalType() {
    return temporalType;
  }

  public void setTemporalType(String temporalType) {
    this.temporalType = temporalType;
  }
}
