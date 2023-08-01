package Objects;

public class ObjectDemo {
  // Rule: all class extends Object implicitly
  String name;

 
  /* @Override
  public String toString(){
    return name;
  } */
  public static void main(String[] args) {
    // Example 1: ObjectDemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    // hash code -> int 
    objectDemo.hashCode(); // another presentation of object reference
    // hash code has shorter range for storing value
    // so, it cannm=ot store all memory address( object reference) in your machine

    String s = "abc";
    System.out.println(s); //abc -> toString override toString 
    System.out.println(objectDemo);
    System.out.println("abc hashcode()= "+ s.hashCode()); //96354 (come from formula)


    // equals()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); //true

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));

    
  }
}
