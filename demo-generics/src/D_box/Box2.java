package D_box;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Box2 { // any class extending Object

  private ArrayList<Number> numbers;

  private Box2() {
    numbers = new ArrayList<>();
  }

  public Box2(Number number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public ArrayList<Number> getNumbers() {
    return this.numbers;
  }

  public void add(Number number) {
    numbers.add(number); // null pointer
  }

  public int size() {
    return numbers.size();
  }

  // public void setNumbers(T[] numbers) {
  // this.numbers = numbers;
  // }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<>();
    /* Box<Number> box1 = new Box<>(100); // compile-time check
    Box<Integer> box2 = new Box<>(100); // compile-time check
    Box<Double> box3 = new Box<>(100d); // compile-time check */

    Box2 box4 = new Box2(); 
    box4.add(2);
    System.out.println(box4.size()); // 1
  }
}