package swing.pastQuestions;

import javax.swing.*;
import java.awt.*;

public class SquareCalculator extends JFrame {

    JLabel resultLabel, numberLabel;
    JTextField numberField;
    JButton calculateBtn;

    public SquareCalculator() {
        setTitle("Square Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new FlowLayout());

        numberLabel = new JLabel("Enter a number:");

        numberField = new JTextField(10);

        numberPanel.add(numberLabel);
        numberPanel.add(numberField);

        add(numberPanel);


        resultLabel = new JLabel("Result will be shown here.");
        add(resultLabel);

        calculateBtn = new JButton("Calculate Square");

        calculateBtn.addActionListener(e -> {
            // Get the text from the text field
            String inputText = numberField.getText();
            double number = Double.parseDouble(inputText);

            // Calculate the square
            double square = number * number;

            // Set the result label's text
            resultLabel.setText("The square is: " + square);
        });

        add(calculateBtn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}