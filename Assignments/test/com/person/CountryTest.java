package com.person;

import com.guest.Guest;
import com.person.name.Name;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryTest {

    @Test
    public void test_equals_returns_true_when_given_country_name_is_valid() throws Exception {
        Country c = new Country("Macedonia");
        assertTrue(c.equals(new Country("Macedonia")));
    }

    @Test
    public void test_equals_returns_false_when_given_country_name_is_invalid() throws Exception {
        Country c = new Country("Macedonia");
        assertFalse(c.equals(new Country("India")));
    }

    @Test
    public void test_getAll_gets_all_guests_provided_a_country_name() throws Exception {
        Country c = new Country("Macedonia");
        Country b = new Country("Bangladesh");
        Country r = new Country("Romania");
        Guest g1 = new Guest(new Name("Brandt", "Huel"), Gender.MALE, 25, new Address(new City("West Shanna"), new State("Illinois"), new Country("Macedonia")));
        Guest g2 = new Guest(new Name("Velma", "Bergstrom"), Gender.FEMALE, 24, new Address(new City("Katlynn view"), new State("Vermont"), new Country("Macedonia")));
        Guest g3 = new Guest(new Name("Salman", "Khan"), Gender.MALE, 34, new Address(new City("Everest"), new State("Himalaya"), new Country("Bangladesh")));
        Guest g4 = new Guest(new Name("Barinder", "Bergstrom"), Gender.FEMALE, 29, new Address(new City("Catan"), new State("Vermonteno"), new Country("Romania")));
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
