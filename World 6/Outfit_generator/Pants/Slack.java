package Outfit_generator;

package Outfit_generator.Pants;
import Outfit_generator.*;

public class Slack extends Pant
{
    public Slack (String initColor, String initOccasion)
    {
        super(initColor, "Long");
        //legLength = initLegLength;
        //matchesDressShoes = true;
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
