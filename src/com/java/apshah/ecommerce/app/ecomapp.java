package com.java.apshah.ecommerce.app;

import com.java.apshah.ecommerce.model.creditcard;
import com.java.apshah.ecommerce.model.order;
import com.java.apshah.ecommerce.model.payment;
import com.java.apshah.ecommerce.service.checkout;

public class ecomapp {
    public static void main(String[] args) {


        order o = new order("AI-67", 6767.67);
        creditcard cp = new creditcard();
        payment up = new payment();
        checkout ce = new checkout(up, cp);

        ce.checkout(o, "UPI");
    }

}
create one more payment metod and integrate.
