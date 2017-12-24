package xbrl.parsers.concepts;

import org.dom4j.Document;
import xbrl.elementTypes.ContextContent;

import java.util.List;

public interface Parser {

  static <T> List<T> parse(String filename){
    return null;
  };

  static <T> List<T> parse(Document document){
    return null;
  };

}
