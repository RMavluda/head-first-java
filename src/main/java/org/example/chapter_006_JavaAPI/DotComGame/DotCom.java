package main.java.org.example.chapter_006_JavaAPI.DotComGame;

import java.util.ArrayList;

public class DotCom {

  private ArrayList<String> locationCells;
  private String name;
  // private int numOfHits;
  // We don't need this right now

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String checkYourself(String userInput) {
    String result = "miss";

    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result = "sank";
        System.out.println("Oh, you sank the " + name + " : ( ");
      } else {
        result = "hit";
      }
    }
    return result;
  }

}
