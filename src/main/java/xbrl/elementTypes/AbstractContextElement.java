package xbrl.elementTypes;

import xbrl.elementTypes.subTypes.Identifier;
import xbrl.elementTypes.subTypes.Period;
import xbrl.elementTypes.subTypes.Segment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractContextElement extends AbstractElement {

  protected boolean currentContext;
  protected String id;
  protected boolean isBase;
  protected String baseContextRef;
  protected String contextRef;
  protected List<String> axis;
  protected List<String> axisPure;
  protected List<String> member;
  protected List<String> memberPure;
  protected String instant;
  protected LinkedList<OrganizationElement> organizationContent;
  protected Period period;
  protected Identifier identifier;
  protected ArrayList<Segment> segment;

  abstract void addOrganizationElement(OrganizationElement organizationElement);

  abstract void addFact(FactElement fact);

  abstract void addSegment(Segment value);

  abstract void addAxis(String axis);

  abstract void addMember(String member);

  abstract Boolean isInstant();

  public boolean isCurrentContext() {
    return currentContext;
  }

  public void setCurrentContext(boolean currentContext) {
    this.currentContext = currentContext;
  }

  abstract FactElement getFact(String tag);

  abstract String getInstantOrDuration();

  abstract String getInstantOrEnd();

  abstract String getDuration();

  abstract String getEndDate();

  abstract String getStartDate();

  abstract LocalDate getPeriodInstant();

  abstract LocalDate getPeriodEndDate();

  // Basic Getters And Setters

  abstract LocalDate getPeriodStartDate();

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Identifier value) {
    this.identifier = value;
  }

  public LinkedList<OrganizationElement> getOrganizationElements() {
    return organizationContent;
  }

  public void setOrganizationElements(LinkedList<OrganizationElement> organizationElements) {
    this.organizationContent = organizationElements;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public ArrayList<Segment> getSegment() {
    return segment;
  }

  public void setSegment(ArrayList<Segment> value) {
    this.segment = value;
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

  public String getContextRef() {
    return contextRef;
  }

  public void setContextRef(String contextRef) {
    this.contextRef = contextRef;
  }

  public List<String> getAxisPure() {
    return axisPure;
  }

  public void setAxisPure(List<String> axisPure) {
    this.axisPure = axisPure;
  }

  public List<String> getMemberPure() {
    return memberPure;
  }

  public void setMemberPure(List<String> memberPure) {
    this.memberPure = memberPure;
  }

  public boolean isBase() {
    return isBase;
  }

  public void setBase(boolean base) {
    isBase = base;
  }

  public String getBaseContextRef() {
    return baseContextRef;
  }

  public void setBaseContextRef(String baseContextRef) {
    this.baseContextRef = baseContextRef;
  }

  public String getInstant() {
    return this.instant;
  }

  public void setInstant(String instant) {
    this.instant = instant;
  }

  // Internal Processing
  protected abstract void processContextRef(String context);

  @Override
  public String toString() {
    return "ContextElement{"
            + "currentContext="
            + currentContext
            + ", id='"
            + id
            + '\''
            + ", isBase="
            + isBase
            + ", baseContextRef='"
            + baseContextRef
            + '\''
            + ", contextRef='"
            + contextRef
            + '\''
            + ", axis="
            + axis
            + ", axisPure="
            + axisPure
            + ", member="
            + member
            + ", memberPure="
            + memberPure
            + ", instant='"
            + instant
            + '\''
            + ", organizationContent="
            + organizationContent
            + ", period="
            + period
            + ", identifier="
            + identifier
            + ", segment="
            + segment
            + '}';
  }
}
