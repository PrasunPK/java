package hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by prasunkp on 29/02/16.
 */
public class HashTest {

    @Test
    public void test_addEntry_to_add_a_given_value_to_the_list() {
        Hash hash = new Hash();
        assertTrue(hash.addEntry(10));
    }

    @Test
    public void test_getValue_gives_the_number_provided_the_given_key_is_valid(){
        Hash hash = new Hash();
        hash.addEntry(10);
        hash.addEntry(20);
        assertEquals(10 , hash.getElement(0));
    }

    @Test
    public void test_addEntry_adds_to_the_next_position_if_the_calculated_position_is_filled_already(){
        Hash hash = new Hash();
        hash.addEntry(10);
        hash.addEntry(20);
        assertTrue(!hash.addEntry(20));
        assertEquals(20 , hash.getElement(1));
    }

    @Test
    public void test_addEntry_addss_in_different_calculated_location_when_multiple_values_are_given(){
        Hash hash = new Hash();
        hash.addEntry(12);
        hash.addEntry(117);
        hash.addEntry(1239);
        assertEquals(12 , hash.getElement(2));
        assertEquals(117 , hash.getElement(7));
        assertEquals(1239 , hash.getElement(9));
    }

    @Test
    public void test_addEntry_when_all_the_locations_are_reserved_it_returns_false(){
        Hash hash = new Hash();
        hash.addEntry(10);
        hash.addEntry(11);
        hash.addEntry(12);
        hash.addEntry(13);
        hash.addEntry(14);
        hash.addEntry(15);
        hash.addEntry(16);
        hash.addEntry(17);
        hash.addEntry(18);
        hash.addEntry(19);
        assertTrue(!hash.addEntry(101));
    }
}
