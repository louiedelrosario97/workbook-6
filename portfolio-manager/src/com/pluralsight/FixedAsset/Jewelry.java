package com.pluralsight.FixedAsset;

public class Jewelry extends FixedAsset
{
   // Variables
   double karat;

   // Constructor [ FixedAsset(String name, double value) ]
   public Jewelry(double karat)
   {
      super("", 0.0);
      this.karat = karat;
   }

   @Override
   public double getValue() { }
}

