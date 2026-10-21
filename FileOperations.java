import java.io.*;
import java.util.*;

public class FileOperations{
    public static void main(String[] args) throws IOException{
        File file = new File("sample.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("welcome to java file operations.\n");
        fw.write("This is  a sample file.");
        fw.close();
        System.out.println("Data written successfuly.");
        Scanner sc = new Scanner(file);
        System.out.println("\n file contents: ");
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}