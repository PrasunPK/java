package com;

import java.util.ArrayList;
import java.util.List;

public class Guests {

    private ArrayList<Guest> list;
    private List<Country> countries;

    public Guests() {
        list = new ArrayList<>();
        countries = new ArrayList<>();
    }

    public boolean add(Guest guest) {
        return list.add(guest);
    }

    public Guest[] getFrom() {
        ArrayList<Guest> guestsOfACountry = new ArrayList<>();
        for (Guest guest : list)
            guestsOfACountry.add(guest);
        Guest[] guests = new Guest[guestsOfACountry.size()];
        guestsOfACountry.toArray(guests);
        return guests;
    }

    public Guest[] getFrom(Country countryName) {
        ArrayList<Guest> guestsOfACountry = new ArrayList<>();
        for (Guest guest : list)
            if (guest.isOfSameCountry(countryName))
                guestsOfACountry.add(guest);
        Guest[] guests = new Guest[guestsOfACountry.size()];
        guestsOfACountry.toArray(guests);
        if (guests.length == 0) throw new RuntimeException("Country Not Found");
        return guests;
    }

    public void addAll(String[] records) {
        Guest guest;
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(",");
            Name name = new Name(record[0], record[1]);
            Address address = new Address(new City(record[4]), new State(record[5]), new Country(record[6]));
            String gender = record[2];
            int age = Integer.parseInt(record[3]);
            guest = new Guest(name, gender, age, address);
            list.add(guest);
        }
    }

}
