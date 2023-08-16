package A_math;

public class MathDemo {
  public static int calculate(int i, int j, MathOperation formula) {
    return formula.operate(i, j);
  }

  public static void main(String[] args) {
    MathOperation add = (x, y) -> x + y;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multiply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;

    System.out.println(calculate(1, 3, add));
    System.out.println(calculate(10, 2, divide));
    System.out.println(calculate(7, 8, (x, y) -> x * y));
  }
}
