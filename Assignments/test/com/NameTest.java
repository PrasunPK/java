package com;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {

    @Test
    public void test_casualName_gets_the_representation_of_a_given_name_with_first_name_first() throws Exception {
        Name name = new Name("Julius","Barrows");
        assertEquals("Julius Barrows", name.casualName());
    }

    @Test
    public void test_formalName_gets_the_representation_of_a_given_name_with_first_name_first() throws Exception {
        Name name = new Name("Julius","Barrows");
        assertEquals("Barrows, Julius", name.formalName());
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Ms_as_prefix_given_gender_is_female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Ms Julius Barrows";
        String actualName = name.withPrefix(Gender.FEMALE, "casual");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_containing_Mr_as_prefix_given_gender_is_male() throws Exception {
        Name name = new Name("Carlos","Johns");
        String expectedName = "Mr Carlos Johns";
        String actualName = name.withPrefix(Gender.MALE, "casual");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_withPrefix_creates_a_cardNameRepresentation_in_formal() throws Exception {
        Name name = new Name("Julius", "Barrows");
        String expectedName = "Ms Barrows, Julius";
        String actualName = name.withPrefix(Gender.FEMALE, "formal");
        Assert.assertEquals(expectedName, actualName);
    }

}
