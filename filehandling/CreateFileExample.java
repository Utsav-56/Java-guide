package filehandling;

import java.io.*;

public class CreateFileExample {

    public static void main(String[] args) {
        try {

            File f = new File("example.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


