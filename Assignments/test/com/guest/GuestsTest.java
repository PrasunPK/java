package com.guest;

import com.person.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class GuestsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    Guests list;
    Guest g1;
    Guest g2;
    Guest g3;
    Guest g4;
    Guest g5;

    @Before
    public void setUp() throws Exception {
        list = new Guests();
        g1 = new Guest(new Name("Julius", "Barrows"), "Female", 18, new Address(new City("Veda haven"), new State("Vermont"), new Country("Macedonia")));
        g2 = new Guest(new Name("Brandt", "Huel"), "Male", 25, new Address(new City("West Shanna"), new State("Illinois"), new Country("Macedonia")));
        g3 = new Guest(new Name("Velma", "Bergstrom"), "Female", 24, new Address(new City("Katlynn view"), new State("Vermont"), new Country("Macedonia")));
        g4 = new Guest(new Name("Melody", "Dooley"), "Female", 31, new Address(new City("West Shanna"), new State("Vermont"), new Country("Bangladesh")));
        g5 = new Guest(new Name("Velma", "Bergstrom"), "Female", 24, new Address(new City("West Shanna"), new State("South Carolina"), new Country("Bangladesh")));
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
    }

    @Test
    public void test_getFrom_provides_all_the_guests_from_a_particular_country_given_to_it() throws Exception {
        Guest[] expectedGuestList = {g1, g2, g3, g4, g5};
        assertArrayEquals(expectedGuestList, list.getGuests());
    }


}
