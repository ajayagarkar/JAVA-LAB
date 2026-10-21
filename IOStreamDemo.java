import java.io.*;
public class IOStreamDemo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("sample.txt");
        String data = ("Welcome to java I/O Streams.");
        data = data + ("This data is written using FileOutputStream");
        fos.write(data.getBytes());
        fos.close();
        System.out.println("Data written successfully.");
        FileInputStream fis = new FileInputStream("sample.txt");
        System.out.println("File Contents:");
        int ch;
        while ((ch = fis.read()) != -1){
            System.out.println((char)ch);
        }
        fis.close();
    }
}