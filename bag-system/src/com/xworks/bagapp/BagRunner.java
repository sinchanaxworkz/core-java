package com.xworks.bagapp;

import com.xworks.bagapp.customer.Bag;
import com.xworks.bagapp.customer.Customer;

public class BagRunner {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setBagId(1);
        customer.setBagBrand("puma");
        customer.setColor("pink");
        customer.setPrice(999);
        customer.setNoofcompatments(9);
        Bag bag=new Bag(customer);
        bag.getCustomerDetails();

    }
}
