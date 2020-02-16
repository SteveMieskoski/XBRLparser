package FilingParser;

import ElementParsers.BaseXbrlParser;
import ElementParsers.SchemaParser;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import taxonomyParser.TaxonomyEntry;

import java.util.Iterator;

public class FilingRawParser implements ElementHandler {
  Element parent = null;
  String parentPath = null;
  FilingEntry filingEntry = null;
  boolean isXsd = false;

  public FilingRawParser(FilingEntry taxonomyEntry) {
    this.filingEntry = taxonomyEntry;
  }

  @Override
  public void onStart(ElementPath path) {
    Element element = path.getCurrent();

      if (parent == null) {
      System.out.println("START:  " + path.getPath()); // todo remove dev item

      // dev item
      parent = element.getParent();
      parentPath = element.getUniquePath();
    } else {
      if (element.getParent().isRootElement()
          || (element.getParent().getPath().startsWith("/linkbase")
              && element.getParent().getParent().isRootElement())) {
        System.out.println("=================== NEW PARENT "); // todo remove dev
        System.out.println("NEW:  " + path.getPath()); // todo remove dev item

        parent = element.getParent();
        parentPath = element.getUniquePath();

      } else if (parent.equals(element.getParent())) {
        System.out.println("SAME PARENT ===="); // todo remove dev item
        System.out.println("SAME:  " + path.getPath()); // todo remove dev item

      } else if (element.getUniquePath().startsWith(parentPath)) {
        System.out.println("SAME PARENT ===="); // todo remove dev item
        System.out.println("SAME:  " + path.getPath()); // todo remove dev item
      }
    }

    boolean isLinkBaseRef = element.getName().equals("linkbaseRef");

    for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
      Attribute attribute = attrIter.next();
      if (attribute != null) {
        System.out.print(attribute.getName() + " : "); // todo remove dev item
        System.out.println(attribute.getValue()); // todo remove dev item
        if (attribute.getName().equals("schemaLocation")) {
          this.filingEntry.parse(attribute.getValue());
        }
        if (isLinkBaseRef && attribute.getName().equals("href")) {
          System.out.println("LINKBASE REFERENCE"); // todo remove dev item
          this.filingEntry.parse(attribute.getValue());
        }
      }
    }
  }

  @Override
  public void onEnd(ElementPath path) {
    Element element = path.getCurrent();
    System.out.println("END:  " + path.getPath()); // todo remove dev item
    if (element.getUniquePath().equals(parentPath)) {
      System.out.println("=================== NEW PARENT 2"); // todo remove dev
      parent = null;
      parentPath = null;
    }
    path.removeHandler("/schema/*");
    path.removeHandler("/xbrl");
    //            path.removeHandler("element");
    //            path.removeHandler("//*");
    //            path.removeHandler("annotation/appinfo/roleType");
    //            path.removeHandler("annotation/appinfo/linkbaseRef");
    //            schemaContent.stopFileCache(currentFile);
    element.detach();
  }
}
