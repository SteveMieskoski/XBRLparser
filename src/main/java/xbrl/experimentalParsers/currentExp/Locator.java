package xbrl.experimentalParsers.currentExp;

/*
 * Represents element 'Locator'.
 * It is created from 'arc' tag but validated from 'link:loc' tag ...
 */
public class Locator {
  private String Label = null; // label content.
  private String href = null; // reference to schema.

  /*
   * Position among its siblings.
   * For Top-most RootNode this value is '0'.
   * This is used while displaying it in a tree struture
   */
  private double siblingOrder = 0f;

  public Locator(String t_label, double t_order) {
    Label = t_label;
    siblingOrder = t_order;
  }

  public Locator(String t_label, double t_order, String t_href) {
    Label = t_label;
    siblingOrder = t_order;
    href = t_href;
  }

  public String getLabel() {
    return Label;
  }

  public void setLabel(String temp) {
    this.Label = temp;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String temp) {
    this.href = temp;
  }

  public double getSiblingOrder() {
    return this.siblingOrder;
  }

  public void setSiblingOrder(double order) {
    this.siblingOrder = order;
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
