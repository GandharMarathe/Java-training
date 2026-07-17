package com.java.apshah.ecommerce.service;

import com.java.apshah.ecommerce.model.creditcard;
import com.java.apshah.ecommerce.model.order;
import com.java.apshah.ecommerce.model.payment;

public class checkout {
        payment up;
        creditcard cp;
    public checkout(payment up, creditcard cp) {
        this.up = up;
        this.cp = cp;
    }

    public void checkout(order o, String paymenttype){
        if(paymenttype.equalsIgnoreCase("UPI")) {
            up.authoriseAndhold(o);
            up.captureupi(o);
        } else if (paymenttype.equalsIgnoreCase("creditcard")) {
            cp.authoriseAndHoldCredit(o);
            cp.captureCard(o);
        }


    }
}
