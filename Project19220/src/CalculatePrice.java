
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatePrice extends JFrame {

    private JRadioButton small, medium, big, large;
    private JTextField weightField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public CalculatePrice() {
        setTitle("Calculate price");
        setLayout(new BorderLayout());

        JPanel sizePanel = new JPanel(new GridLayout(4, 1));
        sizePanel.setBorder(BorderFactory.createTitledBorder("Choose your package size:"));

        small = new JRadioButton("small (40x30x30)", true);
        medium = new JRadioButton("medium (45x45x40)");
        big = new JRadioButton("big (60x45x45)");
        large = new JRadioButton("large (60x45x60)");

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(small);
        sizeGroup.add(medium);
        sizeGroup.add(big);
        sizeGroup.add(large);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(big);
        sizePanel.add(large);

        JPanel weightPanel = new JPanel();
        weightPanel.setBorder(BorderFactory.createTitledBorder("Choose your package weight:"));

        weightField = new JTextField("1", 5);

        weightPanel.add(weightField);

        JPanel buttonPanel = new JPanel();

        calculateButton = new JButton("Calculate");

        buttonPanel.add(calculateButton);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(sizePanel, BorderLayout.NORTH);
        add(weightPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.EAST);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected radio button and input field values
                double size = 0;
                if (small.isSelected()) {
                    size = 3.60;
                } else if (medium.isSelected()) {
                    size = 8.10;
                } else if (big.isSelected()) {
                    size = 12.15;
                } else if (large.isSelected()) {
                    size = 16.20;
                }
                double weight = Double.parseDouble(weightField.getText());

                // Perform the calculation and display the result
                double result = size + weight/2;
                resultLabel.setText(String.format("%.2f", result));
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(300, 300); // set the size of the window to 400 by 700 pixels
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatePrice();
            }
        });
    }
}