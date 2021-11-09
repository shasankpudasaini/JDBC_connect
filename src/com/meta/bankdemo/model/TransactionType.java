package com.meta.bankdemo.model;

public class TransactionType {

    private Integer id;
    private String name;
    private Short code;

    public TransactionType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public TransactionType(Integer id, String name, Short code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
