package A_arraylist1;
import java.util.Objects;

public class Ball {
  private int id ;
  private Color color;
  private static int count = 0;


  public Ball(Color color){
    this.id = ++count;
    this.color = color;
  }

  public static Ball random(){
    return new Ball(Color.getRandomColor());
  }


  public int id(){
    return this.id;
  }
  public Color color(){
    return this.color;
  }
  public void setId(int id){
    this.id = id;
  }
  public void setColor(Color color){
    this.color = color;
  }
  public int getScore(){
    return this.color.getScore();
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.id, this.color);
  }

  @Override
  public boolean equals(Object obj){
    if (obj == this){
      return true;
    }
    if (!(obj instanceof Ball)){
      return false;
    }
    Ball b = (Ball) obj;
    return this.color == b.color() && this.id == b.id;
  }

  @Override 
  public String toString (){
    return  "id= " + this.id + " color= " +this.color+",   ";
  }
}
