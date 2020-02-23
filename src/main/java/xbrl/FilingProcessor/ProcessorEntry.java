package xbrl.FilingProcessor;

import xbrl.FilingParser.Database.DatabaseHandler;
import xbrl.FilingParser.Database.DatabaseQueries;
import xbrl.FilingProcessor.Holders.ExtendedLinkHolder;

import java.util.List;

public class ProcessorEntry {
    DatabaseHandler databaseHandler;


    public ProcessorEntry() {
        databaseHandler = new DatabaseHandler();
        DatabaseQueries databaseQueries = databaseHandler.getDatabaseQueries();
        List<ExtendedLinkHolder> extendedLinkHolders = databaseQueries.getCalculationExtendedLinks();
        System.out.println(extendedLinkHolders); // todo remove dev item
//        List<ItemConceptArc> itemConceptArcs = databaseQueries.getLinkBaseConnections();
//        System.out.println(itemConceptArcs); // todo remove dev item
    }

}
