package com.xworks.patient.state;

import com.xworks.patient.area.Area;
import com.xworks.patient.city.City;

public class State {
    public String stateName;
    City city;
    public State(City city){
        this.city=city;


    }
    public  void cityDetails(){
        this.city.araedetails();
        System.out.println("the state name is" + this.stateName);
    }

}

