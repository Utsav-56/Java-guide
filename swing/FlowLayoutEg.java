package swing;

import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.*;

import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutEg extends JFrame {
    public FlowLayoutEg() {

        setTitle("Still is too verbose why!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);

        setLayout(new FlowLayout());
        int i = 10;

        do {
            add(new JButton("Btn" + i));
        } while (--i > 0);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEg();
    }
}