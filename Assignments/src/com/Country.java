package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private ArrayList<Guest> guestList;
    private String name = null;

    public Country(String country) {
        guestList = new ArrayList<>();
        name = country;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public String[] getAll(String format, int legalAge) {
        List<String> allGuest = new ArrayList<>();
        int count = 0;
        for (Guest guest : guestList)
            if (guest.isAbleToConsumeAlcohol(legalAge)) {
                allGuest.add(guest.represent(format));
                count++;
            }
        return allGuest.toArray(new String[count]);
    }

    @Override
    public boolean equals(Object o) {
        return this == o
                || (!(o instanceof Country))
                || Objects.equals(((Country) o).name, name);
    }
}
