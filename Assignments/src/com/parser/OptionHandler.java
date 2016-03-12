package com.parser;

import com.guest.Guest;
import com.guest.Guests;
import com.person.Country;
import lib.Pair;

import java.util.ArrayList;
import java.util.List;


public class OptionHandler {


    private final String[] commandLineArguments;
    private List<String> formattedGuestNames;
    private String fileName;

    public OptionHandler(String[] args) {
        commandLineArguments = args;
        formattedGuestNames = new ArrayList<>();
    }

    public List<Pair<String, String>> extract() {
        List<Pair<String, String>> filters = new ArrayList<>();
        for (int i = 0; i < commandLineArguments.length; i++) {
            String option = commandLineArguments[i];

            if (option.equals("--file"))
                fileName = commandLineArguments[i + 1];
            if (option.contains("--") && !option.equals("--file"))
                filters.add(new Pair<>(commandLineArguments[i], commandLineArguments[i + 1]));
        }
        return filters;
    }


    public void operate(Guests guests, List<Pair<String, String>> filters) {
        String nameFormat = null;
        String countryName = null;
        for (Pair<String, String> filter : filters) {
            if (filter.getKey().equals("--format")) {
                nameFormat = filter.getValue();
                formatName(guests.getFrom(), nameFormat);
            }
            if (filter.getKey().equals("--country")) {
                countryName = filter.getValue();
                formatNameWithCountry(guests.getFrom(new Country(countryName)), nameFormat);
            }

            if (filter.getKey().equals("--age")) {
                formatNameWithCountryAndAge(guests.getFrom(new Country(countryName)), nameFormat, Integer.parseInt(filter.getValue()));
            }
        }
    }

    private void formatName(Guest[] data, String nameFormat) {
        for (Guest guest : data)
            formattedGuestNames.add(guest.represent(nameFormat));
    }

    private void formatNameWithCountry(Guest[] data, String nameFormat) {
        formattedGuestNames = new ArrayList<>();
        for (Guest guest : data) {
            formattedGuestNames.add(guest.representWithCountry(nameFormat));
        }
    }

    private void formatNameWithCountryAndAge(Guest[] data, String nameFormat, int legalAge) {
        formattedGuestNames = new ArrayList<>();
        for (Guest guest : data) {
            if (guest.isAbleToConsumeAlcohol(legalAge))
                formattedGuestNames.add(guest.representWithCountryAndAge(nameFormat));
        }
    }

    public String[] formattedData() {
        String[] content = new String[formattedGuestNames.size()];
        formattedGuestNames.toArray(content);
        return content;
    }


    public String getFileName() {
        return fileName;
    }
}
