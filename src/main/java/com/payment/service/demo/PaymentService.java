package com.payment.service.demo;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod payMethod){
        paymentMethods.put(name, payMethod);
    }

    public void makePayment(String name){
        PaymentMethod makePayment = paymentMethods.get(name);
        makePayment.pay(); // This is an example of Runtime Polymorphism
    }
}
/*
=================================================================================
                    RUNTIME POLYMORPHISM
=================================================================================

HashMap<String, PaymentMethod> paymentMethods;

PaymentMethod is the Parent Interface.

Objects stored inside HashMap can be:

✔ CreditCard
✔ DebitCard
✔ DigitalWallet
✔ UnifiedPaymentUPI

Example:

paymentMethods.put("credit",new CreditCard(...));

paymentMethods.put("upi",new UnifiedPaymentUPI(...));

Although every object is stored using the Parent Interface reference,

PaymentMethod paymentMethod

the actual object decides which pay() method will execute.

Example:

PaymentMethod paymentMethod =
        paymentMethods.get("credit");

paymentMethod.pay();

Actual object = CreditCard

Therefore,

CreditCard.pay()

gets executed.

Similarly,

PaymentMethod paymentMethod =
        paymentMethods.get("upi");

paymentMethod.pay();

Actual object = UnifiedPaymentUPI

Therefore,

UnifiedPaymentUPI.pay()

gets executed.

Since the method selection happens during Runtime,
this is called Runtime Polymorphism (Dynamic Method Dispatch).

=================================================================================
*/
/*
=================================================================================
                    PROGRAMMING TO INTERFACE
=================================================================================

Instead of writing

HashMap<String,CreditCard>

or

HashMap<String,DebitCard>

the project uses

HashMap<String,PaymentMethod>

Benefit:

New payment methods can be added without modifying PaymentService.

Example:

Tomorrow,

NetBanking

CryptoPayment

ApplePay

GooglePay

can simply implement PaymentMethod.

PaymentService will continue to work without any code changes.

This follows the Open-Closed Principle (SOLID).

=================================================================================
*/