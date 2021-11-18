package com.meta.bankdemo.model;

public class Account {
    private Integer id;
    private String accountNumber;
    private String openDate;
    private String closeDate;
    private Double interestAccured;
    private Double totalBalance;
    private String accountType;
    private Customer customerId;

    public Account() {71
    }

    public Account(Integer id, String accountNumber, String openDate, String closeDate, Double interestAccured, Double totalBalance, String accountType, Customer customerId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.interestAccured = interestAccured;
        this.totalBalance = totalBalance;
        this.accountType = accountType;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public Double getInterestAccured() {
        return interestAccured;
    }

    public void setInterestAccured(Double interestAccured) {
        this.interestAccured = interestAccured;
    }

    public Double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
