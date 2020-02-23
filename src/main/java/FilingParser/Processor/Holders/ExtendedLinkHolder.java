package FilingParser.Processor.Holders;

import FilingParser.ElementTypes.Arc;
import FilingParser.ElementTypes.Loc;
import FilingParser.Processor.ItemConceptArc;
import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.*;

public class ExtendedLinkHolder {
  public Integer extendedLink_key;
  public String ref_id;
  public String tag;
  public String type;
  public String role;
  public String title;
  public String schema;
  public String doc_id;

  List<ItemConceptArc> itemConceptArcs = new ArrayList<>();


  public ExtendedLinkHolder() {}

  public ExtendedLinkHolder(Integer extendedLink_key, String ref_id, String tag, String type, String role, String title, String schema, String doc_id) {
    this.extendedLink_key = extendedLink_key;
    this.ref_id = ref_id;
    this.tag = tag;
    this.type = type;
    this.role = role;
    this.title = title;
    this.schema = schema;
    this.doc_id = doc_id;
  }

  public void builder(String column, String value) {
    switch (column) {
      case "linkBase_key":
      case "extendedLink_key":
        this.extendedLink_key = Integer.parseInt(value);
        break;
      case "ref_id":
        this.ref_id = value;
        break;
      case "tag":
        this.tag = value;
        break;
      case "type":
        this.type = value;
        break;
      case "role":
        this.role = value;
        break;
      case "title":
        this.title = value;
        break;
      case "schema":
        this.schema = value;
        break;
      case "doc_id":
        this.doc_id = value;
        break;
    }
  }

  public Integer getExtendedLink_key() {
    return extendedLink_key;
  }

  public void setExtendedLink_key(Integer extendedLink_key) {
    this.extendedLink_key = extendedLink_key;
  }

  public String getRef_id() {
    return ref_id;
  }

  public void setRef_id(String ref_id) {
    this.ref_id = ref_id;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public String getDoc_id() {
    return doc_id;
  }

  public void setDoc_id(String doc_id) {
    this.doc_id = doc_id;
  }

  public List<ItemConceptArc> getItemConceptArcs() {
    return itemConceptArcs;
  }

  public void setItemConceptArcs(List<ItemConceptArc> itemConceptArcs) {
    this.itemConceptArcs = itemConceptArcs;
  }

  @Override
  public String toString() {
    return "\n\nExtendedLinkHolder{" +
            "extendedLink_key=" + extendedLink_key +
            ", ref_id='" + ref_id + '\'' +
            ", tag='" + tag + '\'' +
            ", type='" + type + '\'' +
            ", role='" + role + '\'' +
            ", title='" + title + '\'' +
            ", schema='" + schema + '\'' +
            ", doc_id='" + doc_id + '\'' +
            ", itemConceptArcs=" + itemConceptArcs +
            '}';
  }
}
