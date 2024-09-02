package com.xworks.shoesapp;

import com.xworks.shoesapp.customer.Customer;
import com.xworks.shoesapp.customer.Shoes;

public class ShoesRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setShoesId(1);
        customer.setShoesBrand("Puma");
        customer.setSize(8);
        customer.setPrice(20000.0);

        Shoes shoes = new Shoes(customer);
        shoes.getCustomerDetails();

    }

}
