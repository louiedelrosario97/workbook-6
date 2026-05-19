package com.pluralsight.LiquidAsset;

import com.pluralsight.Interface.IValuable;

public class CreditCard implements IValuable
{
    // Variables
    String name;
    String accountNumber;
    double balance;

    // Constructors
    public CreditCard(String name, String accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public charge(double amount){}
    public pay(double amount) {}

    // Implemented methods
    public double getValue()
    {

    }
}

