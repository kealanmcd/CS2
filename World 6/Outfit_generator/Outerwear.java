package Outfit_generator;
import Outfit_generator.Interfaces.ShoeMethods;

public abstract class Outerwear extends Clothing implements ShoeMethods
{
    private int thermalRating;

    public Outerwear (String initColor, String initStyle, int initThermalRating)
    {
        super(initColor, initStyle);
        thermalRating = initThermalRating;
    }

    public int getThermalRating()
    {
        return thermalRating;
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
