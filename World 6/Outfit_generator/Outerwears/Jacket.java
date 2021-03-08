package Outfit_generator.Outerwears;
import Outfit_generator.*;

public class Jacket extends Outerwear
{
    public Jacket (String initColor, String initStyle, int initThermalRating)
    {
        super(initColor, initStyle, initThermalRating);
    }
    
    // Shoe Matching Methods
    public boolean isGoodWithDressShoes()
    {
        return false;
    }
}
