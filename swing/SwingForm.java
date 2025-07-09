package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm extends JFrame {

//    JLabel nameLabel, emailLabel, phoneLabel;
//    JTextField nameTf, emailTf, phoneTf;
//
//    JButton btn;

    SwingForm() {
//
//        setTitle("Form of Swing");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 400);
//
//        setLayout(new GridLayout(10, 2));
//
//        nameLabel = new JLabel("Enter name:");
//        nameTf = new JTextField();
//
//        emailLabel = new JLabel("Enter Email: ");
//        emailTf = new JTextField();
//
//        phoneLabel = new JLabel("Enter fone number");
//        phoneTf = new JTextField();
//
//        btn = new JButton();
//        btn.addActionListener((e)-> {
//
//
//        });
//
//
//
//
//
//
//        add(nameLabel);
//        add(nameTf);
//
//        add(emailLabel);
//        add(emailTf);
//
//        add(phoneLabel);
//        add(phoneTf);
//
//        setAlwaysOnTop(true);
//        setVisible(true);
    }


    public static void main(String[] args) {

        var window = new JFrame();

        window.setTitle("Form of Swing");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new GridLayout(10, 2));

        var nameLabel = new JLabel("Enter name:");
        var nameTf = new JTextField();

        var emailLabel = new JLabel("Enter Email: ");
        var emailTf = new JTextField();

        var phoneLabel = new JLabel("Enter fone number");
        var phoneTf = new JTextField();

        var btn = new JButton("Click me !");

        btn.addActionListener((e) -> {
            System.out.println("Button clicked !!");
        });

        window.add(btn);

        window.add(nameLabel);
        window.add(nameTf);


        window.add(emailLabel);
        window.add(emailTf);

        window.add(phoneLabel);
        window.add(phoneTf);

        window.setAlwaysOnTop(true);
        window.setVisible(true);

//        new SwingForm();
    }


}
