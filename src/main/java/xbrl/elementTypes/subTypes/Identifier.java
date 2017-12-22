package xbrl.elementTypes.subTypes;

public class Identifier {

  protected String value;
  protected String scheme;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getScheme() {
    return scheme;
  }

  public void setScheme(String value) {
    this.scheme = value;
  }

  @Override
  public String toString() {
    return "Identifier{" + "value='" + value + '\'' + ", scheme='" + scheme + '\'' + '}';
  }
}
