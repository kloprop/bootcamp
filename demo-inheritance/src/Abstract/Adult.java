package Abstract;
public abstract class Adult extends Person{
  // abstract class extends abstract class
  // implicitly "extends" abstract method

  /* public Adult (){
    super();
  } */
 /*  public Adult (int age, double height){
    super(age,height);
  } */
  public abstract void read();

  public void eat (){
    System.out.println("I am Adult, eating.");
  }
}
