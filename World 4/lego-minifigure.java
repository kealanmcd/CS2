class LegoHat {
  String style;
  int size;
  
  LegoHat(String newStyle, int newSize) {
    style = newStyle;
    size = newSize;
  }
  
  public String toString() {
    return "a " + size + " " + style;
  }
  
  public int computeStyle(String season) {
    int fashionable = 10;
    return fashionable;
  }
}


class LegoItem {
  String name;
  float weight;
  
  LegoItem(String newName, int newWeight) {
    name = newName;
    weight = newWeight;
  }
  
  public String toString() {
    System.out.println("a " + weight + "-gram " + name + ".");
    return "a " + weight + "-gram " + name;
  }
  
  public boolean isHeavy(float threshold) {
      return threshold > weight;
  }
}

class LegoMinifigure {
  String name;
  LegoHat hat;
  LegoItem leftHand;
  LegoItem rightHand;
  
  // Provide a constructor (which allows each attribute to be set), as well as the following methods:
  LegoMinifigure(String newName, LegoHat newHat, LegoItem leftItem, LegoItem rightItem) {
      name = newName;
      hat = newHat;
      leftHand = leftItem;
      rightHand = rightItem;
  }
  
  public String toString() {
    return "A Lego minifigure named " + name+", who is wearing " + hat + " and is holding "+ leftHand + " in the left hand and " + rightHand + " in the right hand";
  }
  
  public void swapHands() {
      LegoItem placeholder = leftHand;
      leftHand = rightHand;
      rightHand = placeholder;
  }
  
  public void wearHat(LegoHat hatY) {
      hat = hatY;
  }
  
  public void placeInLeftHand(LegoItem item) {
      leftHand = item;
  }
  
  public void placeInRightHand(LegoItem item) {
      rightHand = item;
  }
  
  public boolean isGood(String season, float threshold) {
      return true;
  }
}


public class TestClass {
public static void main(String[] args) {
  LegoHat hat = new LegoHat("Cowboy", 2);
  LegoItem sword = new LegoItem("Sword", 600);
  LegoMinifigure a = new LegoMinifigure("John", null, sword, null);
  System.out.println(a.name);
  System.out.println(a.hat);
  System.out.println(a.leftHand);
  System.out.println(a.rightHand);
  a.swapHands();
  System.out.println(a.leftHand);
  System.out.println(a);
}
}