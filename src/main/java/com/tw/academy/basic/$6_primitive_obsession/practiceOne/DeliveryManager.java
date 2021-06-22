package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address toAddress;
    Address fromAddress;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = new Address(toAddress);
        this.fromAddress = new Address(fromAddress);
    }

    public DeliverCenter allocate() {
        if (isSameAddress()) {
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameAddress() {
        return isSameProvince() && isSameCity();
    }

    private boolean isSameCity() {
        return toAddress.getCity().equals(fromAddress.getCity());
    }

    private boolean isSameProvince() {
        return toAddress.getProvince().equals(fromAddress.getProvince());
    }

}
