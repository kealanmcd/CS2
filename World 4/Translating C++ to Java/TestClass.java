public class TestClass {

  public static void main(String[] args)
  {

    int numTapes = 3;
    Tape [] tapes = new Tape[numTapes];
    tapes[0] = new ScotchTape("clear", 3, 22);
    tapes[1] = new ScotchTape("green", 1, 15);
    tapes[2] = new ScotchTape("blue", 2, 19);
    
    Tape.printTapeArray(tapes);
   
    Tape.stickTape(tapes[0], (float)0.5);
    Tape.stickTape(tapes[1], (float)0.3);
    Tape.stickTape(tapes[2], (float)0.9);

    System.out.println();
    Tape.printTapeArray(tapes);

  }
}
