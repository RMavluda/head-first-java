package chapter04objects;

public class Clock {

  String time;

  void setTime(String t) {
    time = t;
  }

  String getTime() {
    return time;
  }
}

class ClockTestDrive {

  public static void main(String[] args) {
    Clock c = new Clock();

    c.setTime("1234");
    String tod = c.getTime();
    System.out.println("time: " + tod);
  }
}
