package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Dropdown Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create label
        JLabel label = new JLabel("Select your stream:");

        // Create dropdown with items
        String[] options = {"+2", "Bachelor", "Primary"};

        JComboBox<String> streamDropdown = new JComboBox<String>(options);

        // Create submit button
        JButton submitButton = new JButton("Submit");

        // Action listener to handle dropdown selection
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedStream = (String) streamDropdown.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedStream);
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(streamDropdown);
        frame.add(submitButton);

        // Make frame visible
        frame.setVisible(true);
    }
}
