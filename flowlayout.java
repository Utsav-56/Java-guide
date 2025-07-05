import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.*;

class FlowLayoutEg {
    public static void main(String[] args) {
        JFrame body = new JFrame("Still is too verbose why!");
        body.setLayout(new FlowLayout());
        int i = 10;
        do {
            body.add(new JButton("Btn" + i));
        } while (--i > 0);

        body.setSize(300, 500);
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setVisible(true);
    }
}