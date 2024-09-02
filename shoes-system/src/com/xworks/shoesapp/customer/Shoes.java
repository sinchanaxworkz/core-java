package com.xworks.shoesapp.customer;

public class Shoes {
    Customer customer;
    public  Shoes(Customer customer){
        this.customer=customer;
    }
    public void getCustomerDetails(){
        System.out.println("shoes id is"+  customer.getShoesId());
        System.out.println("shoes brand is"+ customer.getShoesBrand());
        System.out.println("shoes price is" + customer.getPrice());
        System.out.println("shoes size is "+ customer.getSize());
    }
}
