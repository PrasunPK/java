import java.io.*;
import src.WC;

class WCMain{
    public static void main(String args[]) throws IOException, FileNotFoundException {
        File file = new File(args[0]);
        char []data = new char[(int) file.length()];
        FileReader reader = new FileReader(file);
        reader.read(data);
        String content = new String(data);
        WC wc = new WC(content);
        int lines = wc.countLines();

        System.out.println("No fo Lines : "+lines);

    }
}
