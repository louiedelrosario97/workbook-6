package com.pluralsight.FixedAsset;

import com.pluralsight.Interface.IValuable;

public abstract class FixedAsset implements IValuable
{
    // Variables
    String name;
    double marketValue;

    // Constructors
    public FixedAsset(String name, double value) {}

    // Implemented method
    @Override
    public double getValue() { return marketValue; }
}

