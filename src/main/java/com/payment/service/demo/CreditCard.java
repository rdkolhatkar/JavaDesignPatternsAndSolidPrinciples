package com.payment.service.demo;

public class CreditCard extends Card{
    public CreditCard(String cardNumber, String userName) {
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via CreditCard ...... " + "Credit Card Number is : "+cardNumber);
    }
}
/*
=================================================================================
                           INHERITANCE
=================================================================================

Definition:
-----------
Inheritance allows one class to acquire the properties and methods
of another class.

Syntax:

class Child extends Parent

Used in this project:

                 PaymentMethod (Interface)
                          ▲
                          │
                    implements
                          │
                      Card (Abstract)
                    /               \
                   /                 \
          CreditCard           DebitCard

CreditCard and DebitCard inherit:

✔ cardNumber
✔ userName
✔ getters
✔ setters

from Card class.

Benefit:
--------
Code Reusability.

Instead of writing cardNumber and userName inside every card class,
they are written once in Card class.

=================================================================================
*/
/*
=================================================================================
                     CONSTRUCTOR CHAINING
=================================================================================

CreditCard Constructor

public CreditCard(String cardNumber, String userName){
    super(cardNumber,userName);
}

super()

calls the constructor of the parent class.

Execution Order:

new CreditCard(...)

↓

CreditCard Constructor

↓

super(...)

↓

Card Constructor

↓

Object Created

=================================================================================
*/
/*
=================================================================================
                       METHOD OVERRIDING
=================================================================================

Every payment class overrides pay().

Example:

CreditCard

@Override
public void pay(){
    ...
}

DebitCard

@Override
public void pay(){
    ...
}

DigitalWallet

@Override
public void pay(){
    ...
}

UnifiedPaymentUPI

@Override
public void pay(){
    ...
}

Each class provides its own implementation of pay().

This is Method Overriding.

Method Overriding is the foundation of Runtime Polymorphism.

=================================================================================
*/
