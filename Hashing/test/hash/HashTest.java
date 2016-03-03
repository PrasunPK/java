package hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HashTest {

    @Test
    public void test_to_put_value_in_proper_hashed_location() {
        Hash<Integer, Integer> hash = new Hash<>();
        hash.put(1, 99);
        hash.put(9, 123);
        assertEquals(123, (int) hash.get(9));
        assertEquals(99, (int) hash.get(1));
    }

    @Test
    public void test_get_to_give_the_value_when_a_valid_key_is_provided() {
        Hash<Integer, Integer> hash = new Hash<>();
        int key = 1;
        int value = 99;
        hash.put(key, value);
        assertEquals(99, (int) hash.get(key));
    }

    @Test
    public void test_to_put_and_override_if_same_key_is_given_with_value() throws Exception {
        Hash<Integer, Integer> hash = new Hash<>();
        hash.put(4, 45);
        assertEquals(45, (int) hash.get(4));
        hash.put(4, 91);
        assertEquals(91, (int) hash.get(4));
    }

    @Test
    public void test_if_collision_happens_the_value_is_put() throws Exception {
        Hash<String, Integer> hash = new Hash<>();
        hash.put("K", 2016);
        hash.put("18", 9999);
        assertEquals(2016, (int) hash.get("K"));
        assertEquals(9999, (int) hash.get("18"));
    }

    @Test
    public void test_hash_accepts_null_key(){
        Hash<String, Integer> hash = new Hash<>();
        hash.put(null, 3030);
        assertEquals(3030, (int)hash.get(null));
    }
}
