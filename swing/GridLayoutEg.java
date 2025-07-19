package swing;

import java.awt.*;
import javax.swing.*;


public class GridLayoutEg extends JFrame{
   GridLayoutEg() {
       setTitle("Flow Layout Example");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(300, 300);

       var myLayout = new GridLayout(3,3);
       setLayout(myLayout);

       ///  add more mody and component here


       setVisible(true);
   }
}


class FlowEg extends JFrame{
    FlowEg(){
        setTitle("Flow Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        FlowLayout myLayout = new FlowLayout();
        setLayout(myLayout);

        setLayout(new FlowLayout());

        ///  add more mody and component here


        for (int i = 0; i < 10; i++) {
            add(new JLabel("You 20"));
        }

        setVisible(true);
    }
}

