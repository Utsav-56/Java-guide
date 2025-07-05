import java.io.*;

class DeserializeEg {

    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Student.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Student1 s = (Student1) objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Success deserializing student object");
            System.out.printf("ID: %d,\t Name: %s%n", s.id, s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student1 implements Serializable {
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}