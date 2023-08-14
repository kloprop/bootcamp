package A_arraylist1;
import java.util.Arrays;
import java.util.Random;

public class Person implements Player {

  Pocket[] pockets;

  public Person() {
    pockets = new Pocket[2];
    pockets[0] = new Pocket();
    pockets[1] = new Pocket();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }

  public int calculateScore() {
    return this.getLeftPocket().getTotalScore() + this.getRightPocket().getTotalScore();
  }



  public static void main(String[] args) {
    Person p1 = new Person();
    Player.fillThePocket(p1.getLeftPocket());
    Player.fillThePocket(p1.getRightPocket());
    System.out.println(p1.getLeftPocket());
    System.out.println(p1.getRightPocket());

    Person p2 = new Person();
    Player.fillThePocket(p2.getLeftPocket());
    Player.fillThePocket(p2.getRightPocket());
    System.out.println(p2.getLeftPocket());
    System.out.println(p2.getRightPocket());

    System.out.println("P1 Total Score: " + p1.calculateScore());
    System.out.println("P1 Left Pocket Ball Details: : " + p1.getLeftPocket());
    System.out.println("P1 Right Pocket Ball Details: : " + p1.getRightPocket());

    System.out.println("P2 Total Score: " + p2.calculateScore());
    System.out.println("P2 Left Pocket Ball Details: : " + p2.getLeftPocket());
    System.out.println("P2 Right Pocket Ball Details: : " + p2.getRightPocket());



    // System.out.println(p1.lefPocket().balls);
  }
}
