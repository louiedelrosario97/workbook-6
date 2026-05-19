package com.pluralsight.LiquidAsset;

import com.pluralsight.Interface.IValuable;

public class BankAccount implements IValuable
{
    // Variables
    String name;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public void deposit(double amount)
    {

    }
    public void withdraw(double amount)
    {

    }

    // Implemented methods
    public double getValue()
    {

    }
}

