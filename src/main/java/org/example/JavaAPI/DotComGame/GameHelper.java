package main.java.org.example.JavaAPI.DotComGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

  private static final String alphabet = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int[] grid = new int[gridSize];
  private int comCount = 0;

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

  public ArrayList<String> placeDotCom(int comSize) {
    ArrayList<String> alphaCells = new ArrayList<>();
    String temp;
    int[] coords = new int[comSize];
    int attempts = 0;
    boolean success = false;
    int location = 0;

    comCount++;
    int incr = 1;
    if ((comCount % 2) == 1) {
      incr = gridSize;
    }

    while (!success & attempts < 200) {
      location = (int) (Math.random() * gridLength);
      int x = 0;
      success = true;
      while (success && x < comSize) {
        if (grid[location] == 0) {
          coords[x++] = location;
          location += incr;
          if (location >= gridSize) {
            success = false;
          }
          if (x > 0 && (location % gridLength) == 0) {
            success = false;
          }
        } else {
          success = false;
        }
      }
    }
    int x = 0;
    int row = 0;
    int column = 0;

    while (x < comSize) {
      grid[coords[x]] = 1;
      row = (int) (coords[x] / gridLength);
      column = (int) (coords[x] % gridLength);
      temp = String.valueOf(alphabet.charAt(row)) + row;
      alphaCells.add(temp);
      x++;
    }
    return alphaCells;
  }
}
