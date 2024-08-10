package com.xworks.hotelroom.room;

public class Room {
    public String hotelName;
    public int hotelPrice;
    public boolean isFoodAvailable;
    public int noOfPerson;


    public void displayInfo(){
        System.out.println("hotelname is" + this.hotelName);
        System.out.println("the hotelprice is" + this.hotelPrice);
        System.out.println("is this foodavailabel" + this.isFoodAvailable);
    }
}
