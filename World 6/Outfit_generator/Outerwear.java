public abstract class Outerwear extends Clothing
{
    private boolean waterproof;
    private int thermalRating;

    Outerwear (String initColor, String initStyle, int initThermalRating)
    {
        super(initColor, initStyle);
        thermalRating = initThermalRating;
    }

    public int getThermalRating()
    {
        return thermalRating;
    }
}
