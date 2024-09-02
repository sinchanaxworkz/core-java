package com.xworks.bagapp.customer;

public class Customer {
    private int bagId;
    private  String bagBrand;
    private double price;
    private  String color;
    private int noofcompatments;

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBagBrand(String bagBrand) {
        this.bagBrand = bagBrand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNoofcompatments(int noofcompatments) {
        this.noofcompatments = noofcompatments;
    }

    public int getBagId() {
        return bagId;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getNoofcompatments() {
        return noofcompatments;
    }

    public String getBagBrand() {
        return bagBrand;
    }

}
