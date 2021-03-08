package Outfit_generator.Pants;
import Outfit_generator.*;

public class Slack extends Pant 
{
    public Slack (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
    }

    // Accessory Methods
    public boolean isGoodWithEarrings()
    {
        return false;
    }

    // Shoe methods
    public boolean isGoodWithBoots()
    {
        return false;
    }

    public boolean isGoodWithRunningShoes()
    {
        return false;
    }
    
    public boolean isGoodWithTrainers()
    {
        return false;
    }
  
}
