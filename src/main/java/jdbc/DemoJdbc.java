package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import lombok.extern.java.Log;

@Log
public class DemoJdbc {

    private static final String INSERT = "insert into user(name, phone) " +
            "values(?, ?)";

    private static ResourceBundle resource = ResourceBundle.getBundle("db");
    private static String url = resource.getString("url");
    private static String driver = resource.getString("driver");
    private static String user = resource.getString("user");
    private static String password = resource.getString("password");

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData resultSetMetaData = null;
        DatabaseMetaData dbMetaData = null;
        PreparedStatement preparedStatement = null;

        Class.forName(driver);
        connection = getDatabaseConnection();

        if (connection != null) {
            statement = connection.createStatement();
        }
        resultSet = statement.executeQuery("Select * from user");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
        }

        resultSetMetaData = resultSet.getMetaData();

        System.out.println(resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnName(1));

        dbMetaData = connection.getMetaData();

        System.out.println(dbMetaData.getDatabaseProductName());
        System.out.println(dbMetaData.getDatabaseProductVersion());
        System.out.println(dbMetaData.getDriverName());
        System.out.println(dbMetaData.getUserName());
        System.out.println(dbMetaData.getURL());

        preparedStatement = connection.prepareStatement(INSERT);
        PrepearedInsert.insert(preparedStatement, "Misha", 123123);
        statement.close();
        connection.close();

    }

    private static Connection getDatabaseConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return connection;
    }
}