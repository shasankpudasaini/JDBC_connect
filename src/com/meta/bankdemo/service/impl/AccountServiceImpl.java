package com.meta.bankdemo.service.impl;

import com.meta.bankdemo.model.Account;
import com.meta.bankdemo.service.AccountService;
import com.meta.bankdemo.service.GenericService;

import java.util.List;

public class AccountServiceImpl implements GenericService<Account> , AccountService {


    @Override
    public Account findAccountbyAccountNumber(String AccountNumber) {
        return null;
    }

    @Override
    public boolean create(Account customer) {
        return false;
    }

    @Override
    public boolean update(Account customer) {
        return false;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
