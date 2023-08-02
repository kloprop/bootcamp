package Fly;

public class Main {
  public static void main(String[] args){
    Airplane a = new Airplane(500, -1);
    Airplane b = new Airplane(500, 1000);
    a.fly();
  /*   System.out.println(a.equals(b));
    Helicopter c = new Helicopter(0);
    System.out.println(c.getMaxspeed());
    Helicopter d = new Helicopter(3.3d);
    c.fly();
    d.fly();
    System.out.println(c.equals(d));
    System.out.println(a.toString()); */
  }
}
