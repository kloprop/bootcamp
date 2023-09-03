import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

  public static Optional<Person2> getFromDb(List<Person2> persons,
      String lastName) {
    return persons.stream() //
        .filter(p -> p.getname().endsWith(lastName))//
        .findAny()//
    ;
  }

  public static void main(String[] args) {
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person2 p1 = new Person2("Ann Chan", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person2 p2 = new Person2("Betty Chen", addresses2);

    List<Person2> list2 = new ArrayList<>();
    list2.add(p1);
    list2.add(p2);

    Optional<Person2> res = getFromDb(list2, "Chan");
    res.ifPresent(p -> p.getAddresses().stream()//
        .forEach(s -> System.out.println(s)));
  }
}
