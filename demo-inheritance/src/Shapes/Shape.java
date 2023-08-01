package Shapes;

import java.math.BigDecimal;

public abstract class Shape { // super class extends object
  public abstract double area();

  public static double area(Shape[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);

    for (Shape s : shapes){ // add all area at once // factory pattern // call abstract method once
        total = total.add(BigDecimal.valueOf(s.area()));
      }
    return total.doubleValue();  
    }

    public static void main(String[] args) {
      double total = 0.0d;
      BigDecimal b= BigDecimal.valueOf(total).add(BigDecimal.valueOf(5));
      System.out.println(b);
      Circle c = new Circle(10.0d);
      Square s = new Square(3.0d);
      Shape [] shapes= new Shape[] {c,s};
      System.out.println(Shape.area(shapes));
  
    }
  }
  

