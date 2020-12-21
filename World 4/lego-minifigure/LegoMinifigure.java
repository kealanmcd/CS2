public class LegoMinifigure {
  String name;
  LegoHat hat;
  LegoItem leftHand;
  LegoItem rightHand;
  
  LegoMinifigure(String newName, LegoHat newHat, LegoItem leftItem, LegoItem rightItem) {
    name = newName;
    hat = newHat;
    leftHand = leftItem;
    rightHand = rightItem;
  }
  
  public String toString() {
    String legoFigureDetails = "A Lego minifigure";
    if (name != null) {
      legoFigureDetails += " named " + name;
    }

    if (hat != null || leftHand != null || rightHand != null) {
      legoFigureDetails += ", who is ";
    }

    if (hat != null) {
      legoFigureDetails += "wearing " + hat;
      if (leftHand != null || rightHand != null) {
        legoFigureDetails += " and ";
      }
    }

    if ((leftHand != null) && (rightHand != null)) {
      legoFigureDetails += "is holding " + leftHand + " in the left hand, and " + rightHand + " in the right hand";
    } else if (leftHand != null || rightHand != null) {
      legoFigureDetails += "is holding ";
      legoFigureDetails += (leftHand != null) ? leftHand + " in the left hand" : rightHand + " in the right hand";
    }
    legoFigureDetails += ".";
    
    return legoFigureDetails;
  }
  
  public void swapHands() {
    LegoItem placeholder = leftHand;
    leftHand = rightHand;
    rightHand = placeholder;
  }
  
  public void wearHat(LegoHat initHat) {
    hat = initHat;
  }
  
  public void placeInLeftHand(LegoItem item) {
    leftHand = item;
  }
  
  public void placeInRightHand(LegoItem item) {
    rightHand = item;
  }
  
  public boolean isGood(String season, float threshold) {
    season = season.toLowerCase();
    if (hat == null) {
      return false;
    }

    boolean leftHandGood = leftHand != null ? leftHand.isHeavy(threshold) : false;
    boolean rightHandGood = rightHand != null ? rightHand.isHeavy(threshold) : false;
    boolean isGoodResult = ((hat.computeStyle(season) >= 6) && leftHandGood == false && rightHandGood == false) ? true : false;

    return isGoodResult;

  }
}
