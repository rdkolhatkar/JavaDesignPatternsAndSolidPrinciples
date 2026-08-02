package com.payment.service.demo;

public interface PaymentMethod {
    void pay();
}
/*
=================================================================================
                           INTERFACE
=================================================================================

PaymentMethod is an Interface.

public interface PaymentMethod{
    void pay();
}

Purpose:
--------
The interface defines a common contract that every payment method
must implement.

Any class implementing PaymentMethod MUST provide its own implementation
of pay().

Implemented by:

✔ CreditCard
✔ DebitCard
✔ DigitalWallet
✔ UnifiedPaymentUPI

Benefit:
--------
Allows loose coupling.

PaymentService only depends on the interface instead of
specific implementations.

=================================================================================
*/
