

public abstract class GameMember {

  private int score;

  public int getScore (){
    return this.score;
  }

  public void setScore(int score){
    this.score = score;
  }
  public void addScore(int score){
    this.score += score;
  }



  public abstract void up();
  public abstract void down();
  public abstract void right();
  public abstract void left();

  /* public static void up(GameMember obj){
    obj.setScore(0);

  } */

  public static void upOnce(GameMember... members){
    for (GameMember member : members){ 
      member.up(); // dog / student objects perform up(), add score
    }
  }
  public static void jumpOnce(Move... moves){
    for (Move move : moves){ 
      move.jump(); // dog / student objects perform up(), add score
    }
  }
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());
    
    GameMember.jumpOnce(dog,cat);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());
    // Interface default instance method
    dog.print();
    cat.print(); 
    
    // Interface static method
    System.out.println(Move.concat("abc", "abc"));
  }
}
