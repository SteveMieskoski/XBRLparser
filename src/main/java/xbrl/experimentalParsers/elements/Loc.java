package xbrl.experimentalParsers.elements;

// should probably extend from SimpleType. but
// its type is locator and arcs don't have an href attribute
public class Loc {

    private final String label;
    private final String href;
    private final String type = "locator";

    private String role;
    private String title;

    public Loc(String label, String href) {
        this.label = label;
        this.href = href;
    }

    public String getLabel() {
        return label;
    }

    public String getHref() {
        return href;
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

    public void print()
    {
        System.out.println( "Arc:" );
        System.out.println( "  label='" + label  );
        System.out.println( " href=" + href);
        System.out.println( " type=" + type);
        System.out.println( " type=" + type);
        System.out.println( " role=" + role);
        System.out.println( " title=" + title);
    }
}
