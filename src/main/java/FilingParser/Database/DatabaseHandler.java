package FilingParser.Database;

import java.sql.*;
import java.util.UUID;

public class DatabaseHandler {
  DatabaseInsert databaseInsert;
  DatabaseQueries databaseQueries;
  String connectionURI = "jdbc:sqlite:xbrlraw.db";
  String doc_id;

  public DatabaseHandler() {
    this(UUID.randomUUID().toString(), false);
  }

  public DatabaseHandler(boolean doReset) {
    this(UUID.randomUUID().toString(), doReset);
  }

  public DatabaseHandler(String doc_id, boolean doReset) {
    this.doc_id = doc_id;
    this.databaseInsert = new DatabaseInsert(this);
    this.databaseQueries = new DatabaseQueries();
    if(doReset){
      reset();
    }
  }

  public DatabaseInsert getDatabaseInsert(){
    return databaseInsert;
  }

  public DatabaseQueries getDatabaseQueries(){
    return databaseQueries;
  }

  public void reset(){
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      statement.executeUpdate(SqliteMySchemaXbrl.drop);
      statement.executeUpdate(SqliteMySchemaXbrl.linkBases);
      statement.executeUpdate(SqliteMySchemaXbrl.locators);
      statement.executeUpdate(SqliteMySchemaXbrl.arcs);
      statement.executeUpdate(SqliteMySchemaXbrl.facts);
      statement.executeUpdate(SqliteMySchemaXbrl.contexts);
      statement.executeUpdate(SqliteMySchemaXbrl.roleRefs);

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
      connection = DriverManager.getConnection(connectionURI);
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into locators (ref_id, type, href, label, doc_id) values(?,?,?,?,?)");
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      preparedStatement.setString(1, ref_id);
      preparedStatement.setString(2, locatorType);
      preparedStatement.setString(3, href);
      preparedStatement.setString(4, label);
      preparedStatement.setString(5, doc_id);
      preparedStatement.executeUpdate();

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
      String ref_id, String tag, String linkBaseType, String role, String title, String schema) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into linkBases (ref_id, tag, type, role, title, schema, doc_id) values(?,?,?,?,?,?,?)");
      preparedStatement.setString(1, ref_id);
      preparedStatement.setString(2, tag);
      preparedStatement.setString(3, linkBaseType);
      preparedStatement.setString(4, role);
      preparedStatement.setString(5, title);
      preparedStatement.setString(6, schema);
      preparedStatement.setString(7, doc_id);
      preparedStatement.executeUpdate();

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
      connection = DriverManager.getConnection(connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into arcs (ref_id, type, role, 'from', 'to', 'order', use, weight, priority, doc_id) values(?,?,?,?,?,?,?,?,?,?)");
      preparedStatement.setString(1, ref_id);
      preparedStatement.setString(2, arcType);
      preparedStatement.setString(3, role);
      preparedStatement.setString(4, arcFrom);
      preparedStatement.setString(5, arcTo);
      preparedStatement.setString(6, arcOrder);
      preparedStatement.setString(7, arcUse);
      preparedStatement.setString(8, arcWeight);
      preparedStatement.setString(9, arcPriority);
      preparedStatement.setString(10, doc_id);
      preparedStatement.executeUpdate();

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
      String prefix,
      String concept_ref,
      String context_ref,
      String unit_ref,
      String decimals,
      String value) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into facts (prefix, concept_ref, context_ref, unit_ref, decimals, value, doc_id)  values(?, ?,?,?,?,?,?)");
      preparedStatement.setString(1, prefix);
      preparedStatement.setString(2, concept_ref);
      preparedStatement.setString(3, context_ref);
      preparedStatement.setString(4, unit_ref);
      preparedStatement.setString(5, decimals);
      preparedStatement.setString(6, value);
      preparedStatement.setString(7, doc_id);
      preparedStatement.executeUpdate();

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
      Boolean isInstant,
      Boolean isForever,
      String segment_dim,
      String segment_value) {
    Connection connection = null;
    try {
//      System.out.println(isInstant); // todo remove dev item
//      System.out.println(isForever); // todo remove dev item
//      System.out.println(segment_dim); // todo remove dev item
//      System.out.println(segment_value); // todo remove dev item

      boolean isInstantValue = isInstant != null ? isInstant : false;
      boolean isForeverValue = isForever != null ? isForever : false;
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into contexts (context_id, identifier, identifier_schema, start_date, end_date,isInstant, isForever, segment_dim, segment_value, doc_id) values(?,?,?,?,?,?,?,?,?,?)");
      preparedStatement.setString(1, context_id);
      preparedStatement.setString(2, identifier);
      preparedStatement.setString(3, identifier_schema);
      preparedStatement.setString(4, start_date);
      preparedStatement.setString(5, end_date);
      preparedStatement.setBoolean(6, isInstantValue);
      preparedStatement.setBoolean(7, isForeverValue);
      preparedStatement.setString(8, segment_dim);
      preparedStatement.setString(9, segment_value);
      preparedStatement.setString(10, doc_id);
      preparedStatement.executeUpdate();

      return true;

    } catch (Exception e) {
      System.out.println("Insert ERROR"); // todo remove dev item
      e.printStackTrace();
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
      return false;
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        System.out.println("Close ERROR"); // todo remove dev item
        // connection close failed.
        System.err.println(e);
      }
    }
  }

  public boolean insertRoleRefs(
          String roleRef_id,
          String schema_def,
          String type,
          String href,
          String role_uri) {
    Connection connection = null;
    try {

      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      // create a database connection
      connection = DriverManager.getConnection(connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
              connection.prepareStatement(
                      "insert into roleRefs (roleRef_id, schema_def, type, href, role_uri, doc_id) values(?,?,?,?,?,?)");
      preparedStatement.setString(1, roleRef_id);
      preparedStatement.setString(2, schema_def);
      preparedStatement.setString(3, type);
      preparedStatement.setString(4, href);
      preparedStatement.setString(5, role_uri);
      preparedStatement.setString(6, doc_id);
      preparedStatement.executeUpdate();

      return true;

    } catch (Exception e) {
      System.out.println("Insert ERROR"); // todo remove dev item
      e.printStackTrace();
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
      return false;
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        System.out.println("Close ERROR"); // todo remove dev item
        // connection close failed.
        System.err.println(e);
      }
    }
  }
}
