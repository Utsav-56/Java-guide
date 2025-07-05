import java.io.*;
class FileReadExample{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("warning.txt"));
            String line;
            while(line=reader.readline(1)!=num){
                System.out.println(line);

            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("error: " +e.getmessage(1));
        }
    }
}