import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class SerializeExample {
    public static void main(String[] args) {
        try {


            FileOutputStream fileout = new FileOutputStream("Student.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileout);


            Student s = new Student(1, "Gwen");

            objOut.writeObject(s);





            objOut.close();
            fileout.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



