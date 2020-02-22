package FilingParser;

import FilingParser.ElementTypes.*;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;

public class ParserTwo {
  List<List<Element>> elementLists = new ArrayList<>();
  List<Context> contexts = new ArrayList<>();
  List<ItemConcept> itemConcepts = new ArrayList<>();
  List<ItemConcept> iinLineIemConcepts = new ArrayList<>();
  List<RoleRef> roleRefs = new ArrayList<>();
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

  public List<RoleRef> getRoleRefs() {
    return roleRefs;
  }

  public ParserTwo(FilingEntry filingEntry) {
    System.out.println("Begin processing parsed"); // todo remove dev item
    this.elementLists = filingEntry.elements;
    this.extendedPrefixes = filingEntry.extendedPrefixes;
    process();
  }

  public void process() {
    for (List<Element> elements : elementLists) {
      switch(elements.get(0).getName()){
        case "context":
          contexts.add(new Context(elements));
          break;
        case "calculationLink":
          calculations.add(new ExtendedLink(elements));
          break;

        default:
//          System.out.println("----------------------------------------------------"); // todo remove dev item
          for (Element element : elements) {
//              System.out.println(el.getName() + " : " + el.getPath()); // todo remove dev item
              if(this.extendedPrefixes.contains(element.getNamespacePrefix())){
                if(!element.getName().contains("TextBlock")){
//                  System.out.println(el.getNamespacePrefix()); // todo remove dev item
                  itemConcepts.add(ItemConcept.parseAndBuild(this.extendedPrefixes, element));
                } else {
                  iinLineIemConcepts.add(ItemConcept.parseAndBuild(this.extendedPrefixes, element));
                }

              }
              switch (element.getName()){
                case "roleRef":
                  roleRefs.add(new RoleRef(element));
                  break;
                default:
                  break;
              }
          }
      }

    }
  }

}
