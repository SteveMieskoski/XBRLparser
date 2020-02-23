package xbrl.experimentalParsers.currentExp;

/*
 * Represents element 'arc'(CURRENTLY:Presentation arc only)
 *
 * This represents the relationship b/w locators.
 *
 */
public class Arc {
  private String parentLabel; // xlink:from
  private String childLabel; // xlink:to
  private String arcrole;

  // stores the order value.Used while inserting arcs into the tree
  private float childLabelOrder = 0; // order

  public Arc(String t_parentLabel, String t_childLabel, float childOrder) {
    parentLabel = t_parentLabel;
    childLabel = t_childLabel;
    childLabelOrder = childOrder;
  }

  public Arc(String t_parentLabel, String t_childLabel, float childOrder, String t_arcrole) {
    parentLabel = t_parentLabel;
    childLabel = t_childLabel;
    childLabelOrder = childOrder;
    arcrole = t_arcrole;
  }

  public String getParentLabel() {
    return parentLabel;
  }

  public void setParentLabel(String parentLabel) {
    this.parentLabel = parentLabel;
  }

  public String getArcrole() {
    return arcrole;
  }

  public void setArcrole(String arcrole) {
    this.arcrole = arcrole;
  }

  public String getChildLabel() {
    return childLabel;
  }

  public void setChildLabel(String childLabel) {
    this.childLabel = childLabel;
  }

  public float getOrder() {
    return childLabelOrder;
  }

  public void setOrder(float order) {
    this.childLabelOrder = order;
  }

  @Override
  public String toString() {
    return "Arc{"
        + "parentLabel='"
        + parentLabel
        + '\''
        + ", childLabel='"
        + childLabel
        + '\''
        + ", childLabelOrder="
        + childLabelOrder
        + '}';
  }
}
