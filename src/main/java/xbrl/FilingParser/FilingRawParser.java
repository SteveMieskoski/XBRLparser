package xbrl.FilingParser;

import xbrl.FilingParser.ElementParsers.BaseXbrlParser;
import xbrl.FilingParser.ElementParsers.SchemaParser;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilingRawParser implements ElementHandler {
  Element parent = null;
  String parentPath = null;
  FilingEntry filingEntry = null;
  boolean isXsd = false;
  SchemaParser schemaParser;
  BaseXbrlParser baseXbrlParser;

  List<Element> currentCollection = new ArrayList<>();

  public FilingRawParser(FilingEntry filingEntry) {
    this.filingEntry = filingEntry;
    schemaParser = new SchemaParser(filingEntry);
    baseXbrlParser = new BaseXbrlParser(filingEntry);
  }

  @Override
  public void onStart(ElementPath path) {
    Element element = path.getCurrent();

    if (parent == null) {
      // parent element start
      //      System.out.println("START:  " + path.getPath()); // todo remove dev item
      // dev item
      parent = element.getParent();
      parentPath = element.getUniquePath();
      if (!currentCollection.isEmpty()) {
        this.filingEntry.elements.add(currentCollection);
      }
      currentCollection = new ArrayList<>();
      currentCollection.add(element);
    } else {
      if (element.getParent().isRootElement()
          || (element.getParent().getPath().startsWith("/linkbase")
              && element.getParent().getParent().isRootElement())) {
        // xbrl, schema
        // parent element start
        parent = element.getParent();
        parentPath = element.getUniquePath();
        if (!currentCollection.isEmpty()) {
          this.filingEntry.elements.add(currentCollection);
        }
        currentCollection = new ArrayList<>();
      }
      currentCollection.add(element);
    }

    boolean isLinkBaseRef = element.getName().equals("linkbaseRef");
    boolean isSchemaRef = element.getName().equals("schemaRef");
    boolean isSchemaRoot = element.getName().equals("schema");
    boolean isXbrlRoot = element.getName().equals("xbrl");

    String targetNameSpace = "";
    for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
      Attribute attribute = attrIter.next();
      if (attribute != null) {
        //        System.out.print(attribute.getName() + " : "); // todo remove dev item
        //        System.out.println(attribute.getValue()); // todo remove dev item
        if (attribute.getName().equals("schemaLocation")) {
          this.filingEntry.parse(attribute.getValue());
        }
        if (isLinkBaseRef && attribute.getName().equals("href")) {
          //          System.out.println("LINKBASE REFERENCE"); // todo remove dev item
          this.filingEntry.parse(attribute.getValue());
        }
        if (isSchemaRef && attribute.getName().equals("href")) {
          System.out.println("xbrl SCHEMA REFERENCE"); // todo remove dev item
          this.filingEntry.parse(attribute.getValue());
        }
        if (isSchemaRoot && attribute.getName().equals("targetNamespace")) {
          System.out.println("xbrl SCHEMA REFERENCE"); // todo remove dev item
          this.filingEntry.parse(attribute.getValue());
        }
        if (isSchemaRoot) {
          if(attribute.getName().equals("targetNamespace")){
            targetNameSpace = attribute.getValue();
          }
          if(attribute.getValue().equals(targetNameSpace)){
            this.filingEntry.extendedPrefixes.add(attribute.getName().replace("xmlns:", ""));
          }
          System.out.println("xbrl SCHEMA REFERENCE"); // todo remove dev item
        }
      }
    }
  }

  @Override
  public void onEnd(ElementPath path) {
    Element element = path.getCurrent();
    //    System.out.println("END:  " + path.getPath()); // todo remove dev item
    if (element.getUniquePath().equals(parentPath)) {
      //      System.out.println("=================== NEW PARENT 2"); // todo remove dev
      parent = null;
      parentPath = null;
    }
    element.detach();
  }
}
