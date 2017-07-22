
package cuelayer;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionModel
{
    public static Connection con = null;

    public static Connection getConnection()
    {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            return con;

        } catch (Exception e) {
            System.out.println("Exception From Database----"+e.getMessage());
             return null;
        }

   }

}
