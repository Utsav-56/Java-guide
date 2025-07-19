package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonsExample {
    /**
     * The main method initializes a JFrame with radio buttons for gender selection.
     * It sets up a grid layout, adds radio buttons to a button group, and a button
     * to check the selection. Upon clicking the "Check Selection" button, the selected
     * gender is printed to the console.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        var frame = new JFrame("Radio Button Examples");
        frame.setLayout(new GridLayout(1, 4));


        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout());


        JRadioButton genMale = new JRadioButton("Male");
        JRadioButton genFemale = new JRadioButton("Female");
        JRadioButton genOther = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(genMale);
        genderGroup.add(genFemale);
        genderGroup.add(genOther);

        genderPanel.add(genMale);
        genderPanel.add(genFemale);
        genderPanel.add(genOther);


        JButton checkButton = new JButton("Check Selection");
        frame.add(checkButton);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (genMale.isSelected()) {
                    System.out.println("Selected: Male");
                } else if (genFemale.isSelected()) {
                    System.out.println("Selected: Female");
                } else if (genOther.isSelected()) {
                    System.out.println("Selected: Other");
                } else {
                    System.out.println("No selection made.");
                }
            }
        });

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}





class RadioApp extends JFrame{
    RadioApp() {



    }
}