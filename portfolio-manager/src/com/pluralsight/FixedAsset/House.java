package com.pluralsight.FixedAsset;

public class House extends FixedAsset
{
    // Variables
    private final int yearBuilt;
    protected int squareFeet;
    protected int bedrooms;

    // Constructor
    public House(int yearBuilt, int squareFeet, int bedrooms)
    {
        super("", 0.0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Getters
    public int getYearBuilt() { return yearBuilt; }
    public int getSquareFeet() { return squareFeet; }
    public int getBedrooms() { return bedrooms; }

    // FixedAsset-Inherited methods
    @Override
    public double getValue()
    {
        return squareFeet * 2000;
    }
}


