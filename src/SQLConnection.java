
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIAZ
 */
public class SQLConnection {
    public static Connection getConnection() throws Exception{
        
        String dbRoot = "jdbc:mysql://";
        String hostName ="localhost:3306/";
        String dbName ="booking_application";
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUserName = "root";
        String hostPassword = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = DriverManager.getConnection(dbUrl, hostUserName, hostPassword);
        
        return myConn;
        
    }
    
}
