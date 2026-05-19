package com.pluralsight.LiquidAsset;

import com.pluralsight.Interface.IValuable;

public class BankAccount implements IValuable
{
    // Variables
    String name;
    int accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, int accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public double deposit(double amount)
    {
        balance += amount;
        return balance;
    }
    public double withdraw(double amount)
    {
        balance -= amount;
        return balance;
    }

    // Implemented methods
    public double getValue()
    {
        return balance;
    }
}

