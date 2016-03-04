package com;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String casualName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return lastName + ", " + firstName;
    }

    private boolean isMale(Gender gender) {
        return gender == Gender.MALE;
    }

    public String withPrefix(Gender gender, String format) {
        String name = "";
        if (format.equals("casual")) {
            name = casualName();
        }else{
            name = formalName();
        }
        if (isMale(gender))
            return Gender.MALE + " " + name;
        return Gender.FEMALE + " " + name;

    }
}
