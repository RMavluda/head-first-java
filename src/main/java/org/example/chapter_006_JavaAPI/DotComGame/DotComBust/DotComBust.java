package main.java.org.example.chapter_006_JavaAPI.DotComGame.DotComBust;

import java.util.ArrayList;
import main.java.org.example.chapter_006_JavaAPI.DotComGame.DotCom;
import main.java.org.example.chapter_006_JavaAPI.DotComGame.GameHelper;

public class DotComBust {

  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;

  private void setUpGame(){
    // Creating several 'sites' and assign them addresses
    DotCom one = new DotCom();
    one.setName("Pets.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("Go2.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);

    System.out.println("Your goal is to sink three 'sites'.");
    System.out.println("'Pets.com', 'eToys.com', 'Go2.com'");
    System.out.println("Try to sink them in the minimum number of moves");

    for(DotCom dotComToSet : dotComsList){
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying(){
    while(!dotComsList.isEmpty()){
      String userGuess = helper.getUserInput("Make a move");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";
    for(DotCom dotCom : dotComsList){
      result = dotCom.checkYourself(userGuess);
      if(result.equals("hit")){
        break;
      }
      if(result.equals("sank")){
        dotComsList.remove(dotCom);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    System.out.println("All your 'websites' have gone under! Your shares are now worthless.");
    if(numOfGuesses <= 18){
      System.out.println("It only took you " + numOfGuesses + " attempts.");
      System.out.println("You managed to get out before your investments sank.");
    } else{
      System.out.println("That took you quite a while " + numOfGuesses + " attempts.");
      System.out.println("The fish are already dancing around your investments.");
    }
  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }

}
