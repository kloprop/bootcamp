package UnitConversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeightConverter {
  private static final BigDecimal poundKgConvert = new BigDecimal(0.453592);
  private static final BigDecimal kgTonConvert = new BigDecimal(0.00110231);
  private static final BigDecimal onzeGramConvert = new BigDecimal(28.3495);
  private static final int decimalPlace = 3;
  
  
public static BigDecimal poundToKg(double pound){
  return new BigDecimal(pound).multiply(poundKgConvert).setScale(decimalPlace, RoundingMode.HALF_UP);
}
public static BigDecimal kgToPound (double kg){
  return new BigDecimal(kg).divide(poundKgConvert,decimalPlace,RoundingMode.HALF_UP);
}
public static BigDecimal kgToTon(double kg ){
  return new BigDecimal(kg).multiply(kgTonConvert).setScale(decimalPlace,RoundingMode.HALF_UP);
}
public static BigDecimal tonTokg(double ton ){
  return new BigDecimal(ton).divide(kgTonConvert,decimalPlace,RoundingMode.HALF_UP);
}
public static BigDecimal onzeToGram(double onze){
  return new BigDecimal(onze).multiply(kgTonConvert).setScale(decimalPlace,RoundingMode.HALF_UP);
}
public static BigDecimal gramToOnze (double gram){
  return new BigDecimal(gram).divide(onzeGramConvert,decimalPlace,RoundingMode.HALF_UP);
}
public static void main(String[] args) {
  System.out.println(WeightConverter.poundToKg(1.1));
  System.out.println(WeightConverter.kgToPound(1.12131));
  System.out.println(WeightConverter.kgToTon(4));
  System.out.println(WeightConverter.tonTokg(4));
} // End of Main

} //End of Class
