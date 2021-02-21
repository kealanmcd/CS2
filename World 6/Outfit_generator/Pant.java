public abstract class Pant extends Clothing 
{
    private String legLength;
    private boolean matchesDressShoes;

    Pant (String initColor, String initStyle, String initLegLength)
    {
        super(initColor, initStyle);
        legLength = initLegLength;
        //matchesDressShoes = true;
    }
}
