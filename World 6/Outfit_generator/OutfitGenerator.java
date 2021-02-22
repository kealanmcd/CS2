package Outfit_generator;
import Outfit_generator.Accessories.*;
import Outfit_generator.Pants.*;
import Outfit_generator.Pants.Short;

import java.util.ArrayList;
import java.util.Random;

public class OutfitGenerator {

    private  ArrayList<Shirt> shirts;
    private  ArrayList<Pant> pants;
    private  ArrayList<Outerwear> outerwears;
    private  ArrayList<Shoe> shoes;
    private  ArrayList<Accessory> accessories;

    OutfitGenerator()
    {
        shirts = new ArrayList<Shirt>();
        pants = new ArrayList<Pant>();
        outerwears = new ArrayList<Outerwear>();
        shoes = new ArrayList<Shoe>();
        accessories = new ArrayList<Accessory>();
    }

    public void addAccessory(Accessory accessory)
    {
        accessories.add(accessory);
    }

    public void addItem(Shirt shirt)
    {
        shirts.add(shirt);
    }

    public void addItem(Pant pant)
    {
        pants.add(pant);
    }

    public void addItem(Outerwear outerwear)
    {
        outerwears.add(outerwear);
    }

    public void addItem(Shoe shoe)
    {
        shoes.add(shoe);
    }


    // Use one method and use downcasting to access the correct subclass
    private void printOutiftCombination(Clothing shirt, Clothing pant, Clothing outerwear, Clothing shoe, Accessory accessory)
    {
        System.out.println("Outfit combination:\n" + shirt + "\n" + pant + "\n" + shoe + "\n" + outerwear + "\n" + accessory);
    }

    // Grabs a random accessory from the "accessories" list
    private Accessory getRandomAccessory()
    {
        Random rand = new Random();
        return accessories.get(rand.nextInt(accessories.size())); 
    }

    // Grabs random piece of clothing from the passed in list ("shirts", "pants", "outerwears" or "shoes")
    private Clothing getRandomClothing(ArrayList<? extends Clothing> items)
    {
        Random rand = new Random();
        return items.get(rand.nextInt(items.size())); 
    }

    // Return true if the shirt, pant and shoe are all plain
    private boolean isOutiftPlain(Shirt shirt, Pant pant, Shoe shoe)
    {
        return shirt.isPlain() && pant.isPlain() && shoe.isPlain();
    }

    // Return true if the outerwear thermal rating is at least 3 (out of 5) and the pant is a Short
    private boolean isWinterCoatWithShorts(Outerwear outerwear, Pant pant)
    {
        return outerwear.getThermalRating() >= 3 && pant instanceof Short;
    }

    // Rturn true if Blue and Green is present in the outfit
    private boolean isBlueAndGreenPresent(Shirt shirt, Pant pant, Outerwear outerwear)
    {
        boolean greenPresent = (shirt.getColor() == "green" || pant.getColor() == "green" || outerwear.getColor() == "green" ) ? true : false; 
        boolean bluePresent = (shirt.getColor() == "blue" || pant.getColor() == "blue" || outerwear.getColor() == "blue" ) ? true : false;
        return greenPresent && bluePresent;
    }

    // Return true if the pant is a Jean and the accessory is a Tie
    private boolean isJeanAndTieCombo(Pant pant, Accessory accessory)
    {
        return pant instanceof Jean && accessory instanceof Tie;
    }

    // Depending on the accessory subclass passed in, check if all the Clothing items match it
    private boolean matchesAccessory(Shirt shirt, Pant pant, Outerwear outerwear, Accessory accessory)
    {
        String accessoryType = accessory.getClass().getSimpleName();
        boolean match = true;
        switch(accessoryType) {
            case "Earring":
                match = shirt.isGoodWithEarrings() && pant.isGoodWithEarrings() && outerwear.isGoodWithEarrings();
                break;
            case "Ring": 
                match = shirt.isGoodWithRing() && pant.isGoodWithRing() && outerwear.isGoodWithRing();
                break;
            case "Tie": 
                match = shirt.isGoodWithTie() && pant.isGoodWithTie() && outerwear.isGoodWithTie();
                break;
            case "Watch":
                match = shirt.isGoodWithWatch() && pant.isGoodWithWatch() && outerwear.isGoodWithWatch();
                break;
            default:
                match = true;
                break;
        }
        return match;
    }

    // Check if the chosen shoes match the Clothing chosen
    private boolean matchesShoes(Shirt shirt, Pant pant, Outerwear outerwear, Shoe shoe)
    {
        
        String shoeType = shoe.getClass().getSimpleName();
        boolean match = true;
        switch(shoeType) {
            case "Boot":
                match = shirt.isGoodWithBoots() && pant.isGoodWithBoots() && outerwear.isGoodWithBoots();
                break;
            case "DressShoe": 
                match = shirt.isGoodWithDressShoes() && pant.isGoodWithDressShoes() && outerwear.isGoodWithDressShoes();
                break;
            case "RunningShoe": 
                match = shirt.isGoodWithRunningShoes() && pant.isGoodWithRunningShoes() && outerwear.isGoodWithRunningShoes();
                break;
            case "Trainer":
                match = shirt.isGoodWithTrainers() && pant.isGoodWithTrainers() && outerwear.isGoodWithTrainers();
                break;
            default:
                match = true;
                break;
        }
        return match;
    }

    // This is the master method to be used to check if the chosen items of clothing are a match
    private boolean isGoodOutfit(Shirt shirt, Pant pant, Outerwear outerwear, Accessory accessory, Shoe shoe)
    {
        boolean plainOutfit = isOutiftPlain(shirt, pant, shoe);                         // The shirt, pants, and shoes should not all be plain
        boolean winterCoatWithShorts = isWinterCoatWithShorts(outerwear, pant);         // A winter jacket (outerwear with a thermal rating of at least 3) shouldn’t be worn with shorts
        boolean blueAndGreenPresent = isBlueAndGreenPresent(shirt, pant, outerwear);    // Is green and blue present in the outfit
        boolean jeanAndTieCombo = isJeanAndTieCombo(pant, accessory);                   // Are the pants Jeans and the accessory a tie
        boolean matchesAccessory = matchesAccessory(shirt, pant, outerwear, accessory); // Does the selected accessory match the clothing
        boolean matchesShoes = matchesShoes(shirt, pant, outerwear, shoe);              // Do the selected shoes match the clothing

        return (plainOutfit || winterCoatWithShorts || blueAndGreenPresent || jeanAndTieCombo || !matchesAccessory || !matchesShoes) ? false : true;
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
