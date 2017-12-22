package xbrl.elementTypes;

import xbrl.elementTypes.subTypes.Period;
import xbrl.elementTypes.subTypes.Segment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

abstract class AbstractFact extends AbstractElement {

  protected Double numeric;

  protected Integer index;
  protected String tag;
  protected String conceptTag;
  protected String nameSpace;
  protected String contextRef;
  protected String decimals;
  protected String id;
  protected String unitRef;
  protected String value;
  protected List<String> axis;
  protected List<String> member;
  protected String factLabel;
  protected Period period;
  protected ArrayList<Segment> segment;
  protected HashMap<String, String> additionalAttributes;

  protected String schemaId;
  protected SchemaElement schemaElement;

  protected HashMap<String, LabelElement> factLabels;

  public abstract void setAttributes(String name, String value);

  public abstract void processContextRef(String context);

  public abstract void addAxis(String ax);

  public abstract void addMember(String ax);

  public Double getNumeric() {
    return numeric;
  }

  public void setNumeric(Double numeric) {
    this.numeric = numeric;
  }

  @Override
  public String getTag() {
    return tag;
  }

  @Override
  public abstract void setTag(String tag);

  public String getConceptTag() {
    return conceptTag;
  }

  public void setConceptTag(String conceptTag) {
    this.conceptTag = conceptTag;
  }

  public String getNameSpace() {
    return nameSpace;
  }

  public void setNameSpace(String nameSpace) {
    this.nameSpace = nameSpace;
  }

  public String getContextRef() {
    return contextRef;
  }

  public void setContextRef(String contextRef) {
    this.contextRef = contextRef;
  }

  public SchemaElement getSchemaElement() {
    return schemaElement;
  }

  public abstract void setSchemaElement(SchemaElement schemaElement);

  public String getSchemaId() {
    return schemaId;
  }

  public HashMap<String, LabelElement> getFactLabels() {
    return factLabels;
  }

  public void setFactLabels(HashMap<String, LabelElement> factLabels) {
    this.factLabels = factLabels;
  }

  @Override
  public Integer getIndex() {
    return index;
  }

  @Override
  public void setIndex(Integer index) {
    this.index = index;
  }

  public ArrayList<Segment> getSegment() {
    return segment;
  }

  public void setSegment(ArrayList<Segment> segment) {
    this.segment = segment;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public String getDecimals() {
    return decimals;
  }

  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public String getUnitRef() {
    return unitRef;
  }

  public void setUnitRef(String unitRef) {
    this.unitRef = unitRef;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public void setValue(String value) {
    this.value = value;
  }

  public List<String> getAxis() {
    return axis;
  }

  public void setAxis(List<String> axis) {
    this.axis = axis;
  }

  public List<String> getMember() {
    return member;
  }

  public void setMember(List<String> member) {
    this.member = member;
  }

  public String getFactLabel() {
    return factLabel;
  }

  public void setFactLabel(String factLabel) {
    this.factLabel = factLabel;
  }

  @Override
  public String toString() {
    return "FactElement{"
            + "index="
            + index
            + ", tag='"
            + tag
            + '\''
            + ", conceptTag='"
            + conceptTag
            + '\''
            + ", nameSpace='"
            + nameSpace
            + '\''
            + ", contextRef='"
            + contextRef
            + '\''
            + ", decimals='"
            + decimals
            + '\''
            + ", id='"
            + id
            + '\''
            + ", unitRef='"
            + unitRef
            + '\''
            + ", value='"
            + value
            + '\''
            + ", axis="
            + axis
            + ", member="
            + member
            + ", factLabel='"
            + factLabel
            + '\''
            + ", factLabels='"
            + factLabels
            + '\''
            + ", period="
            + period
            + ", segment="
            + segment
            + ", additionalAttributes="
            + additionalAttributes
            + ", schemaId='"
            + schemaId
            + '\''
            + ", schemaElement="
            + schemaElement
            + '}';
  }
}
