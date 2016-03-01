package hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HashTest {

    @Test
    public void test_addEntry_to_add_a_given_value_to_the_list() {
        Hash<Integer, Integer> hash = new Hash<>();
        int key = 1;
        int value = 99;
        assertTrue(hash.addEntry(key,value));
        assertEquals(99, (int)hash.find(key));
    }

//    @Test
//    public void test_getValue_gives_the_number_provided_the_given_key_is_valid() {
//        Hash hash = new Hash();
//        hash.addEntry(10, 99);
//        assertEquals(99, hash.getElement(10));
//    }
//
//    @Test
//    public void test_addEntry_address_in_different_calculated_location_when_multiple_keys_and_values_are_given() {
//        Hash hash = new Hash();
//        hash.addEntry(12, 11);
//        hash.addEntry(17, 233);
//        hash.addEntry(13, 371);
//        assertEquals(11, hash.getElement(12));
//        assertEquals(233, hash.getElement(17));
//        assertEquals(371, hash.getElement(13));
//    }
//
//    @Test
//    public void test_addEntry_does_not_override_existing_value_if_the_calculated_position_is_filled_already() {
//        Hash hash = new Hash();
//        hash.addEntry(10, 99);
//        hash.addEntry(20, 199);
//        assertEquals(99, hash.getElement(10));
//    }
//
//    @Test
//    public void test_addEntry_inserts_to_another_empty_location_if_the_calculated_position_is_filled_already() {
//        Hash hash = new Hash();
//        hash.addEntry(10, 99);
//        hash.addEntry(11, 199);
//        assertEquals(199, hash.getElement(11));
//    }

}
