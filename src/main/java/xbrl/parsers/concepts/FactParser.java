package xbrl.parsers.concepts;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import xbrl.elementTypes.ContextContent;
import xbrl.elementTypes.ContextElement;
import xbrl.elementTypes.FactElement;
import xbrl.exceptions.MisformedXBRLException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactParser implements FactParse {

    private Integer index = 0;
    private List<FactElement> factList;

    public FactParser() {
        factList = new ArrayList<>();
    }

    @Override
    public ContextContent parse(Document xmlDocument, ContextContent contextContent) {
        try {
            Element root = xmlDocument.getRootElement();
            for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
                Element element = it.next();
                if (element.attribute("contextRef") != null) {
                    FactElement factElement = createFactElement(element);

                    ContextElement contextForFact = contextContent.getContext(factElement.getContextRef());
                    if(contextForFact == null){

                        throw new MisformedXBRLException("Fact Concept <"+ factElement.getTag() + "> references a non-existent contextRef");
                    }
                    factElement.setSegment(contextForFact.getSegment());
                    factElement.setPeriod(contextForFact.getPeriod());
                    factElement.setTemporalType(contextForFact.getPeriod().getTemporalType());
                    ;
                    contextContent.addAFact(factElement);
                    contextContent.addContextFact(factElement);
                    factList.add(factElement);
                }
            }

            System.out.println("FACTS PARSE COMPLETE");
            return contextContent;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private FactElement createFactElement(Element element) {
        ++index;
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

    public List<FactElement> getFactList() {
        return factList;
    }

    public void setFactList(List<FactElement> factList) {
        this.factList = factList;
    }
}
