package Outfit_generator;

import Outfit_generator.Interfaces.*;

public abstract class Shirt extends Clothing implements ShoeMethods, AccessoryMethods
{
    private String sleeveLength;

    public Shirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle);
        sleeveLength = initSleeveLength.toLowerCase();
    }
    
    public String getSleeveLength()
    {
        return sleeveLength;
    }

    // AccessoryMethods Interface
    public boolean isGoodWithEarrings()
    {
        return true;
    }

    public boolean isGoodWithTie()
    {
        return true;
    }

    public boolean isGoodWithWatch()
    {
        return true;
    }

    public boolean isGoodWithRing()
    {
        return true;
    }

    // Shoe Matching Methods
    public boolean isGoodWithDressShoes()
    {
        return true;
    }

    public boolean isGoodWithBoots()
    {
        return true;
    }

    public boolean isGoodWithRunningShoes()
    {
        return true;
    }

    public boolean isGoodWithTrainers()
    {
        return true;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": Is " + getColor() + ", is " + getStyle() + " and is " + getSleeveLength() + "-sleeved.";
    }

}
