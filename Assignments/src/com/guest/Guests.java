package com.guest;

import com.person.*;

import java.util.ArrayList;

public class Guests {

    private ArrayList<Guest> guests;

    public Guests() {
        guests = new ArrayList<>();
    }

    public boolean add(Guest guest) {
        return guests.add(guest);
    }

    public Guest[] getFrom() {
        ArrayList<Guest> guestsOfACountry = new ArrayList<>();
        for (Guest guest : guests)
            guestsOfACountry.add(guest);
        Guest[] guests = new Guest[guestsOfACountry.size()];
        guestsOfACountry.toArray(guests);
        return guests;
    }

    public Guest[] getFrom(Country countryName) {
        ArrayList<Guest> guestsOfACountry = new ArrayList<>();
        for (Guest guest : guests)
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
            guests.add(guest);
        }
    }

}
