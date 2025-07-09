package swing.pastQuestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class solved_020_swing extends JFrame {

    JLabel numLabel, ansHintLabel, actualAnswerLabel;
    JTextField numField;
    JButton calculateBtn;

    JPanel numEnterPanel, answerPanel;


    solved_020_swing() {
        setTitle("QSN solved");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));


        numEnterPanel = new JPanel();
        numEnterPanel.setLayout(new FlowLayout());

        numLabel = new JLabel("Enter number: ");
        numEnterPanel.add(numLabel);

        numField = new JTextField(20);
        numEnterPanel.add(numField);

        add(numEnterPanel);


        calculateBtn = new JButton("Calculate");
        add(calculateBtn);

        calculateBtn.addMouseListener(new MouseListener() {


            @Override
            public void mousePressed(MouseEvent e) {

                String inpText = numField.getText();
                // decimal number ko factorial hudaina so int ma lageko
                int num = Integer.parseInt(inpText);

                int ans = 1;

                for (int i = 1; i <= num; i++) {
                    ans = ans * i;
                }
                ansHintLabel.setText("Factorial is: ");
                actualAnswerLabel.setText("" + ans);
            }


            @Override
            public void mouseReleased(MouseEvent e) {
                // Suruma input ma bhako kura lene
                String inpText = numField.getText();

                // float ko cube hunxa so float mai lageko
                float num = Float.parseFloat(inpText);

                float ans = num * num * num;

                ansHintLabel.setText("Cube is: ");
                actualAnswerLabel.setText("" + ans);

            }

            @Override
            public void mouseClicked(MouseEvent e) { }


            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        });


        answerPanel = new JPanel();
        answerPanel.setLayout(new FlowLayout());

        ansHintLabel = new JLabel("Answer: ");
        answerPanel.add(ansHintLabel);

        actualAnswerLabel = new JLabel("");
        answerPanel.add(actualAnswerLabel);

        add(answerPanel);


        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new solved_020_swing();
    }
}
