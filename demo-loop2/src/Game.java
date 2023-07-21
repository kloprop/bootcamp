import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main (String [] args){

    int bomb = new Random().nextInt(100)+1;
    int input;
    int min = 1;
    int max = 100;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number between "+ min +" and "+ max);
      input = scanner.nextInt();
      if (input < min || input > max){
        System.out.println("Invaild number!");
        continue;
      }
      
      if (input < bomb){
        min = input;
      }
      if (input > bomb){
        max = input;
      }
    }while (input != bomb);
   
    System.out.println("You are right!");
    
  }
}
