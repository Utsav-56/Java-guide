import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Student.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            FileOutputStream fileout = new FileOutputStream("Student.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileout);

            Student s = new Student(1, "Gwen");

            // Serializing the object
            objOut.writeObject(s);

            // Deserializing the object
            Student s2 = (Student) objIn.readObject();

            System.out.println("Success deserializing student object");
            System.out.printf("ID: %d,\t Name: %s%n", s.id, s.name);

            objOut.close();
            fileout.close();
            objIn.close();
            fileIn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


