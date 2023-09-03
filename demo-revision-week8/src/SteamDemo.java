import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamDemo {

  public static List<String> getStrFromDb(String lastName) {
    List<Person3> persons = new ArrayList<>();
    persons.add(new Person3("John Chan"));
    persons.add(new Person3("Eric Lau"));
    persons.add(new Person3("Peter Lau"));

    return persons.stream()//
        .filter(e -> e.getName().endsWith(lastName))//
        .map(e -> e.getName())//
        .collect(Collectors.toList());
  }

  public static List<String> getStrFromDb2(String lastName) {
    List<Person3> persons = new ArrayList<>();
    persons.add(new Person3("John Chan"));
    persons.add(new Person3("Eric Lau"));
    persons.add(new Person3("Peter Lau"));

    List<String> res = new LinkedList<>();
    for (Person3 p : persons) {
      res.add(p.getName());
    }
    return res;
  }


  public static List<Person3> getFromDb(String lastName) {
    List<Person3> persons = new ArrayList<>();
    persons.add(new Person3("John Chan"));
    persons.add(new Person3("Eric Lau"));
    persons.add(new Person3("Peter Lau"));

    // Stream

    return persons.stream()
        .filter(e -> e.getName().split(" ")[1].equals(lastName))//
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(SteamDemo.getFromDb("Lau"));
    System.out.println(SteamDemo.getStrFromDb("Lau"));

    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person2 p1 = new Person2("Ann", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person2 p2 = new Person2("Betty", addresses2);

    List<Person2> list2 = new ArrayList<>();
    list2.add(p1);
    list2.add(p2);
    // return all addresses (List<String>)from List<Person>
    System.out.println(SteamDemo.getAllAddresses(list2));
    System.out.println(SteamDemo.getAllAddresses2(list2));
  }

  public static List<String> getAllNames(List<Person2> persons) {
    return persons.stream() //
        .flatMap(p -> p.getAddresses().stream()) //
        .collect(Collectors.toList());

  }

  public static List<String> getAllAddresses(List<Person2> persons) {
    return persons.stream()//
        .flatMap(person -> person.getAddresses().stream()) //
        // extract list from list
        // change the list to stream
        .collect(Collectors.toList());
  }
  public static List<String> getAllAddresses2(List<Person2> persons) {
      List <String> addresses = new LinkedList<>();
      for (Person2 p : persons){
        for (String a : p.getAddresses()){
          addresses.add(a);
        }
      }
      return addresses;
  }


}
