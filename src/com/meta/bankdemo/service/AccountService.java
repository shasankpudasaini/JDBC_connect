package com.meta.bankdemo.service;

import com.meta.bankdemo.model.Account;

public interface AccountService {

    Account findAccountbyAccountNumber(String AccountNumber);
}
