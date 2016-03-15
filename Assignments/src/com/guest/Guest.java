package com.guest;

import com.person.Address;
import com.person.Country;
import com.person.Gender;
import com.person.name.Name;

public class Guest {
    private Address address;
    private int age;
    private Gender gender;
    private Name name;

    public Guest(Name name, Gender gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public boolean isLegalToConsumeAlcohol(int legalAge) {
        return age > legalAge;
    }

    public boolean isOfSameCountry(Country countryName) {
        return address.isSame(countryName);
    }

    public String representAddress() {
        return address.toString();
    }

    public String representName(String nameFormat) {
            return name.withPrefix(gender,nameFormat);
    }
}
