public class Person implements Swimable {
  String name;
  @Override
  public void swim(){
  System.out.println("Person is swimming");
  }

  public static void main(String[] args) {
    //Person person = new Person();
    //person.swim();

    Swimable person1 = () -> System.out.println("Person 1 is swimming");
    person1.swim();

    Swimable person2 = () -> System.out.println("Person 2 is swimming");
    person2.swim();


  }
}
