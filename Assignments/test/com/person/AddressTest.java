package com.person;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class AddressTest {

    @Test
    public void test_addCountryName_gets_the_country_name_of_a_given_person() {
        Address address = new Address(new City("Veda haven"), new State("Vermont"),new Country("Macedonia"));
        String suffixedName  = address.addCountryName("John Robin");
        String expected = "John Robin, Macedonia";
        assertEquals(expected, suffixedName);
    }

    @Test
    public void test_isSame_returns_true_if_the_countryName_matches() {
        Address address = new Address(new City("Veda haven"), new State("Vermont"),new Country("Macedonia"));
        assertTrue(address.isSame(new Country("Macedonia")));
    }

    @Test
    public void test_isSame_returns_flase_if_the_countryName_does_not_match() {
        Address address = new Address(new City("Veda haven"), new State("Vermont"),new Country("Macedonia"));
        assertFalse(address.isSame(new Country("Nigeria")));
    }
}
