package com;

public class Guest {
    private Address address;
    private int age;
    private String gender;
    private Name name;

    public Guest(Name name, String gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String represent(String option) {
        return name.withPrefix(gender, option);
    }

    public String representWithCountry(String option) {
        return address.addCountryName(name.withPrefix(gender, option));
    }

    public String representWithCountryAndAge(String option) {
        return address.addCountryName(name.withPrefix(gender, option)) + ", " + age;
    }

    public boolean isAbleToConsumeAlcohol(int legalAge) {
        return age >= legalAge;
    }

    public boolean isOfSameCountry(Country countryName) {
        return address.isSame(countryName);
    }
}
