package xbrl.parsers;

import org.dom4j.Document;
import xbrl.elementTypes.SchemaContent;

public interface ISchemaParser {

  SchemaContent parseAppInfo(Document xmlDocument, SchemaContent schemaContent);
}
