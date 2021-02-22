package Outfit_generator.Outerwears;
import Outfit_generator.*;

public class Wintercoat extends Outerwear
{
    public Wintercoat (String initColor, String initStyle, int initThermalRating)
    {
        // Wintercoat must have a thermalRating of at least 3 out of 5;
        super(initColor, initStyle, Math.max(3, initThermalRating));
    }

}
