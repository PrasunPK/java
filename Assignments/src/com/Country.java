package com;

import java.util.ArrayList;

public class Country {
    private ArrayList<Guest> guestList;
    private String name = null;

    public Country(String country) {
        guestList = new ArrayList<>();
        name = country;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Country)
            return ((Country) obj).name.equals(this.name);
        return false;
    }

    public ArrayList<Guest> getAll() {
        ArrayList<Guest> allGuest = new ArrayList<>();
        for (Guest guest : this.guestList) {
            allGuest.add(guest);
        }
        return allGuest;
    }

}
