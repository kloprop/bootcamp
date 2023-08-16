import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate <String> startWithV = str1 ->str1.startsWith("V");
    Predicate <String> endWithV = str2 ->str2.endsWith("V");

    Predicate<String> combined = startWithV.and(endWithV);
    
    System.out.println(combined.test("VV"));
    System.out.println(combined.test("VE"));
    System.out.println(combined.test("AV"));
    
    Predicate<String> combined2 = startWithV.or(endWithV);
    
    System.out.println(combined2.test("VV"));
    System.out.println(combined2.test("VE"));
    System.out.println(combined2.test("AV"));
    System.out.println(combined2.test("AA"));
  }
}
