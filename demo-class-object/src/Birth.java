import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main (String [] args){
    LocalDate today = LocalDate.now();
    LocalDate t2 = LocalDate.of(2023, 7, 29);
    System.out.println(today.equals(t2));
    System.out.println(today); // 2023-07-28
    LocalDate specifiedDate = LocalDate.of(2023, Month.FEBRUARY,25);
    System.out.println(specifiedDate);

    LocalDate d1 = LocalDate.parse("2023-12-30");
    int y = d1.getYear();
    Month m = d1.getMonth();
    int d = d1.getDayOfMonth();
    System.out.println(d);

    System.out.println(d1.plusMonths(1));

    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023,7,20);
    if (LocalDate.now().isAfter(effectiveDate.plusMonths(3L))){
      expiry = true;
    }
  }
}
