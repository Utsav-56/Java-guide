import java.io.*;
import java.util.scanner;
class ScannerFileRead{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new file("warning.txt"));
            while(sc.hasnextline()){
                System.out.println("sc.nextLine()");
            }
            sc.close();

        }
        catch(FileNotFoundException e){
            System.out.println("File not found: " +e.getmessage());
        }
    }
}