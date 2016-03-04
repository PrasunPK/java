package com;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountryTest {
    @Test
    public void test_adds_a_guest_according_to_his_or_her_country_and_increases_that_coutry_member() throws Exception {
        Guest g1 = new Guest("Julius","Barrows",Gender.FEMALE,18,"Veda haven","Vermont","Macedonia");
        Country Macedonia = new Country("Macedonia");
        Macedonia.add(g1);
        assertEquals(1,Macedonia.getCount());
    }

    @Test
    public void test_adds_in_two_different_country_if_the_guests_are_of_different_countries() throws Exception {
        Country Macedonia = new Country("Macedonia");
        Guest g1 = new Guest("Julius","Barrows",Gender.FEMALE,18,"Veda haven","Vermont","Macedonia");
        Macedonia.add(g1);
        Guest g3 = new Guest("Velma","Bergstrom",Gender.FEMALE,24,"Katlynn view","Vermont","Macedonia");
        Macedonia.add(g3);

        Country Bangladesh = new Country("Bangladesh");
        Guest g2 = new Guest("Melody","Dooley",Gender.FEMALE,31,"West Shanna","Vermont","Bangladesh");
        Bangladesh.add(g2);

        assertEquals(2, Macedonia.getCount());
        assertEquals(1, Bangladesh.getCount());

    }
}
