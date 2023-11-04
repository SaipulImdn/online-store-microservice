package com.onlinestore.payment.model;

public class Payment {
    private String paymentId;
    private double amount;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    // Getter and setter methods
    // ...

    @Override
    public String toString() {
        return "Payment{" +
               "paymentId='" + paymentId + '\'' +
               ", amount=" + amount +
               '}';
    }
}
