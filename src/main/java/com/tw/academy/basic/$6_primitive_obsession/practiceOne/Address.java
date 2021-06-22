package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    String city;
    String province;

    public Address(String address) {
        city = address.substring(address.indexOf("省") + 1, address.indexOf("市"));
        province = address.substring(0, address.indexOf("省"));
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
