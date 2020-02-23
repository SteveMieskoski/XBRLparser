package scraps.taxonomyParser;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TaxonomyEntry {

  String currentFile;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();

  public TaxonomyEntry() {
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
    String file5 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";

    String webFile = "http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd";
    parse(file5);
    //        databaseConnection();
  }


  public File getRemoteFile(String FILE_URL) {
    try {

      File file = File.createTempFile("temp", null);
      System.out.println(file.getAbsolutePath());
      file.deleteOnExit();
      URL website = new URL(FILE_URL);
      ReadableByteChannel rbc = Channels.newChannel(website.openStream());
      FileOutputStream fos = new FileOutputStream(file);
      fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
      return file;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
//    BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
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
        file = getRemoteFile(filename);
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
    } catch (Exception e) {
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
      System.out.println(file); // todo remove dev item
      if (file == null) {
        System.out.println("COULD NOT FIND FILE"); // todo remove dev item
        return;
      }

      System.out.println(file.getCanonicalPath()); // todo remove dev item
      SAXReader reader = new SAXReader();
      reader.setDefaultHandler(new TaxonomyParser(this));

      Document document = reader.read(file);
//      demo(document);
//      Element root = document.getRootElement();

    } catch (Exception e) {
      e.printStackTrace();
    }
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


}
