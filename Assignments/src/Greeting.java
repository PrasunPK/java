import com.GuestList;

import java.io.File;
import java.io.FileReader;

public class Greeting {
    public static void main(String[] args) throws Exception {
        String fileName = "./data/records";
        File file = new File(fileName);
        char[] data = new char[(int) file.length()];
        FileReader reader = new FileReader(file);
        reader.read(data);
        String content = new String(data);
        String[] eachData = content.split("\n");

        GuestList list = new GuestList();

        for (String s : eachData) {
            String[] individual = s.split(",");
            list.add(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5], individual[6]);
        }

        String []guests  = list.getFrom("Macedonia","casual");
        for (String guest: guests) {
            System.out.println(guest);
        }

    }
}
