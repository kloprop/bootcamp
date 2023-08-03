public enum Direction{
  // public class Direction extends Enum
  // enum is final class
  EAST('E',90), SOUTH('S',180), WEST('W',270), NORTH('N',360);

  private char direction;
  private int degree;

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
    return this.degree;
  }

  private Direction (char direction, int degree){
    this.direction = direction;
    this.degree = degree;
  }

public static void main(String [] args){
  System.out.println(Direction.EAST);

  Direction east = Direction.EAST;
  Direction west = Direction.EAST;
  


  // values() -> loop
  for (Direction element: Direction.values()){
    System.out.println(element.name());
  }

  System.out.println(Direction.SOUTH.ordinal());
}

}
