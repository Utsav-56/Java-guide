
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


class GridLayoutEg{
    public static void main(String[] args) {
        JFrame body = new JFrame("Grid Example");
        body.setLayout(new GridLayout(3,3));

        for(int i=1; i<=9; i++){
            body.add(new JButton("Button"+i));
        }
        body.setSize(300,300);
        body.setDefault on CloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setVisible(true);
    }
}