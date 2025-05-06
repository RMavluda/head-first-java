package main.java.org.example.JavaAPI.DotComGame.SimpleDotCom;

public class SimpleDotComTestDrive {

  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    int[] location = {2, 3, 4};
    dot.setLocationCells(location);
    String userGuess = "2";
    String result = dot.checkYourself(userGuess);
  }
}
