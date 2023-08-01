package Objects;

import java.util.Objects;
import Shapes.Circle;
import Shapes.Shape;

public class Ball {

  private String color;

  public Ball(String color) {
    this.color = color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) {
    // if address same, values inside the obj must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball)) // Make sure it is a ball
      return false;
    Ball ball = (Ball) o; // downcast

    return ball.color.equals(this.color); // obj do not hv ball

  }

  @Override
  public String toString() {
    return "[color=" + this.color + "]";
  }

  public static void main(String[] args) {
    Ball ball1 = new Ball("Blue");
    Ball ball2 = new Ball("Blue");
    ball1.equals(ball2);
    StringBuilder sb = new StringBuilder("lo");
    StringBuilder sb2 = new StringBuilder("lo");
    sb.equals(sb2);
    Integer i = 9;
    i.equals(i);

    // instanceOf, Object.class

    Object obj = new String("abc"); // obj is an obj reference
    System.out.println(obj instanceof String); // true
    Shape shape = new Circle(5.0d);
    // shape.print();
    // /Hide child print() method
    Circle c = (Circle) shape;
    c.print();
    obj = Long.valueOf(10);

    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    // Number
    Integer int1 = Integer.valueOf(10);
    System.out.println(int1 instanceof Number); // true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true

    // Wrapper Class equals

    // Wrapper Class, for comparsion, we use equals

    Integer j1 = 128;
    Integer j2 = 128;
    j1.equals(j2);
    StringBuilder bg = new StringBuilder("i");
    bg.equals(obj);

  }

}
