package com.java.apshah.ecommerce.model;

public class order {
    private final String sku;
    private final double amount;
    private String status;

    public order(String sku, double amount) {
        this.sku = sku;
        this.amount = amount;
        this.status="NEW";
    }
    void processorder(String status ){
        if(this.status.equalsIgnoreCase("New")&& status.equalsIgnoreCase("Pending"))
            this.status="PENDING";
        else if (this.status.equalsIgnoreCase("pending")&& status.equalsIgnoreCase("PAID")) {
            this.status="PAID";
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getSku() {
        return sku;
    }

    public String getStatus() {
        return status;
    }
}
