package com.pluralsight.main;

import com.pluralsight.Interface.IValuable;
import com.pluralsight.Assets.Liquid.BankAccount;

public class FinanceApplication
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("Justin", 123, 30000);
        IValuable account2 = new BankAccount("Shelby", 321, 20000);

        account1.deposit(100);
        account2.deposit(100);

        // Did the deposit work for both accounts? Why or why not?
        // The deposit worked for only account1. deposit() only exists in the BankAccount class.

        // What methods are available for account1?
        // deposit(), withdraw(), and getValue()

        // What methods are available for account2?
        // only getValue()

        // Why?
        // Because account2 is an instance of the IValuable class. IValuable does not implement nor inherit methods from BankAccount.

    }
}

