package shape;

import java.util.Arrays;

public class Square {
  private Edge [] edges; // instance variable

  public Square (){
    this.edges = new Edge[4];
    this.edges[0] = new Edge(3.0d, "RED");
    this.edges[1] = new Edge(3.0d, "YEllOW");
    this.edges[2] = new Edge(3.0d, "WHITE");
    this.edges[3] = new Edge(3.0d, "BROWN");
  }
  public Square (double length){
    this.edges = new Edge[4];
    this.edges[0] = new Edge(length, "RED");
    this.edges[1] = new Edge(length, "RED");
    this.edges[2] = new Edge(length, "RED");
    this.edges[3] = new Edge(length, "RED");
  }

  public Edge[] getEdges(){
    return this.edges;
  }
  public static void main(String[] args) {
    Square square = new Square();
    Square square2 = new Square();
    Square square3 = new Square(5);

    square3.getEdges()[0].setColor("YELLOW");
  

  }


}
