package com;

public class Guest {
    private Address address;
    private int age;
    private Gender gender;
    private Name name;

    public Guest(String firstName, String lastName, Gender gender, int age, String city, String state, String country) {
        this.name = new Name(firstName, lastName);
        this.gender = gender;
        this.age = age;
        this.address = new Address(city, state, country);
    }

    public String getCountry(){
        return address.getCountry();
    }

    public String getName(String option){
        return name.withPrefix(gender, option);
    }
}
