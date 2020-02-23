package FilingParser.Processor;

import FilingParser.Database.DatabaseHandler;
import FilingParser.Database.DatabaseQueries;
import FilingParser.ElementTypes.Loc;
import FilingParser.Processor.Holders.ExtendedLinkHolder;

import java.sql.*;
import java.util.ArrayList;
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
