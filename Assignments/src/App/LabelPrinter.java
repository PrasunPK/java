package app;

import com.guest.Guests;
import com.io.RecordReader;
import com.parser.OptionHandler;
import lib.Pair;

import java.util.List;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        OptionHandler optionHandler = new OptionHandler(args);
        optionHandler.extract();
        String fileName = optionHandler.getFileName();


        RecordReader reader = new RecordReader();
        String[] records = reader.read(fileName);

        Guests list = new Guests();
        list.addAll(records);
        List<Pair<String, String>> filters = optionHandler.extract();
        optionHandler.operate(list, filters);


        String[] formattedNames = optionHandler.formattedData();
        for (String name : formattedNames) {
            System.out.println(name);
        }
    }
}
