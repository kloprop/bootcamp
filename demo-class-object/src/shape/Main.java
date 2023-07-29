package shape;

public class Main {
  public static void main(String[] args) {
    Square square = new Square();
    Square square2 = new Square();
    Square s2 = Square.of(5);

    square2.modify("RED");
    System.out.println(square.getEdge(1).getId());
    
  }
}
