public class Flower
{
  String color;
  int height;
  float percentWater;
  
  public Flower(String initColor, int initHeight, float initPercentWater)
  {
    color = initColor;
    height = initHeight;
    percentWater = initPercentWater;
  }
  
  public void printFlower() {
    System.out.println(color + " (" + height + " cm, " + percentWater + "% water)");
  }
  public void growFlower()
  {
    height += 2;
    percentWater -= 0.05;
  }
  public void waterFlower()
  {
    percentWater += 0.1;
  }
 
  public static void main(String[] args)
  {
    Flower f = new Flower("purple", 10, (float)0.5);
    f.printFlower();
    f.waterFlower();
    f.printFlower();
    f.growFlower();
    f.printFlower();
    
  }
}