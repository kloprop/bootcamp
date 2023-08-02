
public class Dog extends GameMember implements Move {
  

  @Override
  public void jump(){
    addScore(3);
  }
  @Override
  public void up(){
    addScore(2);
  }
  @Override
  public void down(){

  }
  @Override
  public void right(){

  }
  @Override
  public void left(){

  }
  
}
