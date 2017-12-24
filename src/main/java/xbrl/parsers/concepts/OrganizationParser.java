package xbrl.parsers.concepts;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.OrganizationElement;
import xbrl.exceptions.AttributeFormatException;
import xbrl.exceptions.MisformedXBRLException;
import xbrl.parsers.AbstractParser;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OrganizationParser{

  private static final Logger logger =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public static List<OrganizationElement> parse(String filename){
    return parseFileName(filename);
  }

  public static List<OrganizationElement> parse(Document document){
    return parseDocument(document);
  }


  public static List<OrganizationElement> parse(Document document, ContextContent contextContent){
    return parseWithContextContent(document, contextContent);
  }


  private static List<OrganizationElement> parseFileName(String filename){
    try {
      SAXReader reader = new SAXReader();
      Document document = reader.read(new File(filename));
      return parseDocument(document);
    } catch (DocumentException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static List<OrganizationElement> parseDocument(Document document) {
    List<OrganizationElement> organizationElements = new LinkedList<>();
    try {
      org.dom4j.XPath xpathSelector = DocumentHelper.createXPath("//*");
      List<org.dom4j.Node> results = xpathSelector.selectNodes(document);

      for (Iterator<org.dom4j.Node> it = results.iterator(); it.hasNext(); ) {
        Element element = (Element) it.next();

        if (element.getNamespacePrefix().contains("dei")) {

          if (element.attributeValue("contextRef") != null) {
            OrganizationElement organizationElement = createElement(element);
            organizationElements.add(organizationElement);

          }
        }
      }
      logger.info("PARSE COMPANY DETAILS COMPLETE");
      return organizationElements;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }

  private static List<OrganizationElement> parseWithContextContent(Document xmlDocument, ContextContent contextContent) {
    List<OrganizationElement> organizationElements = new ArrayList<>();
    Element root = xmlDocument.getRootElement();
    for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
      Element element = it.next();
      try {
        if (element.attribute("contextRef") != null) {
          OrganizationElement organizationElement = createElement(element);
          organizationElement = alignFactWithContext(organizationElement, contextContent);
          organizationElements.add(organizationElement);

        } else {
          throw new AttributeFormatException("No contextRef attribute found");
        }
      } catch (AttributeFormatException ex) {
        logger.warn("Tag {} missing the required contextRef attribute", element.getName());
        logger.debug("AttributeFormatException due to: {} ", ex.getCause());
        ex.printStackTrace();
      }
    }

    logger.info("PARSE COMPANY DETAILS COMPLETE");
    return organizationElements;
  }

  private static OrganizationElement createElement(Element element) {
    OrganizationElement organizationElement = new OrganizationElement();
    organizationElement.setTag(element.getName());
    organizationElement.setValue(element.getText());
    for (Iterator<Attribute> segAttrIter = element.attributeIterator();
         segAttrIter.hasNext(); ) {
      Attribute attribute = segAttrIter.next();
      organizationElement.setAttributes(attribute.getName(), attribute.getValue());
    }
    return organizationElement;
  }

  private static OrganizationElement alignFactWithContext(
          OrganizationElement organizationElement, ContextContent contextContent) {

    try {
      ContextElement contextForFact = contextContent.getContext(organizationElement.getContextRef());
      if (contextForFact == null) {

        throw new MisformedXBRLException(
                "contextRef for concept tag <" + organizationElement.getTag() + "> does not exist");
      }

      contextContent.addOrganizationElement(organizationElement);

      return organizationElement;
    } catch (MisformedXBRLException e) {
      logger.debug("MisformedXBRLException due to: {} ", e.getCause());
      e.printStackTrace();
      return null;
    }
  }
}
