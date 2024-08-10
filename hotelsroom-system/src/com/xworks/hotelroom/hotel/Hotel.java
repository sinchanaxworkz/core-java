package com.xworks.hotelroom.hotel;

import com.xworks.hotelroom.room.Room;

public class Hotel {
    Room room;
   public Hotel(Room room){
       this.room=room;
   }
   public void bookingRoom(){
       if(room!=null)

       this.room.displayInfo();
       else
           System.out.println("room is not found");


   }

}
