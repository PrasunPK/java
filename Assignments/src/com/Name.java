package com;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String casualName() {
        return firstName + " " + lastName;
    }

    private String formalName() {
        return lastName + ", " + firstName;
    }

    private boolean isMale(String gender) {
        return gender.equals("Male");
    }

    public String withPrefix(String gender, String format) {
        String name;
        if (format.equals("casual"))
            name = casualName();
        else
            name = formalName();
        return addPrefix(name,gender);
    }

    private String addPrefix(String name, String gender) {
        if (isMale(gender))
            return Gender.MALE + " " + name;
        return Gender.FEMALE + " " + name;
    }
}
