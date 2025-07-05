import java.io.*;
public class DeserializeEg{
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Student.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Student s = (Student).objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Success deserializing student ob");
            System.out.printf("ID:%s,\t Name:%s", s.id,s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}