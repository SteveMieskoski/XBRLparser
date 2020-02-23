package xbrl.experimentalParsers.extendedLink;

/*
 * Represents element 'Locator'.
 * It is created from 'arc' tag but validated from 'link:loc' tag ...
 */
public class Locator {
  private final String Label; // label content.
  private final String href; // reference to schema.
  private String arcrole;
  public Integer tempIndex;
  /*
   * Position among its siblings.
   * For Top-most RootNode this value is '0'.
   * This is used while displaying it in a tree struture
   */
  private double siblingOrder = 0d;

//  public Locator(String t_label, double t_order) {
//    Label = t_label;
//    siblingOrder = t_order;
//  }

  public Locator(String t_label, String t_href) {
    Label = t_label;
    href = t_href;
  }

  public Locator(String label, String href, Integer tempIndex) {
    Label = label;
    this.href = href;
    this.tempIndex = tempIndex;
  }

  public Locator(String t_label, double t_order, String t_href) {
    Label = t_label;
    siblingOrder = t_order;
    href = t_href;
  }

  public Locator(String t_label, double t_order, String t_href, String arcrole) {
    Label = t_label;
    siblingOrder = t_order;
    href = t_href;
    arcrole = arcrole;
  }


  public String getLabel() {
    return Label;
  }

  public String getHref() {
    return href;
  }

  public double getSiblingOrder() {
    return this.siblingOrder;
  }

  public void setSiblingOrder(double order) {
    this.siblingOrder = order;
  }

  public Locator copy(double t_order){
    return new Locator(getLabel(), t_order, getHref());
  }

  public Locator copy(double t_order, String arcrole){
    return new Locator(getLabel(), t_order, getHref(), arcrole);
  }

  @Override
  public String toString() {
    return "Locator{"
        + "Label='"
        + Label
        + '\''
        + ", href='"
        + href
        + '\''
        + ", siblingOrder="
        + siblingOrder
        + '}';
  }
}
