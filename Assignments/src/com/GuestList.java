package com;

import java.util.ArrayList;

public class GuestList {
    private ArrayList<Guest> guests;
    private Country country;

    private int size = 0;
    public GuestList() {
         guests = new ArrayList<Guest>();
    }

    private void createCountry(String countryName){
        country = new Country(countryName);
    }

    public void add(Guest guest){
        createCountry(guest.getCountry());
        country.add(guest);
        guests.add(guest);
        size++;
    }

    public int getSize() {
        return size;
    }

    public Guest getGuest(int i) {
        return guests.get(i);
    }
}
