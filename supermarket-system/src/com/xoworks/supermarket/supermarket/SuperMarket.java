package com.xoworks.supermarket.supermarket;

import com.xoworks.supermarket.workers.Workers;

public class SuperMarket {
    Workers workers;
    public SuperMarket(Workers workers){
        this.workers=workers;
    }
    public void WorkersDetails(){
        if(workers!=null)
            this.workers.displayinfo();
        else {
            System.out.println("workers not found");
        }

    }



}
