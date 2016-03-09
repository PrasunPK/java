package com;

import java.util.ArrayList;


public class OptionHandler {


    ArrayList<String> formattedData;
    private int legalAge;
    private String nameFormat;
    private String country;
    private Guest[] data;

    public OptionHandler() {
        formattedData = new ArrayList<>();
        nameFormat = null;
        legalAge = 0;
        country = null;
    }

    private void setHandler(String format, String givenCountry, int age) {
        nameFormat = format;
        legalAge = age;
        country = givenCountry;
    }

    private void setHandler(String format, String givenCountry) {
        nameFormat = format;
        country = givenCountry;
    }

    private void setHandler(String format) {
        this.nameFormat = format;
    }

    public void operate(Guests guests, String[] options) {
        if (options.length == 4) {
            setHandler(options[0], options[2], Integer.parseInt(options[1]));
            data = guests.getFrom();
        }
        if (options.length == 3) {
            setHandler(options[0], options[1]);
            data = guests.getFrom(new Country(country));
            formatNameWithCountry(data);
        }
        if (options.length == 2) {
            setHandler(options[0]);
            data = guests.getFrom();
            formatName(data);
        }
    }

    private void formatName(Guest[] data) {
        for (Guest guest : data) {
            formattedData.add(guest.represent(nameFormat));
        }
    }

    private void formatNameWithCountry(Guest[] data) {
        for (Guest guest : data) {
            formattedData.add(guest.representWithCountry(nameFormat));
        }
    }

    public String[] formattedData() {
        String[] content = new String[formattedData.size()];
        formattedData.toArray(content);
        return content;
    }


}
