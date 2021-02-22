package Outfit_generator;
import Outfit_generator.Interfaces.ShoeMethods;

public abstract class Shirt extends Clothing implements ShoeMethods
{
    private String sleeveLength;

    public Shirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle);
        sleeveLength = initSleeveLength.toLowerCase();
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
