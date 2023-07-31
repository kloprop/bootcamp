public class Student extends Adult {
  // Must implement super class abstract method


  /* public Student(int age, double height){
    super(age,height);
  } */
  /* public Student (){
    super();
  } */

  public void sleep(){
    System.out.println("I am student, sleeping");
  }

  public void read(){
    System.out.println("I am student, sleeping");
  }
  public static void main(String[] args){
    /* Student student = new Student ();
    student.sleep();
    student.read();
    student.run();
    student.eat(); */

    Dog d = new Dog("hi", 23.6, 56);
    Fish f = new Fish("rt", 23.6, 56,2);
    d.bark();
    System.out.println(d.getSpecies());
    

  }
}
