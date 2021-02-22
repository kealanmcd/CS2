package Outfit_generator.Shirts;
import Outfit_generator.*;

public class TurtleNeck extends Shirt
{
    public TurtleNeck (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
    }

    // New methods - Accessories
    public boolean isGoodWithTie()
    {
        return false;
    }
    
    // Shoe methods
    public boolean isGoodWithRunningShoes()
    {
        return false;
    }
    public boolean isGoodWithTrainers()
    {
        return false;
    }
}
