package xbrl.parsers.concepts;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.RoleTypeUsGaap;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;
import xbrl.parsers.SchemaCaller;

import java.util.*;

public class ResourceParser {

  private final Logger logger = LoggerFactory.getLogger(ResourceParser.class);
  private Map<String, String> linkbases;
  private List<String> schemaRefs;

  public ResourceParser() {
    linkbases = new HashMap<>();
    schemaRefs = new LinkedList<>();
  }

    public ResourceParser(String xbrlFile) {
        linkbases = new HashMap<>();
        schemaRefs = new LinkedList<>();
        parseResource(xbrlFile);
    }


  public static ResourceParser parse(String xbrlFile){
      return new ResourceParser(xbrlFile);
  }


  public void parseResource(String xbrlFile) {
    System.out.println("xbrlFile: " + xbrlFile);

    try {
      SAXReader reader = new SAXReader();

      reader.addHandler("/xbrl", new XbrlInstance());

      Document document = reader.read(xbrlFile);
      logger.info("RESOURCE FILES IDENTIFICATION COMPLETE");
    } catch (DocumentException e) {
      e.printStackTrace();
      //            return null;
    }
  }

  public Map<String, String> getLinkbases() {
    return linkbases;
  }

  public void setLinkbases(Map<String, String> linkbases) {
    this.linkbases = linkbases;
  }

  public List<String> getSchemaRefs() {
    return schemaRefs;
  }

  public void setSchemaRefs(List<String> schemaRefs) {
    this.schemaRefs = schemaRefs;
  }

  class XbrlInstance implements ElementHandler {

    public XbrlInstance() {}

    @Override
    public void onStart(ElementPath path) {
      path.addHandler("schemaRef", new SchemaRef());
      path.addHandler("linkbaseRef", new LinkbaseRefs());
    }

    @Override
    public void onEnd(ElementPath elementPath) {}
  }

  class SchemaRef implements ElementHandler {

    public SchemaRef() {}

    @Override
    public void onStart(ElementPath elementPath) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      schemaRefs.add(element.attributeValue("href"));
      element.detach();
    }
  }

  class LinkbaseRefs implements ElementHandler {

    LinkbaseRefs() {}

    @Override
    public void onStart(ElementPath path) {}

    @Override
    public void onEnd(ElementPath path) {
      Element element = path.getCurrent();
      linkbases.put(element.attributeValue("arcrole"), element.attributeValue("href"));
      element.detach();
    }
  }
}
