package xbrl.experimentalParsers.elements;

public class SimpleType {

  private final String type = "simple";
    private final String href;
//  private String href;
  private String arcrole;
  private String role;
  private String title;
  private String show;
  private String actuate;

  // don't like having a default constructor but it seems that other
  // elements of type simple are not required to have the same
  // required attributes.  (doesn't make sense to me, but that is what I have seen)

  public SimpleType(String href) {
    this.href = href;
  }

  public String getHref() {
    return href;
  }

  public String getArcrole() {
    return arcrole;
  }

  public void setArcrole(String arcrole) {
    this.arcrole = arcrole;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }

  public String getActuate() {
    return actuate;
  }

  public void setActuate(String actuate) {
    this.actuate = actuate;
  }
}
