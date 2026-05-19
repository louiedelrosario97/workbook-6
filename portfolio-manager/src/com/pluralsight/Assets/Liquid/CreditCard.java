package com.pluralsight.Assets.Liquid;

import com.pluralsight.Interface.IValuable;

public class CreditCard implements IValuable
{
    // Variables
    String creditorName;
    String cardNumber;
    double creditCardBalance;

    // Constructors
    public CreditCard(String creditorName, String cardNumber, double creditCardBalance)
    {
        this.creditorName = creditorName;
        this.cardNumber = cardNumber;
        this.creditCardBalance = creditCardBalance;
    }

    // Methods
    public double charge(double chargeAmount)
    {
        creditCardBalance -= chargeAmount;
        return creditCardBalance;
    }

    public double pay(double payAmount) // The pay amount needs to come out of BankAccount (optional logic, do later)
    {
        creditCardBalance += payAmount;
        return creditCardBalance;
    }

    // IValuable-Implemented methods
    public double getValue()
    {
        return creditCardBalance;
    }
}

