package xbrl.parsers;

import org.apache.commons.lang3.NotImplementedException;
import org.dom4j.Document;
import xbrl.schemaElementTypes.SchemaContent;
import xbrl.util.UniversalNamespaceCache;

import java.util.List;

abstract class AbstractSchemaParser<T>  implements ISchemaParser, AbstractParser {

  public List<T> parse(Document xmlDocument) {
    throw new NotImplementedException(
        "SchemaParserOld requires two parameters: Document & org.jaxen.NamespaceContext.  Only Document supplied.");
  }

  abstract SchemaContent parse(Document document, UniversalNamespaceCache namespaceCache);
}
