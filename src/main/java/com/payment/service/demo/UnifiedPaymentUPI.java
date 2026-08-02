package com.payment.service.demo;

public class UnifiedPaymentUPI implements PaymentMethod{
    String unifiedPaymentID;

    public UnifiedPaymentUPI(String unifiedPaymentID) {
        this.unifiedPaymentID = unifiedPaymentID;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via UPI Transaction ......  " + "UPI payment ID is : "+unifiedPaymentID);
    }
}
