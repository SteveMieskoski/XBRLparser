package xbrl.experimentalParsers.elements;

public class ExtendedType {

  private final String type = "extended";
  private final String role;
  private String title;
  private String id;
  private String base;

  public ExtendedType(String role) {
    this.role = role;
  }

  public String getType() {
    return type;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public String getRole() {
    return role;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
