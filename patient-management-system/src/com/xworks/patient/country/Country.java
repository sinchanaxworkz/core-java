package com.xworks.patient.country;

import com.xworks.patient.city.City;
import com.xworks.patient.state.State;

public class Country {

    public String name;
    State state;

    public Country(State state) {
        this.state = state;
    }
    public void stateDetails(){
        this.state.cityDetails();
        System.out.println("country name is" + this.name);


    }

}