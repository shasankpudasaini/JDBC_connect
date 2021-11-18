package com.meta.bankdemo.userio;

import com.meta.bankdemo.model.Customer;

public class CustomerIO extends BaseIO{
    //This class is for reading and displaying customer info
    public  CustomerIO() {}

    public Customer readCustomerInformation(){
        Customer customer = new Customer();
        try {
            customer.setFullname(read("fullname"));
            customer.setMobileNumber(read("mobile number "));
            customer.setEmailAddress(read("email address"));
            customer.setDateOfBirth(read("Date of birth in pattern yyyy-mm-dd"));
            customer.setPremium(Boolean.parseBoolean(read("premium [true or false] ")));
            customer.setIdType(Integer.parseInt(read("ID Type [Integer value]")));
            customer.setIdName(read("ID Name: "));
            return customer;

        } catch (Exception ex) {
            ex.printStackTrace();
            display( ex.getMessage() + "Error reading customer data ");
            return null;
        }

    }
}
