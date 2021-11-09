package com.meta.bankdemo.service;

import com.meta.bankdemo.model.Customer;

public interface CustomerService {

    Customer findCustomeByMobileNumber(String mobileNumber);
}
