package com.xworks.patient.city;

import com.xworks.patient.area.Area;

public class City {
    public String cityName;
    Area area;
public City(Area area){
    this.area=area;

}
public  void araedetails(){
    this.area.streetdatils();
    System.out.println("the city name is" + this.area);
}

}
