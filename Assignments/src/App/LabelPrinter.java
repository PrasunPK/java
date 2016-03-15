package app;

import com.decor.Decoration;
import com.guest.Guest;
import com.guest.Guests;
import com.io.RecordReader;
import com.io.ResultPrinter;
import com.parser.OptionHandler;
import lib.Pair;
import validator.Validator;

import java.util.List;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        OptionHandler optionHandler = new OptionHandler(args);
        List<Pair<String, String>> filters = optionHandler.extract();
        String fileName = optionHandler.getFileName();
        String nameFormat = optionHandler.getNameFormat();

        RecordReader reader = new RecordReader();
        String[] records = reader.read(fileName);

        Guests list = new Guests();
        list.addAll(records);

        Validator validator = new Validator(filters);
        Guest[] validatedGuests = validator.validate(list);
        
        String[] decorators = {" ", "+", "|", "-"};
        Decoration decor = new Decoration(decorators);

        String[] decoratedNames = decor.decorateAll(validatedGuests, nameFormat);
        ResultPrinter printer = new ResultPrinter();
        printer.print(decoratedNames);
    }
}
