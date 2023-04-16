
import javax.swing.*;
import java.awt.*;

public class AboutUsPage extends JFrame {

    public AboutUsPage() {

        // Задаване на заглавието на страницата
        setTitle("About Us");

        // Задаване на размера на страницата
        setSize(600, 500);

        // Задаване на действие по подразбиране при затваряне на страницата
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Създаване на контейнер за компонентите
        Container contentPane = getContentPane();

        // Задаване на layout за контейнера
        contentPane.setLayout(new GridLayout(6, 2, 10, 10));

        //title
        JLabel myLabel = new JLabel("Delivery Ltd.");
        myLabel.setFont(new Font("Arial", Font.BOLD, 24));
        myLabel.setForeground((Color.decode("#04AA6D")));



        // Add label to content pane
        getContentPane().add(myLabel);

        // Създаване на компоненти  текста на страницата
        JLabel companyAddressLabel = new JLabel("Company Address:");
        JLabel companyPhoneLabel = new JLabel("Company Phone:");
        JLabel companyEmailLabel = new JLabel("Company Email:");
        JLabel companyDescriptionArea = new JLabel("Company Description:");

        // Настройка на размера на JTextArea
        companyDescriptionArea.setPreferredSize(new Dimension(200, 100));


        // Добавяне на компонентите към контейнера

        contentPane.add(new JLabel()); // Празен JLabel за изравняване с дясната колона
        contentPane.add(companyAddressLabel);
        contentPane.add(new JLabel("123 Main Street, City, Country")); // Примерен текст
        contentPane.add(companyPhoneLabel);
        contentPane.add(new JLabel("+1 (123) 456-7890")); // Примерен текст
        contentPane.add(companyEmailLabel);
        contentPane.add(new JLabel("info@delivery.com")); // Примерен текст
        contentPane.add(companyDescriptionArea);
        contentPane.add(new JLabel("We are Delivery LTD. We are top of the world."));


        // Настройка на видимостта на страницата
        setVisible(true);
    }

    public static void main(String[] args) {
        // Създаване на инстанция на AboutUsPage и показване на страницата
        AboutUsPage аboutUsPage = new AboutUsPage();

    }
}
