package swing;

import javax.swing.*;
import java.awt.*;

public class BorderEg extends JFrame {
    BorderEg() {
        setTitle("Kotlin is way short than Java");

        var borderLayout = new BorderLayout();

        setLayout(borderLayout);

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
