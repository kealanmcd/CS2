package Outfit_generator.Outerwears;
import Outfit_generator.*;

public class Raincoat extends Outerwear
{
    public Raincoat (String initColor, String initStyle, int initThermalRating)
    {
        super(initColor, initStyle, initThermalRating);
    }

    // Shoe Matching Methods
    public boolean isGoodWithDressShoes()
    {
        return false;
    }
}
