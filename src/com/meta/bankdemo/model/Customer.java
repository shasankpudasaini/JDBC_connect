package com.meta.bankdemo.model;

public class Customer {

    private Integer id;
    private String fullname;
    private String mobileNumber;
    private String emailAddress;
    private String dateOfBirth;
    private boolean isPremium;
    private Integer idType;
    private String idName;

    public Customer() {
    }

    public Customer(Integer id, String fullname, String mobileNumber, String emailAddress, String dateOfBirth, boolean isPremium, Integer idType, String idName) {
        this.id = id;
        this.fullname = fullname;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.isPremium = isPremium;
        this.idType = idType;
        this.idName = idName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}
