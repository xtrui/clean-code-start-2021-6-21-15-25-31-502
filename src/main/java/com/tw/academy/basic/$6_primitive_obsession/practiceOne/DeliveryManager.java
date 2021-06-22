package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address toAddress;
    Address fromAddress;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = new Address(toAddress);
        this.fromAddress = new Address(fromAddress);
    }

    public DeliverCenter allocate() {
        if (areFromAndToSame()) {
            return DeliverCenter.LOCAL;
        }
        if (toAddress.getProvince().equals(fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean areFromAndToSame() {
        return toAddress.getProvince().equals(fromAddress.getProvince()) && toAddress.getCity().equals(fromAddress.getCity());
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
