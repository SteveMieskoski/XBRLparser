package taxonomyParser;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import java.util.Iterator;

public class TaxonomyParser implements ElementHandler {
    Element parent = null;
    String parentPath = null;
    TaxonomyEntry taxonomyEntry = null;
    public TaxonomyParser(TaxonomyEntry taxonomyEntry) {
        this.taxonomyEntry = taxonomyEntry;
    }


    @Override
    public void onStart(ElementPath path) {
//        System.out.println("-----------------------------------------------------------------------------"); // todo remove dev item
//        System.out.println("PATH: " + path.getPath() + ", size: " + path.size()); // todo remove dev item
        Element element = path.getCurrent();
//        System.out.println(element.getUniquePath()); // todo remove dev item
        if (parent == null) {
            System.out.println("START:  " + path.getPath()); // todo remove dev item

            // dev item
            parent = element.getParent();
            parentPath = element.getUniquePath();
        } else {
            if(element.getParent().isRootElement()){
                System.out.println(
                        "=================== NEW PARENT "); // todo remove dev
                System.out.println("NEW:  " + path.getPath()); // todo remove dev item

                parent = element.getParent();
                parentPath = element.getUniquePath();


            } else if (parent.equals(element.getParent())) {
                System.out.println(
                        "SAME PARENT ===="); // todo remove dev item
//                System.out.println("Name: " + element.getName()); // todo remove dev item
                System.out.println("SAME:  " + path.getPath()); // todo remove dev item

            } else if(element.getUniquePath().startsWith(parentPath)){
                System.out.println(
                        "SAME PARENT ===="); // todo remove dev item
                System.out.println("SAME:  " + path.getPath()); // todo remove dev item

            }
        }
        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
            Attribute attribute = attrIter.next();
            if (attribute != null) {
                System.out.print(attribute.getName() + " : "); // todo remove dev item
                System.out.println(attribute.getValue()); // todo remove dev item
                if (attribute.getName().equals("schemaLocation")) {
                    this.taxonomyEntry.parse(attribute.getValue());
                }
            }
        }
        //            path.addHandler("annotation/appinfo/roleType", new SchemaParser.RoleType());
        //            path.addHandler("annotation/appinfo/linkbaseRef", new SchemaParser.LinkBases());
    }

    @Override
    public void onEnd(ElementPath path) {
        Element element = path.getCurrent();
      System.out.println("END:  " + path.getPath()); // todo remove dev item
        if(element.getUniquePath().equals(parentPath)){
            System.out.println(
                    "=================== NEW PARENT 2"); // todo remove dev
            parent = null;
            parentPath = null;
        }

        //            path.removeHandler("element");
        //            path.removeHandler("//*");
        //            path.removeHandler("annotation/appinfo/roleType");
        //            path.removeHandler("annotation/appinfo/linkbaseRef");
        //            schemaContent.stopFileCache(currentFile);
        element.detach();
    }
}