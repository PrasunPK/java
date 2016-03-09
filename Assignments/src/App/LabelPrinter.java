package app;

import com.Guests;
import com.OptionHandler;
import com.RecordReader;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {


        OptionHandler optionHandler = new OptionHandler();
        optionHandler.extract(args);

        String fileName = optionHandler.getFileName();
        RecordReader reader = new RecordReader();
        String[] records = reader.read(fileName);

        Guests list = new Guests();
        list.addAll(records);

        optionHandler.operate(list);

        String[] formattedNames = optionHandler.formattedData();
        for (String name : formattedNames) {
            System.out.println(name);
        }
    }
}
