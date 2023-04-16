
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class LoginGUI extends JFrame {

    static Connection conn;
    public static JTextField emailField;
    public static JPasswordField pswField;
    public static JButton loginButton, cancelButton;

    public LoginGUI() {
        // Create a new JFrame object
        super("Login Form");

        // Set the dimensions of the window
        setSize(400, 400);

        // Create a JPanel object with a GridLayout
        JPanel panel = new JPanel(new GridLayout(5, 1));

        // Create a JLabel object and add it to the panel
        JLabel label = new JLabel("Login Form");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

        // Create a JPanel object for the input fields and add it to the panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JLabel unameLabel = new JLabel("Email");
        inputPanel.add(unameLabel);
        emailField = new JTextField();
        inputPanel.add(emailField);
        JLabel pswLabel = new JLabel("Password");
        inputPanel.add(pswLabel);
        pswField = new JPasswordField();
        inputPanel.add(pswField);
        panel.add(inputPanel);

        // Create a JPanel object for the buttons and add it to the panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        loginButton = new JButton("Login");
        buttonPanel.add(loginButton);
        cancelButton = new JButton("Cancel");
        buttonPanel.add(cancelButton);
        panel.add(buttonPanel);

        // Set the behavior of the window when closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the panel to the frame and display the window
        add(panel);
        setVisible(true);

        loginButton.addActionListener(e -> {

            try {
                getCon();
                dispose();      // Dispose of the current window
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }



        });
    }


    public static Connection getCon() throws Exception {
        String url = "jdbc:mysql://localhost:3307/project oop";
        String username = "root";
        String password = "";
        String sql = "SELECT * FROM Users WHERE Email='"+ emailField.getText() +"' AND Password='"+ pswField.getText() +"'";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = conn.prepareStatement(sql);
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            rs = pst.executeQuery();

            if (rs.next()){
            DeliveryCompanyIndexPage HomePage = new DeliveryCompanyIndexPage();
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect email or password!");
            }



        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        // Create a new LoginGUI object
        LoginGUI loginGUI = new LoginGUI();

    }
}