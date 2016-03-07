package com;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestTest {
    @Test
    public void test_isAbleToConsumeAlcohol_returns_true_if_the_guest_age_is_greater_than_20() throws Exception {
        Guest guest = new Guest(new Name("sashi","kumar"), "Male", "21", new Address("Koramangala","Bangalore", "India"));
        assertTrue(guest.isAbleToConsumeAlcohol(20));
    }

    @Test
    public void test_a_guest_is_not_able_for_consuming_alcohol_if_his_age_is_18() throws Exception {
        Guest guest = new Guest(new Name("sashi","kumar"), "Male", "18", new Address("Koramangala","Bangalore", "India"));
        assertFalse(guest.isAbleToConsumeAlcohol(20));
    }
}
