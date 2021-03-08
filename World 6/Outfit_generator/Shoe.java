package Outfit_generator;

public abstract class Shoe extends Clothing
{
    String type;

    public Shoe (String initColor, String initStyle)
    {
        super(initColor, initStyle);
        type = getClass().getSimpleName().toLowerCase();
    }
    
    // Used to store shoe sub-types so we can compare pants with Trainers/Boots etc.
    public String getShoeType()
    {
        return type;
    }
}
