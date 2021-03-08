package Outfit_generator;
import java.util.Arrays;
import Outfit_generator.Interfaces.ClothingMatches;

public abstract class Accessory implements ClothingMatches {
    String color;
    String type;
    private final String[] colorsArray = new String[] { "yellow", "green", "red", "blue" };

    public Accessory(String initColor, String initStyle)
    {
        color = initColor.toLowerCase();
        type = getClass().getSimpleName().toLowerCase(); // Needed to check if Pants matches Tie etc.
    }

    // Getters
    public String getColor()
    {
        return color;
    }

    public String getAccessoryType()
    {
        return type;
    }

    public boolean isPlain()
    {
        return !(Arrays.asList(colorsArray)).contains(color);
    }

    public boolean isColorful()
    {
        return (Arrays.asList(colorsArray)).contains(color);
    }

    public boolean isFancy()
    {
        return style == "fancy";
    }

    public boolean isCasual()
    {
        return style == "casual";
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": Color " + getColor();
    }
}
