package Animal;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog extends Animal {

  private int noOfLeg;

  public Dog(String species, double weight, double growRate){
    super(species,weight,growRate);
    this.noOfLeg = 4;
  }

  @Override
  public void grow(){
    BigDecimal weight = new BigDecimal(this.getWeight()+3/9);
    BigDecimal growRate = new BigDecimal(this.getGrowRate());
    this.setWeight((weight.multiply(growRate).setScale(2, RoundingMode.HALF_UP).doubleValue()));
  }

  @Override
  public void respiration(){
    BigDecimal growRate = new BigDecimal(this.getGrowRate()); 
    this.setGrowRate(growRate.add(BigDecimal.valueOf(0.03)).setScale(2, RoundingMode.HALF_UP).doubleValue());
  }
  @Override
  public void move(){
    System.out.println("I am running");
  }
  public int getLeg(){
    return this.noOfLeg;
  }
  public void bark (){
    System.out.println("woof");
  }

}
