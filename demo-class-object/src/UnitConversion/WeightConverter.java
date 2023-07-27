package UnitConversion;

public class WeightConverter {
  private static final double poundKgConvert = 0.453592;
  private static final double kgTonConvert = 0.00110231;
  private static final double onzeGramConvert = 28.3495;
  
  
public static double poundToKg(double pound){
  return pound*poundKgConvert;
}
public static double kgToPound (double kg){
  return kg/poundKgConvert;
}
public static double kgToTon(double kg ){
  return kg*kgTonConvert;
}
public static double tonTokg(double ton ){
  return ton/kgTonConvert;
}
public static double onzeToGram(double onze){
  return onze*onzeGramConvert;
}
public static double gramToOnze (double gram){
  return gram/onzeGramConvert;
}
public static void main(String[] args) {
  System.out.println(WeightConverter.poundToKg(1.1));
  System.out.println(WeightConverter.kgToPound(1.12131));
  System.out.println(WeightConverter.kgToTon(4));
  System.out.println(WeightConverter.tonTokg(4));
} // End of Main

} //End of Class
