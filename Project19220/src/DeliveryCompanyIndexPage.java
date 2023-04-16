import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeliveryCompanyIndexPage extends JFrame {

    public DeliveryCompanyIndexPage() {

        // Set the frame properties
        setTitle("Delivery Company");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create the welcome message
        JLabel welcomeLabel = new JLabel("Welcome to Delivery Company");
        welcomeLabel.setBounds(250, 50, 300, 50);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Create the delivery options panel
        JPanel deliveryOptionsPanel = new JPanel();
        deliveryOptionsPanel.setBounds(100, 150, 600, 300);
        deliveryOptionsPanel.setLayout(new GridLayout(3, 2, 20, 20));

        // Create the delivery options buttons
        JButton registerButton = new JButton("Register");
        registerButton.setBackground(Color.decode("#04AA6D"));
        registerButton.setForeground(Color.WHITE);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        registerButton.addActionListener(e -> {

            RegisterForm registerForm = new  RegisterForm();

            dispose();
        });


        JButton DatabaseSenderButton= new JButton("Sender info");
        DatabaseSenderButton.setBackground(Color.decode("#04AA6D"));
        DatabaseSenderButton.setForeground(Color.WHITE);
        DatabaseSenderButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        DatabaseSenderButton.addActionListener(e -> {

            DatabaseSender DatabaseSender = new DatabaseSender();

            dispose();
        });

        JButton DatabaseReceiverButton= new JButton("Receiver info");
        DatabaseSenderButton.setBackground(Color.decode("#04AA6D"));
        DatabaseSenderButton.setForeground(Color.WHITE);
        DatabaseSenderButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        DatabaseReceiverButton.addActionListener(e -> {

            DatabaseReceiver DatabaseReceiver = new DatabaseReceiver();

            dispose();
        });




        JButton priceCalculatingButton = new JButton("Calculate price of delivery");
        priceCalculatingButton.setBackground(Color.decode("#04AA6D"));
        priceCalculatingButton.setForeground(Color.WHITE);
        priceCalculatingButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        priceCalculatingButton.addActionListener(e -> {

             CalculatePrice calculatePrice= new CalculatePrice();

            dispose();
        });



        JButton aboutUsButton = new JButton("About us");
        aboutUsButton.setBackground(Color.decode("#04AA6D"));
        aboutUsButton.setForeground(Color.WHITE);
        aboutUsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        aboutUsButton.addActionListener(e -> {

            AboutUsPage AboutUsPage = new AboutUsPage();

            dispose();
        });





        // Add the delivery options buttons to the delivery options panel
        deliveryOptionsPanel.add(DatabaseSenderButton);
        deliveryOptionsPanel.add(priceCalculatingButton);
        deliveryOptionsPanel.add(aboutUsButton);
        deliveryOptionsPanel.add(registerButton);
        deliveryOptionsPanel.add(DatabaseReceiverButton);


        // Add the welcome message and delivery options panel to the frame
        add(welcomeLabel);
        add(deliveryOptionsPanel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new DeliveryCompanyIndexPage();
    }
}