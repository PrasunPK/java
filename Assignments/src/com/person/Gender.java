package com.person;

public enum Gender {
    FEMALE("Ms"),
    MALE("Mr");

    private String prefix;

    Gender(String prefix) {
        this.prefix  = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
