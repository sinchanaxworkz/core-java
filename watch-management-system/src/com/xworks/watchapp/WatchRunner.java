package com.xworks.watchapp;

public class WatchRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setWatchId(1);
        customer.setWatchBrand("boat");
        customer.setPrice(4500.0);

        Watch watch = new Watch(customer);
        watch.getCustomerDetails();

    }
}
