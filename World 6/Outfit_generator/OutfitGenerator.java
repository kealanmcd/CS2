import java.util.ArrayList;
import java.util.Random;

public class OutfitGenerator {

    private  ArrayList<Shirt> shirts;
    private  ArrayList<Pant> pants;
    private  ArrayList<Outerwear> outerwears;
    private  ArrayList<Shoe> shoes;
    private  ArrayList<Accessory> accessories;

    private String season;

    OutfitGenerator()
    {
        shirts = new ArrayList<Shirt>();
        pants = new ArrayList<Pant>();
        outerwears = new ArrayList<Outerwear>();
        shoes = new ArrayList<Shoe>();
        accessories = new ArrayList<Accessory>();
    }

    // Use one method and use downcasting to access the correct subclass
    private Accessory getRandomAccessory()
    {
        Random rand = new Random();
        return accessories.get(rand.nextInt(accessories.size())); 
    }

    private Clothing getRandomClothing(ArrayList<? extends Clothing> items)
    {
        Random rand = new Random();
        return items.get(rand.nextInt(items.size())); 
    }

    private boolean isOutiftPlain(Shirt shirt, Pant pant, Shoe shoe)
    {
        return shirt.isPlain() && pant.isPlain() && shoe.isPlain();
    }

    private boolean isWinterCoatWithShorts(Outerwear outerwear, Pant pant)
    {
        return outerwear.getThermalRating() >= 3 && pant instanceof Short;
    }

    private boolean isBlueAndGreenPresent(Shirt shirt, Pant pant, Outerwear outerwear)
    {
        boolean greenPresent = (shirt.getColor() == "green" || pant.getColor() == "green" || outerwear.getColor() == "green" ) ? true : false; 
        boolean bluePresent = (shirt.getColor() == "blue" || pant.getColor() == "blue" || outerwear.getColor() == "blue" ) ? true : false;
        return greenPresent && bluePresent;
    }

    private boolean isJeanAndTieCombo(Pant pant, Accessory accessory)
    {
        return pant instanceof Jean && accessory instanceof Tie;
    }

    public void addShirt(Shirt shirt)
    {
        shirts.add(shirt);
    }

    public void addPant(Pant pant)
    {
        pants.add(pant);
    }

    public void addOuterwear(Outerwear outerwear)
    {
        outerwears.add(outerwear);
    }

    public void addShoe(Shoe shoe)
    {
        shoes.add(shoe);
    }

    public void addAccessory(Accessory accessory)
    {
        accessories.add(accessory);
    }



    public void randomOutfitCombo()
    {
        Clothing shirt = getRandomClothing(shirts);
        Clothing pant = getRandomClothing(pants);
        Clothing shoe = getRandomClothing(shoes);
        Clothing outerwear = getRandomClothing(outerwears);
        Accessory accessory = getRandomAccessory();
        
        boolean match = true;

        boolean plainOutfit = isOutiftPlain((Shirt)shirt, (Pant)pant, (Shoe)shoe);                              // The shirt, pants, and shoes should not all be plain
        boolean winterCoatWithShorts = isWinterCoatWithShorts((Outerwear)outerwear, (Pant)pant);                // A winter jacket shouldn’t be worn with shorts
        boolean blueAndGreenPresent = isBlueAndGreenPresent((Shirt)shirt, (Pant)pant, (Outerwear)outerwear);    // False if green and blue in ooutfit is found
        boolean jeanAndTieCombo = isJeanAndTieCombo((Pant)pant, accessory);
        
        if (plainOutfit || winterCoatWithShorts || blueAndGreenPresent || jeanAndTieCombo) 
        {
            match = false;
        }

        System.out.println(shirt);
        System.out.println(pant);
        System.out.println(shoe);
        System.out.println(outerwear);
        System.out.println(accessory);
        System.out.println(match);

    }



    // Keep calling this function until we get a matching outfit combination
    public boolean generateMatchingOutfitCombo()
    {
        Clothing shirt = getRandomClothing(shirts);
        Clothing pant = getRandomClothing(pants);
        Clothing shoe = getRandomClothing(shoes);
        Clothing outerwear = getRandomClothing(outerwears);
        Accessory accessory = getRandomAccessory();
        
        boolean match = true;

        boolean plainOutfit = isOutiftPlain((Shirt)shirt, (Pant)pant, (Shoe)shoe);                              // The shirt, pants, and shoes should not all be plain
        boolean winterCoatWithShorts = isWinterCoatWithShorts((Outerwear)outerwear, (Pant)pant);                // A winter jacket shouldn’t be worn with shorts
        boolean blueAndGreenPresent = isBlueAndGreenPresent((Shirt)shirt, (Pant)pant, (Outerwear)outerwear);    // False if green and blue in ooutfit is found
        boolean jeanAndTieCombo = isJeanAndTieCombo((Pant)pant, accessory);

        System.out.println(shirt);
        System.out.println(pant);
        System.out.println(shoe);
        System.out.println(outerwear);
        System.out.println(accessory);
        
        if (plainOutfit || winterCoatWithShorts || blueAndGreenPresent || jeanAndTieCombo) 
        {
            System.out.println("Not a match");
            System.out.println();
            return generateMatchingOutfitCombo();
        }
        System.out.println("Matching combonation");
        System.out.println();
        
        return false;

    }
    
}
