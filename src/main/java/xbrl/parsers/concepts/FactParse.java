package xbrl.parsers.concepts;

import org.dom4j.Document;
import xbrl.elementTypes.ContextContent;

public interface FactParse {

  ContextContent parse(Document xmlDocument, ContextContent contextContent);
}
