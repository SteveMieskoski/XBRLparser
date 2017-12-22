package xbrl.elementTypes.subTypes;

import java.time.LocalDate;

public class Period extends AbstractPeriod {

  protected String temporalType;
  protected String startDate;
  protected LocalDate periodStart;
  protected String endDate;
  protected LocalDate periodEnd;
  protected String instant;
  protected LocalDate periodInstant;
  protected Forever forever;

  @Override
  public String getInstantOrDuration() {
    if (this.instant != null) {
      return this.getInstant();
    } else {
      return this.getStartDate() + " - " + this.getEndDate();
    }
  }

  @Override
  public Boolean isInstant() {
    return this.instant != null;
  }

  public LocalDate getInstantOrEndAsDate() {
    if (this.instant != null) {
      return this.getPeriodInstant();
    } else {
      return this.getPeriodEnd();
    }
  }

  public LocalDate getInstantOrStartAsDate() {
    if (this.instant != null) {
      return this.getPeriodInstant();
    } else {
      return this.getPeriodStart();
    }
  }

  public Boolean isInstantOrInDuration(LocalDate testDate) {
    if (this.instant != null) {
      return this.getPeriodInstant().equals(testDate);
    } else {
      return this.getPeriodStart().isBefore(testDate) && this.getPeriodEnd().isAfter(testDate);
    }
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String value) {
    this.periodStart = LocalDate.parse(value);
    this.startDate = value;
  }

  public void setStartDate(LocalDate value) {
    this.periodStart = value;
    this.startDate = value.toString();
  }

  public LocalDate getPeriodStart() {
    return periodStart;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String value) {
    this.periodEnd = LocalDate.parse(value);
    this.endDate = value;
  }

  public void setEndDate(LocalDate value) {
    this.periodEnd = value;
    this.endDate = value.toString();
  }

  public LocalDate getPeriodEnd() {
    return periodEnd;
  }

  public String getInstant() {
    return instant;
  }

  public void setInstant(String value) {
    this.periodInstant = LocalDate.parse(value);
    this.instant = value;
  }

  public void setInstant(LocalDate value) {
    this.periodInstant = value;
    this.instant = value.toString();
  }

  public LocalDate getPeriodInstant() {
    return periodInstant;
  }

  public Forever getForever() {
    return forever;
  }

  public void setForever(Forever value) {
    this.forever = value;
  }

  public String getTemporalType() {
    return temporalType;
  }

  public void setTemporalType(String temporalType) {
    this.temporalType = temporalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Period)) return false;

    Period period = (Period) o;

    if (startDate != null ? !startDate.equals(period.startDate) : period.startDate != null)
      return false;
    if (periodStart != null ? !periodStart.equals(period.periodStart) : period.periodStart != null)
      return false;
    if (endDate != null ? !endDate.equals(period.endDate) : period.endDate != null) return false;
    if (periodEnd != null ? !periodEnd.equals(period.periodEnd) : period.periodEnd != null)
      return false;
    if (instant != null ? !instant.equals(period.instant) : period.instant != null) return false;
    return periodInstant != null
        ? periodInstant.equals(period.periodInstant)
        : period.periodInstant == null;
  }

  @Override
  public int hashCode() {
    int result = startDate != null ? startDate.hashCode() : 0;
    result = 31 * result + (periodStart != null ? periodStart.hashCode() : 0);
    result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
    result = 31 * result + (periodEnd != null ? periodEnd.hashCode() : 0);
    result = 31 * result + (instant != null ? instant.hashCode() : 0);
    result = 31 * result + (periodInstant != null ? periodInstant.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContextPeriodType{"
        + "startDate='"
        + startDate
        + '\''
        + ", endDate='"
        + endDate
        + '\''
        + ", instant='"
        + instant
        + '\''
        + ", forever="
        + forever
        + '}';
  }
}
