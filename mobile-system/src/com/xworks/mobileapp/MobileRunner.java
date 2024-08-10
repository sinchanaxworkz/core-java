package com.xworks.mobileapp;

import com.xworks.mobileapp.contact.Contacts;
import com.xworks.mobileapp.mobile.Mobile;


public class MobileRunner {
    public static void main(String[] args) {
        Contacts contacts=new Contacts();
        contacts.contactName="thanu";
        contacts.phoneNumber=63600339554L;




    Mobile mobile =new Mobile(contacts);
    mobile.openContacts();

}
}