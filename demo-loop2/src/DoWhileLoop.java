import java.util.Scanner;

public class DoWhileLoop {
  public static void main (String [] args){
    // do-while, do first, then check condition to start looping

    int count = 9;
    do{
      System.out.println("hello, count=" +count);
      count++;
    } while (count < 3);

    int input;
    do {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Please input a number");
      input = scanner.nextInt();

      
    }
    while (input %2 == 0);

    
    System.out.println("input= "+input);
    
    



  } // End of Main
} // End of Class
