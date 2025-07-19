import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class SerializeExample {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Gwen");

            FileOutputStream fileout = new FileOutputStream("Student.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileout);

            objOut.writeObject(s1);

            objOut.close();
            fileout.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



