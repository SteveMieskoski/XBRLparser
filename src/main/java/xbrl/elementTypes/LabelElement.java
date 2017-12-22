package xbrl.elementTypes;

public class LabelElement extends AbstractElement {

  // todo: look at spec and sec guidance in relation to removing relatedRole from LabelElement
  // todo: (used to track the containing link base role in order to enable linkbase (labelLink, etc.
  // ) content collection)
  protected String relatedRole;

  public LabelElement() {}

  public LabelElement(String defaultPrefix) {
    super(defaultPrefix);
  }

  public LabelElement(String customPrefix, String defaultPrefix) {
    super(customPrefix, defaultPrefix);
  }

  @Override
  public String toString() {
    String base = super.toString();
    return "LabelElement{" + base;
  }
}
