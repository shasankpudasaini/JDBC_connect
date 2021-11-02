package com.meta.bankdemo.menu;

import com.meta.bankdemo.userio.BaseIO;

public class CustomerMenu extends BaseIO {
    public CustomerMenu() {
        display("Welcine to Customer Section ");
        boolean status = true;
        while(status){
            display(" 1 Customer Create");
            display(" 1 Customer Update");
            display(" 1 Customer List");
            display("4 Exit ");
            int choice = Integer.parseInt(readChoice("Enter choice"));
            switch (choice){
                case 1:
                    display("Customer create section");
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
