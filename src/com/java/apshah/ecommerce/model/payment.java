package com.java.apshah.ecommerce.model;

public class payment {
    public void authoriseAndhold(order O){
        System.out.println("contscting payment gateway");
        System.out.println("authorising upi amount"+O.getAmount());
        O.processorder("PENDING");
    }

    public void captureupi(order o){
        System.out.println("trasferring payment from upi");
        o.processorder("PAID");
    }
}
