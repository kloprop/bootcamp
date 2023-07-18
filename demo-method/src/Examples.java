public class Examples {
  public static void main (String [] args){
    double width = 2;
    double height = 3;
    double area = rectangleArea(width, height);
    double perimeter = rectanglePerimeter(width, height);
    System.out.println("The area of the rectangle is "+ area);
    System.out.println("The perimeter of the rectangle is "+ perimeter);

    double radius = 3;
    
    System.out.println("The area of the circle is "+ area);
    System.out.println("The perimeter of the circle is "+ area);



  } //end of main

  public static double rectangleArea (double width,double height){
    return width*height;
  }
  public static double rectanglePerimeter (double width,double height){
    return width*2+height*2;
  }
  public static double circleArea (double radius){
    return Math.PI*radius*radius;
  }
  public static double circlePerimeter (double radius){
    return 2*Math.PI*radius;
  }




} // End of Main
