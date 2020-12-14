public class LegoMinifigure {
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
    } else {
      ///legoFigureDetails += "nothing.";
    }

    legoFigureDetails += ".";
    //legoFigureDetails += hat ? "who is wearing a" + hat" : "";
    
    return legoFigureDetails;
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
    // needs to be updated to check for null values in the hands and hats

    // has hat?
    // has leftHand??
    // has rightHand??
    if (hat == null) {
      return false;
    } else {
      if (leftHand != null && rightHand == null) {
        if (hat.computeStyle(season) >= 6 && leftHand.isHeavy(threshold) == false) {

          return true;
        } else {
          return false;
        }
      } else if (leftHand == null && rightHand != null) {
        if (hat.computeStyle(season) >= 6 && rightHand.isHeavy(threshold) == false) {


          return true;
        } else {
          return false;
        }
      } else {
        if ((hat.computeStyle(season) >= 6) && (leftHand.isHeavy(threshold) == false && rightHand.isHeavy(threshold) == false)) {

          return true;
        } else {
          return false;
        }
      }
    }

    /*System.out.println(threshold);
    System.out.println(rightHand.isHeavy(threshold));
    if ((hat.computeStyle(season) >= 6) && (leftHand.isHeavy(threshold) == false && rightHand.isHeavy(threshold) == false)) {
      return true;
    } else {
      return false;
    }*/
  }
}
