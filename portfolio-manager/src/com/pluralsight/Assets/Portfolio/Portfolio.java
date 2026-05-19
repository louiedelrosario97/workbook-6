package com.pluralsight.Assets.Portfolio;

import com.pluralsight.Interface.IValuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio
{
    // Variables
    String name;
    String owner;

    // List of IValuable objects. The List is called 'assets'.
    List<IValuable> assets = new ArrayList<>();

    // Constructor
    public Portfolio(String name, String owner)
    {
        this.name = name;
        this.owner = owner;
    }

    // Methods
    public void add(IValuable asset) // This lets us add objects that implement IValuable to the 'assets' List.
    {
        assets.add(asset);
    }

    // Derived Getters
    public double getValue() // For each loop IValuable objects in
    {
        double totalValue = 0;
        for (IValuable asset : assets) // getValue() of 'assets' List
        {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public IValuable getMostValuable ()
    {
        for (IValuable asset: assets)
        {

        }
        return mostValuable;
    }

    public IValuable getLeastValuable()
    {
        for (IValuable asset: assets)
        {

        }
        return leastValuable;
    }

}

