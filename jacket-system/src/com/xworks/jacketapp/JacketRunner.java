package com.xworks.jacketapp;

public class JacketRunner {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setJacketId(9);
        customer.setJacketBrand("puma");
        customer.setColor("white");
        customer.setPrice(999);
        customer.setNoOfPocket(3);
        Jacket jacket=new Jacket(customer);
        jacket.getCustomerDetails();

    }
}

