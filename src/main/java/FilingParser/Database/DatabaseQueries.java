package FilingParser.Database;


import FilingParser.ElementTypes.Arc;
import FilingParser.ElementTypes.Loc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DatabaseQueries {

  String connectionURI = "jdbc:sqlite:xbrlraw.db";
  String doc_id;

  public DatabaseQueries() {}

  public boolean getCalculationLinkBases() {
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
        System.out.println(rs.getString("ref_id"));
      }
      return true;

    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
      return false;
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
  }

  public List<Loc> getLocatorsForLinkBase(String linkBaseRef) {
    List<Loc> locators = new ArrayList<>();
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      String sql = "SELECT * from locators WHERE ref_id=" + linkBaseRef;
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      // loop through the result set
      while (rs.next()) {
        locators.add(
            new Loc(
                rs.getString("ref_id"),
                rs.getString("type"),
                rs.getString("href"),
                rs.getString("label")));
      }
      return locators;

    } catch (Exception e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
      return locators;
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
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
