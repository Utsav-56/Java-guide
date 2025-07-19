package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        try {
            File f = new File("example.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}


class FileReaderExample {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



