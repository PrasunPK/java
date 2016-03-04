package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GuestList {

    private List<Guest> list;
    private List<Country> countries;

    public GuestList() {
        list = new ArrayList<Guest>();
        countries = new LinkedList<Country>();
    }

    public boolean add(String firstName, String lastName, String gender, String age, String city, String state, String country) {
        Name name = new Name(firstName, lastName);
        Address address = new Address(city, state, country);
        Guest guest = new Guest(name, gender, age, address);
        Country newCountry = new Country(country);
        if (!countries.contains(newCountry))
            countries.add(newCountry);
        int position = countries.indexOf(newCountry);
        countries.get(position).add(guest);
        return list.add(guest);
    }

    public String[] getFrom(String country) {
        Country countryToRetrieve = new Country(country);
        if (!countries.contains(countryToRetrieve))
            return new String[0];
        int position = countries.indexOf(countryToRetrieve);
        return countries.get(position).getAll();
    }


}
