public abstract class Accessory {
    String color;

    Accessory(String initColor)
    {
        color = initColor;
    }

    // Getters
    public boolean isGoodWithShirt()
    {
        return false;
    }

    public boolean isGoodWithPants()
    {
        return false;
    }

    public boolean isGoodWithJeans()
    {
        return false;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() + ": Color " + color;
    }
}
