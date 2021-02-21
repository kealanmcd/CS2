import java.util.Arrays;

public abstract class Clothing implements ClothingMatches 
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

    public boolean isGoodWithEarrings()
    {
        return true;
    }

    public boolean isColorful()
    {
        String[] colors = new String[] {"yellow", "green", "red", "blue" };
        return (Arrays.asList(colors)).contains(color);
    }

    public boolean isGoodWithDressShoes()
    {
        return true;
    }
    
    public String toString()
    {
        return this.getClass().getSimpleName() + ": Is " + color + " in color and is " + style + ".";
    }
}