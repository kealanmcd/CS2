package Outfit_generator.Pants;
import Outfit_generator.*;

public class Jean extends Pant 
{
    public Jean (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
    }

    // Accessory Methods
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
