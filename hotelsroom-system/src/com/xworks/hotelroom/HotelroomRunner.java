package com.xworks.hotelroom;

import com.xworks.hotelroom.hotel.Hotel;
import com.xworks.hotelroom.room.Room;

public class HotelroomRunner {
    public static void main(String[] args) {

        Room room = new Room();
        room.hotelName="oceanperl";
        room.hotelPrice=3000;
        room.isFoodAvailable=true;
        room.noOfPerson=4;

        Hotel hotel=new Hotel(room);
        hotel.bookingRoom();

    }
}
