public class Tshirt extends Shirt {
    Tshirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle, initSleeveLength);
    }

    public boolean isGoodWithDressShoes()
    {
        return false;
    }
}
