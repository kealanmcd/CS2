public class TestClass 
{
  public static void main(String[] args)
  {
    // Hats
    LegoHat toque = new LegoHat("Toque", 5);
    LegoHat fedora = new LegoHat("Fedora", 7);
    LegoHat sunVisor = new LegoHat("Sun Visor", 1);
    LegoHat beret = new LegoHat("Beret", 4);
    LegoHat bomber = new LegoHat("Bomber", 6);

    // Items
    LegoItem sword = new LegoItem("Sword", 1200);
    LegoItem spear = new LegoItem("Spear", 800);
    LegoItem bow = new LegoItem("Bow", 1000);
    LegoItem axe = new LegoItem("Axe", 1600);
    LegoItem shield = new LegoItem("Shield", 2000);


    System.out.println("Let's start testing:");
    LegoMinifigure legoFigure = new LegoMinifigure("John", fedora, sword, shield);
    System.out.println(legoFigure.name);
    System.out.println(legoFigure.hat);
    System.out.println(legoFigure.leftHand);
    System.out.println(legoFigure.rightHand);
    System.out.println(legoFigure);
    System.out.println("Is good? (summer, 4000)");
    System.out.println(legoFigure.isGood("summer", 4000));
    System.out.println();

    System.out.println("Let's change the hat and add two new items:");
    legoFigure.wearHat(sunVisor);
    legoFigure.placeInLeftHand(spear);
    legoFigure.placeInRightHand(axe);
    System.out.println(legoFigure);
    System.out.println("How fashionable is the new hat in winter?");
    System.out.println(legoFigure.hat.computeStyle("winter"));
    System.out.println();

    System.out.println("Now swap the items in each hand:");
    legoFigure.swapHands();
    System.out.println(legoFigure);
    System.out.println("Is good? (winter, 800)");
    System.out.println(legoFigure.isGood("winter", 800));
    System.out.println();

    System.out.println("Remove one item:");
    legoFigure.placeInRightHand(null);
    System.out.println(legoFigure);
    System.out.println("Is good? (summer, 1600)");
    System.out.println(legoFigure.isGood("summer", 1600));
    System.out.println();

    System.out.println("Swap the items again:");
    legoFigure.swapHands();
    System.out.println(legoFigure);
    System.out.println("Is good? (autumn, 1600)");
    System.out.println(legoFigure.isGood("autumn", 1600));
    System.out.println();

    System.out.println("Remove the hat:");
    legoFigure.wearHat(null);
    System.out.println(legoFigure);
    System.out.println("Is good? (spring, 2000)");
    System.out.println(legoFigure.isGood("spring", 2000));
    System.out.println();

    System.out.println("Remove all items:");
    legoFigure.placeInLeftHand(null);
    legoFigure.placeInRightHand(null);
    System.out.println(legoFigure);
    System.out.println("Is good? (winter, 800)");
    System.out.println(legoFigure.isGood("winter", 800));
    System.out.println();

    System.out.println("Remove the name:");
    legoFigure.name = null;
    System.out.println(legoFigure);

  }
  
}
