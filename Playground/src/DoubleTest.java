import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
  public static void main (String [] args){
    double d = 3.453;
    double d2 = 3.1;
    BigDecimal d3 = BigDecimal.valueOf(d);
    BigDecimal d4 = BigDecimal.valueOf(d2);
    
    System.out.println(d/d2); 
    System.out.println(d3.divide(d4,2,RoundingMode.HALF_UP)); 
    System.out.println(d3.multiply(d4).setScale(2, RoundingMode.HALF_UP)); 

    System.out.println(new BigDecimal("56.5"));
    

  }
}
