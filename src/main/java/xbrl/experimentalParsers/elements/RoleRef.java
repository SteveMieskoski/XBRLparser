package xbrl.experimentalParsers.elements;

// should probably extend from SimpleType. but
// will get the base implementation working then work in inheritance
// if it operates to better follow the specification
public class RoleRef{

    private final String roleURI;
    private final String href;
    private String arcRole;
    private String role;


    public RoleRef(String href, String roleURI) {
        this.roleURI = roleURI;
        this.href = href;
    }

    public String getRoleURI() {
        return roleURI;
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
