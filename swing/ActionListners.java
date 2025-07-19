package swing;

import javax.swing.*;
import java.awt.*;

public class ActionListners extends JFrame {
    ActionListners(){
        setTitle("Action Listners");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        setLayout(new FlowLayout());

        JButton btn = new JButton("Click me");

        btn.addActionListener(( e) -> {
            // Code to be executed when the button is clicked
        });

        add(btn);












        setVisible(true);




    }

}
