package xbrl.elementTypes;


import java.util.HashMap;

public class OrganizationElement extends AbstractOrganizationElement {

  @Override
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
  public void setTag(String tag) {
    String[] tagParts = tag.split(":");
    if (tagParts.length == 2) {
      setFieldName(tagParts[1]);
    } else {
      setFieldName(tag);
    }
    this.tag = tag;
  }

  @Override
  public String toString() {
    String base = super.toString();
    return "OrganizationElement{" + base;
  }


}
