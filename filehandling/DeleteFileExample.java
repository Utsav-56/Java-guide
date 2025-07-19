package filehandling;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {

        File f = new File("example.txt");

        if (f.delete()) {
            System.out.println("Deleted file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}





