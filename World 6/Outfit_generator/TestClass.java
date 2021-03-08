package Outfit_generator;
import Outfit_generator.Shirts.*;
import Outfit_generator.Accessories.*;
import Outfit_generator.Pants.*;
import Outfit_generator.Pants.Short;
import Outfit_generator.Shoes.*;
import Outfit_generator.Outerwears.*;
import java.util.ArrayList;


public class TestClass {

    public static void main(String[] args) 
    {
        OutfitGenerator outfitGenerator = new OutfitGenerator();

        ArrayList<Shirt> shirtsArray = new ArrayList<Shirt>() {
            {
                add(new Tshirt("red", "fancy", "long"));
                add(new Tshirt("blue", "plain", "long"));
                add(new ButtonShirt("white", "plain", "long"));
                add(new Sweater("charcoal", "plain"));
            }
        };

        ArrayList<Pant> pantsArray = new ArrayList<Pant>() {
            {
                add(new Jean("blue", "plain"));
                add(new Jean("black", "fancy"));
                add(new Khaki("tan", "casual"));
                add(new Short("grey", "casual"));
            }
        };

        ArrayList<Outerwear> outerwearsArray = new ArrayList<Outerwear>() {
            {
                add(new Wintercoat("Black", "casual", 5));
                add(new Raincoat("Blue", "casual", 2));
            }
        };

        ArrayList<Shoe> shoesArray = new ArrayList<Shoe>() {
            {
                add(new DressShoe("black"));
            }
        };

        ArrayList<Accessory> accessoriesArray = new ArrayList<Accessory>() {
            {
                add(new Ring("silver"));
                add(new Earring("gold"));
                add(new Watch("brown"));
            }
        };

        outfitGenerator.addShirts(shirtsArray);
        outfitGenerator.addPants(pantsArray);
        outfitGenerator.addOuterwear(outerwearsArray);
        outfitGenerator.addShoes(shoesArray);
        outfitGenerator.addAccessory(accessoriesArray);

        
        // Add all items in array to their respective lists

        for (int i = 0; i < 6; i++) {
            outfitGenerator.randomOutfitCombo(); 
            System.out.println();
        }


        outfitGenerator.generateMatchingOutfitCombo();
        outfitGenerator.generateMatchingOutfitCombo();
        outfitGenerator.generateMatchingOutfitCombo();

    }
}
