package Shapes;

import java.math.BigDecimal;

public class Square extends Shape {

  private double length;

  public Square(double length){
    this.length = length;
  }
  
  @Override
  public double area (){
    return Math.pow((this.length), 2);
  }
}
