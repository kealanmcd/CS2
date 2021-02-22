package Outfit_generator;
import Outfit_generator.Interfaces.ShoeMethods;

public abstract class Pant extends Clothing implements ShoeMethods
{
    private String legLength;
    private boolean matchesDressShoes;

    public Pant (String initColor, String initStyle, String initLegLength)
    {
        super(initColor, initStyle);
        legLength = initLegLength;
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
