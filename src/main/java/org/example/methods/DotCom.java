package main.java.org.example.methods;

import java.util.ArrayList;

public class DotCom {

  private ArrayList<String> locationCells;
  // private int numOfHits;
  // seychas eto nam ne nujno

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public String checkYourself(String userInput) {
    String result = "miss";

    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result = "sank";
      } else {
        result = "hit";
      }
    }
    return result;
  }

}
