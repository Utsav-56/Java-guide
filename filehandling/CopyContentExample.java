package filehandling;


import java.io.*;
import java.util.Scanner;

// wap to copy content of one file to another


public class CopyContentExample {
    public static void main(String[] args) {
        try {

            File f = new File("example.txt");
            Scanner sc = new Scanner(f);

            FileWriter fw = new FileWriter("example2.txt");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fw.write(line+"\n");
            }


            sc.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}





