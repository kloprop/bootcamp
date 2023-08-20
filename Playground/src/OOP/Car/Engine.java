package OOP.Car;

public class Engine {
  int price = 3;

  @Override
  public String toString(){
    return String.format("[Price : %d]", this.price);
  }
}
