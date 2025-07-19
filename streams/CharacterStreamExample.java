package streams;

import java.io.FileReader;

public class CharacterStreamExample {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("example.txt");

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







