package com.meta.bankdemo.menu;

import com.meta.bankdemo.userio.BaseIO;

public class Menu extends BaseIO {
    public Menu() {
        System.out.println("********* Welcome to Simple Application ");
       boolean status = true;
        while(status) {
            display("1 Customer Section");
            display("2 Account Section");
            display("3 Exit ");
            int choice = Integer.parseInt(readChoice(" Enter your Option"));

            switch (choice) {
                case 1:
                    display("You are at customer section");
                    new CustomerMenu();

                    break;
                case 2:
                    display("You are at account section");

                    break;
                case 3:
                    status = false;
                    display("****** Come back ***********");
                    break;
                default:
                    display("Invalid option ");
            }
        }
    }
}
