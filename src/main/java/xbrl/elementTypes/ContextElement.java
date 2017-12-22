package xbrl.elementTypes;

import xbrl.elementTypes.subTypes.Segment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContextElement extends AbstractContextElement {

  private boolean currentContext = false;

  public void addOrganizationElement(OrganizationElement organizationElement) {
    if (this.organizationContent == null) {
      this.organizationContent = new LinkedList<>();
    }
    this.organizationContent.add(organizationElement);
  }

  public void addFact(FactElement fact) {
  }

  public void addSegment(Segment value) {
    if (segment == null) {
      segment = new ArrayList<>();
    }
    segment.add(value);
  }

  public void addAxis(String axis) {
    if (this.axis == null) {
      this.axis = new ArrayList<>();
    }
    if (this.axisPure == null) {
      this.axisPure = new ArrayList<>();
    }
    this.axis.add(axis);
    this.axisPure.add(axis.replace("Axis", ""));
  }

  public void addMember(String member) {
    if (this.member == null) {
      this.member = new ArrayList<>();
    }
    if (this.memberPure == null) {
      this.memberPure = new ArrayList<>();
    }
    this.member.add(member);
    this.memberPure.add(member.replace("Member", ""));
  }

  public Boolean isInstant() {
    if (this.period != null) {
      if (this.period.getInstant() != null) {
        return true;
      } else {
        return false;
      }
    }
    return null;
  }

  @Override
  public boolean isCurrentContext() {
    return currentContext;
  }

  public FactElement getFact(String tag) {
    return null;
  }

  public String getInstantOrDuration() {
    if (this.period != null) {
      if (this.period.getInstant() != null) {
        return this.period.getInstant();
      } else {
        return this.period.getStartDate() + " - " + this.period.getEndDate();
      }
    }
    return null;
  }

  public String getInstantOrEnd() {
    if (this.period != null) {
      if (this.period.getInstant() != null) {
        return this.period.getInstant();
      } else {
        return this.period.getEndDate();
      }
    }
    return null;
  }

  public String getDuration() {
    if (this.period != null) {
      if (this.period.getInstant() != null) {
        return null;
      } else {
        return this.period.getStartDate() + " - " + this.period.getEndDate();
      }
    }
    return null;
  }

  @Override
  public String getInstant() {
    if (this.period != null) {
      return this.period.getInstant();
    }
    return null;
  }

  public String getEndDate() {
    if (this.period != null) {
      return this.period.getEndDate();
    }
    return null;
  }

  public String getStartDate() {
    if (this.period != null) {
      return this.period.getStartDate();
    }
    return null;
  }

  public LocalDate getPeriodInstant() {
    if (this.period != null) {
      return this.period.getPeriodInstant();
    }
    return null;
  }

  public LocalDate getPeriodEndDate() {
    if (this.period != null) {
      return this.period.getPeriodEnd();
    }
    return null;
  }

  public LocalDate getPeriodStartDate() {
    if (this.period != null) {
      return this.period.getPeriodStart();
    }
    return null;
  }



  @Override
  public void setId(String id) {
    this.contextRef = id;
    this.id = id;
    processContextRef(id);
  }

  // Internal Processing
  public void processContextRef(String context) {
    Pattern memberPattern = Pattern.compile("Member");
    Pattern axisPattern = Pattern.compile("Axis");

    String[] splitContext = context.split("_");

    for (int i = 0; i < splitContext.length; i++) {
      Matcher memberMatcher = memberPattern.matcher(splitContext[i]);
      Matcher axisMatcher = axisPattern.matcher(splitContext[i]);

      if (axisMatcher.find()) {
        addAxis(splitContext[i]);
      }

      if (memberMatcher.find()) {
        addMember(splitContext[i]);
      }
    }
  }


}
