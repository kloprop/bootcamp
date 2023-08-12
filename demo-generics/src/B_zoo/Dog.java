package B_zoo;
public class Dog extends Animal {

  String name;
  private Dog(String name){
    this.name= name;
  }

  public static Dog of (String name){
    return new Dog(name);
  }
  public static void main(String[] args) {
    Dog dog = new Dog("cde");
    System.out.println(dog.getName());
  }
}
