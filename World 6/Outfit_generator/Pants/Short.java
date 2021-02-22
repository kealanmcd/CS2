package Outfit_generator.Pants;
import Outfit_generator.*;

public class Short extends Pant 
{

    public Short (String initColor, String initStyle)
    {
        super(initColor, initStyle, "short");
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
        return false;
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

}
