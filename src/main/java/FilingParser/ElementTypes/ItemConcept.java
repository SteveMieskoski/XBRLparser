package FilingParser.ElementTypes;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ItemConcept {
  String prefix;
  String tag;
  String id;
  String contextRef;
  String unitRef;
  String precision;
  String decimals;
  String value;
  List<XmlEntry> additional = new ArrayList<>();
  String[] attrs = {"contextRef", "unitRef", "precision", "decimals"};
  List<String> attributesToGet = new ArrayList<>(Arrays.asList(attrs));
  List<String> extendedPrefixes = new ArrayList<>();
  // See
  // http://www.xbrl.org/Specification/XBRL-2.1/REC-2003-12-31/XBRL-2.1-REC-2003-12-31+corrected-errata-2013-02-20.html#_4.6
  // for additional items that can be added

  /*
  *   <xsd:element
        name="FinancingReceivableMinimumPeriodForWhichPrincipalOrInterestInDefaultForLoansToBeConsideredAsNonaccrual"
        id="ktyb_FinancingReceivableMinimumPeriodForWhichPrincipalOrInterestInDefaultForLoansToBeConsideredAsNonaccrual"
        type="xbrli:durationItemType" substitutionGroup="xbrli:item" nillable="true" xbrli:periodType="duration"/>
        *
  * */

  public ItemConcept() {}

  public ItemConcept(List<String> extendedPrefixes) {
    this.extendedPrefixes = extendedPrefixes;
  }

  static public ItemConcept parseAndBuild(List<String> extendedPrefixes, Element element){
      ItemConcept ic = new ItemConcept(extendedPrefixes);
      ic.parseHandler(element);
      return ic;
  }


  public void parseHandler(Element element) {
    boolean withAttributes = false;
    XmlEntry xmlEntry = null;
    if (!this.extendedPrefixes.isEmpty()) {
      if (this.extendedPrefixes.contains(element.getNamespacePrefix())) {
          this.value = element.getStringValue();
          this.tag = element.getName();
          this.prefix = element.getNamespacePrefix();
        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
          Attribute attribute = attrIter.next();
          if (attribute != null) {
              switch (attribute.getName()){
                  case "contextRef":
                      this.contextRef = attribute.getValue();
                      break;
                  case "unitRef":
                      this.unitRef = attribute.getValue();
                      break;
                  case "precision":
                      this.precision = attribute.getValue();
                      break;
                  case "decimals":
                      this.decimals = attribute.getValue();
                      break;
                  default:
                      withAttributes = true;
                      System.out.print(attribute.getName() + " : "); // todo remove dev item
                      System.out.println(attribute.getValue()); // todo remove dev item
                      xmlEntry = new XmlEntry();
                      xmlEntry.setAttribute(attribute.getName(), attribute.getValue());
              }
          }
        }
          if (withAttributes) {
              xmlEntry.setTag(element.getName());
              xmlEntry.setText(element.getText());
              additional.add(xmlEntry);
          }
      }
    }
  }


    @Override
    public String toString() {
        return "\nItemConcept{" +
                "prefix='" + prefix + '\'' +
                ", tag='" + tag + '\'' +
                ", id='" + id + '\'' +
                ", contextRef='" + contextRef + '\'' +
                ", unitRef='" + unitRef + '\'' +
                ", precision='" + precision + '\'' +
                ", decimals='" + decimals + '\'' +
                ", value='" + value + '\'' +
                ", additional=" + additional +
                '}';
    }
}
