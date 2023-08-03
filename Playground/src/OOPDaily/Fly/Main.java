package Fly;

public class Main {
  public static void main(String[] args){
    Airplane a = new Airplane(500, -1);
    Airplane b = new Airplane(500, 1000);
    a.fly();
    Flyable a2 = new Helicopter(23);
    Flyable a3 = new Airplane(23,5);

    if(a2 instanceof Helicopter){
      Helicopter h = (Helicopter) a2;
      h.fly();
    }
  
  }
}
