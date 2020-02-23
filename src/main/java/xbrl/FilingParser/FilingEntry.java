package xbrl.FilingParser;

import xbrl.FilingParser.Database.DatabaseHandler;
import xbrl.FilingParser.Database.DatabaseInsert;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilingEntry {

  String currentFile;
  String basePath = null;
  String altBasePath = null;
  HashSet<String> attrs = new HashSet<>();
  HashSet<String> ids = new HashSet<>();
  ArrayList<String> cache = new ArrayList<>();
  boolean isXsd = false;
  List<List<Element>> elements = new ArrayList<>();
  List<String> extendedPrefixes = new ArrayList<>();
  DatabaseHandler databaseHandler; //new DatabaseHandler(false);
  boolean shouldPersist = true; //false; // true;

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
          "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630.xml";
  String file5 =
          "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/demo_data/0001558370-17-006547-xbrl/ktyb-20170630_cal.xml";
  String fileRelative = "../elts/us-gaap-dep-pre-2017-01-31.xml";

  public FilingEntry() {
    databaseHandler = new DatabaseHandler();
    extendedPrefixes.add(
        "us-gaap"); // <- need to remove this hard coding and get this via parsing (i.e.
    // programmatically)

    preParse(file4);
    //    databaseHandler.insertFacts(
    //            "file1",
    //            "file1",
    //            "file1",
    //            "file1",
    //            "file1");
  }


  public FilingEntry(DatabaseHandler databaseHandler){
    this.databaseHandler = databaseHandler;
    preParse(file4);
  }

  public void preParse(String filename) {
    File fileInput = new File(filename);
    basePath = fileInput.getParent();
    altBasePath = basePath;
    parse(filename);
  }

  public File getFile(String filename) {
    if (filename == null) {
      return null;
    }
    File file;
    if (basePath == null) {
      basePath =
          "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/";
    }

    if (altBasePath == null) {
      altBasePath = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/";
    }

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
    if(this.extendedPrefixes.isEmpty()){
      extendedPrefixes.add(
              "us-gaap"); // <- need to remove this hard coding and get this via parsing (i.e.
      // programmatically)
    }
    System.out.println("filename: " + filename);
    this.currentFile = filename;
    try {
      File file = getFile(filename);
      if (file == null) {
        return;
      }

      System.out.println(file.getCanonicalPath()); // todo remove dev item
      SAXReader reader = new SAXReader();
      reader.setDefaultHandler(new FilingRawParser(this));
      Document document = reader.read(file);

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
        "====================================================================================="); // todo remove dev item
    //    System.out.println(elements); // todo remove dev item
    ParserTwo parserTwo = new ParserTwo(this);
    persist(parserTwo);
    //        System.out.println(parserTwo.getContexts()); // todo remove dev item
//        System.out.println(parserTwo.getItemConcepts()); // todo remove dev item
    //    System.out.println(parserTwo.getCalculations()); // todo remove dev item
//        System.out.println(parserTwo.getRoleRefs()); // todo remove dev item

  }

  public void persist(ParserTwo parserTwo) {
    if(shouldPersist){
      DatabaseInsert databaseInsert = databaseHandler.getDatabaseInsert();
      databaseInsert.insertFacts(parserTwo);
      databaseInsert.insertExtendedLinks(parserTwo);
      databaseInsert.insertContexts(parserTwo);
      databaseInsert.insertRoleRefs(parserTwo);
    }
    System.out.println(cache); // todo remove dev item
  }


}
