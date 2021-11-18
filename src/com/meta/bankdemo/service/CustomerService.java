package com.meta.bankdemo.service;

import com.meta.bankdemo.model.Customer;

public interface CustomerService extends GenericService<Customer> {

    Customer findCustomeByMobileNumber(String mobileNumber);
}
