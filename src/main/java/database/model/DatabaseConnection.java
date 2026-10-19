package database.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database credentials
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String USER = "your_user";
    private static final String PASSWORD = "your_password";

    // Private constructor prevents anyone from instantiating this utility class
    private DatabaseConnection() {}

    /**
     * Establishes and returns a new connection to the database.
     */
    public static Connection getConnection() throws SQLException {
        // DriverManager automatically finds the MariaDB driver on your classpath
        // and attempts to connect using the provided credentials.
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}