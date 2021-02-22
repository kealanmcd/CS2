package Outfit_generator.Shirts;
import Outfit_generator.*;

public class Sweater extends Shirt
{
    public Sweater (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
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
    public boolean isGoodWithRunningShoes()
    {
        return false;
    }

}