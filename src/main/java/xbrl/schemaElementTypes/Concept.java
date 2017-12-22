package xbrl.schemaElementTypes;

public interface Concept {

  String getId();

  void setId(String id);

  String getName();

  void setName(String name);

  String getType();

  void setType(String type);

  String getSubstitutionGroup();

  void setSubstitutionGroup(String substitutionGroup);

  String getPeriodType();

  void setPeriodType(String periodType);
}
