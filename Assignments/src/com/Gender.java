package com;

public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    private String prefix;

    Gender(String prefix) {
        this.prefix  = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
