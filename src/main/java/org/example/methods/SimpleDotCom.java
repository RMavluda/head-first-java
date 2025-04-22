package main.java.org.example.methods;

public class SimpleDotCom {

  int[] locationCells; // yacheyka dresini saqalsh uchun massiv
  int numOfHits = 0; // to`g`ri kelganlik sonini hisoblash uchun o`zgaruvchi loc

  public void setLocationCells(int[] locations) {
    locationCells = locations;
  }

  public String checkYourself(String userGuess) {
    int i = 0;
    int num = 0;
    while(i < userGuess.length()){
      int x = userGuess.charAt(i);
      num = num * 10 + x;
      i++;
    }
    i = 0;
    while(i < locationCells.length){
      if(locationCells[i] == num){
        numOfHits++;
        if(numOfHits == 3){
          return "sank!";
        }
        return "hit";
      }
    }
    return "miss";
  }
}

