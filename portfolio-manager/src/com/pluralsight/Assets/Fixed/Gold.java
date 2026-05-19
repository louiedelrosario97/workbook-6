package com.pluralsight.Assets.Fixed;

public class Gold extends FixedAsset
{
    // Variables
    protected double weight;

    // Constructor
    public Gold(String name, double weight)
    {
        super (name, 0.0);
        this.weight = weight;
    }

    @Override
    public double getValue()
    {
        return weight * 200;
    }
}

