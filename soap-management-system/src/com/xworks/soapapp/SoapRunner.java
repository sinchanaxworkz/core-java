package com.xworks.soapapp;

public class SoapRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setSoapId(1);
        customer.setSoapName("dove");
        customer.setPrice(28.0);

        Soap soap = new Soap(customer);
        soap.getCustomerDetails();

    }

}
