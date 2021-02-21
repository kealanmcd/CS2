public class Sweater extends Shirt
{
    Sweater (String initColor, String initStyle)
    {
        super(initColor, initStyle, "long");
    }

    public boolean isGoodWithDressShoes()
    {
        return true;
    }
  
}
