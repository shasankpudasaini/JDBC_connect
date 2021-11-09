package com.meta.bankdemo.menu;

import com.meta.bankdemo.model.Customer;
import com.meta.bankdemo.userio.BaseIO;
import com.meta.bankdemo.userio.CustomerIO;

public class CustomerMenu extends CustomerIO {
   public CustomerMenu(){

        display("Welcome to Customer Section ");
        boolean status = true;
        while (status) {
            display(" 1 Customer Create");
            display(" 2 Customer Update");
            display(" 3 Customer List");
            display("4 Exit ");
            int choice = Integer.parseInt(readChoice("Enter choice"));
            switch (choice) {
                case 1:
                    display("Customer create section");
                    Customer customer = readCustomerInformation();

                    if(customer !=null ) {
                        display("Successfully created new customer ");
                    }
                    else
                        display("Error reading customer information ");

                    break;
                case 2:
                    display("Customer create section");
                    break;
                case 3:
                    display("Customer create section");
                    break;
                case 4:
                    status = false;
                    display("Exiting.........");
                default:
                    display("Wrong Customer create section");


            }
        }
    }
}
