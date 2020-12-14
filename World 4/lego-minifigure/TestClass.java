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
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("summer", 4000));

    System.out.println("- First: change hat and two new items");
    legoFigure.hat = sunVisor;
    legoFigure.leftHand = spear;
    legoFigure.rightHand = axe;
    System.out.println(legoFigure);
    System.out.println("How fashionable is the new hat in winter?");
    System.out.println(legoFigure.hat.computeStyle("winter"));

    System.out.println("- Second: Now swap the items");
    legoFigure.swapHands();
    System.out.println(legoFigure);
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("winter", 800));

    System.out.println("- Third: Remove one item");
    legoFigure.rightHand = null;
    System.out.println(legoFigure);
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("winter", 800));

    System.out.println("- Fourth: swap the items again");
    legoFigure.swapHands();
    System.out.println(legoFigure);
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("winter", 800));

    System.out.println("- Fifth: Remove the hat");
    legoFigure.hat = null;
    System.out.println(legoFigure);
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("winter", 800));

    System.out.println("- Sixth: Remove all items");
    legoFigure.leftHand = null;
    legoFigure.rightHand = null;
    System.out.println(legoFigure);
    System.out.println("Is good?");
    System.out.println(legoFigure.isGood("winter", 800));

    System.out.println("- Seventh: Remove the name");
    legoFigure.name = null;
    System.out.println(legoFigure);


    /*LegoHat hat = new LegoHat("Fedora", 2);
    LegoItem sword = new LegoItem("Sword", 600);
    LegoMinifigure a = new LegoMinifigure("John", hat, sword, null);
    System.out.println(a.name);
    System.out.println(a.hat);
    System.out.println(a.leftHand);
    System.out.println(a.rightHand);
    a.swapHands();
    System.out.println(a.leftHand);
    System.out.println(a);
    System.out.println("test");
    System.out.println(a.isGood("spring", 800));*/
  }
  
}
