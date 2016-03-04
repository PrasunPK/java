package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private ArrayList<Guest> list;
    private String name = null;

    public Country(String country) {
        list = new ArrayList<Guest>();
        name = country;
    }

    public void add(Guest guest) {
        list.add(guest);
    }

    @Override
    public String toString() {
        return name;
    }

    public String[] getAll() {
        List<String> allGuest = new ArrayList<String>();
        Guest[] guests = new Guest[list.size()];
        list.toArray(guests);
        String[] allNames = new String[list.size()];
        for (Guest guest : guests)
            allGuest.add(guest.toString());
        return allGuest.toArray(allNames);
    }

    @Override
    public boolean equals(Object o) {
        return this == o
                || (!(o instanceof Country))
                || Objects.equals(((Country) o).name, name);
    }
}
