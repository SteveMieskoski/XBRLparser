package xbrl.FilingProcessor.Holders;

public class ArcHolder {
  public Integer arc_key;
  public String ref_id; // linkBaseRef
  public String type;
  public String role; // arcRole
  public String from;
  public String to;
  public String order;
  public String use;
  public String weight;
  public String priority;
  public String doc_id;

    public ArcHolder() {
    }

    public ArcHolder(
      Integer arc_key,
      String ref_id,
      String type,
      String role,
      String from,
      String to,
      String order,
      String use,
      String weight,
      String priority,
      String doc_id) {
    this.arc_key = arc_key;
    this.ref_id = ref_id;
    this.type = type;
    this.role = role;
    this.from = from;
    this.to = to;
    this.order = order;
    this.use = use;
    this.weight = weight;
    this.priority = priority;
    this.doc_id = doc_id;
  }

  public void builder(String column, String value) {
    switch (column) {
      case "arc_key":
        this.arc_key = Integer.parseInt(value);
        break;
      case "ref_id":
        this.ref_id = value;
        break;
      case "type":
        this.type = value;
        break;
      case "role":
        this.role = value;
        break;
      case "from":
        this.from = value;
        break;
      case "to":
        this.to = value;
        break;
      case "order":
        this.order = value;
        break;
      case "use":
        this.use = value;
        break;
      case "weight":
        this.weight = value;
        break;
      case "priority":
        this.priority = value;
        break;
      case "doc_id":
        this.doc_id = value;
        break;
    }
  }

  public Integer getArc_key() {
    return arc_key;
  }

  public void setArc_key(Integer arc_key) {
    this.arc_key = arc_key;
  }

  public String getRef_id() {
    return ref_id;
  }

  public void setRef_id(String ref_id) {
    this.ref_id = ref_id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public String getDoc_id() {
    return doc_id;
  }

  public void setDoc_id(String doc_id) {
    this.doc_id = doc_id;
  }



  @Override
  public String toString() {
    return "\nArc{"
        + "arc_key="
        + arc_key
        + ", ref_id='"
        + ref_id
        + '\''
        + ", type='"
        + type
        + '\''
        + ", role='"
        + role
        + '\''
        + ", from='"
        + from
        + '\''
        + ", to='"
        + to
        + '\''
        + ", order='"
        + order
        + '\''
        + ", use='"
        + use
        + '\''
        + ", weight='"
        + weight
        + '\''
        + ", priority='"
        + priority
        + '\''
        + ", doc_id='"
        + doc_id
        + '\''
        + '}';
  }
}
