
public class Cat extends GameMember implements Move{
  String name;


  @Override
  public void jump(){
    super.addScore(1);
  }
  @Override
  public void up(){
    super.addScore(2);
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
