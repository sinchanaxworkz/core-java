package com.xworks.patient;

import com.xworks.patient.area.Area;
import com.xworks.patient.city.City;
import com.xworks.patient.country.Country;
import com.xworks.patient.state.State;
import com.xworks.patient.street.Street;

public class PatientRunner {

    public static void main(String[] args) {
        Street street = new Street();
        street.streetName="bashyam";
        street.streetNo=2;

        Area area=new Area(street);
        area.areaName="rajajinagra";

        City city=new City(area);
        city.cityName="banglore";

        State state =new State(city);
        state.stateName="karnataka";

        Country country =new Country(state);
        country.name="india";
        country.stateDetails();
    }
}

