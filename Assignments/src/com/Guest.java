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

    public String represent(String option) {
        return address.addCountryName(name.withPrefix(gender, option)) + ", " + age;
    }

    public boolean isAbleToConsumeAlcohol(int legalAge){
      return  Integer.parseInt(age) >= legalAge;
    }
}
