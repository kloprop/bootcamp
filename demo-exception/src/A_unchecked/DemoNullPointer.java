package A_unchecked;
public class DemoNullPointer {
  public static void main(String[] args) {
    String[] arr = new String[4];

    try {
      for (String str : arr) {
        if (str.charAt(0) == 'a') {
          System.out.println("The first character is a");
        }
      }
    } catch (NullPointerException e) {
      System.out.println("Null pointer exception");
    }
  }
}
