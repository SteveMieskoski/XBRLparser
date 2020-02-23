package xbrl.schemaElementTypes;

import xbrl.elementTypes.ConstantValues;

import java.util.ArrayList;

public class SchemaRole {

  private String roleURI;
  private String id;
  private String definition;
  private ArrayList<String> usedOn;

  public void setAttribute(String name, String value) {
    switch (name) {
      case ConstantValues.id:
        setId(value);
        break;
      case ConstantValues.roleURI:
        setRoleURI(value);
        break;
    }
  }

  public void addUsedOn(String value) {
    if (this.usedOn == null) {
      this.usedOn = new ArrayList<>();
    }
    this.usedOn.add(value);
  }

  public String getRoleURI() {
    return roleURI;
  }

  public void setRoleURI(String roleURI) {
    this.roleURI = roleURI;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public ArrayList<String> getUsedOn() {
    return usedOn;
  }

  public void setUsedOn(ArrayList<String> usedOn) {
    this.usedOn = usedOn;
  }

  @Override
  public String toString() {
    return "SchemaRole{" +
            "roleURI='" + roleURI + '\'' +
            ", id='" + id + '\'' +
            ", definition='" + definition + '\'' +
            ", usedOn=" + usedOn +
            '}';
  }
}
