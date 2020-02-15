package FilingParser;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import xbrl.schemaElementTypes.SchemaContent;
import xbrl.schemaElementTypes.SchemaElement;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FilingEntry {

  SchemaContent schemaContent;
  String currentFile;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();
  boolean isXsd = false;

  public FilingEntry() {
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
    String file4 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630.xsd";
    String file5 =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";
    String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";
    parse(file4);
    //        databaseConnection();
  }

  public File getFile(String filename) {
    if (filename == null) {
      return null;
    }
    File file;
    String basePath =
        "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/";
    File fileBase = new File(basePath);
    File fileInput = new File(filename);

    if (filename.endsWith("xsd")) {
      isXsd = true;
    } else {
      isXsd = false;
    }
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
      reader.setDefaultHandler(new FilingRawParser(this, isXsd));

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
}
