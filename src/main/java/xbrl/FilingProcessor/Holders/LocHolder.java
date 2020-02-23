package xbrl.FilingProcessor.Holders;

public class LocHolder {
  public Integer locator_key;
  public String ref_id;
  public String type;
  public String href;
  public String conceptRaw;
  public String schemaDef;
  public String concept;
  public String prefix;
  public String label;
  public String doc_id;
  public String role; // Optional
  public String title; // Optional

    public LocHolder() {
    }

    public LocHolder(
      Integer locator_key,
      String ref_id,
      String type,
      String href,
      String conceptRaw,
      String schemaDef,
      String concept,
      String prefix,
      String label,
      String doc_id) {
    this.locator_key = locator_key;
    this.ref_id = ref_id;
    this.type = type;
    this.href = href;
    this.conceptRaw = conceptRaw;
    this.schemaDef = schemaDef;
    this.concept = concept;
    this.prefix = prefix;
    this.label = label;
    this.doc_id = doc_id;
  }

  public void builder(String column, String value) {
    switch (column) {
      case "locator_key":
        this.locator_key = Integer.parseInt(value);
        break;
      case "ref_id":
        this.ref_id = value;
        break;
      case "type":
        this.type = value;
        break;
      case "href":
        this.href = value;
        break;
      case "conceptRaw":
        this.conceptRaw = value;
        break;
      case "schemaDef":
        this.schemaDef = value;
        break;
      case "concept":
        this.concept = value;
        break;
      case "prefix":
        this.prefix = value;
        break;
      case "label":
        this.label = value;
        break;
      case "doc_id":
        this.doc_id = value;
        break;
      case "role":
        this.role = value;
        break;
      case "title":
        this.title = value;
        break;
    }
  }

  public Integer getLocator_key() {
    return locator_key;
  }

  public void setLocator_key(Integer locator_key) {
    this.locator_key = locator_key;
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

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getConceptRaw() {
    return conceptRaw;
  }

  public void setConceptRaw(String conceptRaw) {
    this.conceptRaw = conceptRaw;
  }

  public String getSchemaDef() {
    return schemaDef;
  }

  public void setSchemaDef(String schemaDef) {
    this.schemaDef = schemaDef;
  }

  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getDoc_id() {
    return doc_id;
  }

  public void setDoc_id(String doc_id) {
    this.doc_id = doc_id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "\nLoc{"
        + "locator_key='"
        + locator_key
        + '\''
        + ", ref_id='"
        + ref_id
        + '\''
        + ", type='"
        + type
        + '\''
        + ", href='"
        + href
        + '\''
        + ", conceptRaw='"
        + conceptRaw
        + '\''
        + ", schemaDef='"
        + schemaDef
        + '\''
        + ", concept='"
        + concept
        + '\''
        + ", prefix='"
        + prefix
        + '\''
        + ", label='"
        + label
        + '\''
        + ", doc_id='"
        + doc_id
        + '\''
        + ", role='"
        + role
        + '\''
        + ", title='"
        + title
        + '\''
        + '}';
  }
}
