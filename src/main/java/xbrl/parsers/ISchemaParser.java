package xbrl.parsers;

import org.dom4j.Document;
import xbrl.schemaElementTypes.SchemaContent;

public interface ISchemaParser {

  SchemaContent parseAppInfo(Document xmlDocument, SchemaContent schemaContent);
}
