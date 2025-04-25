package main.java.org.example.methods;

public class SimpleDotComGame {

  public static void main(String[] args) {
    int numOfGuesses = 0;

    GameHelper gameHelper = new GameHelper();

    SimpleDotCom theDotCom = new SimpleDotCom();

    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};
    theDotCom.setLocationCells(locations);
    boolean isAlive = true;

    while (isAlive) {
      String guess = gameHelper.getUserInput("Enter number: ");

      String result = theDotCom.checkYourself(guess);

      numOfGuesses++;

      if (result.equals("sank")) {
        isAlive = false;
        System.out.println("It took you " + numOfGuesses + " guesses");
      }
    }
  }
}
