public class Student2 extends Person2 implements Runnable, Swimable,Move{

  private String name;
  private int score;

  @Override
  public void breath(){

  };
  @Override
  public void run(){
    System.out.println("Student is running");
  }
  @Override
  public void swim(){
    System.out.println("Student is swimming");
  }
  @Override
  public void jump(){

  }
  

  public static void main(String[] args){
    Move move = new Student2();
    move.jump();
  

    Move dog = new Dog();
    dog.jump();


    Swimable swimable = new Student2();
    swimable.swim();

    Person2 person = new Student2();
    //person.breath();
  }
  
}
