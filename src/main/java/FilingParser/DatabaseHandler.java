package newParser;

import xbrlSchemas.SqliteXbrlDdl;
import xbrlSchemas.SqliteXbrlIndustryCodePopulate;

import java.sql.*;

public class DatabaseHandler {

    public DatabaseHandler(){
        Connection connection = null;
        try {
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");



            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate(SqliteXbrlDdl.drop);
            statement.executeUpdate(SqliteXbrlDdl.entity);
            statement.executeUpdate(SqliteXbrlDdl.former_entity);
            statement.executeUpdate(SqliteXbrlDdl.filing);
            statement.executeUpdate(SqliteXbrlDdl.report);
            statement.executeUpdate(SqliteXbrlDdl.document);
            statement.executeUpdate(SqliteXbrlDdl.referenced_documents);
            statement.executeUpdate(SqliteXbrlDdl.aspect);
            statement.executeUpdate(SqliteXbrlDdl.data_type);
            statement.executeUpdate(SqliteXbrlDdl.role_type);
            statement.executeUpdate(SqliteXbrlDdl.arcrole_type);
            statement.executeUpdate(SqliteXbrlDdl.used_on);
            statement.executeUpdate(SqliteXbrlDdl.resource);
            statement.executeUpdate(SqliteXbrlDdl.relationship_set);
            statement.executeUpdate(SqliteXbrlDdl.root);
            statement.executeUpdate(SqliteXbrlDdl.relationship);
            statement.executeUpdate(SqliteXbrlDdl.data_point);
            statement.executeUpdate(SqliteXbrlDdl.entity_identifier);
            statement.executeUpdate(SqliteXbrlDdl.period);
            statement.executeUpdate(SqliteXbrlDdl.unit);
            statement.executeUpdate(SqliteXbrlDdl.unit_measure);
            statement.executeUpdate(SqliteXbrlDdl.aspect_value_selection_set);
            statement.executeUpdate(SqliteXbrlDdl.aspect_value_selection);
            statement.executeUpdate(SqliteXbrlDdl.table_data_points);
            statement.executeUpdate(SqliteXbrlDdl.message);
            statement.executeUpdate(SqliteXbrlDdl.message_reference);
            statement.executeUpdate(SqliteXbrlDdl.industry);
            statement.executeUpdate(SqliteXbrlDdl.industry_level);
            statement.executeUpdate(SqliteXbrlDdl.industry_structure);


            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert1);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert2);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert3);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert4);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert5);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert6);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert6);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert7);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert8);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert9);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert10);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert11);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert12);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert13);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert14);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert15);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert16);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert16);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert17);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert18);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert19);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert20);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert21);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert22);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert23);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert24);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert25);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert26);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert27);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert28);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert29);
            statement.executeUpdate(SqliteXbrlIndustryCodePopulate.industryCodeInsert30);


            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person (id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'leo')");
            statement.executeUpdate("insert into person values(2, 'yui')");
            ResultSet rs = statement.executeQuery("select * from person");
            while(rs.next())
            {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }

        }
        catch (Exception e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(connection != null)
                    connection.close();
            }
            catch(SQLException e)
            {
                // connection close failed.
                System.err.println(e);
            }
        }

    }



}
