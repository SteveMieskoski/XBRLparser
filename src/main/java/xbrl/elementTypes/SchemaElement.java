package xbrl.elementTypes;

public class SchemaElement implements Concept {

  public String id; // should
  public String name; // required
  public String type; // required (sort of)
  public String substitutionGroup; // required
  public String periodType; // required [for all practical purposes.  see ???]
  public String balance; // optional
  public Boolean isAbstract = false; // optional
  public Boolean nillable = false; // optional

  public void setAttribute(String name, String value) {
    switch (name) {
      case "id":
        setId(value);
        break;
      case "name":
        setName(value);
        break;
      case "type":
        setType(value);
        break;
      case "substitutionGroup":
        setSubstitutionGroup(value);
        break;
      case "periodType":
      case "xbrli:periodType":
        setPeriodType(value);
        break;
      case "balance":
      case "xbrli:balance":
        setBalance(value);
        break;
      case "abstract":
        setAbstract(Boolean.parseBoolean(value));
        break;
      case "nillable":
        setNillable(Boolean.getBoolean(value));
        break;
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSubstitutionGroup() {
    return substitutionGroup;
  }

  public void setSubstitutionGroup(String substitutionGroup) {
    this.substitutionGroup = substitutionGroup;
  }

  public String getPeriodType() {
    return periodType;
  }

  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public boolean isAbstract() {
    return isAbstract;
  }

  public void setAbstract(boolean anAbstract) {
    isAbstract = anAbstract;
  }

  public boolean isNillable() {
    return nillable;
  }

  public void setNillable(boolean nillable) {
    this.nillable = nillable;
  }

  @Override
  public String toString() {
    return "SchemaElement{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", type='"
        + type
        + '\''
        + ", substitutionGroup='"
        + substitutionGroup
        + '\''
        + ", periodType='"
        + periodType
        + '\''
        + ", balance='"
        + balance
        + '\''
        + ", isAbstract="
        + isAbstract
        + ", nillable="
        + nillable
        + '}';
  }
}
