import java.sql.*;


public class DBAccess {

    static final String DB_URL = "jdbc:mysql://localhost:3307/sports_stocks";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM stocks WHERE brand = 'nike'" ;

    public static void getConnection() {
        // Open a connection

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set - извличат се резултатите

            while (rs.next()) {
                // Retrieve by column name - извличане по име на колкона
                System.out.print("ID: " + rs.getInt(1));
                System.out.print(", Category: " + rs.getString(2));
                System.out.print(", Brand: " + rs.getString(3));
                System.out.print(", Name: " + rs.getString(4));
                System.out.println(", Quantity: " + rs.getString(5));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

