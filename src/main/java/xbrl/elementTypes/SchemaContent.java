package xbrl.elementTypes;

import java.util.*;

public class SchemaContent {

  protected LinkedList<RoleTypeUsGaap> schemaRoles;
  protected Map<String, SchemaElement> schemaElements;
  protected Map<String, SchemaElement> schemaElementIds;
  protected Map<String, String> linkbases;
  protected List<String> entryPoints;
  protected List<String> filenames;
  protected Map<String, Map<String, SchemaElement>> preCache;

  public void addRoleType(RoleTypeUsGaap schemaRole) {
    if (this.schemaRoles == null) {
      this.schemaRoles = new LinkedList<>();
    }
    this.schemaRoles.add(schemaRole);
  }

  public void addSchemaElement(SchemaElement value) {
    if (this.schemaElements == null) {
      this.schemaElements = new HashMap<>();
    }

    this.schemaElements.put(value.name, value);
    if (value.getId() != null) {
      addSchemaElementById(value);
    }
  }

  public void addSchemaElementById(SchemaElement value) {
    if (this.schemaElementIds == null) {
      this.schemaElementIds = new HashMap<>();
    }

    this.schemaElementIds.put(value.getId(), value);
  }

  public void addLinkbase(String key, String value) {
    if (this.linkbases == null) {
      this.linkbases = new HashMap<>();
    }
    this.linkbases.put(key, value);
  }

  public void addEntryPoints(String value) {
    if (this.entryPoints == null) {
      this.entryPoints = new ArrayList<>();
    }
    this.entryPoints.add(value);
  }

  public void startFileCache(String filename){
    if(this.preCache == null){
      this.preCache = new HashMap<>();
    } else if(this.filenames != null){
      if(this.filenames.contains(filename)){
        return;
      }
    }
    this.preCache.put(filename, new HashMap<>());
  }

  public void addToCacheSchemaElement(String filename, SchemaElement value) {
    if (this.preCache != null) {
     if(this.preCache.containsKey(filename)){
       this.preCache.get(filename).put(value.name, value);
     }

    }
  }

  public void stopFileCache(String filename){
    if(this.filenames == null){
      this.filenames = new ArrayList<>();
    }
    this.filenames.add(filename);
  }



  public Map<String, SchemaElement> getSchemaElementNameMap() {
    return schemaElements;
  }

  public Map<String, SchemaElement> getSchemaElementIds() {
    return schemaElementIds;
  }

  public void setSchemaElementIds(Map<String, SchemaElement> schemaElementIds) {
    this.schemaElementIds = schemaElementIds;
  }

  public LinkedList<RoleTypeUsGaap> getSchemaRoles() {
    return schemaRoles;
  }

  public void setSchemaRoles(LinkedList<RoleTypeUsGaap> schemaRoles) {
    this.schemaRoles = schemaRoles;
  }

  public Map<String, SchemaElement> getSchemaElements() {
    return schemaElements;
  }

  public void setSchemaElements(Map<String, SchemaElement> schemaElements) {
    this.schemaElements = schemaElements;
  }

  public List<String> getEntryPoints() {
    return entryPoints;
  }

  public void setEntryPoints(List<String> entryPoints) {
    this.entryPoints = entryPoints;
  }

  public Map<String, String> getLinkbases() {
    return linkbases;
  }

  public void setLinkbases(Map<String, String> linkbases) {
    this.linkbases = linkbases;
  }

  public List<String> getFilenames() {
    return filenames;
  }

  public void setFilenames(List<String> filenames) {
    this.filenames = filenames;
  }

  public Map<String, Map<String, SchemaElement>> getPreCache() {
    return preCache;
  }

  public void setPreCache(Map<String, Map<String, SchemaElement>> preCache) {
    this.preCache = preCache;
  }

  @Override
  public String toString() {
    return "SchemaContent{"
        + "schemaRoles="
        + schemaRoles
        + ", schemaElements="
        + schemaElements
        + ", linkbases="
        + linkbases
        + ", entryPoints="
        + entryPoints
        + '}';
  }
}
