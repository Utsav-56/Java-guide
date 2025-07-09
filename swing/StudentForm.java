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
        JTextField nameField = new JTextField(20);
        addToPanel(namePanel, new JComponent[]{new JLabel("Name:"), nameField});

        // Email input
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField emailField = new JTextField(20);
        addToPanel(emailPanel, new JComponent[]{new JLabel("Email:"), emailField});

        // Contact input
        JPanel contactPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField contactField = new JTextField(20);
        addToPanel(contactPanel, new JComponent[]{new JLabel("Contact:"), contactField});

        // Gender radio buttons
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        addToPanel(genderPanel, new JComponent[]{new JLabel("Gender:"), male, female, other});

        // Stream radio buttons
        JPanel streamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton plus2 = new JRadioButton("+2");
        JRadioButton bachelor = new JRadioButton("Bachelor");
        JRadioButton primary = new JRadioButton("Primary");
        ButtonGroup streamGroup = new ButtonGroup();
        streamGroup.add(plus2);
        streamGroup.add(bachelor);
        streamGroup.add(primary);
        addToPanel(streamPanel, new JComponent[]{new JLabel("Stream:"), plus2, bachelor, primary});

        // Shift radio buttons
        JPanel shiftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton morning = new JRadioButton("Morning");
        JRadioButton day = new JRadioButton("Day");
        ButtonGroup shiftGroup = new ButtonGroup();
        shiftGroup.add(morning);
        shiftGroup.add(day);
        addToPanel(shiftPanel, new JComponent[]{new JLabel("Shift:"), morning, day});

        // Submit button
        JButton submitButton = new JButton("Submit");

        // Add all panels and button to frame
        addToFrame(frame, new JComponent[]{
            namePanel, emailPanel, contactPanel, genderPanel, streamPanel, shiftPanel, submitButton
        });

        // Action listener for submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String contact = contactField.getText();
                String gender = male.isSelected() ? "Male"
                        : female.isSelected() ? "Female" : other.isSelected() ? "Other" : "Not selected";
                String stream = plus2.isSelected() ? "+2"
                        : bachelor.isSelected() ? "Bachelor" : primary.isSelected() ? "Primary" : "Not selected";
                String shift = morning.isSelected() ? "Morning" : day.isSelected() ? "Day" : "Not selected";

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

    static void addToPanel(JPanel pan, JComponent[] comps) {
        for (var comp : comps) {
            pan.add(comp);
        }
    }

    static void addToFrame(JFrame frame, JComponent[] components) {
        for (var item : components) {
            frame.add(item);
        }
    }
}
