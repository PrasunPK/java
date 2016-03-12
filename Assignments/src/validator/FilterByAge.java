package validator;

import com.guest.Guest;

public class FilterByAge implements Filter {
    private final int age;

    public FilterByAge(String value) {
        this.age = Integer.parseInt(value);
    }

    @Override
    public boolean filter(Guest guest) {
        return guest.isAbleToConsumeAlcohol(age);
    }
}
