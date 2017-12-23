package xbrl.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;

import static java.nio.file.FileVisitResult.CONTINUE;

public class CoreFileTreeWalker extends SimpleFileVisitor<Path> {

  //    private final PathMatcher factMatcher;
  private final PathMatcher xsdMatcher;
  private int numMatches = 0;
  private String dirPathBase;
  private String found;
  private HashMap<String, String> collectAll;
  private String factFile = null;
  private String xsdFile = null;
  private boolean fact = false;
  private boolean xsd = false;
  private boolean useCollectAll = false;

  public CoreFileTreeWalker(String pathBase) {
    dirPathBase = pathBase;
    xsdMatcher = FileSystems.getDefault().getPathMatcher("glob:**.xsd");
  }

  public CoreFileTreeWalker(String pathBase, String glob) {
    dirPathBase = pathBase;
    this.collectAll = new HashMap<>();
    this.useCollectAll = true;
    xsdMatcher = FileSystems.getDefault().getPathMatcher("glob:" + glob);
  }

  // Compares the glob pattern against
  // the file or directory name.
  void find(Path file) {
    Path name = file.getFileName();
    if (name != null) {
      if(!name.toString().contains("_") && name.toString().endsWith("xml")){
          String fileSeparator = System.getProperty("file.separator");
          factFile = dirPathBase + fileSeparator + name.toFile().getName(); // could be the fact xml file, used as fallback

      }
      if (xsdMatcher.matches(name)) {
        if(useCollectAll){
          collectAll.put(name.toString(), file.toString());
          xsd = true;
        } else {
          xsdFile = file.toString();
          xsd = true;
        }

      }
      numMatches++;
      if (found == null) {
        found = file.toString();
      }
    }
  }

  // Prints the total number of
  // matches to standard out.
  public Boolean done() {
    if (xsd) {
      return true;
    } else {
      System.out.println("XSD File Not Found.");
      return false;
    }
  }

  public HashMap<String, String> getFiles() {
    if(useCollectAll){
      return collectAll;
    } else {
      HashMap<String, String> filePaths = new HashMap<>();
      filePaths.put("fact", factFile);
      filePaths.put("xsd", xsdFile);
      return filePaths;
    }

  }

  // Invoke the pattern matching
  // method on each file.
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    find(file);
    return CONTINUE;
  }

  // Invoke the pattern matching
  // method on each directory.
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
    find(dir);
    return CONTINUE;
  }

  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) {
    System.err.println(exc);
    return CONTINUE;
  }
}
