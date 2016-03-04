package com;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestListTest {
    @Test
    public void test_given_persons_of_different_countries_they_are_grouped() throws Exception {
        Guest g1 = new Guest("Julius","Barrows",Gender.FEMALE,18,"Veda haven","Vermont","Macedonia");
        Guest g2 = new Guest("Melody","Dooley",Gender.FEMALE,31,"West Shanna","Vermont","Bangladesh");
        Guest g3 = new Guest("Gavin","Hyatt",Gender.MALE,36,"Crooks ton","Illinois","Romania");
        Guest g4 = new Guest("Carlos","Johns",Gender.MALE,35,"West Shanna","South Carolina","Bangladesh");
        Guest g5 = new Guest("Brandt","Huel",Gender.MALE,25,"West Shanna","Illinois","Macedonia");
        Guest g6 = new Guest("Velma","Bergstrom",Gender.FEMALE,24,"Katlynn view","Vermont","Macedonia");

        GuestList guestList = new GuestList();
        guestList.add(g1);
        assertEquals(1,guestList.getSize());
        guestList.add(g2);
        assertEquals(2,guestList.getSize());
    }
}
