package xbrl.experimentalParsers.elements;

public class Label {

    private final String label;
    private final String type = "resource";

    private String role;
    private String title;
    private String id;

    public Label(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
