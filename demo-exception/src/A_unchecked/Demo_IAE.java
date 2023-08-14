package A_unchecked;
public class Demo_IAE {
  public static int add(int a, int b) {
    if (a < 0 || b < 0){
      throw new IllegalArgumentException();
    }
    return a + b;
  }

  public static void main(String[] args) {
    try{
      add(1,4);
      add(-1,5); //throw exception
      add(4,5); //unreachable
    }catch (IllegalArgumentException e){
      System.out.println("Skip the process");
    }
  }
}
