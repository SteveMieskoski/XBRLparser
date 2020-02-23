package FilingParser.Processor;

import FilingParser.Processor.Holders.ArcHolder;
import FilingParser.Processor.Holders.ItemConceptHolder;
import FilingParser.Processor.Holders.LocHolder;

public class ItemConceptArc {
  LocHolder fromLocator = new LocHolder();
  ItemConceptHolder fromFact = new ItemConceptHolder();
  ArcHolder arc = new ArcHolder();
  LocHolder toLocator = new LocHolder();
  ItemConceptHolder toFact = new ItemConceptHolder();

  String currentTable = "";
  Integer increment = 0;

  public ItemConceptArc() {}

  public void builder(String table, String column, String value) {
    if (!table.equals(currentTable)) {
      currentTable = table;
      ++increment;
    }

    switch (increment) {
      case 1: // locators
          fromLocator.builder(column, value);
        break;
      case 2: // facts
          fromFact.builder(column, value);
        break;
      case 3: // arcs
          arc.builder(column, value);
        break;
      case 4: // locators
          toLocator.builder(column, value);
        break;
      case 5: // facts
          toFact.builder(column, value);
        break;
    }
  }


  public String getContext(){
    return fromFact.getContext_ref();
  }

  public String getParentLinkRef(){
    return arc.getRef_id();
  }

  @Override
  public String toString() {
    return "\nItemConceptArc{" +
            "fromLocator=" + fromLocator +
            ", fromFact=" + fromFact +
            ", arc=" + arc +
            ", toLocator=" + toLocator +
            ", toFact=" + toFact +
            ", currentTable='" + currentTable + '\'' +
            ", increment=" + increment +
            '}';
  }
}
