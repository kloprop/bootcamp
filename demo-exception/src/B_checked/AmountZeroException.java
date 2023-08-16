package B_checked;

public class AmountZeroException extends Exception{
  public AmountZeroException (){
    super("The amount can not below or equal to zero");
    
  }
}
