package com.xworks.soapapp;

public class Soap {
    Customer customer;
    public  Soap(Customer customer){
        this.customer=customer;
    }
    public void getCustomerDetails(){
        System.out.println("soap id is"+  customer.getSoapId());
        System.out.println("soap name is"+ customer.getSoapName());
        System.out.println("soap price is" + customer.getPrice());

    }
}

