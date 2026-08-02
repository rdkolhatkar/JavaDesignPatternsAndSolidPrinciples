package com.payment.service.demo;

public class DigitalWallet implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Making payment via Digital Wallet ..... ");
    }
}
