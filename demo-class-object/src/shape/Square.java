package shape;

import java.util.Arrays;

public class Square {
  private final Edge [] edges; // instance variable // may not be initialized // address cant be changed // fixed length, no worry about how many edges

  public Square (){
    int id = 0;
    this.edges = new Edge[4];
    this.edges[0] = new Edge(++id,3.0d, "RED");
    this.edges[1] = new Edge(++id,3.0d, "YEllOW");
    this.edges[2] = new Edge(++id,3.0d, "WHITE");
    this.edges[3] = new Edge(++id,3.0d, "BROWN");
  }
  private Square (double length){
    int id = 0;
    this.edges = new Edge[4];
    this.edges[0] = new Edge(++id,length, "RED");
    this.edges[1] = new Edge(++id,length, "RED");
    this.edges[2] = new Edge(++id,length, "RED");
    this.edges[3] = new Edge(++id,length, "RED");
  }

  public static Square of (double length){ // user use of to create squre avoid directly call constructor
    return new Square(length);
  }
  public static Square of (String str){
    return new Square (Double.valueOf(str));
  }

  private Edge[] getEdges(){
    return this.edges;
  }

  public void modify (double length){ // directly change the length without changing the array
    for (int i = 0 ; i< this.edges.length ; i++){
      this.getEdges()[i].setLength(length);
    }
  }
  public void modify (String color){
    for (int i = 0 ; i< this.edges.length ; i++){
      this.getEdges()[i].setColor(color);
    }
  }
  public Edge getEdge(int edgeId){
    return this.edges[edgeId -1];
  }
 


}
