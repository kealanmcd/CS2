class Tape {
  String colour;
  int weight;
  int length;

  Tape (String initColour, int initWeight, int initLength) {
    colour = initColour;
    weight = initWeight;
    length = initLength;
  }
  
  static void stickTape(Tape tape, float percentToUse)
  {
    tape.weight -= (int)(tape.weight * percentToUse);
    tape.length -= (int)(tape.length * percentToUse);
  }
  static void printTapeArray(Tape array[])
  {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i].colour + " (" + array[i].length + " cm, " + array[i].weight + " oz)");
    }
  }
}
