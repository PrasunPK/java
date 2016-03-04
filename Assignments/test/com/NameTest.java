package com;

import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Ms_as_prefix_given_gender_is_female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Ms Julius Barrows";
        String actualName = name.withPrefix("Female", "casual");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Mr_as_prefix_given_gender_is_male() throws Exception {
        Name name = new Name("Carlos","Johns");
        String expectedName = "Mr Carlos Johns";
        String actualName = name.withPrefix("Male", "casual");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_in_formal() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Ms Barrows, Julius";
        String actualName = name.withPrefix("Female", "formal");
        Assert.assertEquals(expectedName, actualName);
    }

}
