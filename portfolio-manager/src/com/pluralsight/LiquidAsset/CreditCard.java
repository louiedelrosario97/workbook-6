package com.pluralsight.LiquidAsset;

import com.pluralsight.Interface.IValuable;

public class CreditCard implements IValuable
{
    // Variables
    String creditorName;
    String cardNumber;
    double creditCardBalance;

    // Constructors
    public CreditCard(String name, String accountNumber, double creditCardBalance)
    {
        this.creditorName = name;
        this.cardNumber = accountNumber;
        this.creditCardBalance = creditCardBalance;
    }

    // Methods
    public charge(double amount){}
    public pay(double amount) {}

    // Implemented methods
    public double getValue()
    {

    }
}

