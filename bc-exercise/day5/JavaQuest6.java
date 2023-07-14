/**
 * Expected output: 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int firstNum = 1;
    int nextNum = 1;
    for (int i = 0; i<15; i++){
      System.out.print(firstNum+" ");
      int tem = nextNum; // store the previous nextNum
      nextNum = firstNum + nextNum; //update next number by adding previous firstNum and nextNum
      firstNum =tem; //update first number



    }
  }
}
