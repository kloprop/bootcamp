package Garden;

public class Oak {
  private int id;
  private double height;
  private static final double pricePerMeter = 5.6;
  private static int counter;

  public Oak (double height){
    this.height = height;
    counter++;
    this.id = counter;
  }

  public double getHeight(){
    return this.height;
  }
  public int getId (){
    return this.id;
  }

  public double getPrice(){
    return this.height*pricePerMeter;
  }

  public void setHeight (double height){
    this.height = height;
  }
} // End of Class
