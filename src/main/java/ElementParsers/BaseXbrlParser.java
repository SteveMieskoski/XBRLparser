package ElementParsers;

import FilingParser.FilingEntry;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import java.util.Iterator;

public class BaseXbrlParser implements ElementHandler {
    Element parent = null;
    String parentPath = null;
    FilingEntry filingEntry = null;
    boolean isXsd = false;

    public BaseXbrlParser(FilingEntry taxonomyEntry) {
        this.filingEntry = taxonomyEntry;
    }

    @Override
    public void onStart(ElementPath path) {
        Element element = path.getCurrent();
        if (parent == null) {
            System.out.println("xbrl START:  " + path.getPath()); // todo remove dev item

            // dev item
            parent = element.getParent();
            parentPath = element.getUniquePath();
        } else {
            if (element.getParent().isRootElement()
                    || (element.getParent().getPath().startsWith("/linkbase")
                    && element.getParent().getParent().isRootElement())) {
                System.out.println("xbrl =================== NEW PARENT "); // todo remove dev
                System.out.println("xbrl NEW:  " + path.getPath()); // todo remove dev item

                parent = element.getParent();
                parentPath = element.getUniquePath();

            } else if (parent.equals(element.getParent())) {
                System.out.println("xbrl SAME PARENT ===="); // todo remove dev item
                System.out.println("xbrl SAME:  " + path.getPath()); // todo remove dev item

            } else if (element.getUniquePath().startsWith(parentPath)) {
                System.out.println("xbrl SAME PARENT ===="); // todo remove dev item
                System.out.println("xbrl SAME:  " + path.getPath()); // todo remove dev item
            }
        }

        boolean isSchemaRef = element.getName().equals("schemaRef");

        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
            Attribute attribute = attrIter.next();
            if (attribute != null) {
                System.out.print(attribute.getName() + " : "); // todo remove dev item
                System.out.println(attribute.getValue()); // todo remove dev item
                if (isSchemaRef && attribute.getName().equals("href")) {
                    System.out.println("xbrl SCHEMA REFERENCE"); // todo remove dev item
                    this.filingEntry.parse(attribute.getValue());
                }
            }
        }
    }

    @Override
    public void onEnd(ElementPath path) {
        Element element = path.getCurrent();
        System.out.println("xbrl END:  " + path.getPath()); // todo remove dev item
        if (element.getUniquePath().equals(parentPath)) {
            System.out.println("xbrl =================== NEW PARENT 2"); // todo remove dev
            parent = null;
            parentPath = null;
        }
        element.detach();
    }
}
