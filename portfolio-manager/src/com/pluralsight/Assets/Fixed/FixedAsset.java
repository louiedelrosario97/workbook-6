package com.pluralsight.Assets.Fixed;

import com.pluralsight.Interface.IValuable;

public abstract class FixedAsset implements IValuable
{
    // Variables
    String name;
    double marketValue;

    // Constructors
    public FixedAsset(String name, double value) {}

    // Getters
    public String getName() { return name; }
    public double getMarketValue() { return marketValue; }

    // IValuable-Implemented method
    @Override
    public double getValue() { return marketValue; }
}

