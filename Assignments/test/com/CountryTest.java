package com;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class CountryTest {
    @Test
    public void test_instances_of_same_country_is_equal() throws Exception {
        Country c = new Country("c");
        Country d = new Country("c");
        assertTrue(c.equals(d));
    }

    @Test
    public void test_getAll_gets_all_guests_provided_a_country_name_to_it() throws Exception {
        Country c = new Country("Macedonia");
        Guest g1 = new Guest(new Name("Brandt","Huel"),"Male","25",new Address("West Shanna","Illinois","Macedonia"));
        Guest g2 = new Guest(new Name("Velma","Bergstrom"), "Female","24",new Address("Katlynn view","Vermont","Macedonia"));
        c.add(g1);
        c.add(g2);
        String []nameList = {
                "Mr Brandt Huel, Macedonia",
                "Ms Velma Bergstrom, Macedonia"
        };

        assertArrayEquals(nameList, c.getAll());
    }
}
