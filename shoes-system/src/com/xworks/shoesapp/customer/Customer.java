package com.xworks.shoesapp.customer;

public class Customer {
    private int shoesId;
    private  String shoesBrand;
        private double price;
        private  int size;

    public void setShoesId(int shoesId) {
        this.shoesId = shoesId;
    }

    public void setShoesBrand(String shoesBrand) {
        this.shoesBrand = shoesBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getShoesId() {
        return shoesId;
    }

    public String getShoesBrand() {
        return shoesBrand;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
