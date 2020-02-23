package xbrl.FilingParser.Database;

import xbrl.FilingParser.ElementTypes.*;
import xbrl.FilingParser.ParserTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabaseInsert {
  DatabaseHandler databaseHandler;

  public DatabaseInsert(DatabaseHandler databaseHandler) {
    this.databaseHandler = databaseHandler;
  }

  public void insertFacts(ParserTwo parserTwo) {
    System.out.println("Insert Facts"); // todo remove dev item
    for (ItemConcept itemConcept : parserTwo.getItemConcepts()) {
      insertFacts(
          itemConcept.prefix,
          itemConcept.tag,
          itemConcept.contextRef,
          itemConcept.unitRef,
          itemConcept.decimals,
          itemConcept.value);
    }
  }

  public void insertFacts(
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
      connection = DriverManager.getConnection(databaseHandler.connectionURI);

      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into facts (prefix, concept_ref, context_ref, unit_ref, decimals, value, doc_id)  values(?, ?,?,?,?,?,?)");
      preparedStatement.setString(1, prefix);
      preparedStatement.setString(2, concept_ref);
      preparedStatement.setString(3, context_ref);
      preparedStatement.setString(4, unit_ref);
      preparedStatement.setString(5, decimals);
      preparedStatement.setString(6, value);
      preparedStatement.setString(7, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

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

  public void insertExtendedLinks(ParserTwo parserTwo) {
    System.out.println("Insert Extended Links"); // todo remove dev item
    for (ExtendedLink extendedLink : parserTwo.getCalculations()) {
      insertLinkBase(
          extendedLink.uuid,
          extendedLink.tag,
          extendedLink.type,
          extendedLink.role,
          extendedLink.title,
          extendedLink.schema);
      for (Arc arc : extendedLink.arcs) {
        insertArcs(
            extendedLink.uuid,
            arc.type,
            arc.arcrole,
            arc.from,
            arc.to,
            arc.order,
            arc.use,
            arc.weight,
            arc.priority);
      }
      for (Loc loc : extendedLink.locs) {
        insertLocator(
            extendedLink.uuid,
            loc.type,
            loc.href,
            loc.conceptRaw,
            loc.schemaDef,
            loc.concept,
            loc.prefix,
            loc.label);
      }
    }
  }

  public void insertLinkBase(
      String ref_id, String tag, String linkBaseType, String role, String title, String schema) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
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
      preparedStatement.setString(7, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

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

  public void insertArcs(
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
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
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
      preparedStatement.setString(10, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

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

  public void insertLocator(
      String ref_id,
      String locatorType,
      String href,
      String conceptRaw,
      String schemaDef,
      String concept,
      String prefix,
      String label) {
    Connection connection = null;
    try {
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");

      // create a database connection
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into locators (ref_id, type, href, conceptRaw, schemaDef, concept, prefix, label, doc_id) values(?,?,?,?,?,?,?,?,?)");
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      preparedStatement.setString(1, ref_id);
      preparedStatement.setString(2, locatorType);
      preparedStatement.setString(3, href);
      preparedStatement.setString(4, conceptRaw);
      preparedStatement.setString(5, schemaDef);
      preparedStatement.setString(6, concept);
      preparedStatement.setString(7, prefix);
      preparedStatement.setString(8, label);
      preparedStatement.setString(9, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

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

  public void insertContexts(ParserTwo parserTwo) {
    System.out.println("Insert Contexts"); // todo remove dev item
    for (Context context : parserTwo.getContexts()) {
      insertSegments(context.getId(), context.segments);

      insertContexts(
          context.getId(),
          context.getEntityIdentifier(),
          context.getIdentifierSchema(),
          context.getPeriodStart(),
          context.getPeriodEnd(),
          context.getInstant(),
          context.getForever());
    }
  }

  public void insertContexts(
          String context_id,
          String identifier,
          String identifier_schema,
          String start_date,
          String end_date,
          Boolean isInstant,
          Boolean isForever) {
    Connection connection = null;
    try {
      boolean isInstantValue = isInstant != null ? isInstant : false;
      boolean isForeverValue = isForever != null ? isForever : false;
      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      // create a database connection
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
              connection.prepareStatement(
                      "insert into contexts (context_id, identifier, identifier_schema, start_date, end_date,isInstant, isForever, doc_id) values(?,?,?,?,?,?,?,?)");
      preparedStatement.setString(1, context_id);
      preparedStatement.setString(2, identifier);
      preparedStatement.setString(3, identifier_schema);
      preparedStatement.setString(4, start_date);
      preparedStatement.setString(5, end_date);
      preparedStatement.setBoolean(6, isInstantValue);
      preparedStatement.setBoolean(7, isForeverValue);
      preparedStatement.setString(8, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

    } catch (Exception e) {
      System.out.println("Insert ERROR"); // todo remove dev item
      e.printStackTrace();
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
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

  public void insertSegments(String context_id, List<XmlEntry> segments) {
    System.out.println("Insert Context Segments"); // todo remove dev item
    if (!segments.isEmpty()) {
      for (XmlEntry xmlEntry : segments) {
        if (xmlEntry.attributes.containsKey("dimension")) {
          insertSegments(context_id, xmlEntry.attributes.get("dimension"), xmlEntry.getText());
        }
      }
    }
  }

  public void insertSegments(String context_id, String segment_dim, String segment_value) {
    Connection connection = null;
    try {

      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      // create a database connection
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
      //      Statement statement = connection.createStatement();
      //      statement.setQueryTimeout(30); // set timeout to 30 sec.
      PreparedStatement preparedStatement =
          connection.prepareStatement(
              "insert into segments (context_id, segment_dim, segment_value, doc_id) values(?,?,?,?)");
      preparedStatement.setString(1, context_id);
      preparedStatement.setString(2, segment_dim);
      preparedStatement.setString(3, segment_value);
      preparedStatement.setString(4, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

    } catch (Exception e) {
      System.out.println("Insert ERROR"); // todo remove dev item
      e.printStackTrace();
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
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

  public void insertRoleRefs(ParserTwo parserTwo) {
    System.out.println("Insert Role refs"); // todo remove dev item
    for (RoleRef roleRef : parserTwo.getRoleRefs()) {
      insertRoleRefs(
          roleRef.roleRefId, roleRef.schemaDef, roleRef.type, roleRef.href, roleRef.roleUri);
    }
  }
  // Raw Database interactions



  public void insertRoleRefs(
      String roleRef_id, String schema_def, String type, String href, String role_uri) {
    Connection connection = null;
    try {

      // load the sqlite-JDBC driver using the current class loader
      Class.forName("org.sqlite.JDBC");
      // create a database connection
      connection = DriverManager.getConnection(databaseHandler.connectionURI);
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
      preparedStatement.setString(6, databaseHandler.doc_id);
      preparedStatement.executeUpdate();

    } catch (Exception e) {
      System.out.println("Insert ERROR"); // todo remove dev item
      e.printStackTrace();
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
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
