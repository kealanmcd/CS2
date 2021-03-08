package Outfit_generator.Shirts;
import Outfit_generator.*;

public class ButtonShirt extends Shirt
{
    public ButtonShirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle, initSleeveLength);
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
