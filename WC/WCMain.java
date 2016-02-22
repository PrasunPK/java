import java.io.*;

class WCMain{
    public static void main(String args[]) throws IOException, FileNotFoundException {
        File file = new File(args[0]);
        char []data = new char[(int) file.length()];
        FileReader reader = new FileReader(file);
        reader.read(data);
        String content = new String(data);

        WC wc = new WC(content);
        int lines = wc.countLines();
        int words = wc.countWords();
        int chars = wc.countCharacters();

        System.out.println("No fo Lines : "+lines);
        System.out.println("No fo Words : "+words);
        System.out.println("No fo Characters : "+chars);

    }
}
