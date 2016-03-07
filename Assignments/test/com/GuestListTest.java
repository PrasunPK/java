package com;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class GuestListTest {
    GuestList list;
    @Rule
    public ExpectedException thrown = ExpectedException.none();
//        thrown.expect(RuntimeException.class);
//        list.getFrom("casual","legal","Macedon");

    @Before
    public void initialize() {
        list = new GuestList();
        list.add("Julius", "Barrows", "Female", "18", "Veda haven", "Vermont", "Macedonia");
        list.add("Melody", "Dooley", "Female", "31", "West Shanna", "Vermont", "Bangladesh");
        list.add("Gavin", "Hyatt", "Male", "36", "Crooks ton", "Illinois", "Romania");
        list.add("Carlos", "Johns", "Male", "35", "West Shanna", "South Carolina", "Bangladesh");
        list.add("Brandt", "Huel", "Male", "25", "West Shanna", "Illinois", "Macedonia");
        list.add("Velma", "Bergstrom", "Female", "24", "Katlynn view", "Vermont", "Macedonia");
    }

    @Test
    public void test_given_persons_of_different_countries_they_are_grouped() throws Exception {
        String[] expectedNameList = {
                "Mr Brandt Huel, Macedonia, 25",
                "Ms Velma Bergstrom, Macedonia, 24"
        };

        assertArrayEquals(expectedNameList, list.getFrom("casual", 20, "Macedonia"));

    }


}
