package com.decor;

public class Decoration {

    private String seperator;
    private String cornerDecor;
    private String sideDecor;
    private String topDecor;

    public Decoration(String []decors) {
        this.seperator = decors[0];
        this.cornerDecor = decors[1];
        this.sideDecor = decors[2];
        this.topDecor = decors[3];
    }

    public String decorate(String[] givenName) {
        String topAndBottomBorder = "";
        String middleBorder = "";

        String name = givenName[0];
        String cityAndState = givenName[1] +", "+ givenName[2];
        String country = givenName[3];

        int boxWidth = largest(name.length(), cityAndState.length(), country.length());

        for (int i = 0; i < boxWidth+2; i++)
            middleBorder += topDecor;
        topAndBottomBorder += cornerDecor + middleBorder + cornerDecor;

        String decorated = topAndBottomBorder + "\n" +
                sideDecor + " " +name+ fill(boxWidth - name.length() +1) +sideDecor + "\n"
                +sideDecor+ middleBorder+sideDecor + "\n"
                +sideDecor+" " + cityAndState + fill(boxWidth - cityAndState.length() +1)+ sideDecor+"\n"
                +sideDecor+" " + country +fill(boxWidth - country.length() + 1) +sideDecor+ "\n"
                +topAndBottomBorder;
        System.out.println(decorated);
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

    public static void main(String[] args) {
    String []decorWith = {" ", "+", "|", "-"};
        Decoration decoration = new Decoration(decorWith);
        String[] name = {"Mr John Smith", "Carolina", "New York", "United States"};
        String[] name1 = {"Mr John Smith", "Gangarampur", "Chattrishgarh", "India"};
        String[] name2 = {"Mr John Smith", "New Alanna","Illinois","Slovakia (Slovak Republic)"};
        String[] name3 = {"Mr John Smith New Alanna", "Jack","Illi","Slovakia"};
        decoration.decorate(name);
        decoration.decorate(name1);
        decoration.decorate(name2);
        decoration.decorate(name3);
    }
}
