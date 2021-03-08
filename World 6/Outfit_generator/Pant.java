package Outfit_generator;
import Outfit_generator.Interfaces.*;

public abstract class Pant extends Clothing implements ShoeMethods, AccessoryMethods
{
    private String legLength;

    public Pant (String initColor, String initStyle, String initLegLength)
    {
        super(initColor, initStyle);
        legLength = initLegLength;
    }

    public String getLegLength()
    {
        return legLength;
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
}
