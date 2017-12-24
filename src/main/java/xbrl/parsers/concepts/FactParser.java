package xbrl.parsers.concepts;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.ConstantValues;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.FactElement;
import xbrl.exceptions.AttributeFormatException;
import xbrl.exceptions.MisformedXBRLException;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FactParser {

  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private Integer index = 0;

  public FactParser() {}

  public static List<FactElement> parse(String filename) {
    return parseFileName(filename);
  }

  public static List<FactElement> parse(Document document) {
    return parseDocument(document);
  }

  public static List<FactElement> parse(Document document, ContextContent contextContent) {
    return parseWithContextContent(document, contextContent);
  }

  private static List<FactElement> parseWithContextContent(
      Document xmlDocument, ContextContent contextContent) {
    List<FactElement> factElements = new ArrayList<>();
    ArrayList<String> nonFactTags = new ArrayList<>(Arrays.asList(ConstantValues.nonFactTags));
    Element root = xmlDocument.getRootElement();
    for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
      Element element = it.next();
      if (!nonFactTags.contains(element.getName())) {
        try {
          if (element.attribute("contextRef") != null) {
            FactElement factElement = createElement(element);
            factElement = alignFactWithContext(factElement, contextContent);
            factElements.add(factElement);
          } else {
            throw new AttributeFormatException("No contextRef attribute found");
          }
        } catch (AttributeFormatException ex) {
          logger.warn("Tag {} missing the required contextRef attribute", element.getName());
          logger.debug("AttributeFormatException due to: {} ", ex.getCause());
          ex.printStackTrace();
        }
      }
    }

    logger.info("FACTS PARSE COMPLETE");
    return factElements;
  }

  private static List<FactElement> parseFileName(String filename) {
    try {
      SAXReader reader = new SAXReader();
      Document document = reader.read(new File(filename));
      return parseDocument(document);
    } catch (DocumentException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static List<FactElement> parseDocument(Document xmlDocument) {
    List<FactElement> factElements = new ArrayList<>();
    ArrayList<String> nonFactTags = new ArrayList<>(Arrays.asList(ConstantValues.nonFactTags));
    Element root = xmlDocument.getRootElement();
    for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
      Element element = it.next();
      if (!nonFactTags.contains(element.getName())) {
        try {
          if (element.attribute("contextRef") != null) {
            FactElement factElement = createElement(element);

            factElements.add(factElement);
          } else {
            throw new AttributeFormatException("No contextRef attribute found");
          }

        } catch (AttributeFormatException ex) {
          ex.printStackTrace();
          logger.warn("Tag {} missing the required contextRef attribute", element.getName());
          logger.debug("AttributeFormatException due to: {} ", ex.getCause());
          ex.printStackTrace();
        }
      }
    }

    logger.info("FACTS PARSE COMPLETE");
    return factElements;
  }

  private static FactElement createElement(Element element) {
    FactElement factElement = new FactElement();
    factElement.setTag(element.getName());
    factElement.setNameSpace(element.getNamespacePrefix());
    factElement.setValue(element.getText());
    for (Iterator<Attribute> attr = element.attributeIterator(); attr.hasNext(); ) {
      Attribute attribute = attr.next();
      factElement.setAttributes(attribute.getName(), attribute.getValue());
    }
    return factElement;
  }

  private static FactElement alignFactWithContext(
      FactElement factElement, ContextContent contextContent) {

    try {
      ContextElement contextForFact = contextContent.getContext(factElement.getContextRef());
      if (contextForFact == null) {

        throw new MisformedXBRLException(
            "contextRef for concept tag <" + factElement.getTag() + "> does not exist");
      }
      factElement.setSegment(contextForFact.getSegment());
      factElement.setPeriod(contextForFact.getPeriod());
      factElement.setTemporalType(contextForFact.getPeriod().getTemporalType());
      ;
      contextContent.addAFact(factElement);
      contextContent.addContextFact(factElement);

      return factElement;
    } catch (MisformedXBRLException e) {
      logger.debug("MisformedXBRLException due to: {} ", e.getCause());
      e.printStackTrace();
      return null;
    }
  }

  public static List<FactElement> alignAllFactsWithContext(
      List<FactElement> factElements, ContextContent contextContent) {
      contextContent = doAlignment(factElements, contextContent);
      return contextContent.getAllFacts();
  }

    public static ContextContent alignAllFactsWithContext(
            List<FactElement> factElements, List<ContextElement> contextElements) {
      ContextContent contextContent = new ContextContent();
      contextContent.addAllContextElements(contextElements);

        return doAlignment(factElements, contextContent);
    }

    public static List<FactElement> addContextToFacts(
            List<FactElement> factElements, List<ContextElement> contextElements) {
        ContextContent contextContent = new ContextContent();
        contextContent.addAllContextElements(contextElements);
        contextContent = doAlignment(factElements, contextContent);
        return contextContent.getAllFacts();
    }


    private static ContextContent doAlignment(List<FactElement> factElements, ContextContent contextContent){
        for (FactElement factElement : factElements) {
            try {

                ContextElement contextForFact = contextContent.getContext(factElement.getContextRef());
                if (contextForFact == null) {

                    throw new MisformedXBRLException(
                            "contextRef for concept tag <" + factElement.getTag() + "> does not exist");
                }
                factElement.setSegment(contextForFact.getSegment());
                factElement.setPeriod(contextForFact.getPeriod());
                factElement.setTemporalType(contextForFact.getPeriod().getTemporalType());

                contextContent.addAFact(factElement);
                contextContent.addContextFact(factElement);
            } catch (MisformedXBRLException e) {
                logger.debug("MisformedXBRLException due to: {} ", e.getCause());
                e.printStackTrace();
            }
        }
        return contextContent;
    }
}
