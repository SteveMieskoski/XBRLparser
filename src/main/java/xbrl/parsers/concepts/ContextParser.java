package xbrl.parsers.concepts;

import org.dom4j.*;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.subTypes.Identifier;
import xbrl.elementTypes.subTypes.Period;
import xbrl.elementTypes.subTypes.Segment;
import xbrl.parsers.AbstractParser;
import xbrl.parsers.TagAndAttributeConstants;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContextParser implements AbstractParser {

  private String customPrefix;
  private String defaultPrefix;

  public ContextParser() {}

  public ContextParser(String customPrefix, String defaultPrefix) {
    this.customPrefix = customPrefix;
    this.defaultPrefix = defaultPrefix;
  }

  @Override
  public List<ContextElement> parse(Document document) {
    List<ContextElement> contextElements = new LinkedList<>();
    try {

      String contextXpaths = String.join(" | ", TagAndAttributeConstants.contextVariations);
      org.dom4j.XPath xpathSelector = DocumentHelper.createXPath(contextXpaths);
      List<Node> results = xpathSelector.selectNodes(document);

      for (Iterator<Node> it = results.iterator(); it.hasNext(); ) {
        Element element = (Element) it.next();
        Boolean isBaseContext = true;
        ContextElement contextElement = new ContextElement();

        Period period = new Period();
        contextElement.setPeriod(period);

        String contextId = element.attributeValue("id");
        if (contextId != null) {
          contextElement.setId(contextId);
        }

        Element contextPeriod = element.element("period");
        Element startDate = contextPeriod.element("startDate");
        Element endDate = contextPeriod.element("endDate");
        Element instant = contextPeriod.element("instant");
        Element entity = element.element("entity");

        if (startDate != null) {
          contextElement.getPeriod().setTemporalType("Duration");
          contextElement.getPeriod().setStartDate(startDate.getText());
        }

        if (endDate != null) {
          contextElement.getPeriod().setEndDate(endDate.getText());
        }

        if (instant != null) {
          contextElement.getPeriod().setTemporalType("Instant");
          contextElement.getPeriod().setInstant(instant.getText());
        }

        if (entity != null) {
          Element identifier = entity.element("identifier");

          if (identifier != null) {
            Identifier identifierElement = new Identifier();
            identifierElement.setScheme(identifier.attributeValue("scheme"));
            identifierElement.setValue(identifier.getText());
            contextElement.setIdentifier(identifierElement);
          }

          Element contextSegment = entity.element("segment");
          if (contextSegment != null) {
            isBaseContext = false;

            List<Element> segmentContent = contextSegment.elements();
            for (Element segmentElement : segmentContent) {
              Segment segment = new Segment();

              String memberType = segmentElement.getName();
              switch (memberType) {
                case "explicitMember":
                  segment.setExplicitMember(memberType);
                  break;
                case "typedMember":
                  segment.setTypedMember(memberType);
                  break;
              }

              String memberValue = segmentElement.getTextTrim();

              if (!memberValue.isEmpty()) {
                if (this.defaultPrefix != null && this.customPrefix != null) {
                  String val =
                      memberValue
                          .replace(this.defaultPrefix + ":", "")
                          .replace(this.customPrefix + ":", "");
                  segment.setValue(val);
                } else {
                  segment.setValue(memberValue);
                }

                segment.setAdjValue(memberValue.replace(":", "_"));
                segment.setRawValue(memberValue);
              }

              for (Iterator<Attribute> segAttrIter = segmentElement.attributeIterator();
                  segAttrIter.hasNext(); ) {
                Attribute attribute = segAttrIter.next();
                if (attribute.getName().equals("dimension")) {
                  String dimValue = attribute.getValue();
                  if (this.defaultPrefix != null && this.customPrefix != null) {
                    String val =
                        dimValue
                            .replace(this.defaultPrefix + ":", "")
                            .replace(this.customPrefix + ":", "");
                    segment.setAdjDimension(val);
                  } else {
                    segment.setAdjDimension(dimValue);
                  }

                  segment.setDimension(dimValue.replace(":", "_"));

                  segment.setRawDimension(dimValue);
                } else {
                  segment.addAdditionalContent(attribute.getName(), attribute.getValue());
                }
              }

              contextElement.addSegment(segment);
            }
          }
        }
        contextElement.setBase(isBaseContext);
        contextElements.add(contextElement);
      }

      System.out.println("CONTEXT PARSE COMPLETE");

      return contextElements;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
