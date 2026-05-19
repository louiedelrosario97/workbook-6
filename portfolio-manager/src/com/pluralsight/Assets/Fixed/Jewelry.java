package com.pluralsight.Assets.Fixed;

public class Jewelry extends FixedAsset
{
   // Variables
   private final double karat;

   // Constructor [ FixedAsset(String name, double value) ]
   public Jewelry(double karat)
   {
      super("", 0.0);
      this.karat = karat;
   }

   // Getters
   public double getKarat() { return karat; }

   // FixedAsset-Inherited methods
   @Override
   public double getValue()
   {
      return getKarat() * 100;
   }
}

