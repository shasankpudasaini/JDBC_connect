package com.meta.bankdemo.model;

public class Transaction {

    private Integer id;
    private Account accountId;
    private TransactionType transactionTypeId;
    private Double Amount;
    private Boolean isCashBackApplicable;
    private Boolean status;

    public Transaction() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public TransactionType getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(TransactionType transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Boolean getCashBackApplicable() {
        return isCashBackApplicable;
    }

    public void setCashBackApplicable(Boolean cashBackApplicable) {
        isCashBackApplicable = cashBackApplicable;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Transaction(Integer id, Account accountId, TransactionType transactionTypeId, Double amount, Boolean isCashBackApplicable, Boolean status) {
        this.id = id;
        this.accountId = accountId;
        this.transactionTypeId = transactionTypeId;
        Amount = amount;
        this.isCashBackApplicable = isCashBackApplicable;
        this.status = status;
    }
}
