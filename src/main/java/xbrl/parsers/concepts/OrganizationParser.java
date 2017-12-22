package xbrl.parsers.concepts;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import xbrl.elementTypes.OrganizationElement;
import xbrl.parsers.AbstractParser;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OrganizationParser implements AbstractParser {

  @Override
  public List<OrganizationElement> parse(Document document) {
    List<OrganizationElement> organizationElements = new LinkedList<>();
    try {
      org.dom4j.XPath xpathSelector = DocumentHelper.createXPath("//*");
      List<org.dom4j.Node> results = xpathSelector.selectNodes(document);

      for (Iterator<org.dom4j.Node> it = results.iterator(); it.hasNext(); ) {
        Element element = (Element) it.next();

        if (element.getNamespacePrefix().contains("dei")) {

          if (element.attributeValue("contextRef") != null) {
            OrganizationElement organizationElement = new OrganizationElement();
            organizationElement.setTag(element.getName());
            organizationElement.setValue(element.getText());
            for (Iterator<Attribute> segAttrIter = element.attributeIterator();
                segAttrIter.hasNext(); ) {
              Attribute attribute = segAttrIter.next();
              organizationElement.setAttributes(attribute.getName(), attribute.getValue());
            }
            organizationElements.add(organizationElement);
            //                        contextContent.addOrganizationElement(organizationElement);
            //                        ContextElement contextElement =
            // contextContent.getContext(element.attributeValue("contextRef"));
            //
            //                        if (contextElement != null) {
            //
            // contextElement.addOrganizationElement(organizationElement);
            //                        }
          }
        }
      }
//      getDocumentPrimaryReportingPeriod(organizationElements);
      System.out.println("ORGANIZATION PARSE COMPLETE");
      return organizationElements;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }


}
