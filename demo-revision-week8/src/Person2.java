import java.util.List;

public class Person2 {
  private String name;
  private List<String> addresses;

  public Person2(String name, List<String> addresses) {
    this.name = name;
    this.addresses = addresses;
  }

  public String getname() {
    return this.name;
  }

  public List<String> getAddresses() {
    return this.addresses;
  }

  public String toString() {
    return String.format("Person : [name: %s , address : %s]", //
        this.name, this.addresses);
  }
}
