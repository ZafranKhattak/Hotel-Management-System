package Database;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotel",
                    "root",
                    "ZafranKhan@06");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
