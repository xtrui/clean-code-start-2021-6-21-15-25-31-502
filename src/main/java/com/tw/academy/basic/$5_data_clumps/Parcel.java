package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private final User receiver;
    private final User sender;
    private String size;
    private Double weight;

    private final String receiverName;
    private final String receiverPhoneNumber;
    private final String receiverAddress;

    private final String senderName;
    private final String senderPhoneNumber;
    private final String senderAddress;

    public Parcel(String size, Double weight,
                  User receiver, User sender) {
        this.size = size;
        this.weight = weight;
        this.receiver = receiver;
        this.receiverName = this.receiver.getName();
        this.receiverPhoneNumber = this.receiver.getPhoneNumber();
        this.receiverAddress = this.receiver.getBuyerAddress();
        this.sender = sender;
        this.senderName = this.sender.getName();
        this.senderPhoneNumber = this.sender.getPhoneNumber();
        this.senderAddress = this.sender.getBuyerAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                receiverName, receiverPhoneNumber, receiverAddress);
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
