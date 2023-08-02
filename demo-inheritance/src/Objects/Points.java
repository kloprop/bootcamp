package Objects;

import java.util.Objects;

public class Points {
  private int x;
  private int y;

  public Points(int x, int y){
    this.x = x;
    this.y = y;
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.x,this.y);
  }

  @Override
  public boolean equals(Object o){
    if (o == this){
      return true;
    }

    if(!(o instanceof Points )){
      return false;
    }

    Points p = (Points) o;
    //return p.x == this.x && p.y == this.y;
    return Objects.equals(p.x,this.x) && Objects.equals(p.y,this.y);
  }

  public static void main(String[] args) {
    Points p = new Points(2, 4);
    Points p2 = new Points(2, 4);

    System.out.println(p.equals(p2));
    Long l = 1L; // 1, unbox -> primitive long
    int i = 1; // 1, auto-box -> Integer
    Points.print(10L); // long -> autobox -> Long
    Points.print(Long.valueOf("10")); // Long object
    // Point.print(10); // cannot convert int to Long, compile error
    Points.print((long) 10); // int -> long -> autobox -> Long

    if (Long.valueOf("100") < 101) {
      // convert Long 100 -> long 100
      // 101 -> int
      // long vs int
    }

    if (Boolean.valueOf(false) == false) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    if (Boolean.valueOf(false).equals(false)) {
      // right: false -> boolean
      // left: Boolean false -> boolean false
      // boolean vs boolean
    }

    // unbox Long, and upcast int
    System.out.println(l == i); // true, finally long == int
    // Big bug here
    Integer i2 = 1;
    System.out.println(Objects.equals(l, i)); // false
    System.out.println(Objects.equals(Long.valueOf(1L), Integer.valueOf(1))); // false
    // Long and Integer equals require same instance

  }

  public static void print(Long l) {
    System.out.println("l=" + l);
  }

    
  }

