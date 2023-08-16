
import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo{
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    //System.out.println(isMale.test('M'));
    test(isMale, 'F', false);

    // Bi
    BiPredicate <String, String> equals = (s1, s2) -> s1 != null && s1.equals(s2);
    test2(equals,"hi","hi",true);

    Predicate <LocalDate> isCoolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
    
    test(isCoolingOff, LocalDate.of(2023,7,16), false);
    test(isCoolingOff, LocalDate.of(2023,7,17),true);
  }

  public static <T> void test(Predicate<T> testcase, T data,
      boolean exceptedResult) throws Exception {
    if (testcase.test(data) != exceptedResult)
      throw new Exception();
  }

  public static <T,U> void test2(BiPredicate<T,U> testcase, T data, U data2,
      boolean exceptedResult) throws Exception {
    if (testcase.test(data,data2) != exceptedResult)
      throw new Exception();
  }
}
