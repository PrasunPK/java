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

    @Override
    public String toString() {
        return name;
    }

    private String delimiter(){
        return ", ";
    }

    public String[] getAll() {
        List<String> allGuest = new ArrayList<>();
        Guest[] guests = new Guest[guestList.size()];
        guestList.toArray(guests);
        String[] allNames = new String[guestList.size()];
        for (Guest guest : guests)
            allGuest.add(guest.toString() + delimiter() + this.name);
        return allGuest.toArray(allNames);
    }

    @Override
    public boolean equals(Object o) {
        return this == o
                || (!(o instanceof Country))
                || Objects.equals(((Country) o).name, name);
    }
}
