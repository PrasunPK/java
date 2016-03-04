package com;

public class Representation {

    private GuestList guestList;

    public Representation(GuestList guestList) {
        this.guestList = guestList;
    }

    public String represent(String option) {
        return guestList.getGuest(0).getName(option);
    }
}
