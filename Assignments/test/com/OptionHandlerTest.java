package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OptionHandlerTest {

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
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
    }

    @Test
    public void test_minus_c_returns_file_name_and_option_together() throws Exception {
        String[] options = {"-c", "a.txt"};
        OptionHandler optionHandler = new OptionHandler();
        optionHandler.operate(list,options);
        String[] expected = {
                "Ms Julius Barrows",
                "Mr Brandt Huel",
                "Ms Velma Bergstrom",
                "Ms Melody Dooley"
        };
        assertArrayEquals(expected, optionHandler.formattedData());

    }

    @Test
    public void test_minus_c_and_a_country_name_gives_all_the_guests_from_a_country() throws Exception {
        String[] options = {"-c","Macedonia", "a.txt"};
        OptionHandler optionHandler = new OptionHandler();
        optionHandler.operate(list, options);
        String[] expected = {
                "Ms Julius Barrows, Macedonia",
                "Mr Brandt Huel, Macedonia",
                "Ms Velma Bergstrom, Macedonia"
        };
        assertArrayEquals(expected, optionHandler.formattedData());
    }
}