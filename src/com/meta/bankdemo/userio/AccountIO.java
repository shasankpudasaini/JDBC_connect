package com.meta.bankdemo.userio;

import com.meta.bankdemo.model.Account;

public class AccountIO extends  BaseIO{

    public Account readAccount() {
        Account account = new Account();
        account.setCustomerId(Integer.parseInt("Customer ID"));
    }
    }
}
