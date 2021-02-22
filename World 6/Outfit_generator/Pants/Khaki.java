package Outfit_generator.Pants;
import Outfit_generator.*;

public class Khaki extends Pant
{
    public Khaki (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
        //legLength = initLegLength;
        //matchesDressShoes = true;
    }

    // Accessory Methods
    public boolean isGoodWithEarrings()
    {
        return false;
    }

    public boolean isGoodWithTie()
    {
        return true;
    }

    // Shoe methods
    public boolean isGoodWithDressShoes()
    {
        return false;
    }

    public boolean isGoodWithBoots()
    {
        return false;
    }
    public boolean isGoodWithRunningShoes()
    {
        return false;
    }    

}

