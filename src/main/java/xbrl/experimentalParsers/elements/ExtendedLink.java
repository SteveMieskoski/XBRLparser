package xbrl.experimentalParsers.elements;


import java.util.LinkedList;

public class ExtendedLink  extends ExtendedType {
    private final LinkedList<Loc> locs = new LinkedList<Loc>();
    private final LinkedList<Arc> arcs = new LinkedList<Arc>();
    public ExtendedLink(String role) {
        super(role);
    }

    public void addLoc( Loc item )
    {
        locs.addLast( item );
    }

    public void addArc( Arc item )
    {
        arcs.addLast( item );
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getBase() {
        return super.getBase();
    }

    @Override
    public void setBase(String base) {
        super.setBase(base);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    public void print()
    {
        System.out.println( "This ExtendedLink has " + locs.size() + " locators" );

        for (Loc item : locs) {
            item.print();
        }

        System.out.println( "This ExtendedLink has " + arcs.size() + " arcs" );

        for (Arc item : arcs) {
            item.print();
        }
    }
}
