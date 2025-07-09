import java.io.*;
import java.util.Scanner;
import java.util.Scanner;

public class ScannerFileRead {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("warning.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}