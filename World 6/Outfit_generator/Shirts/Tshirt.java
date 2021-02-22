package Outfit_generator.Shirts;
import Outfit_generator.*;

public class Tshirt extends Shirt 
{
    public Tshirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle, initSleeveLength);
    }

    public boolean isGoodWithDressShoes()
    {
        return false;
    }

    // New methods - Accessories
    public boolean isGoodWithEarrings()
    {
        return false;
    }

    public boolean isGoodWithTie()
    {
        return false;
    }

    // Shoe methods
    public boolean isGoodWithDressShoes()
    {
        return false;
    }

}