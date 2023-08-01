package Shapes;

public class Circle extends Shape{

  private double radius; 

  public Circle (double radius){
    this.radius = radius;
  }

  @Override
  public double area(){
    return Math.pow(radius, 2) *Math.PI;
  }

  public void print(){
    System.out.println("hi");
  }
  
  public static void main(String[] args){
    System.out.println(1.1*1.1);
  }
}
