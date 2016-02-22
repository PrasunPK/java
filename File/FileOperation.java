import java.io.*;

public class FileOperation {
   public static void main(String args[]) throws IOException, FileNotFoundException {
       File file = new File("input.txt");
       char []data = new char[(int) file.length()];
       FileReader reader = new FileReader(file);
       reader.read(data);
       String content = new String(data);

       System.out.print(content);

   }
}
