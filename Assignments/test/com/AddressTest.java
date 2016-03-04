package com;

import org.junit.Test;

public class AddressTest {
    @Test
    public void test_getCountry_gets_the_country_name_of_a_given_person() {
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
    }
}
