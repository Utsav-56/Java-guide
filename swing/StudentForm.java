import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Student Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new GridLayout(0, 1, 10, 10));

        // Name input
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(20);
        namePanel.add(nameField);
        frame.add(namePanel);

        // Email input
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailPanel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField(20);
        emailPanel.add(emailField);
        frame.add(emailPanel);

        // Contact input
        JPanel contactPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contactPanel.add(new JLabel("Contact:"));
        JTextField contactField = new JTextField(20);
        contactPanel.add(contactField);
        frame.add(contactPanel);

        // Gender radio buttons
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(new JLabel("Gender:"));

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        frame.add(genderPanel);

        // Stream radio buttons
        JPanel streamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        streamPanel.add(new JLabel("Stream:"));
        JRadioButton plus2 = new JRadioButton("+2");
        JRadioButton bachelor = new JRadioButton("Bachelor");
        JRadioButton primary = new JRadioButton("Primary");
        ButtonGroup streamGroup = new ButtonGroup();
        streamGroup.add(plus2);
        streamGroup.add(bachelor);
        streamGroup.add(primary);
        streamPanel.add(plus2);
        streamPanel.add(bachelor);
        streamPanel.add(primary);
        frame.add(streamPanel);

        // Shift radio buttons
        JPanel shiftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        shiftPanel.add(new JLabel("Shift:"));
        JRadioButton morning = new JRadioButton("Morning");
        JRadioButton day = new JRadioButton("Day");
        ButtonGroup shiftGroup = new ButtonGroup();
        shiftGroup.add(morning);
        shiftGroup.add(day);
        shiftPanel.add(morning);
        shiftPanel.add(day);
        frame.add(shiftPanel);

        // Submit button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        // Action listener for submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String contact = contactField.getText();
                String gender = male.isSelected() ? "Male" :
                        female.isSelected() ? "Female" :
                                other.isSelected() ? "Other" : "Not selected";
                String stream = plus2.isSelected() ? "+2" :
                        bachelor.isSelected() ? "Bachelor" :
                                primary.isSelected() ? "Primary" : "Not selected";
                String shift = morning.isSelected() ? "Morning" :
                        day.isSelected() ? "Day" : "Not selected";

                // Print collected data to console
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Contact: " + contact);
                System.out.println("Gender: " + gender);
                System.out.println("Stream: " + stream);
                System.out.println("Shift: " + shift);
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }

    void addToPanel(JPanel pan, JComponent[] comps){
        for (var comp : comps){
            pan.add(comp);
        }
    }



}
