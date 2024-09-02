package com.xworks.watchapp;

public class Watch {
    Customer customer;
    public  Watch(Customer customer){
        this.customer=customer;
    }
    public void getCustomerDetails(){
        System.out.println("watch id is"+  customer.getWatchId());
        System.out.println("watch brand name is"+ customer.getWatchBrand());
        System.out.println("watch price is" + customer.getPrice());

    }
}

