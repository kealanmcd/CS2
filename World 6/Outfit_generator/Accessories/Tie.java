package Outfit_generator.Accessories;
import Outfit_generator.*;

public class Tie extends Accessory
{
    public Tie (String initColor)
    {
        super(initColor, "fancy");
    }


    isGoodWithJeans()
    {
        return false;
    }

    isGoodWithShorts()
    {
        return false;
    }
}
