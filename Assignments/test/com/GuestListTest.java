package com;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GuestListTest {
    @Test
    public void test_given_persons_of_different_countries_they_are_grouped() throws Exception {
        GuestList list = new GuestList();
        list.add("Julius","Barrows","Female","18","Veda haven","Vermont","Macedonia");
        list.add("Melody","Dooley","Female","31","West Shanna","Vermont","Bangladesh");
        list.add("Gavin","Hyatt","Male","36","Crooks ton","Illinois","Romania");
        list.add("Carlos","Johns","Male","35","West Shanna","South Carolina","Bangladesh");
        list.add("Brandt","Huel","Male","25","West Shanna","Illinois","Macedonia");
        list.add("Velma","Bergstrom","Female","24","Katlynn view","Vermont","Macedonia");

        String []nameList = {
                "Ms Julius Barrows, Macedonia",
                "Mr Brandt Huel, Macedonia",
                "Ms Velma Bergstrom, Macedonia"
        };

        assertArrayEquals(nameList, list.getFrom("Macedonia","casual"));
    }


}
