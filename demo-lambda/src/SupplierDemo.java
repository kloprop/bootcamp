import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;
public class SupplierDemo {
  public static void main(String[] args) throws Exception {

    Supplier <Integer> random = ()->  new Random().nextInt(3);

    

    test(random,3);
    System.out.println(random.get());
    
  }
  public static <T>void test (Supplier <T> testcase, T result) throws Exception{
      if (testcase.get().equals(result))
      return;
      throw new Exception();
    }
}
