package com;

public class Guest {
    private Address address;
    private String age;
    private String gender;
    private Name name;

    public Guest(Name name, String gender, String age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String toString(String option) {
        return this.name.withPrefix(gender, option);
    }
}
