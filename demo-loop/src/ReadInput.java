import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    // Scanner
    System.out.println("Enter the loop count");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt(); // Enables user to input
    for (int i = 0; i < input; i++) {
      System.out.println("Hello");
    }
  }
}
