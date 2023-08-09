import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{

  @Override
  public int compare(Ball b1, Ball b2){
    return b1.color.id < b2.color.id? -1:1;
  }
 /*  public int compare(Ball b1, Ball b2){
    if (b1.color == b2.color){
      return b1.id < b2.id? -1:1;
    }else{
      return b1.color.id < b2.color.id? -1:1;
    }
  } */
  
  public static void main(String[] args) {
    ArrayList <Ball> balls = new ArrayList<>();
        balls.add(new Ball(4,Color.YELLOW));
        balls.add(new Ball(10,Color.YELLOW));
        balls.add(new Ball(1, Color.RED));
        balls.add(new Ball(6,Color.YELLOW));
        balls.add(new Ball(100,Color.BLUE));
        balls.add(new Ball(5, Color.RED));
        Collections.sort(balls);
        System.out.println(balls);
        Collections.sort(balls,new SortByColor());
        System.out.println(balls);

  }
}
