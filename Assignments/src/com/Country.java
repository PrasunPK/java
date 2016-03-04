package com;

import java.util.ArrayList;

public class Country {
    ArrayList<Guest> list;
    private String name ;
    private int count;

    public Country(String country) {
        list = new ArrayList<Guest>();
        name = country;
    }

    public void add(Guest guest) {
        list.add(guest);
        count++;
    }

    public int getCount() {
        return count;
    }
}
