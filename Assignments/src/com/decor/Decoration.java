package com.decor;

import com.guest.Guest;

import java.util.ArrayList;
import java.util.List;

public class Decoration {

    private String separator;
    private String cornerDecor;
    private String sideDecor;
    private String topDecor;

    public Decoration(String[] decors) {
        this.separator = decors[0];
        this.cornerDecor = decors[1];
        this.sideDecor = decors[2];
        this.topDecor = decors[3];
    }

    private String decorate(Guest guest, String nameFormat) {
        String topAndBottomBorder = "";
        String middleBorder = "";

        String fullName = guest.representName(nameFormat);
        String address = guest.representAddress();
        String[] fullAddress = address.split("\n");
        String cityAndState = fullAddress[0];
        String country = fullAddress[1];


        int boxWidth = largest(fullName.length(), cityAndState.length(), country.length());

        for (int i = 0; i < boxWidth + 2; i++)
            middleBorder += topDecor;
        topAndBottomBorder += cornerDecor + middleBorder + cornerDecor;
        return decorateName(topAndBottomBorder, middleBorder, fullName, cityAndState, country, boxWidth);
    }

    private String decorateName(String topAndBottomBorder, String middleBorder, String fullName, String cityAndState, String country, int boxWidth) {
        String topLine = String.format("%s\n", topAndBottomBorder);
        String nameLine = String.format("%s%s%s%s%s%s\n", sideDecor, separator, fullName, fill(boxWidth - fullName.length()), separator, sideDecor);
        String midlineSeparator = String.format("%s%s%s\n", sideDecor, middleBorder, sideDecor);
        String cityStateLine = String.format("%s%s%s%s%s%s\n", sideDecor, separator, cityAndState, fill(boxWidth - cityAndState.length()), separator, sideDecor);
        String countryLine = String.format("%s%s%s%s%s%s\n", sideDecor, separator, country, fill(boxWidth - country.length()), separator, sideDecor);
        String bottomLine = String.format("%s", topAndBottomBorder);

        return String.format("%s%s%s%s%s%s", topLine, nameLine, midlineSeparator, cityStateLine, countryLine, bottomLine);
    }

    private String fill(int noOfSpaces) {
        String filler = "";
        for (int i = 0; i < noOfSpaces; i++)
            filler += " ";
        return filler;
    }

    private int largest(int nameLength, int citySateLength, int countryLength) {
        int greater = nameLength > citySateLength ? nameLength : citySateLength;
        return greater > countryLength ? greater : countryLength;
    }

    public String[] decorateAll(Guest[] people, String nameFormat) {
        List<Object> decoratedName = new ArrayList<>();
        for (Guest guest : people) {
            decoratedName.add(decorate(guest,nameFormat));
        }
        String []labels = new String[decoratedName.size()];
        return decoratedName.toArray(labels);
    }
}
