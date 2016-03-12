package validator;

import com.guest.Guest;
import com.guest.Guests;
import lib.Pair;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private List<Pair<String, String>> availableFilters;

    public Validator(List<Pair<String, String>> filters) {
        availableFilters = filters;
    }

    public Guest[] validate(Guests guests) {
        ArrayList<Filter> filters = manageFilters(availableFilters);
        List<Guest> filteredData = new ArrayList<>();
        for (Guest guest : guests.getFrom())
            if (verify(guest, filters))
                filteredData.add(guest);
        return filteredData.toArray(new Guest[filteredData.size()]);
    }

    private boolean verify(Guest guest, List<Filter> filters) {
        for (Filter makeFilter : filters)
            if (!makeFilter.filter(guest))
                return false;
        return true;
    }

    private ArrayList<Filter> manageFilters(List<Pair<String, String>> availableFilters) {
        ArrayList<Filter> allFilters = new ArrayList<>();
        for (Pair<String, String> filter : availableFilters) {
            switch (filter.getKey()) {
                case "--country": {
                    allFilters.add(new FilterByCountry(filter.getValue()));
                    break;
                }
                case "--age": {
                    allFilters.add(new FilterByAge(filter.getValue()));
                    break;
                }

            }
        }
        return allFilters;
    }
}
