package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


import lombok.extern.java.Log;

@Log
public class DemoJdbc {

    private static ResourceBundle resource = ResourceBundle.getBundle("db");
    private static String url = resource.getString("url");
    private static String driver = resource.getString("driver");
    private static String user = resource.getString("user");
    private static String password = resource.getString("password");

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName(driver);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData resultSetMetaData = null;
        DatabaseMetaData dbMetaData = null;
        connection = getDatabaseConnection();
        try {
            if (connection != null) {
                statement = connection.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery("Select * from user");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                statement.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        try {
            resultSetMetaData = resultSet.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            dbMetaData = connection.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(dbMetaData.getDatabaseProductName());
            System.out.println(dbMetaData.getDatabaseProductVersion());
            System.out.println(dbMetaData.getDriverName());
            System.out.println(dbMetaData.getUserName());
            System.out.println(dbMetaData.getURL());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static Connection getDatabaseConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return connection;
    }
}
