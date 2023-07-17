package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    // Create static field
    protected static Connection connection;
    private final static String user = "root";
    private final static String pass = "duong2003";
    private final static String url = "jdbc:mysql://localhost:3306/sellphonecard";

    protected static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
    public DBContext() {
        connection = getConnection();
    }
}
