package A_unchecked;
public class DemoNumberFormatException {
  public static void main(String[] args) {
    try {
      Integer.valueOf("abc");
    } catch (NumberFormatException e) {
      System.out.println("Can not convert to number");
    }
  }
}
