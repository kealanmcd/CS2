package Outfit_generator.Shirts;
import Outfit_generator.*;

public class ButtonShirt extends Shirt
{
    public ButtonShirt (String initColor, String initOccasion)
    {
        super(initColor, initOccasion, "long");
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
