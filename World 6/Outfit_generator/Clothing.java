package Outfit_generator;
import Outfit_generator.Interfaces.*;

import java.util.Arrays;

public abstract class Clothing implements ClothingMatches
{
  
    private String color;
    private String style;
    private final String[] colorsArray = new String[] { "yellow", "green", "red", "blue" };

    Clothing (String initColor, String initStyle)
    {
        color = initColor.toLowerCase();
        style = initStyle.toLowerCase();
    }

    // Getters
    public String getColor()
    {
        return color;
    }

    public String getStyle()
    {
        
        return style;
    }

    // ClothingMatches Interface methods
    public boolean isFancy()
    {
        return style == "fancy";
    }

    public boolean isCasual()
    {
        return style == "casual";
    }

    public boolean isPlain()
    {
        return !(Arrays.asList(colorsArray)).contains(color);
    }

    public boolean isColorful()
    {
        return (Arrays.asList(colorsArray)).contains(color);
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": Is " + getColor() + " in color and is " + getStyle() + ".";
    }
}