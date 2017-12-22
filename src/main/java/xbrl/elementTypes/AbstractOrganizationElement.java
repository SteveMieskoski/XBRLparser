package xbrl.elementTypes;

import java.util.HashMap;

abstract class AbstractOrganizationElement extends AbstractElement {

  protected String contextRef;
  protected String tag;
  protected String fieldName;
  protected String value;

  protected boolean numeric = false;
  protected String decimals;
  protected String unitRef;
  protected String id;
  protected HashMap<String, String> additionalAttributes;

  public void setAttributes(String name, String value) {
    switch (name) {
      case "contextRef":
        setContextRef(value);
        break;
      case "decimals":
        setNumeric(true);
        setDecimals(value);
        break;
      case "id":
        setId(value);
        break;
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
  public HashMap<String, String> getAdditionalAttributes() {
    return additionalAttributes;
  }

  @Override
  public void setAdditionalAttributes(HashMap<String, String> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public String getContextRef() {
    return contextRef;
  }

  public void setContextRef(String contextRef) {
    this.contextRef = contextRef;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isNumeric() {
    return numeric;
  }

  public void setNumeric(boolean numeric) {
    this.numeric = numeric;
  }

  public String getDecimals() {
    return decimals;
  }

  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }

  public String getUnitRef() {
    return unitRef;
  }

  public void setUnitRef(String unitRef) {
    this.unitRef = unitRef;
  }

  @Override
  public String toString() {
    return  "contextRef='"
            + contextRef
            + '\''
            + ", tag='"
            + tag
            + '\''
            + ", value='"
            + value
            + '\''
            + ", numeric="
            + numeric
            + ", decimals='"
            + decimals
            + '\''
            + ", unitRef='"
            + unitRef
            + '\''
            + ", id='"
            + id
            + '\''
            + ", additionalAttributes="
            + additionalAttributes
            + '}';
  }
}
