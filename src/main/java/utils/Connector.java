package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static Connection connection;

  // static String URL = "jdbc:mysql://localhost:3306/db";
    static String URL = "jdbc:mysql://localhost:3306/db?useSSL=false";
   static String user = "root";
   static String password = "root";
    public Connector(){ }

    public static Connection getConnection() {

        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                Class.forName("com.mysql.jdbc.Driver"); // Driver register String
                connection = DriverManager.getConnection(URL, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
            }
        }
        return connection;
    }

//    public static void closeConnection() {
//        try {
//            Connector.getConnection().close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
