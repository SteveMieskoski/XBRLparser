package scraps.xbrlSchemas;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ExpEntry {

  String currentFile;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();

  public ExpEntry() {
    String allEntryPoint =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/us-gaap-entryPoint-all-2017-01-31.xsd";
    String filename =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
    String file1 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-cal-2017-01-31.xml";
    String file2 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-acec-def-2017-01-31.xml";
    String file3 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-def-2017-01-31.xml";
    String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";
    parse(file3);
    //        databaseConnection();
  }

  public File getFile(String filename) {
    File file;
    String basePath =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/";
    File fileBase = new File(basePath);
    File fileInput = new File(filename);

    try {

      System.out.println("-----------------------------------------"); // todo remove dev item
      System.out.println(filename); // todo remove dev item
      if (!cache.contains(filename)) {
        cache.add(filename);
      } else {
        return null;
      }
      if (!filename.startsWith("/")
          && !filename.startsWith("../")
          && !filename.contains("http://")) {
        String altBasePath =
            "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/";
        File altFileBase = new File(altBasePath);
        file = new File(altFileBase, filename);
      } else if (filename.contains("http://")) {
        URL url = new URL(filename);
        file = new File(url.getFile());
      } else if (!fileInput.isAbsolute()) {
        file = new File(fileBase, filename);
      } else {
        file = new File(filename);
      }
      if (!file.exists()) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="); // todo remove dev item
        System.out.println(filename); // todo remove dev item
        return null;
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
      return null;
    }
    return file;
  }

  public void parse(String filename) {
    System.out.println("filename: " + filename);
    this.currentFile = filename;
    String basePath =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/";
    File fileBase = new File(basePath);
    File fileInput = new File(filename);
    String allEntryPoint =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/us-gaap-entryPoint-all-2017-01-31.xsd";
    try {
      File file = getFile(filename);
      if (file == null) {
        return;
      }

      System.out.println(file.getCanonicalPath()); // todo remove dev item
      SAXReader reader = new SAXReader();
      reader.setProperty(
          "http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation",
          allEntryPoint);
      reader.setDefaultHandler(new Schema());
      reader.setEntityResolver(
          new EntityResolver() {

            @Override
            public InputSource resolveEntity(String publicId, String systemId)
                throws SAXException, IOException {
              System.out.println("publicId : " + publicId); // todo remove dev item
              System.out.println("systemId : " + systemId); // todo remove dev item
              return new InputSource(systemId);
            }
          });

      Document document = reader.read(file);
      Element root = document.getRootElement();

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("============================"); // todo remove dev item
    System.out.println(attrs); // todo remove dev item
    System.out.println(ids); // todo remove dev item
  }

  class Schema implements ElementHandler {
    Element parent = null;

    public Schema() {}

    @Override
    public void onStart(ElementPath path) {
      System.out.print("PATH: "); // todo remove dev item
      System.out.println(path.getPath()); // todo remove dev item
      //            path.addHandler("element", new ElementSchema());
      //            path.addHandler("//*", new SchemaDemo());
      Element element = path.getCurrent();
      System.out.println(element.getName()); // todo remove dev item
      if (parent == null) {
        System.out.println(
            "START =================================================== NEW PARENT "); // todo remove
                                                                                      // dev item
        parent = element.getParent();
      } else {
        if (parent.equals(element.getParent())) {
          System.out.println(
              "SAME PARENT ============================================================================="); // todo remove dev item
//          System.out.println(element.getParent().getParent()); // todo remove dev item
        } else {
          System.out.println(
              "=================================================== NEW PARENT "); // todo remove dev
                                                                                  // item
          System.out.println(
              parent.equals(element.getParent().getParent())); // todo remove dev item
          parent = element.getParent();
        }
      }
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          System.out.print(attribute.getName() + " : "); // todo remove dev item
          System.out.println(attribute.getValue()); // todo remove dev item
          if (attribute.getName().equals("schemaLocation")) {
                        parse(attribute.getValue());
          }
        }
      }
      //            path.addHandler("annotation/appinfo/roleType", new SchemaParser.RoleType());
      //            path.addHandler("annotation/appinfo/linkbaseRef", new SchemaParser.LinkBases());
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
//      System.out.println(path.getPath()); // todo remove dev item
      //            path.removeHandler("element");
      //            path.removeHandler("//*");
      //            path.removeHandler("annotation/appinfo/roleType");
      //            path.removeHandler("annotation/appinfo/linkbaseRef");
      //            schemaContent.stopFileCache(currentFile);
      element.detach();
    }
  }

  class SchemaDemo implements ElementHandler {

    SchemaDemo() {}

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        if (attribute != null) {
          System.out.print(attribute.getName() + " : "); // todo remove dev item
          System.out.println(attribute.getValue()); // todo remove dev item
        }
      }

      element.detach();
    }
  }

  class ElementSchema implements ElementHandler {

    ElementSchema() {}

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
//      Element element = path.getCurrent();
//      SchemaElement schemaElement = new SchemaElement();
//      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
//        Attribute attribute = attrIter.next();
//        if (attribute != null) {
//          if (attribute.getName() != null && attribute.getValue() != null) {
//            String str = attribute.getName();
//            attrs.add(str);
//            if (str.equals("id")) {
//              ids.add(attribute.getValue());
//            }
//            System.out.print(attribute.getName() + " : "); // todo remove dev item
//            System.out.println(attribute.getValue()); // todo remove dev item
//            //                schemaElement.setAttribute(attribute.getName(), attribute.getValue());
//          }
//        }
//      }
//
//      element.detach();
    }
  }
}
