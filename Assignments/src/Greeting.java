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

//        GuestList list = new GuestList();

//        for (String s : eachData) {
//            String[] individual = s.split(",");
//            Guest g = new Guest(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5], individual[6]);
//            list.add(g);
//        }
//        Representation r = new Representation(list);
//        System.out.println(r.represent("casual").from("Bangladesh"));
    }
}
