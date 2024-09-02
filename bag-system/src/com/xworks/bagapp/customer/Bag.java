package com.xworks.bagapp.customer;

public class Bag {
    Customer customer;
    public Bag(Customer customer){
        this.customer=customer;
    }
    public void getCustomerDetails(){
        System.out.println("bag id is" + customer.getBagId());
        System.out.println("bag brand is" + customer.getBagBrand());
        System.out.println("bag color is" + customer.getColor());
        System.out.println("bag price is" + customer.getPrice());
        System.out.println("bag no of cpmapartment is"+ customer.getNoofcompatments());
    }
}
