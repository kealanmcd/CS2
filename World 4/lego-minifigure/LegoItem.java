public class LegoItem {
  String name;
  float weight;
  
  LegoItem(String newName, int newWeight) {
    name = newName;
    weight = newWeight;
  }
  
  public String toString() {
    return "a " + weight + "-gram " + name;
  }
  
  public boolean isHeavy(float threshold) {
    return threshold < weight;
  }
}
