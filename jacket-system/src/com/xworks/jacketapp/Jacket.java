package com.xworks.jacketapp;

public class Jacket {
    Customer customer;
    public Jacket(Customer customer){
        this.customer=customer;
    }
    public void getCustomerDetails(){
        System.out.println("bag id is" + customer.getJacketId());
        System.out.println("bag brand is" + customer.getJacketBrand());
        System.out.println("bag color is" + customer.getColor());
        System.out.println("bag price is" + customer.getPrice());
        System.out.println("bag no of cpmapartment is"+ customer.getNoOfPocket());
        System.out.println("bag size is" + customer.getSize());
    }
}


