package com.guest;

import com.person.Address;
import com.person.Country;
import com.person.Name;

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

    public boolean isAbleToConsumeAlcohol(int legalAge) {
        return age >= legalAge;
    }

    public boolean isOfSameCountry(Country countryName) {
        return address.isSame(countryName);
    }

    public String representAddress() {
        return address.toString();
    }

}
