package com.meta.bankdemo.service;

import com.meta.bankdemo.model.Customer;

import java.util.List;

public interface GenericService<T> {

    boolean create(T customer);
    boolean update(T customer);

    List<T> findAll();



}
