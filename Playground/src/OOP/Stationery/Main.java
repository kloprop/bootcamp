package Stationery;

public class Main {
  public static void main(String[] args) {
    MarkerPen s = new MarkerPen("Blue",300);
    System.out.println(s.getFunction());
    System.out.println(s.getMaxInk());
    System.out.println(s.getPrice());
    System.out.println(s.getTotalInk());
    System.out.println(s.getType());
    System.out.println(s.toString());
    s.use(2);
    System.out.println(s.getTotalInk());
    s.refill();
    System.out.println(s.getTotalInk());
    System.out.println();

    MarkerPen s2 = new MarkerPen("Red",500);
    System.out.println(s2.getFunction());
    System.out.println(s2.getMaxInk());
    System.out.println("s"+s2.getPrice());
    System.out.println(s2.getTotalInk());
    System.out.println(s2.getType());

    Stationery [] ss = new Stationery[] {s,s2};

    
    
    
    System.out.println(s2.toString());
    System.out.println(s.equals(s2));
    System.out.println(Stationery.totalPrice(ss));
  }
}
