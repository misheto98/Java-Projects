
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DatabaseSender extends JFrame {
    private static final long serialVersionUID = 1L;

    public DatabaseSender() {
        super("Sender data");

        // Set up the database connection
        String url = "jdbc:mysql://localhost:3307/project oop";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
            // Get the length of the table
            ResultSet countResultSet = stmt.executeQuery("SELECT COUNT(*) FROM sender");
            int rowCount = 0;
            if (countResultSet.next()) {
                rowCount = countResultSet.getInt(1);
            }

            // Get the data from the table
            ResultSet dataResultSet = stmt.executeQuery("SELECT * FROM sender");
            Object[][] data = new Object[rowCount][8];
            int row = 0;
            while (dataResultSet.next()) {
                data[row][0] = dataResultSet.getInt("idSender");
                data[row][1] = dataResultSet.getString("email");
                data[row][2] = dataResultSet.getString("password");
                data[row][3] = dataResultSet.getString("firstName");
                data[row][4] = dataResultSet.getString("secondName");
                data[row][5] = dataResultSet.getString("lastName");
                data[row][6] = dataResultSet.getString("address");
                data[row][7] = dataResultSet.getInt("phone");
                row++;
            }

            // Create a JTable with the data and column names
            JTable table = new JTable(data, new Object[]{"idSender", "email", "password", "firstName", "secondName", "lastName", "address", "phone"});

            // Add the table to a scroll pane and add the scroll pane to the frame
            JScrollPane scrollPane = new JScrollPane(table);
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(scrollPane, BorderLayout.CENTER);
            add(panel);

            // Display the length of the table in a message dialog
            JOptionPane.showMessageDialog(null, "The table has " + rowCount + " rows.");

            // Set the frame properties
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600);
            setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DatabaseSender();
    }
}
