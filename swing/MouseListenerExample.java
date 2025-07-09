package swing;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("MouseListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create label to display messages
        JLabel label = new JLabel("Press or release the mouse here", SwingConstants.CENTER);


        // Add MouseListener to label
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Optional: handle click
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Optional: handle press
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               // Optional: handle release
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Optional: handle enter
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Optional: handle exit
            }
        });

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
