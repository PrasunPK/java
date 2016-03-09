package com;

import java.util.ArrayList;

public class OptionHandler {


    private int legalAge;
    private String nameFormat;
    private String country;
    private String fileName;
    private Guest[] data;

    public OptionHandler() {
        nameFormat = null;
        legalAge = 0;
        country = null;
    }

    private void setHandler(String format, String givenCountry, int age, String file) {
        nameFormat = format;
        legalAge = age;
        country = givenCountry;
        fileName = file;
    }

    private void setHandler(String format, String givenCountry, String file) {
        nameFormat = format;
        country = givenCountry;
        fileName = file;
    }

    private void setHandler(String format, String file) {
        this.nameFormat = format;
        this.fileName = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void operate(Guests records) {
        data = records.getFrom();
        System.out.println(data.length);
    }

    public void extract(String[] options) {
        if (options.length == 4)
            setHandler(options[0], options[2], Integer.parseInt(options[1]),options[3]);
        if (options.length == 3)
            setHandler(options[0], options[1],options[2]);
        if (options.length == 2)
            setHandler(options[0], options[1]);
    }

    public String[] formattedData() {
        ArrayList<String> formattedData = new ArrayList<>();
        for (Guest guest : data) {
            formattedData.add(guest.represent(nameFormat));
        }
        String[] content = new String[formattedData.size()];
        formattedData.toArray(content);
        return content;
    }


}
