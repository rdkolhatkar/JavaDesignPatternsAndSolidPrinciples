package com.payment.service.demo;

abstract class Card implements PaymentMethod{
    protected String cardNumber;
    protected String userName;

    public Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

/*
=================================================================================
                        ABSTRACT CLASS
=================================================================================

Card is declared as an abstract class.

abstract class Card implements PaymentMethod

Meaning:

1. Card cannot be instantiated directly.

❌ Invalid

Card card = new Card(...);

2. It provides common properties shared by all card types.

protected String cardNumber;
protected String userName;

3. CreditCard and DebitCard inherit these common members instead of
duplicating them.

This avoids code duplication.

=================================================================================
*/
