import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface 
// Annotation: check if this interface has one abstract method only
public interface Swimable {
  void swim();

  public static void main(String[] args) {
    //Person person = new Person();
    //person.swim();

    Comparator<Person> sortByNameDesc = (Person p1, Person p2) -> p2.name.charAt(0) > p1.name.charAt(0) ? 1:-1;
    List <Person> persons = Arrays.asList(new Person(), new Person());
    Collections.sort(persons,sortByNameDesc);
    System.out.println(persons);

    Swimable person1 = () -> System.out.println("Person 1 is swimming"); // it is a new object
    person1.swim();
    // It is functionalInterface, object only implement one interface

    Swimable person2 = () -> {
      System.out.println("Person 2 start to swim");
      System.out.println("Person 2 stop swimming");
    };
    person2.swim();


  }
}
