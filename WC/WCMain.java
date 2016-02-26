import com.WC;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class WCMain{
    public static void main(String args[]) throws IOException {
        String fileName = args[0];
        File file = new File(fileName);
        char []data = new char[(int) file.length()];
        FileReader reader = new FileReader(file);
        reader.read(data);
        String content = new String(data);

        WC wc = new WC(content);
        int []allCount = wc.countAll();
        System.out.println("\t"+allCount[0] + "\t"+ allCount[1] +"\t"+allCount[2] +"   "+fileName);

    }
}
