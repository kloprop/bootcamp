

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Box<T extends Number> { // any class extending Object

  private ArrayList<T> numbers;

  private Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
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
    Box<Number> box1 = new Box<>(100); // compile-time check
    Box<Integer> box2 = new Box<>(100); // compile-time check
    Box<Double> box3 = new Box<>(100d); // compile-time check
    System.out.println(box1.size()); // 1
  }
}