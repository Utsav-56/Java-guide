import javax.swing.*;
import java.awt.*;

class BoxEg {
    public static void main(String[] args) {
        JFrame body = new JFrame("Wish Java becomes shorter!");
        body.setLayout(new BoxLayout(body, BoxLayout.X_AXIS));

        for (int i = 0; i < 3; i++) {
            body.add(new JButton("" + i));
        }
        body.setVisible(true);
    }
}

