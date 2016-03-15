package com.person.name;

import com.person.Gender;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String casualName() {
        return String.format("%s %s", firstName, lastName);
    }

    private String formalName() {
        return String.format("%s, %s", lastName , firstName);
    }

    public String withPrefix(Gender gender, String format) {
        String name = "";
        if (format.equals("-c"))
            name = casualName();
        if (format.equals("-f"))
            name = formalName();
        return addPrefix(name, gender);
    }

    private String addPrefix(String name, Gender gender) {
        return gender + " " + name;
    }

}
