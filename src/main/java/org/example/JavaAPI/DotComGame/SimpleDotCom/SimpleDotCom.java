package main.java.org.example.JavaAPI.DotComGame.SimpleDotCom;

public class SimpleDotCom {

  int[] locationCells; // yacheyka dresini saqlash uchun massiv
  int numOfHits = 0; // to`g`ri kelganlik sonini hisoblash uchun o`zgaruvchi

  public void setLocationCells(int[] locations) {
    locationCells = locations;
  }

  public String checkYourself(String userGuess) {
    int guess = Integer.parseInt(userGuess);

    String result = "miss";

    for (int cell : locationCells) {
      if (guess == cell) {

        result = "hit";
        numOfHits++;
        break;
      }
    }
    if (numOfHits == locationCells.length) {
      result = "sank";
    }
    System.out.println(result);
    return result;
  }
}

