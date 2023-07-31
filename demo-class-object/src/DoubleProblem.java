import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String [] args){
    double result = 0.1+0.2;
    System.out.println(result);

    System.out.println(0.3/0.2);

    System.out.println("k" + 6.2/3);
    BigDecimal b = new BigDecimal(0.45);
    BigDecimal b2 = new BigDecimal(0.51);
    System.out.println(b.add(b2).setScale(2, RoundingMode.HALF_UP));
    System.out.println("b"+b.multiply(b2));
    //System.out.println(b.divide(b2).setScale(2, RoundingMode.HALF_UP));
    System.out.println("b" +b.compareTo(b2));

    BigDecimal b3 = BigDecimal.valueOf(4.6);
    System.out.println(b3.setScale(2,RoundingMode.UP));
    System.out.println(b3.setScale(2,RoundingMode.DOWN));

    BigDecimal b4 = BigDecimal.valueOf(0.5);
    System.out.println(b.equals(b4));
    System.out.println(0.45/0.51);
    System.out.println(b.divide(b2).setScale(2, RoundingMode.DOWN));
    
   
  }
}
