package com;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class CountryTest {

    @Test
    public void test_getAll_gets_all_guests_provided_a_country_name() throws Exception {
        Country c = new Country("Macedonia");
        Country b = new Country("Bangladesh");
        Country r = new Country("Romania");
        Guest g1 = new Guest(new Name("Brandt","Huel"),"Male",25,new Address(new City("West Shanna"),new State("Illinois"),new Country("Macedonia")));
        Guest g2 = new Guest(new Name("Velma","Bergstrom"), "Female",24,new Address(new City("Katlynn view"),new State("Vermont"),new Country("Macedonia")));
        Guest g3 = new Guest(new Name("Salman","Khan"), "Male",34,new Address(new City("Everest"),new State("Himalaya"),new Country("Bangladesh")));
        Guest g4 = new Guest(new Name("Barinder","Bergstrom"), "Female",29,new Address(new City("Catan"),new State("Vermonteno"),new Country("Romania")));
        c.addGuest(g1);
        c.addGuest(g2);
        b.addGuest(g3);
        r.addGuest(g4);

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(g1);
        guests.add(g2);

        assertTrue(guests.equals(c.getAll()));
    }
}
