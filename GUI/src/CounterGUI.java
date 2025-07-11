import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JButton addButton, subtractButton;
    private JLabel resultLabel;

    public CounterGUI() {
        // Create UI components
        textField1 = new JTextField(5);
        textField2 = new JTextField(5);

        addButton = new JButton("+");
        subtractButton = new JButton("-");

        resultLabel = new JLabel("Result: ");

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);

        // Layout setup
        setLayout(new GridLayout(3, 2, 5, 5));
        add(textField1);
        add(textField2);
        add(addButton);
        add(subtractButton);
        add(resultLabel);

        // Frame settings
        setTitle("Simple Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result;

            if (e.getSource() == addButton) {
                result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}