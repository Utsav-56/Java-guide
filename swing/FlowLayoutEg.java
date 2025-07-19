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

class DateExample extends JFrame {
    DateExample(){
        setTitle("Date Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        setLayout(new FlowLayout());

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        String[] years = new String[900];

        for (int i = 0; i <= 900; i++) {
            int startYear = 1900;
            years[i] = "" +(startYear + i);
        }










        setVisible(true);
    }
}