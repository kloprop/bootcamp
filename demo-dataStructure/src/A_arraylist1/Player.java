package A_arraylist1;
public interface Player {
  
  int calculateScore();
  public static void fillThePocket(Pocket pocket){
    while (!pocket.isFull()) {
      pocket.add(Ball.random());
    }
  };
}
