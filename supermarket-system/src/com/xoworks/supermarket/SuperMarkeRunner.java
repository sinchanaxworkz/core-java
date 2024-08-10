package com.xoworks.supermarket;

import com.xoworks.supermarket.supermarket.SuperMarket;
import com.xoworks.supermarket.workers.Workers;

public class SuperMarkeRunner {
    public static void main(String[] args) {
        Workers workers=new Workers();
        workers.name="rakshaShetty";
        workers.phoneNumber=97689654367L;
        workers.age=30;
        workers.salary=100000;

        SuperMarket superMarket = new SuperMarket(workers);
        superMarket.WorkersDetails();



    }

}
