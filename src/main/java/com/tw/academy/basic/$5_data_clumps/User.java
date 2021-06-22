package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String buyerAddress;

    public User(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        name = buyerName;
        phoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }
}
