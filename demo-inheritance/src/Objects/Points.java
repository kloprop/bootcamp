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
  }
}
