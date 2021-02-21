public class WinterCoat extends Outerwear
{
    WinterCoat (String initColor, String initStyle, int initThermalRating)
    {
        // Wintercoat must have a thermalRating of at least 3 out of 5;
        super(initColor, initStyle, Math.max(3, initThermalRating));
    }
}
