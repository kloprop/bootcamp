package hashset1;

import java.util.Objects;

public class Coordinate {
  int x;
  int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Coordinate)) {
      return false;
    }
    Coordinate c = (Coordinate) obj;
    return Objects.equals(this.x, c.x) && Objects.equals(this.y, c.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }


}
