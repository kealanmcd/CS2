package Outfit_generator;
import java.util.ArrayList;
import java.util.Random;

public class OutfitGenerator {

    private  ArrayList<Shirt> shirts;
    private  ArrayList<Pant> pants;
    private  ArrayList<Outerwear> outerwears;
    private  ArrayList<Shoe> shoes;
    private  ArrayList<Accessory> accessories;

    private Random rand;

    OutfitGenerator()
    {
        shirts = new ArrayList<Shirt>();
        pants = new ArrayList<Pant>();
        outerwears = new ArrayList<Outerwear>();
        shoes = new ArrayList<Shoe>();
        accessories = new ArrayList<Accessory>();
        rand = new Random();
    }

    public void addAccessory(ArrayList<Accessory> accessory)
    {
        accessories.addAll(accessory);
    }

    public void addShirts(ArrayList<Shirt> shirt)
    {
        shirts.addAll(shirt);
    }

    public void addPants(ArrayList<Pant> pant)
    {
        pants.addAll(pant);
    }

    public void addOuterwear(ArrayList<Outerwear> outerwear)
    {
        outerwears.addAll(outerwear);
    }

    public void addShoes(ArrayList<Shoe> shoe)
    {
        shoes.addAll(shoe);
    }


    // Print out the current clothing and accessory combination to be checked by the application
    private void printOutiftCombination(Clothing shirt, Clothing pant, Clothing outerwear, Clothing shoe, Accessory accessory)
    {
        System.out.println("Outfit combination:\n" + shirt + "\n" + pant + "\n" + shoe + "\n" + outerwear + "\n" + accessory + "\n");
    }


    // Grabs a random accessory from the "accessories" list
    private Accessory getRandomAccessory()
    {
        return accessories.get(rand.nextInt(accessories.size())); 
    }


    // Grabs random piece of clothing from the passed in list ("shirts", "pants", "outerwears" or "shoes")
    private Clothing getRandomClothing(ArrayList<? extends Clothing> items)
    {
        return items.get(rand.nextInt(items.size())); 
    }


    // Return true if the shirt, pant and shoe are all plain
    private boolean isOutiftPlain(Shirt shirt, Pant pant, Shoe shoe)
    {
        boolean match = shirt.isPlain() && pant.isPlain() && shoe.isPlain();
        if (match) { System.out.println("Sorry your outfit is too plain. Try adding some brighter colours"); }

        return match;
    }


    // Return true if the outerwear thermal rating is at least 3 (out of 5) and the pant is a Short
    private boolean isWinterCoatWithShorts(Outerwear outerwear, Pant pant)
    {
        boolean match = outerwear.getThermalRating() >= 3 && pant.getLegLength() == "short";
        if (match) { System.out.println("Sorry shorts can't be paired with heavy outerwear"); }

        return match;
    }


    // Return true if Blue and Green is present in the outfit
    private boolean isBlueAndGreenPresent(Shirt shirt, Pant pant, Outerwear outerwear)
    {
        boolean greenPresent = (shirt.getColor() == "green" || pant.getColor() == "green" || outerwear.getColor() == "green" ) ? true : false; 
        boolean bluePresent = (shirt.getColor() == "blue" || pant.getColor() == "blue" || outerwear.getColor() == "blue" ) ? true : false;
        boolean match = greenPresent && bluePresent;

        if (match) { System.out.println("Blue and Green must never be worn together, try picking a different outfit"); }

        return match;
    }

    // Depending on the accessory subclass passed in, check if all the Clothing items match it
    private boolean matchesAccessory(Shirt shirt, Pant pant, Accessory accessory)
    {
        String accessoryType = accessory.getAccessoryType();
        boolean match = true;

        // Some accessories don't go with certain items of clothing
        switch (accessoryType) {
            case "earring":
                match = shirt.isGoodWithEarrings() && pant.isGoodWithEarrings();
                break;
            case "ring": 
                match = shirt.isGoodWithRing() && pant.isGoodWithRing();
                break;
            case "tie": 
                match = shirt.isGoodWithTie() && pant.isGoodWithTie();
                break;
            case "watch":
                match = shirt.isGoodWithWatch() && pant.isGoodWithWatch();
                break;
        }

        if (!match) { System.out.println("Your " + accessoryType + " doesn't go with your outfit"); }

        return match;
    }


    // Check if the chosen shoes match the Clothing chosen
    private boolean matchesShoes(Shirt shirt, Pant pant, Outerwear outerwear, Shoe shoe)
    {
        
        String shoeType = shoe.getShoeType();
        boolean match = true;
        switch(shoeType) {
            case "boot":
                match = shirt.isGoodWithBoots() && pant.isGoodWithBoots();
                break;
            case "dressshoe": 
                match = shirt.isGoodWithDressShoes() && pant.isGoodWithDressShoes();
                break;
            case "runningshoe": 
                match = shirt.isGoodWithRunningShoes() && pant.isGoodWithRunningShoes();
                break;
            case "trainer":
                match = shirt.isGoodWithTrainers() && pant.isGoodWithTrainers();
                break;
        }

        if (!match) { System.out.println("Your " + shoeType + " doesn't go with your outfit"); }

        return match;
    }


    // This is the master method to be used to check if the chosen items of clothing are a match
    private boolean isGoodOutfit(Shirt shirt, Pant pant, Outerwear outerwear, Accessory accessory, Shoe shoe)
    {
        boolean plainOutfit = isOutiftPlain(shirt, pant, shoe);                         // The shirt, pants, and shoes should not all be plain
        boolean winterCoatWithShorts = isWinterCoatWithShorts(outerwear, pant);         // A winter jacket (outerwear with a thermal rating of at least 3) shouldn’t be worn with shorts
        boolean blueAndGreenPresent = isBlueAndGreenPresent(shirt, pant, outerwear);    // Is green and blue present in the outfit
        boolean matchesAccessory = matchesAccessory(shirt, pant, accessory);            // Does the selected accessory match the clothing
        boolean matchesShoes = matchesShoes(shirt, pant, outerwear, shoe);              // Do the selected shoes match the clothing

        return (plainOutfit || winterCoatWithShorts || blueAndGreenPresent || !matchesAccessory || !matchesShoes) ? false : true;
    }


    public void randomOutfitCombo()
    {
        Clothing shirt = getRandomClothing(shirts);
        Clothing pant = getRandomClothing(pants);
        Clothing shoe = getRandomClothing(shoes);
        Clothing outerwear = getRandomClothing(outerwears);
        Accessory accessory = getRandomAccessory();

        printOutiftCombination(shirt, pant, outerwear, shoe, accessory);

        boolean match = isGoodOutfit((Shirt)shirt, (Pant)pant, (Outerwear)outerwear, accessory, (Shoe)shoe);
        System.out.println("Outfit is a match: " + match + "\n");

    }


    // Keep calling this function until we get a matching outfit combination
    public boolean generateMatchingOutfitCombo()
    {
        Clothing shirt = getRandomClothing(shirts);
        Clothing pant = getRandomClothing(pants);
        Clothing shoe = getRandomClothing(shoes);
        Clothing outerwear = getRandomClothing(outerwears);
        Accessory accessory = getRandomAccessory();

        printOutiftCombination(shirt, pant, outerwear, shoe, accessory);

        
        boolean match = isGoodOutfit((Shirt)shirt, (Pant)pant, (Outerwear)outerwear, accessory, (Shoe)shoe);        
        if (!match) 
        {
            System.out.println("Not a match\n");
            return generateMatchingOutfitCombo();
        }

        System.out.println("Outfit is a match\n");
        
        return true;

    }
    
}
