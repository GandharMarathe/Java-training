package com.java.apshah.ecommerce.model;

public class creditcard {
    public void authoriseAndHoldCredit(order O){
        System.out.println("contscting payment gateway");
        System.out.println("authorising credit amount"+O.getAmount());
        O.processorder("PENDING");
    }

    public void captureCard(order o){
        System.out.println("transferring payment from card/bank");
        o.processorder("PAID");
    }
}
