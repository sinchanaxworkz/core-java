package com.xworks.mobileapp.mobile;

import com.xworks.mobileapp.contact.Contacts;

public class Mobile {



    Contacts contacts;

    public  Mobile(Contacts contacts){
        System.out.println("mobie number is invoked");
        System.out.println("no of parameter is : 1");
        System.out.println("type of parameter : Contacts type");
        this.contacts = contacts;
    }
    public void openContacts(){
        System.out.println("opening contacts");
        if(contacts!=null)
            this.contacts.contactDetails();
        else
            System.out.println("No Contacts found");
        System.out.println("end of contacts");


    }

}


