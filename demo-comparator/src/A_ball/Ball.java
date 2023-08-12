import java.util.Comparator;

public class Ball implements Comparable<Ball>  {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.color = color;
    this.id = id;
  }

  @Override


  /* public int compareTo(Ball b1) {
    return this.id > b1.id ? 1 : -1; // b1 greater than this, swap // ascending order
    // this and next : 1 means put to the right // ascending
    // next and this : 1 means put to the left //descending

  } */



  public int compareTo(Ball b1) {
    if (this.color == Color.YELLOW && b1.color != Color.YELLOW) {
      return -1;
    }
    if (this.color != Color.YELLOW && b1.color == Color.YELLOW) {
      return 1;
    }
    if (this.color == Color.YELLOW && b1.color == Color.YELLOW) {
      return this.id > b1.id ? 1 : -1;
    } else {
      return this.id > b1.id ? -1 : 1;
    }
  }


  @Override
  public String toString() {
    return String.valueOf(this.id) + " " + String.valueOf(this.color);
  }
}
