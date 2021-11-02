package com.meta.bankdemo.userio;

import com.meta.bankdemo.model.Customer;

public class CustomerIO extends BaseIO{
    //This class is for reading and displaying customer info
    public Customer readCustomerInformation(){
        Customer customer = new Customer();

       customer.setFullname(read("fullname"));
        customer.setMobileNumber(read("mobile number "));
        customer.setEmailAddress(read("email address"));
        customer.setDateOfBirth(read("Date of birth"));
        customer.setPremium(Boolean.parseBoolean(read("premium true or false ")));
       customer.setIdType(Integer.parseInt(read("ID Type ")));
        customer.setIdName(read("ID Name "));
        return customer;
    }
}
