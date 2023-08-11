import java.util.LinkedList;
import java.util.List;

public class Computer {
  //arttibutes
  private int ram;
  private int weight;
  private String color;

  //constructors
  public Computer (){

  }
  public Computer(String color){ // no return type, constructor name = class name
    this.color = color;
  } // empty constructor

  public Computer (int ram, int weight, String color){
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public String getColor (){
    return color;
  }

  public void setRam (int ram){
    this.ram = ram;
  }

  public void setWeight (int weight){
    this.weight = weight;
  }
  public void setColor (String color){
    this.color = color;
  }

  public int getRam (){
    return ram;
  }

  public static void test(){
    System.out.println("HI");
  }
  public static void main(String[] args) {
    List <Integer> list = new LinkedList<>();
  }
  
} // End of Class
