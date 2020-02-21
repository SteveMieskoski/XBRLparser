package FilingParser;

import java.sql.*;

public class DatabaseHandler {

  public DatabaseHandler() {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(SqliteMySchemaXbrl.drop);
      statement.executeUpdate(SqliteMySchemaXbrl.linkBases);
      statement.executeUpdate(SqliteMySchemaXbrl.locators);
      statement.executeUpdate(SqliteMySchemaXbrl.arcs);

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
  }

  public boolean insertLocator(String ref_id, String locatorType, String href, String label) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(
          "insert into locators values("
              + ref_id
              + ","
              + locatorType
              + ","
              + href
              + ","
              + label
              + ")");
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

  public boolean insertLinkBase(
      String ref_id, String linkBaseType, String role, String title, String schema) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(
          "insert into linkBases values("
              + ref_id
              + ","
              + linkBaseType
              + ","
              + role
              + ","
              + title
              + ","
              + schema
              + ")");
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

  public boolean insertArcs(
      String ref_id,
      String arcType,
      String role,
      String arcFrom,
      String arcTo,
      String arcOrder,
      String arcUse,
      String arcWeight,
      String arcPriority) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(
          "insert into arcs values("
              + ref_id
              + ","
              + arcType
              + ","
              + role
              + ","
              + arcFrom
              + ","
              + arcTo
              + ","
              + arcOrder
              + ","
              + arcUse
              + ","
              + arcWeight
              + ","
              + arcPriority
              + ")");
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

  public boolean insertFacts(
      String concept_ref, String context_ref, String unit_ref, String decimals, String value) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(
          "insert into facts values("
              + concept_ref
              + ","
              + context_ref
              + ","
              + unit_ref
              + ","
              + decimals
              + ","
              + value
              + ")");
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

  public boolean insertContexts(
      String context_id,
      String identifier,
      String identifier_schema,
      String start_date,
      String end_date,
      String segment_dim,
      String segment_value) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      boolean isInstant = end_date == null;
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(
          "insert into contexts values("
              + context_id
              + ","
              + identifier
              + ","
              + identifier_schema
              + ","
              + start_date
              + ","
              + end_date
              + ","
              + isInstant
              + ","
              + segment_dim
              + ","
              + segment_value
              + ")");
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
}
