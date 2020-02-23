package xbrl.FilingParser.Database;

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
      statement.executeUpdate(SqliteMySchemaXbrl.segments);
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

}
