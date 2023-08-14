package F_shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Shape {

  abstract double area();

  //public static <T extends Shape>double area(List <T> shapes){
  public static double area(List <? extends Shape> shapes){
    BigDecimal sum = BigDecimal.ZERO;
    for (Shape shape : shapes){
      sum =sum.add(BigDecimal.valueOf(shape.area()));
    }
    return sum.doubleValue();
  }
  public static void main(String[] args) {
    //Polymorphism
    Shape shape = new Circle();
    Shape shape2 = new Square();
    ArrayList <Shape> shapes = new ArrayList<Shape>(); // The list shall contains Shapes, can not change to store Circle
    Object obj = new Object();
    
    shapes.add(new Circle()); 
    //shapes = new ArrayList<Circle>(); // compile- error

    List<? extends Shape> list = new ArrayList<Circle>();
    list = new ArrayList<Square>();
    //list.add(new Circle()); // compile check refer declaration, compile clear all unsure conditions

    List <Map <String,String>> list2 = new ArrayList<>();

  }
  
}
