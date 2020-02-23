package xbrl.FilingProcessor.Holders;

public class ItemConceptHolder {
  public Integer fact_key;
  public String prefix;
  public String concept_ref;
  public String context_ref;
  public String unit_ref;
  public String decimals;
  public String value;
  public String doc_id;

  public ItemConceptHolder() {
  }

  public ItemConceptHolder(
      Integer fact_key,
      String prefix,
      String concept_ref,
      String context_ref,
      String unit_ref,
      String decimals,
      String value,
      String doc_id) {
    this.fact_key = fact_key;
    this.prefix = prefix;
    this.concept_ref = concept_ref;
    this.context_ref = context_ref;
    this.unit_ref = unit_ref;
    this.decimals = decimals;
    this.value = value;
    this.doc_id = doc_id;
  }

  public void builder(String column, String value) {
    switch (column) {
      case "fact_key":
        this.fact_key = Integer.parseInt(value);
        break;
      case "prefix":
        this.prefix = value;
        break;
      case "concept_ref":
        this.concept_ref = value;
        break;
      case "context_ref":
        this.context_ref = value;
        break;
      case "unit_ref":
        this.unit_ref = value;
        break;
      case "decimals":
        this.decimals = value;
        break;
      case "value":
        this.value = value;
        break;
      case "doc_id":
        this.doc_id = value;
        break;
    }
  }

  public Integer getFact_key() {
    return fact_key;
  }

  public void setFact_key(Integer fact_key) {
    this.fact_key = fact_key;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getConcept_ref() {
    return concept_ref;
  }

  public void setConcept_ref(String concept_ref) {
    this.concept_ref = concept_ref;
  }

  public String getContext_ref() {
    return context_ref;
  }

  public void setContext_ref(String context_ref) {
    this.context_ref = context_ref;
  }

  public String getUnit_ref() {
    return unit_ref;
  }

  public void setUnit_ref(String unit_ref) {
    this.unit_ref = unit_ref;
  }

  public String getDecimals() {
    return decimals;
  }

  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getDoc_id() {
    return doc_id;
  }

  public void setDoc_id(String doc_id) {
    this.doc_id = doc_id;
  }

  @Override
  public String toString() {
    return "\nItemConcept{"
        + "fact_key="
        + fact_key
        + ", prefix='"
        + prefix
        + '\''
        + ", concept_ref='"
        + concept_ref
        + '\''
        + ", context_ref='"
        + context_ref
        + '\''
        + ", unit_ref='"
        + unit_ref
        + '\''
        + ", decimals='"
        + decimals
        + '\''
        + ", value='"
        + value
        + '\''
        + ", doc_id='"
        + doc_id
        + '\''
        + '}';
  }
}
