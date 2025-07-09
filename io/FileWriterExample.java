import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This line is from Java");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}