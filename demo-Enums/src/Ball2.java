import java.util.Objects;

public class Ball2{
  Color color;

  public Ball2(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Ball2)){
      return false;
    }
    Ball2 b = (Ball2) obj;
    return Objects.equals(this.getColor(), b.getColor());
  }

  public static void main(String[] args){
    Ball2 ball = new Ball2(Color.RED); 
    System.out.println(ball.getColor()); // 
    System.out.println(ball.getColor()); // 
  }
}
