package FilingParser.Database;

import FilingParser.ElementTypes.Arc;
import FilingParser.ElementTypes.Loc;
import FilingParser.Processor.Holders.ExtendedLinkHolder;
import FilingParser.Processor.ItemConceptArc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DatabaseQueries {

  String connectionURI = "jdbc:sqlite:xbrlraw.db";
  String doc_id;

  public DatabaseQueries() {}

  public List<ExtendedLinkHolder> getCalculationExtendedLinks() {
    List<ExtendedLinkHolder> extendedLinkHolders = new ArrayList<>();
    List<String> columns = new ArrayList<>();
    List<String> columnTypes = new ArrayList<>();
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      String sql = "SELECT DISTINCT * from linkBases";
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      ResultSet rs = statement.executeQuery(sql);
      int columnCount = rs.getMetaData().getColumnCount();
      for (int i = 1; i < columnCount + 1; i++) {
        columns.add(rs.getMetaData().getColumnName(i));
        columnTypes.add(rs.getMetaData().getColumnTypeName(i));
      }
      while (rs.next()) {
        System.out.println(rs.getString("ref_id"));
        ExtendedLinkHolder extendedLinkHolder = new ExtendedLinkHolder();
        for (int i = 0; i < columns.size(); i++) {
          switch (columnTypes.get(i)) {
            case "INTEGER":
              extendedLinkHolder.builder(columns.get(i), String.valueOf(rs.getInt(columns.get(i))));
              break;
            case "TEXT":
              extendedLinkHolder.builder(columns.get(i), rs.getString(columns.get(i)));
              break;
            default:
              break;
          }
        }
        extendedLinkHolder.setItemConceptArcs(getConnectionsForLink(extendedLinkHolder.getRef_id()));
        extendedLinkHolders.add(extendedLinkHolder);
      }


    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
    return extendedLinkHolders;
  }

  public List<ItemConceptArc> getConnectionsForLink(String link_ref) {
    List<ItemConceptArc> itemConceptArcs = new ArrayList<>();
    List<String> columns = new ArrayList<>();
    List<String> columnTypes = new ArrayList<>();
    List<String> tableNames = new ArrayList<>();
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      String sql =
          "SELECT A.*,\n"
              + "       FF.*,\n"
              + "       arcs.*,\n"
              + "       B.*,\n"
              + "       FT.*\n"
              + "FROM arcs\n"
              + "         LEFT JOIN locators A ON A.label = arcs.\"from\"\n"
              + "         LEFT JOIN locators B ON B.label = arcs.\"to\"\n"
              + "         INNER JOIN facts FF ON A.concept = FF.concept_ref\n"
              + "         INNER JOIN facts FT ON B.concept = FT.concept_ref\n"
              + "WHERE FF.context_ref = FT.context_ref AND A.ref_id = \'"
              + link_ref
              + "\' AND B.ref_id = \'"
              + link_ref
              + "\'  AND arcs.ref_id = \'"
              + link_ref
              + "\'";
      System.out.println(sql); // todo remove dev item
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      // loop through the result set
      int columnCount = rs.getMetaData().getColumnCount();
      for (int i = 1; i < columnCount + 1; i++) {
        columns.add(rs.getMetaData().getColumnName(i));
        columnTypes.add(rs.getMetaData().getColumnTypeName(i));
        tableNames.add(rs.getMetaData().getTableName(i));
      }

      while (rs.next()) {
        ItemConceptArc itemConceptArc = new ItemConceptArc();
        for (int i = 0; i < columns.size(); i++) {
          switch (columnTypes.get(i)) {
            case "INTEGER":
              itemConceptArc.builder(
                  tableNames.get(i), columns.get(i), String.valueOf(rs.getInt(columns.get(i))));
              break;
            case "TEXT":
              itemConceptArc.builder(
                  tableNames.get(i), columns.get(i), rs.getString(columns.get(i)));
              break;
            default:
              break;
          }
        }
        itemConceptArcs.add(itemConceptArc);
      }

    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
    return itemConceptArcs;
  }

  public List<ItemConceptArc> getLinkBaseConnections() {
    List<ItemConceptArc> itemConceptArcs = new ArrayList<>();
    List<String> columns = new ArrayList<>();
    List<String> columnTypes = new ArrayList<>();
    List<String> columnLabels = new ArrayList<>();
    List<String> tableNames = new ArrayList<>();
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      String sql =
          "SELECT A.*,\n"
              + "       FF.*,\n"
              + "       arcs.*,\n"
              + "       B.*,\n"
              + "       FT.*\n"
              + "FROM arcs\n"
              + "         LEFT JOIN locators A ON A.label = arcs.\"from\"\n"
              + "         LEFT JOIN locators B ON B.label = arcs.\"to\"\n"
              + "         INNER JOIN facts FF ON A.concept = FF.concept_ref\n"
              + "         INNER JOIN facts FT ON B.concept = FT.concept_ref\n"
              + "WHERE FF.context_ref = FT.context_ref AND A.ref_id = B.ref_id AND B.ref_id = arcs.ref_id";
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      // loop through the result set
      int columnCount = rs.getMetaData().getColumnCount();
      for (int i = 1; i < columnCount + 1; i++) {
        columns.add(rs.getMetaData().getColumnName(i));
        columnTypes.add(rs.getMetaData().getColumnTypeName(i));
        columnLabels.add(rs.getMetaData().getColumnLabel(i));
        tableNames.add(rs.getMetaData().getTableName(i));
      }

      int counter = 0;
      while (rs.next()) {
        counter++;
        ItemConceptArc itemConceptArc = new ItemConceptArc();
        //        System.out.println("------------------------------------"); // todo remove dev
        // item
        for (int i = 0; i < columns.size(); i++) {
          switch (columnTypes.get(i)) {
            case "INTEGER":
              //              System.out.println(
              //                  tableNames.get(i)
              //                      + " : "
              //                      + columns.get(i)
              //                      + " : "
              //                      + rs.getInt(columns.get(i))); // todo remove dev item
              itemConceptArc.builder(
                  tableNames.get(i), columns.get(i), String.valueOf(rs.getInt(columns.get(i))));
              break;
            case "TEXT":
              //              System.out.println(
              //                  tableNames.get(i)
              //                      + " : "
              //                      + columns.get(i)
              //                      + " : "
              //                      + rs.getString(columns.get(i))); // todo remove dev item
              itemConceptArc.builder(
                  tableNames.get(i), columns.get(i), rs.getString(columns.get(i)));
              break;
            default:
              break;
          }
        }
        itemConceptArcs.add(itemConceptArc);
      }

      //      System.out.println(counter); // todo remove dev item

    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        //        System.out.println("--------------------------------------"); // todo remove dev
        // item
        //        for (String columnLabel : columnLabels) {
        //          System.out.println(columnLabel); // todo remove dev item
        //        }
        //        System.out.println("--------------------------------------"); // todo remove dev
        // item
        //
        //        for (String columnLabel : tableNames) {
        //          System.out.println(columnLabel); // todo remove dev item
        //        }

        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
    return itemConceptArcs;
  }

  public List<Arc> getArcsForLinkBase() {
    List<Arc> arcList = new ArrayList<>();
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      String sql = "SELECT * from linkBases";
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      // loop through the result set
      while (rs.next()) {
        arcList.add(
            new Arc(
                rs.getString("ref_id"),
                rs.getString("type"),
                rs.getString("role"),
                rs.getString("from"),
                rs.getString("to"),
                rs.getString("order"),
                rs.getString("use"),
                rs.getString("weight"),
                rs.getString("priority")));
      }
      return arcList;

    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
      return arcList;
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
  }
}
