package com.xworks.jacketapp;

public class Customer {
    private int jacketId;
    private  String jacketBrand;
    private double price;
    private  String color;
    private char size;
    private  int noOfPocket;


    public void setJacketId(int jacketId) {
        this.jacketId = jacketId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setJacketBrand(String jacketBrand) {
        this.jacketBrand = jacketBrand;
    }

    public void setNoOfPocket(int noOfPocket) {
        this.noOfPocket = noOfPocket;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public int getJacketId() {
        return jacketId;
    }

    public int getNoOfPocket() {
        return noOfPocket;
    }

    public String getJacketBrand() {
        return jacketBrand;
    }
}
