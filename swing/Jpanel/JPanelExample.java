package swing.Jpanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelExample extends JFrame {
    public JPanelExample() {
        // Create frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4,1));




        JPanel nameInputPanel = new JPanel();
        nameInputPanel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        nameInputPanel.add(nameLabel);
        nameInputPanel.add(nameField);

        add(nameInputPanel);



        JPanel emailInputPanel = new JPanel();
        emailInputPanel.setLayout(new FlowLayout());

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        emailInputPanel.add(emailLabel);
        emailInputPanel.add(emailField);

        add(emailInputPanel);


        JPanel panel = new JPanel();
        var panelLayout = new FlowLayout();
        panel.setLayout(panelLayout);

        JLabel label = new JLabel("Choose an option:");

        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");

        // Add components to panel
        panel.add(label);
        panel.add(button1);
        panel.add(button2);

        // Add panel to frame
        add(panel);




        setAlwaysOnTop(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}


class WithoutJPanelExample extends JFrame {
    public WithoutJPanelExample() {
        // Create frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4,1));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        add(nameLabel);
        add(nameField);

        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout());


        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

         add(emailLabel);
        add(emailField);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Choose an option:");
        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");

        // Add components to panel
        optionsPanel.add(label);
        optionsPanel.add(button1);
        optionsPanel.add(button2);

        add(optionsPanel);

        setAlwaysOnTop(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WithoutJPanelExample();
    }

}