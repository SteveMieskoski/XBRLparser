package xbrl.FilingParser.ElementParsers;

import xbrl.FilingParser.ElementTypes.Context;
import xbrl.FilingParser.FilingEntry;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import java.util.ArrayList;
import java.util.List;

public class BaseXbrlParser implements ElementHandler {
  Element parent = null;
  String parentPath = null;
  FilingEntry filingEntry = null;
  boolean isXsd = false;
  List<Context> contexts = new ArrayList<>();
  Context currentContext = null;

  public BaseXbrlParser(FilingEntry taxonomyEntry) {
    System.out.println("BaseXbrlParser"); // todo remove dev item
    this.filingEntry = taxonomyEntry;
  }

  @Override
  public void onStart(ElementPath path) {
    Element element = path.getCurrent();
    element.getDocument().selectNodes("/context");
      path.addHandler("context/period/startDate", new Schema());
//      path.addHandler("annotation/appinfo/roleType", new Schema());
//      path.addHandler("annotation/appinfo/linkbaseRef", new Schema());

//    if (parent == null) {
//      System.out.println("xbrl START:  " + path.getPath()); // todo remove dev item
//
//      // dev item
//      parent = element.getParent();
//      parentPath = element.getUniquePath();
//      System.out.println(currentContext); // todo remove dev item
//      if (parentPath.contains("context") && currentContext == null) {
//        currentContext = new Context();
//      }
//    } else {
//      if (element.getParent().isRootElement()
//          || (element.getParent().getPath().startsWith("/linkbase")
//              && element.getParent().getParent().isRootElement())) {
//        System.out.println("xbrl =================== NEW PARENT "); // todo remove dev
//        System.out.println("xbrl NEW:  " + path.getPath()); // todo remove dev item
//
//        parent = element.getParent();
//        parentPath = element.getUniquePath();
//        if (parentPath.contains("context")) {
////          contexts.add(currentContext);
//          currentContext = null;
//          currentContext = new Context();
//        }
//
//      } else if (parent.equals(element.getParent())) {
//        System.out.println("xbrl SAME PARENT ===="); // todo remove dev item
//        System.out.println("xbrl SAME:  " + path.getPath()); // todo remove dev item
//        if (currentContext != null) {
//          currentContext.parseHandler(element, path.getPath());
//        }
//      } else if (element.getUniquePath().startsWith(parentPath)) {
//        System.out.println("xbrl SAME PARENT ===="); // todo remove dev item
//        System.out.println("xbrl SAME:  " + path.getPath()); // todo remove dev item
//        if (currentContext != null) {
//          currentContext.parseHandler(element, path.getPath());
//        }
//      }
//    }

//    boolean isSchemaRef = element.getName().equals("schemaRef");
//
//    for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
//      Attribute attribute = attrIter.next();
//      if (attribute != null) {
//        System.out.print("xbrl-: " + attribute.getName() + " : "); // todo remove dev item
//        System.out.println(attribute.getValue()); // todo remove dev item
//        if (isSchemaRef && attribute.getName().equals("href")) {
//          System.out.println("xbrl SCHEMA REFERENCE"); // todo remove dev item
//          this.filingEntry.parse(attribute.getValue());
//        }
//      }
//    }
  }

  @Override
  public void onEnd(ElementPath path) {
    Element element = path.getCurrent();
    System.out.println("xbrl END:  " + path.getPath()); // todo remove dev item
      path.removeHandler("context/period/startDate");
//    if (element.getUniquePath().equals(parentPath)) {
//      System.out.println("xbrl =================== NEW PARENT 2"); // todo remove dev
//      if (parentPath.contains("context") && currentContext != null) {
//          System.out.println("xbrl =================== NEW PARENT 2"); // todo remove dev
////          contexts.add(currentContext);
//        currentContext = null;
//      }
//      parent = null;
//      parentPath = null;
//
//      System.out.println(contexts); // todo remove dev item
//    }
    element.detach();
  }

    class Schema implements ElementHandler {
        Element parent = null;

        public Schema() {}

        @Override
        public void onStart(ElementPath path) {
            System.out.print("PATH: "); // todo remove dev item
            System.out.println(path.getPath()); // todo remove dev item
        }

        @Override
        public void onEnd(ElementPath path) {
            Element element = path.getCurrent();
            element.detach();
        }
    }
}
