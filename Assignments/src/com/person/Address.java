package com.person;

public class Address {
    private City city;
    private State state;
    private Country country;

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String addCountryName(String guestName) {
        return String.format("%s, %s", guestName, country);
    }

    public boolean isSame(Country countryName) {
        return this.country.equals(countryName);
    }

    @Override
    public String toString() {
        return city.toString() +", "+ state + "\n" + country;
    }
}
