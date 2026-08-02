package com.payment.service.demo;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("RatnakarDebitCard", new DebitCard("1234", "Ratnakar Kolhatkar"));
        paymentService.addPaymentMethod("RatnakarCreditCard", new CreditCard("5678", "Ratnakar Digvjay Kolhatkar"));
        paymentService.addPaymentMethod("RatnakarUPIpayment", new UnifiedPaymentUPI("rk-987"));
        paymentService.addPaymentMethod("RatnakarDigitalWallet", new DigitalWallet());

        paymentService.makePayment("RatnakarUPIpayment");
        paymentService.makePayment("RatnakarDebitCard");
        paymentService.makePayment("RatnakarCreditCard");
        paymentService.makePayment("RatnakarDigitalWallet");
    }
}
/*
=================================================================================
                             CLASS IN JAVA
=================================================================================

Definition:
-----------
A Class is a blueprint or template from which Objects are created.
It defines the properties (variables) and behaviours (methods) of an object.

In this project, the following are Java classes:

1. Card                 -> Abstract Class
2. CreditCard           -> Concrete Class
3. DebitCard            -> Concrete Class
4. DigitalWallet        -> Concrete Class
5. UnifiedPaymentUPI    -> Concrete Class
6. PaymentService       -> Concrete Class

Each class represents a different payment-related entity.

Example:

CreditCard creditCard = new CreditCard("1234567890", "Ratnakar");

Here,

CreditCard      -> Class
creditCard      -> Object
new             -> Creates the object
CreditCard()    -> Constructor

=================================================================================
*/
/*
=================================================================================
                             OBJECT IN JAVA
=================================================================================

Definition:
-----------
An Object is a real-world instance of a Class.

Objects occupy memory and are used to access the methods and variables
defined inside the class.

Examples from this project:

CreditCard creditCard =
        new CreditCard("1234567890123456","Ratnakar");

DebitCard debitCard =
        new DebitCard("9876543210123456","Rahul");

DigitalWallet wallet =
        new DigitalWallet();

UnifiedPaymentUPI upi =
        new UnifiedPaymentUPI("ratnakar@ybl");

PaymentService paymentService =
        new PaymentService();

Object Reference:

CreditCard creditCard

CreditCard  -> Data Type
creditCard  -> Reference Variable

new CreditCard(...) creates the actual object in Heap Memory.

=================================================================================
*/
/*
    Making Payment via CreditCard ...... Credit Card Number is : 1234567890123456
    Making Payment via DebitCard ...... Debit Card Number is : 9876543210123456
    Making payment via Digital Wallet .....
    Making Payment via UPI Transaction ......  UPI payment ID is : ratnakar@ybl
*/
/*
=================================================================================
                         OOP SUMMARY
=================================================================================

1. Class
---------
Card
CreditCard
DebitCard
DigitalWallet
UnifiedPaymentUPI
PaymentService

2. Object
----------
new CreditCard(...)
new DebitCard(...)
new DigitalWallet()
new UnifiedPaymentUPI(...)
new PaymentService()

3. Interface
-------------
PaymentMethod

4. Abstract Class
-----------------
Card

5. Inheritance
---------------
CreditCard extends Card
DebitCard extends Card

6. Method Overriding
---------------------
Every class overrides pay()

7. Runtime Polymorphism
------------------------
PaymentMethod paymentMethod = paymentMethods.get(name);

paymentMethod.pay();

The JVM decides at Runtime which implementation of pay() to invoke
based on the actual object.

8. Code Reusability
--------------------
Card provides common fields and methods that are reused by
CreditCard and DebitCard.

9. Loose Coupling
------------------
PaymentService depends only on the PaymentMethod interface,
not on specific payment implementations.

=================================================================================
*/