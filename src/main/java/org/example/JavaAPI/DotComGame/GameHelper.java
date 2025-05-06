package main.java.org.example.JavaAPI.DotComGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameHelper {

  public String getUserInput(String promt) {
    String inputLine = null;
    System.out.println(promt + " ");

    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0) {
        return null;
      }

    } catch (Exception e) {
      System.out.println("IOException: " + e);
    }
    return inputLine;
  }

}
