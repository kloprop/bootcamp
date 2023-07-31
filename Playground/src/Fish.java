import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fish extends Animal{
    private int noOfScales;

  public Fish(String species, double weight, double growRate, int noOfScales){
    super(species,weight,growRate);
    this.noOfScales = noOfScales;
  }

  @Override
  public void grow(){
    BigDecimal weight = new BigDecimal(this.getWeight());
    BigDecimal growRate = new BigDecimal(this.getGrowRate());
    this.setWeight((weight.multiply(growRate).setScale(2, RoundingMode.HALF_UP).doubleValue()));
  }

  @Override
  public void respiration(){
    BigDecimal growRate = new BigDecimal(this.getGrowRate()*9/7); 
    this.setGrowRate(growRate.add(BigDecimal.valueOf(0.01)).setScale(2, RoundingMode.HALF_UP).doubleValue());
  }
  @Override
  public void move(){
    System.out.println("I am swimming");
  }

  
}
