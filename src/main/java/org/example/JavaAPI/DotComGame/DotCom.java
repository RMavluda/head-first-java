package main.java.org.example.JavaAPI.DotComGame;

import java.util.ArrayList;

public class DotCom {

  private String name;
  private ArrayList<String> locationCells;
  // private int numOfHits;
  // seychas eto nam ne nujno

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
