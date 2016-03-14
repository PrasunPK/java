package com.decor;

import com.guest.Guest;
import com.person.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecorationTest {
    @Test
    public void test_given_a_guest_decorate_decorates_a_guest_label() throws Exception {
        Guest g1 = new Guest(new Name("Julius", "Barrows"), "Female", 18, new Address(new City("Veda haven"), new State("Vermont"), new Country("Macedonia")));
        String []decorWith = {" ", "+", "|", "-"};
        Decoration decoration = new Decoration(decorWith);

        String actual =  decoration.decorate(g1,"-c");
        String expected = "+---------------------+\n" +
                          "| Ms Julius Barrows   |\n" +
                          "|---------------------|\n" +
                          "| Veda haven, Vermont |\n" +
                          "| Macedonia           |\n" +
                          "+---------------------+";

        assertEquals(expected, actual);

    }


}
