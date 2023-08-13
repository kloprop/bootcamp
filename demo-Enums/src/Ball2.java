import java.util.Objects;
import A_ball.Color;

public class Ball2{
  Color color;

  public Ball2(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Ball2)){
      return false;
    }
    Ball2 b = (Ball2) obj;
    return Objects.equals(this.getColor(), b.getColor());
  }

  public static void main(String[] args){
    Ball2 ball = new Ball2(Color.RED); 
    System.out.println(ball.getColor()); // 
    System.out.println(ball.getColor()); // 

    // Object is topmost parent

    Object object = new Ball2(Color.RED);
    // Compile-time Class "Object" type check
    object.hashCode();
    // Compile-time check if Object class has hashCode() method
    // Compile- time check if Ball class inherit Object
    // Compile- time perform type check

    // Run-time object variable stores an address , point a Ball object in heap
    // Run-time determine if Class Ball has hashcode() method.
    // If no, then invoke Class Object hashCode()

    Color color = ((Ball2) object).getColor();
    //System.out.println(((Ball2) object).getColor());

    Class<?> clas = color.getClass();
    

    System.out.println(clas.getName()); //Color
    System.out.println(clas.toString()); //class Color

     
    if (Color.BLUE instanceof Color){
      System.out.println("Color.BLUE is instance of color");
    }

    if (Color.BLUE.getClass() == Color.class){
      System.out.println("Color.BLUE is instance of Color");
    }

    Object o = 1 - 'a'; // int 
    System.out.println(o.getClass().getName()); //Integer
    Object o2 = 'b';
    System.out.println(o2.getClass().getName()); // Character
    Object o3 = new Ball2(Color.GREEN);
    System.out.println(o3.getClass().getName());


    System.out.println((clas.getClass())); // true

   


  }
}
