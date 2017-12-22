package xbrl.experimentalParsers.elements;


import java.util.LinkedList;

public class Linkbase {
    private final LinkedList<ExtendedLink> extendedLinks = new LinkedList<ExtendedLink>();
    private String id;
    private String schemaLocation;
    private String base;

    public Linkbase() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
    public void addExtendedLink(ExtendedLink link){
        this.extendedLinks.add(link);
    }

    public void print()
    {
        System.out.println( "This Linkbase has " + extendedLinks.size() + " extendedLinks" );

        for (ExtendedLink item : extendedLinks) {
            item.print();
        }
    }
}

