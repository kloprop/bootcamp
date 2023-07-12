public class LogicalOperator {
  public static void main(String[] args) {

    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && operator
    // true, true-> true
    // true, false-> false
    boolean res = isExpensive && isWorthToBuy;
    System.out.println(res);

    // || operator
    // ture, true -> ture
    // ture, false -> true
    boolean res2 = isExpensive || isWorthToBuy;
    System.out.println(res2);

    int a = 5;
    int b = 10;
    int c = 13;
    boolean res3 = a > 6 && b < 9; // false

    boolean res4 = c > 15 || !(a > 6 && b < 9); // true as c<15
    // && operator would go first

    System.out.println(res4);
    boolean res5 = c > 15 || a < 6 && b > 9; // true as (a < 6 && b > 9)
    System.out.println(res5);

    boolean res6 = a == b; // false
    boolean res7 = a != b; // true

    





  } // end of main
} // End of Main
