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

public class EntryV4 {

  String currentFile;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();

  public EntryV4() {
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
    String file4 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630.xml";
    String file5 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";
    String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";
    parse(file5);
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
    try {
      File file = getFile(filename);
      if (file == null) {
        return;
      }

      System.out.println(file.getCanonicalPath()); // todo remove dev item
      SAXReader reader = new SAXReader();
      reader.setDefaultHandler(new Schema());


      Document document = reader.read(file);
//      demo(document);
//      Element root = document.getRootElement();

    } catch (Exception e) {
      e.printStackTrace();
    }
//    System.out.println("============================"); // todo remove dev item
//    System.out.println(attrs); // todo remove dev item
//    System.out.println(ids); // todo remove dev item
  }


  public void demo(Document doc) {
    doc.setEntityResolver(
            new EntityResolver() {

              @Override
              public InputSource resolveEntity(String publicId, String systemId)
                      throws SAXException, IOException {
                System.out.println("publicId : " + publicId); // todo remove dev item
                System.out.println("systemId : " + systemId); // todo remove dev item
                return new InputSource(systemId);
              }
            });

    Visitor elementVisitor = new VisitorSupport() {
      public void visit(Element element) {
        System.out.println("Entity name: " + element.getName()  +", Path: " + element.getPath());
      }
    };

    Visitor attrVisitor = new VisitorSupport() {
      public void visit(Attribute attribute) {
        System.out.println("Attribute name: " + attribute.getName()  +", Path: " + attribute.getPath());
      }
    };

    Visitor entityVisitor = new VisitorSupport() {
      public void visit(Entity entity) {
        System.out.println("Entity name: " + entity.getName()  +", Path: " + entity.getPath());
      }
    };

    Visitor docVisitor = new VisitorSupport() {
      public void visit(Document document) {
        System.out.println("Entity name: " + document.getName()  +", Path: " + document.getPath());
      }
    };

    Visitor cdataVisitor = new VisitorSupport() {
      public void visit(CDATA cdata) {
        System.out.println("Entity name: " + cdata.getName()  +", Path: " + cdata.getPath());
      }
    };

    doc.accept( docVisitor );
    doc.accept( cdataVisitor );
    doc.accept( elementVisitor );
    doc.accept( attrVisitor );
    doc.accept( entityVisitor );

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
