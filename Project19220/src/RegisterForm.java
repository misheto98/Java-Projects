
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class RegisterForm extends JFrame {
    public static JPanel panel;
    public static JLabel firstNameLabel, secondNameLabel, lastNameLabel, addressLabel, phoneLabel, emailLabel, passwordLabel, confirmPasswordLabel, signInLabel;
    public static JTextField firstNameTextField, secondNameTextField, lastNameTextField, addressTextField, phoneTextField, emailTextField;
    public static JPasswordField passwordField, confirmPasswordField;
    public static JButton registerButton, signInButton;

    public RegisterForm() {
        // Set frame properties
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 700);

        // Create form elements
        firstNameLabel = new JLabel("First Name");
        firstNameTextField = new JTextField(20);

        secondNameLabel = new JLabel("Second Name");
        secondNameTextField = new JTextField(20);

        lastNameLabel = new JLabel("Last Name");
        lastNameTextField = new JTextField(20);

        addressLabel = new JLabel("Address");
        addressTextField = new JTextField(20);

        phoneLabel = new JLabel("Phone Number");
        phoneTextField = new JTextField(20);

        emailLabel = new JLabel("Email");
        emailTextField = new JTextField(20);

        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(20);

        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordField = new JPasswordField(20);

        registerButton = new JButton("Register");
        registerButton.setBackground(Color.decode("#04AA6D"));
        registerButton.setForeground(Color.WHITE);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        signInButton = new JButton("Sign In");
        signInButton.setBackground(Color.decode("#04AA6D"));
        signInButton.setForeground(Color.WHITE);
        signInButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        signInLabel = new JLabel("Already have an account? ");


        // Set form layout
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        // Add form elements to panel
        panel.add(firstNameLabel);
        panel.add(firstNameTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(secondNameLabel);
        panel.add(secondNameTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(lastNameLabel);
        panel.add(lastNameTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(addressLabel);
        panel.add(addressTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(phoneLabel);
        panel.add(phoneTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(Box.createVerticalStrut(10));

        panel.add(registerButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(signInLabel);
        panel.add(signInButton);

        // Add panel to frame
        add(panel);

        // Show frame
        setVisible(true);

        signInButton.addActionListener(e -> {

            LoginGUI loginGUI = new LoginGUI();

            dispose();
        });

        registerButton.addActionListener(e -> {
            SaveData.SaveToDB();

          DeliveryCompanyIndexPage homePage = new DeliveryCompanyIndexPage();

            dispose();
        });
    }

    static Connection conn;
    public static Connection getCon() throws Exception {
        String url = "jdbc:mysql://localhost:3307/project oop";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void insertData(String sql) throws Exception{
        getCon().createStatement().executeUpdate(sql);
    }

    public static void main(String[] args) {

        new RegisterForm();
        new SaveData();

    }
}