package shape;

public class Edge {
  private double length;
  private String color;
  private int id;

  public Edge(int id , double length, String color){
    this.length = length;
    this.color = color;
    this.id = id;
  }


   public void setColor(String color){
      this.color = color;
    }

    public void setLength(double length){
      this.length = length;
    }

  public String getColor (){
    return this.color;
  }
  public int getId(){
    return this.id;
  }
  
}
