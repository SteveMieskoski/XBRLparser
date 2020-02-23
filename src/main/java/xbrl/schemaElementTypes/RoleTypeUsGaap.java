package xbrl.schemaElementTypes;

public class RoleTypeUsGaap extends SchemaRole implements UsGaapRoleDef {

    private String sortCode;
    private String type;
    private String title;

    @Override
    public void parseLinkDefinition(String value) {
        String[] defParts = value.split("-");
        setSortCode(defParts[0]);
        setType(defParts[1]);
        setTitle(defParts[2]);
        setDefinition(value);
    }

    @Override
    public void parseDefinitionType(String value) {
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "RoleTypeUsGaap{" +
                "sortCode='" + sortCode + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                super.toString();
    }
}
