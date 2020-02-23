package xbrl.experimentalParsers.elements;

public class ArcroleRef {

    private final String arcroleURI;
    private String href;
    private String arcRole;
    private String role;

    public ArcroleRef(String href, String arcroleURI) {
        this.href = href;
        this.arcroleURI = arcroleURI;
    }

    public String getArcroleURI() {
        return arcroleURI;
    }

    public String getArcRole() {
        return arcRole;
    }

    public void setArcRole(String arcRole) {
        this.arcRole = arcRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
