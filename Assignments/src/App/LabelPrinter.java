package App;

import com.GuestList;
import com.RecordReader;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        String nameFormat = args[0];
        int legalAge = Integer.parseInt(args[1]);
        String countryName = args[2];
        String fileName = args[3];

        RecordReader reader = new RecordReader();
        String[] records = reader.read(fileName);

        GuestList list = new GuestList();
        list.addAll(records);

        String[] guests = list.getFrom(nameFormat, legalAge, countryName);
        for (String guest : guests) {
            System.out.println(guest);
        }

    }
}
