public abstract class Person { // can not final and abstract class at the same time, abstract class cant be created
  private int age ;
  private double height;
 // May contain instance method with implementation
/* public Person(){

} */
/* public Person(int age, double height){
  this.age = age;
  this.height = height;
} */

 public void run(){
  System.out.println("I am running");
 }

 public int getAge(){
  return this.age;
 }

 public double getHeight(){
  return this.height;
 }

 // May contain abstract method (without implementation)
 public abstract void sleep();
}
