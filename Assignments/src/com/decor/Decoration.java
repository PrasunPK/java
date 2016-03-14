package com.decor;

import com.guest.Guest;

public class Decoration {

    private String seperator;
    private String cornerDecor;
    private String sideDecor;
    private String topDecor;

    public Decoration(String []decors) {
//        this.seperator = decors[0];
        this.cornerDecor = decors[1];
        this.sideDecor = decors[2];
        this.topDecor = decors[3];
    }

    public String decorate(Guest guest,String nameFormat) {
        String topAndBottomBorder = "";
        String middleBorder = "";

        String fullName = guest.represent(nameFormat);
        String address = guest.representAddress();
        String []fullAddress = address.split("\n");
        String cityAndState = fullAddress[0];
        String country = fullAddress[1];

        int boxWidth = largest(fullName.length(), cityAndState.length(), country.length());

        for (int i = 0; i < boxWidth+2; i++)
            middleBorder += topDecor;
        topAndBottomBorder += cornerDecor + middleBorder + cornerDecor;

        String decorated = topAndBottomBorder + "\n" +
                sideDecor + " " +fullName+ fill(boxWidth - fullName.length() +1) +sideDecor + "\n"
                +sideDecor+ middleBorder + sideDecor + "\n"
                +sideDecor+" " + cityAndState + fill(boxWidth - cityAndState.length() +1)+ sideDecor+"\n"
                +sideDecor+" " + country +fill(boxWidth - country.length() + 1) +sideDecor+ "\n"
                +topAndBottomBorder;
        return decorated;

    }

    private String fill(int noOfSpaces) {
        String filler = "";
        for (int i = 0; i < noOfSpaces; i++)
            filler += " ";
        return filler;
    }

    private int largest(int nameLength, int citySateLength, int countryLength) {
        int greater = nameLength > citySateLength ? nameLength : citySateLength ;
       return  greater > countryLength ? greater : countryLength;
    }

}
