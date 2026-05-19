package com.pluralsight.FixedAsset;

public class House extends FixedAsset
{
    // Variables
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // Constructor
    public House(int yearBuilt, int squareFeet, int bedrooms)
    {
        super("", 0.0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue()
    {

    }
}


