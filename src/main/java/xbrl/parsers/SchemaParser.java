package xbrl.parsers;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import xbrl.elementTypes.RoleTypeUsGaap;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;

import java.util.Iterator;

public class SchemaParser {

  SchemaContent schemaContent;
  String currentFile;

  public SchemaParser() {
    schemaContent = new SchemaContent();
  };

  public SchemaParser(String filename) {
    parseSchema(filename);
  };

  public static SchemaParser parse(String filename){
    return new SchemaParser(filename);
  }

  public void parseSchema(String filename) {
    schemaContent = new SchemaContent();
    System.out.println("filename: " + filename);
    this.currentFile = filename;
    this.schemaContent.startFileCache(filename);
    try {
      SAXReader reader = new SAXReader();

      reader.addHandler("/schema", new Schema());

      Document document = reader.read(filename);
      //      System.out.println("SCHEMA PARSE COMPLETE");
//      return schemaContent;
    } catch (DocumentException e) {
      e.printStackTrace();
//      return null;
    }
  }

  public SchemaContent getSchemaContent() {
    return schemaContent;
  }

  class Schema implements ElementHandler {

    public Schema() {}

    @Override
    public void onStart(ElementPath path) {
      path.addHandler("element", new ElementSchema());
      path.addHandler("annotation/appinfo/roleType", new RoleType());
      path.addHandler("annotation/appinfo/linkbaseRef", new LinkBases());
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler("element");
      path.removeHandler("annotation/appinfo/roleType");
      path.removeHandler("annotation/appinfo/linkbaseRef");
      schemaContent.stopFileCache(currentFile);
      element.detach();
    }
  }

  class LinkBases implements ElementHandler {

    LinkBases() {}

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      if (element.attributeValue("role") != null) {
        // collect link base filename
        // TODO: implement hand off to linkbase parsers if the particular linkbase is embedded;
        String value = element.attributeValue("role");
        if (value.contains("presentationLinkbaseRef")) {
          schemaContent.addLinkbase("pre", element.attributeValue("href"));

        } else if (value.contains("calculationLinkbaseRef")) {
          schemaContent.addLinkbase("cal", element.attributeValue("href"));

        } else if (value.contains("labelLinkbaseRef")) {
          schemaContent.addLinkbase("lab", element.attributeValue("href"));

        } else if (value.contains("definitionLinkbaseRef")) {
          schemaContent.addLinkbase("def", element.attributeValue("href"));

        } else if (value.contains("referenceLinkbaseRef")) {
          schemaContent.addLinkbase("ref", element.attributeValue("href"));
        }
      }
      element.detach();
    }
  }

  class ElementSchema implements ElementHandler {

    ElementSchema() {}

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      SchemaElement schemaElement = new SchemaElement();
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        schemaElement.setAttribute(attribute.getName(), attribute.getValue());
      }
      schemaContent.addToCacheSchemaElement(currentFile, schemaElement);
      schemaContent.addSchemaElement(schemaElement);
      element.detach();
    }
  }

  class RoleType implements ElementHandler, SchemaCaller {

    RoleTypeUsGaap roleTypeUsGaap;

    RoleType() {}

    @Override
    public void onStart(ElementPath path) {
      Element element = path.getCurrent();
      createElement(element);
      path.addHandler("definition", new RoleTypeDef(this));
      path.addHandler("usedOn", new RoleTypeUsedOn(this));
    }

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      path.removeHandler("definition");
      path.removeHandler("usedOn");
      schemaContent.addRoleType(roleTypeUsGaap);
      element.detach();
    }

    @Override
    public void createElement(Element element) {
      roleTypeUsGaap = new RoleTypeUsGaap();
      for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
        Attribute attribute = attrIter.next();
        roleTypeUsGaap.setAttribute(attribute.getName(), attribute.getValue());
      }
    }

    @Override
    public void addDefinition(String def) {
      roleTypeUsGaap.parseLinkDefinition(def);
    }

    @Override
    public void addUsedOn(String usedOn) {
      roleTypeUsGaap.addUsedOn(usedOn);
    }
  }

  class RoleTypeDef implements ElementHandler {

    SchemaCaller schemaCaller;

    RoleTypeDef(SchemaCaller schemaCaller) {
      this.schemaCaller = schemaCaller;
    }

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      this.schemaCaller.addDefinition(element.getText());
      element.detach();
    }
  }

  class RoleTypeUsedOn implements ElementHandler {

    SchemaCaller schemaCaller;

    RoleTypeUsedOn(SchemaCaller schemaCaller) {
      this.schemaCaller = schemaCaller;
    }

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      this.schemaCaller.addUsedOn(element.getText());
      element.detach();
    }
  }
}
