package FilingParser;

import FilingParser.ElementTypes.Context;
import FilingParser.ElementTypes.ExtendedLink;
import FilingParser.ElementTypes.ItemConcept;
import FilingParser.ElementTypes.XmlEntry;
import org.apache.commons.collections.ArrayStack;
import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParserTwo {
  List<List<Element>> elements = new ArrayList<>();
  List<Context> contexts = new ArrayList<>();
  List<ItemConcept> itemConcepts = new ArrayList<>();
  List<ItemConcept> iinLineIemConcepts = new ArrayList<>();
  List<ExtendedLink> calculations = new ArrayList<>();
    List<String> extendedPrefixes;


  public List<Context> getContexts() {
    return contexts;
  }

  public List<ItemConcept> getItemConcepts() {
    return itemConcepts;
  }

  public List<ExtendedLink> getCalculations() {
    return calculations;
  }

  public ParserTwo(FilingEntry filingEntry) {
    System.out.println("Begin processing parsed"); // todo remove dev item
    this.elements = filingEntry.elements;
    this.extendedPrefixes = filingEntry.extendedPrefixes;
    process();
  }

  public void process() {
    for (List<Element> element : elements) {
      switch(element.get(0).getName()){
        case "context":
          contexts.add(new Context(element));
          break;
        case "calculationLink":
          calculations.add(new ExtendedLink(element));
          break;
        default:
//          System.out.println("----------------------------------------------------"); // todo remove dev item
          for (Element el : element) {
//              System.out.println(el.getName() + " : " + el.getPath()); // todo remove dev item
              if(this.extendedPrefixes.contains(el.getNamespacePrefix())){
                if(!el.getName().contains("TextBlock")){
//                  System.out.println(el.getNamespacePrefix()); // todo remove dev item
                  itemConcepts.add(ItemConcept.parseAndBuild(this.extendedPrefixes, el));
                } else {
                  iinLineIemConcepts.add(ItemConcept.parseAndBuild(this.extendedPrefixes, el));
                }

              }
          }
      }

    }
  }

}
