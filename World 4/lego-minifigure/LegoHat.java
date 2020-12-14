import java.util.HashMap;

public class LegoHat {
  String style;
  int size;
  
  LegoHat(String newStyle, int newSize) {
    style = newStyle;
    size = newSize;
  }
  
  public String toString() {
    String hatSize;
    if (size <= 3) {
      hatSize = "small";
    } else if (size <= 6) {
      hatSize = "medium";
    } else {
      hatSize = "large";
    }
    return "a " + hatSize + " " + style;
  }
  
  public int computeStyle(String season) {
    
    HashMap<String, HashMap<String, Integer>> hatStyles = new HashMap<String, HashMap<String, Integer>>();
    
    HashMap<String, Integer> toqueSeasons = new HashMap<String, Integer>();
    toqueSeasons.put("winter", 1);
    toqueSeasons.put("spring", 1);
    toqueSeasons.put("summer", 1);
    toqueSeasons.put("autumn", 1);
    hatStyles.put("Toque", toqueSeasons);

    HashMap<String, Integer> sunVisorSeasons = new HashMap<String, Integer>();
    sunVisorSeasons.put("winter", 1);
    sunVisorSeasons.put("spring", 1);
    sunVisorSeasons.put("summer", 6);
    sunVisorSeasons.put("autumn", 1);
    hatStyles.put("Sun Visor", sunVisorSeasons);

    HashMap<String, Integer> beretSeasons = new HashMap<String, Integer>();
    beretSeasons.put("winter", 10);
    beretSeasons.put("spring", 7);
    beretSeasons.put("summer", 4);
    beretSeasons.put("autumn", 8);
    hatStyles.put("Beret", beretSeasons);

    HashMap<String, Integer> fedoraSeasons = new HashMap<String, Integer>();
    fedoraSeasons.put("winter", 5);
    fedoraSeasons.put("spring", 6);
    fedoraSeasons.put("summer", 10);
    fedoraSeasons.put("autumn", 7);
    hatStyles.put("Fedora", fedoraSeasons);

    HashMap<String, Integer> bomberSeasons = new HashMap<String, Integer>();
    bomberSeasons.put("winter", 10);
    bomberSeasons.put("spring", 4);
    bomberSeasons.put("summer", 1);
    bomberSeasons.put("autumn", 6);
    hatStyles.put("Bomber", bomberSeasons);

    int fashionable = hatStyles.get(style).get(season);
    return fashionable;
  }
}
