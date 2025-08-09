package main.java.org.example.chapter_007_InheritanceAndPolymorphism;

public class MonsterTestDrive {

  public static void main(String[] args) {
    Monster [] ma = new Monster[3];
    ma[0] = new Vampire();
    ma[1] = new Dragon();
    ma[2] = new Monster();
    for (int i = 0; i < 3; i++) {
      ma[i].frighten(i);
    }
  }
}

class Monster{
  boolean frighten(int d){
    System.out.println("Grrr");
  return true;
  }
}

class Vampire extends Monster{
  boolean frighten(int x){
    System.out.println("Ukusit");
    return false;
  }
}

class Dragon extends Monster{
  boolean frighten(int degree){
    System.out.println("Ognennoye dihaniye");
    return true;
  }
}