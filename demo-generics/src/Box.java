import java.util.ArrayList;

public class Box <T extends Number> {
  
  private ArrayList<T> numbers;

  public Box (){
    numbers = new ArrayList<>();
  }
  public Box(T number){
    this();
    this.numbers.add(number);
  }

 /*  public ArrayList<T> getNumbers(){
    return this.numbers;
  } */

 /*  public void setNumbers(T [] numbers){
    this.numbers = numbers;
  } */

  public void add(T number){
    this.numbers.add(number);
  }

  public int size (){
    return this.numbers.size();
  }
  public static void main(String[] args) {
    
    Box<Integer> box1 = new Box<>(100);
    System.out.println(box1.size());
  }
}
