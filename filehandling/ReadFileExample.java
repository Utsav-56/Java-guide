package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        try {
            File f = new File("example.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



