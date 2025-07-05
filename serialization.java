import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SerializeExample {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Gwen");
            FileOutputStream fileout = new FileOutputStream("Student.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s1);
            out.close();
            fileout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}