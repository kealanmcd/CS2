package Outfit_generator;

import Outfit_generator.Shirts.*;
import Outfit_generator.Accessories.*;
import Outfit_generator.Pants.*;
import Outfit_generator.Pants.Short;
import Outfit_generator.Shoes.*;
import Outfit_generator.Outerwears.*;



public class TestClass {

    public static void main(String[] args) 
    {
        OutfitGenerator outfitGenerator = new OutfitGenerator();

        Tshirt plainRed = new Tshirt("red", "fancy", "long");
        Tshirt plainBlue = new Tshirt("blue", "plain", "long");

        ButtonShirt buttonShirt = new ButtonShirt("white", "plain");
        Sweater sweater = new Sweater("charcoal", "plain");
        TurtleNeck turtleNeck = new TurtleNeck("yellow", "plain");

        Jean pantBlue = new Jean("blue", "plain");
        Jean pantBlack = new Jean("black", "fancy");
        Khaki tanKhaki = new Khaki("tan", "casual");
        Short shortsGrey = new Short("grey", "casual");
        
        Wintercoat coat = new Wintercoat("Black", "casual", 5);
        Raincoat rainCoat = new Raincoat("Blue", "casual", 2);
        
        DressShoe dressShoe = new DressShoe("black");

        Ring silverRing = new Ring("silver");
        Earring goldEarrings = new Earring("gold");
        Watch leatherWatch = new Watch("brown");

        Clothing[] itemsArray = new Clothing[] {
            new Tshirt("red", "fancy", "long"),
            new Tshirt("blue", "plain", "long"),
            new ButtonShirt("white", "plain"),
            new Sweater("charcoal", "plain"),
            new TurtleNeck("yellow", "plain"),

            new Jean("blue", "plain"),
            new Jean("black", "fancy"),
            new Khaki("tan", "casual"),
            new Short("grey", "casual"),

            new Wintercoat("Black", "casual", 5),
            new Raincoat("Blue", "casual", 2),

            new DressShoe("black")
        };

        /*
        // Add all items in array to their respective lists
        for (int i = 0; i < itemsArray.length; i++)
        {
            outfitGenerator.superAdd(itemsArray[i]);
        }
        */
        
      
        outfitGenerator.addItem(plainRed);
        outfitGenerator.addItem(plainBlue);
        outfitGenerator.addItem(buttonShirt);
        outfitGenerator.addItem(sweater);
        outfitGenerator.addItem(turtleNeck);

        outfitGenerator.addItem(pantBlue);
        outfitGenerator.addItem(pantBlack);
        outfitGenerator.addItem(shortsGrey);
        outfitGenerator.addItem(tanKhaki);

        // Add Outerwear
        outfitGenerator.addItem(coat);
        outfitGenerator.addItem(rainCoat);

        // Add shoes
        outfitGenerator.addItem(dressShoe);
      
        // Add Accessories
        outfitGenerator.addAccessory(silverRing);
        outfitGenerator.addAccessory(goldEarrings);
        outfitGenerator.addAccessory(leatherWatch);

        for (int i = 0; i < 6; i++) {
            outfitGenerator.randomOutfitCombo(); 
            System.out.println();
        }


        outfitGenerator.generateMatchingOutfitCombo();
        outfitGenerator.generateMatchingOutfitCombo();
        outfitGenerator.generateMatchingOutfitCombo();

    }
}
