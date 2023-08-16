package B_unary;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  public static void main(String[] args) {
    UnaryOperator<String> uppercase = str-> str.toUpperCase();
    uppercase.apply("hello");

    BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
    concat.apply("Hello", "World");

    SuperUnary <String> unary = (s1,s2,s3)-> s1.concat(s2).concat(s3);
  }
}
