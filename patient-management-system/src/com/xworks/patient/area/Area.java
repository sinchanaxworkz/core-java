package com.xworks.patient.area;

import com.xworks.patient.street.Street;

public class Area {
   Street street;
   public String areaName;
   public Area(Street street){
       this.street=street;
   }

   public void streetdatils() {
       this.street.streetInfo();
       System.out.println("the Area name" + this.areaName);

   }
}

