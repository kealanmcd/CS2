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
        
        WinterCoat coat = new WinterCoat("Black", "casual", 5);
        RainCoat rainCoat = new RainCoat("Blue", "casual", 2);
        
        DressShoe dressShoe = new DressShoe("black");

        Ring silverRing = new Ring("silver");
        Earring goldEarrings = new Earring("gold");
        Watch leatherWatch = new Watch("brown");


        outfitGenerator.addShirt(plainRed);
        outfitGenerator.addShirt(plainBlue);
        outfitGenerator.addShirt(buttonShirt);
        outfitGenerator.addShirt(sweater);
        outfitGenerator.addShirt(turtleNeck);

        outfitGenerator.addPant(pantBlue);
        outfitGenerator.addPant(pantBlack);
        outfitGenerator.addPant(shortsGrey);
        outfitGenerator.addPant(tanKhaki);

        // Add Outerwear
        outfitGenerator.addOuterwear(coat);
        outfitGenerator.addOuterwear(rainCoat);

        // Add shoes
        outfitGenerator.addShoe(dressShoe);

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
