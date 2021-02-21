public abstract class Shirt extends Clothing
{
    private String sleeveLength;

    Shirt (String initColor, String initStyle, String initSleeveLength)
    {
        super(initColor, initStyle);
        sleeveLength = initSleeveLength.toLowerCase();
    }
  
}
