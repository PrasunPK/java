package com;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RepresentationTest {

    @Test
    public void test_represents_name_with_country_name_in_casual_format() throws Exception {
        Guest g1 = new Guest("Julius","Barrows",Gender.FEMALE,18,"Veda haven","Vermont","Macedonia");
        GuestList guestList = new GuestList();
        guestList.add(g1);
        Representation r = new Representation(guestList);

        String expected = "Ms Julius Barrows";
        String actual = r.represent("casual");

        assertEquals(expected, actual);
    }
}
