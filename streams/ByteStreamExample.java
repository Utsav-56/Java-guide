package streams;

import java.io.FileInputStream;

public class ByteStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("example.txt");

            int i;
            while ((i = f.read()) != -1) {
                char line = (char) i;
                System.out.print(line);
            }

            f.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}




