package Outfit_generator;
import Outfit_generator.Interfaces.*;

import java.util.Arrays;

public abstract class Clothing implements ClothingMatches, AccessoryMethods
{
  
    private String color;
    private String style;  // [All, Formal, Casual]

    Clothing (String initColor, String initStyle)
    {
        color = initColor.toLowerCase();
        style = initStyle.toLowerCase();
    }

    // Setters used in subclasses
    //private set

    // Getters
    public String getColor()
    {
        return color;
    }

    public String getStyle()
    {
        return style;
    }

    // Methods Interface Clothing
    public boolean isPlain()
    {
        return style == "plain";
    }

    public boolean isFancy()
    {
        return style == "fancy";
    }

    public boolean isCasual()
    {
        return style == "casual";
    }

    public boolean isColorful()
    {
        String[] colors = new String[] {"yellow", "green", "red", "blue" };
        return (Arrays.asList(colors)).contains(color);
    }

    // New methods - Accessories
    public boolean isGoodWithEarrings()
    {
        return true;
    }

    public boolean isGoodWithTie()
    {
        return true;
    }

    public boolean isGoodWithWatch()
    {
        return true;
    }

    public boolean isGoodWithRing()
    {
        return true;
    }

    // New methods - Shoes specific
    public boolean isGoodWithRunningShoes()
    {
        return true;
    }

    public boolean isGoodWithBoots()
    {
        return true;
    }

    public boolean isGoodWithTrainer()
    {
        return true;
    }
    
    public String toString()
    {
        return this.getClass().getSimpleName() + ": Is " + color + " in color and is " + style + ".";
    }
}