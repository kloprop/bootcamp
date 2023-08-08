package arraylist1;
import java.util.ArrayList;

public class Pocket {
  private ArrayList<Ball> balls;

  public Pocket(){
    this.balls = new ArrayList<>();
  }

  public boolean isFull(){
    return this.balls.size() >= 5;
  }

  
  public int getSize(){
    return this.balls.size();
  }

  public int getTotalScore(){
    int sum = 0;
    for (Ball b : this.balls){
      sum += b.getScore();
    }
    return sum;
  }
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for (Ball ball : balls){
     sb.append(ball).append(""); 
    }
    return "[" +sb.toString()+"]";
  }
 

  public void removeFirstBall(){
    this.balls.remove(0);
  }

  public void add(Ball ball){ // would it be null?
    // if numbers of ball > 5, remove the 1st (ind = 0)
    /* if (this.balls.size() == 5){
      this.balls.remove(0);
    } */

    this.balls.add(ball);
  }


  public void remove(Ball ball){
    this.balls.remove(ball);
  }

  public void remove (int id){
    for (Ball ball: this.balls){
      if (ball.id() == id){
        this.balls.remove(ball);
        return;
      }
    }
  }

}
