package com;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddressTest {
    @Test
    public void test_getCountry_gets_the_country_name_of_a_given_person() {
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        assertEquals("Macedonia", address.getCountry());
    }
}
