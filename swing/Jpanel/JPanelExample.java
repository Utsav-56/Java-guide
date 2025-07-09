package swing.Jpanel;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JFrame {
    public JPanelExample() {
        // Create frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));


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


        setAlwaysOnTop(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}