package xbrl.elementTypes.subTypes;

import java.util.HashMap;

public class Segment {

  protected String contextRef;
  protected String explicitMember;
  protected String typedMember;
  protected String dimension;
  protected String value;
  protected Period period;
  protected String rawDimension;
  protected String rawValue;
  protected String adjDimension;
  protected String adjValue;

//  protected LabelSet dimensionLabel;
//  protected LabelSet memberLabel;
  protected HashMap<String, String> additionalContent;

//  public String getCleanDimension() {
//    String lbl = this.dimensionLabel.getLabel();
//    Pattern pat = Pattern.compile("\\[.*\\]");
//    Matcher matcher = pat.matcher(lbl);
//    lbl = matcher.replaceAll("");
//    return lbl;
//  }
//
//  public String getCleanMember() {
//    String lbl = this.memberLabel.getLabel();
//    Pattern pat = Pattern.compile("\\[.*\\]");
//    Matcher matcher = pat.matcher(lbl);
//    lbl = matcher.replaceAll("");
//    return lbl;
//  }

  public String getAdjDimension() {
    return adjDimension;
  }

  public void setAdjDimension(String adjDimension) {
    this.adjDimension = adjDimension;
  }

  public String getAdjValue() {
    return adjValue;
  }

  public void setAdjValue(String adjValue) {
    this.adjValue = adjValue;
  }

  public String getContextRef() {
    return contextRef;
  }

  public void setContextRef(String contextRef) {
    this.contextRef = contextRef;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

//  public LabelSet getDimensionLabel() {
//    return dimensionLabel;
//  }
//
//  public void setDimensionLabel(LabelSet dimensionLabel) {
//    this.dimensionLabel = dimensionLabel;
//  }
//
//  public LabelSet getMemberLabel() {
//    return memberLabel;
//  }
//
//  public void setMemberLabel(LabelSet memberLabel) {
//    this.memberLabel = memberLabel;
//  }

  public String getRawDimension() {
    return rawDimension;
  }

  public void setRawDimension(String rawDimension) {
    this.rawDimension = rawDimension;
  }

  public String getRawValue() {
    return rawValue;
  }

  public void setRawValue(String rawValue) {
    this.rawValue = rawValue;
  }

  public String getExplicitMember() {
    return explicitMember;
  }

  public void setExplicitMember(String explicitMember) {
    this.explicitMember = explicitMember;
  }

  public String getTypedMember() {
    return typedMember;
  }

  public void setTypedMember(String typedMember) {
    this.typedMember = typedMember;
  }

  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void addAdditionalContent(String name, String value) {
    if (this.additionalContent == null) {
      this.additionalContent = new HashMap<>();
    }

    this.additionalContent.put(name, value);
  }

  public HashMap<String, String> getAdditionalContent() {
    return additionalContent;
  }

  public void setAdditionalContent(HashMap<String, String> additionalContent) {
    this.additionalContent = additionalContent;
  }

  @Override
  public String toString() {
    return "Segment{"
        + "contextRef='"
        + contextRef
        + '\''
        + ", explicitMember='"
        + explicitMember
        + '\''
        + ", typedMember='"
        + typedMember
        + '\''
        + ", dimension='"
        + dimension
        + '\''
        + ", value='"
        + value
        + '\''
        + ", period="
        + period
        + ", rawDimension='"
        + rawDimension
        + '\''
        + ", rawValue='"
        + rawValue
        + '\''
//        + ", dimensionLabel="
//        + dimensionLabel
//        + ", memberLabel="
//        + memberLabel
        + ", additionalContent="
        + additionalContent
        + '}';
  }
}
