package com.xworks.watchapp;

public class Customer {
    private int watchId;
    private  String watchBrand;
    private double price;


    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public void setWatchBrand(String watchBrand) {
        this.watchBrand = watchBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getWatchId() {
        return watchId;
    }

    public String getWatchBrand() {
        return watchBrand;
    }
}
