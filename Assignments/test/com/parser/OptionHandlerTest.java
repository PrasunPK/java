package com.parser;

import com.guest.Guest;
import com.guest.Guests;
import com.person.*;
import com.person.name.Name;
import lib.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class OptionHandlerTest {

    Guests list;
    Guest g1;
    Guest g2;
    Guest g3;
    Guest g4;

    @Before
    public void setUp() throws Exception {
        list = new Guests();
        g1 = new Guest(new Name("Julius", "Barrows"), Gender.FEMALE, 18, new Address(new City("Veda haven"), new State("Vermont"), new Country("Macedonia")));
        g2 = new Guest(new Name("Brandt", "Huel"), Gender.MALE, 25, new Address(new City("West Shanna"), new State("Illinois"), new Country("Macedonia")));
        g3 = new Guest(new Name("Velma", "Bergstrom"), Gender.MALE, 24, new Address(new City("Katlynn view"), new State("Vermont"), new Country("Macedonia")));
        g4 = new Guest(new Name("Melody", "Dooley"), Gender.FEMALE, 31, new Address(new City("West Shanna"), new State("Vermont"), new Country("Bangladesh")));
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
    }

    @Test
    public void test_getNameFormat_gets_the_nameFormat_provided_to_it() throws Exception {
        String[] options = {"--format", "-c", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        optionHandler.extract();
        assertEquals("-c", optionHandler.getNameFormat());
    }

    @Test
    public void test_minus_c_returns_file_name_and_option_together() throws Exception {
        String[] options = {"--format", "-c", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        assertTrue(optionHandler.getFileName().equals("a.txt"));
        assertEquals(1, filters.size());

    }


    @Test
    public void test_minus_c_and_a_country_name_gives_all_the_guests_from_a_country() throws Exception {
        String[] options = {"--format", "-c", "--country", "Macedonia", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        optionHandler.getFileName();
        List<Pair<String, String>> filters = optionHandler.extract();
        assertEquals(2, filters.size());
    }

    @Test
    public void test_minus_c_and_a_country_name_and_age_gives_all_the_guests_from_a_country_who_are_above_that_age() throws Exception {
        String[] options = {"--format", "-c", "--country", "Macedonia", "--age", "20", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        assertEquals(3, filters.size());
    }
}