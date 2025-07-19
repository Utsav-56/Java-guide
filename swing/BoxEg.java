import javax.swing.*;
import java.awt.*;

public class BoxEg extends JFrame {

    public BoxEg() {

        super("Wish Java becomes shorter!");
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        for (int i = 0; i < 3; i++) {
            add(new JButton("" + i));
        }
        setVisible(true);
    }
}