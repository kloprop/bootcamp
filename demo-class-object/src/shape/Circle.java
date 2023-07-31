package shape;

public class Circle {
  private int id;
  private double radius;

  private static final double pi = 3.14; // can not be changed with final // static can be called without obj

  private static int counter;

  public Circle (){
    //this.id++;// first 1, second 2
    addCounter(); //2
    this.id = counter;
  }

  public static void addCounter(){
    counter++;
  }
 public double area (){
  return pi*this.radius*this.radius;
 }

 public double circumference (){
  return 2*pi*this.radius;
 }

 public void setRadius(double r){
  this.radius = r;
 }

 public int getId(){
  return this.id;
 }


 public static void main (String [] args){
  Circle c = new Circle(); //Constructor
  c.setRadius(4);
  c.area();
  c.circumference();
  Circle c2 = new Circle(); //Constructor
  c2.setRadius(4);
  c2.area();
  c2.circumference();
  System.out.println(c.getId());
  System.out.println(c2.getId());

 }
}
