package app;

import com.Guests;
import com.OptionHandler;
import com.RecordReader;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {

        String fileName = args[args.length-1];
        OptionHandler optionHandler = new OptionHandler();


        RecordReader reader = new RecordReader();
        String[] records = reader.read(fileName);

        Guests list = new Guests();
        list.addAll(records);
        optionHandler.operate(list, args);


        String[] formattedNames = optionHandler.formattedData();
        for (String name : formattedNames) {
            System.out.println(name);
        }
    }
}
