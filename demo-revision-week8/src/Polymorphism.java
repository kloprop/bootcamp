import java.util.Arrays;

public class Polymorphism {
  
  
  public static void main(String[] args) {
    //dynamic polymorphism
    // Customer extend Human implements Orderable

    Human customer = new Customer("John");
    customer.order();
    Customer customer2 = new Customer("Mary");
    customer2.humanOrder();
    System.out.println(Customer.counter);
    
    
    // Interface
    Orderable customer3 = new Customer("Eric");
    customer3.order(); 
    System.out.println(Customer.counter);

    Orderable [] orders = new Orderable[] {new Customer("Peter"), new Driver()};  
   
    Orderable order = getByName(orders, "Peter");
    order.order();
    
  }

  public static Orderable getByName(Orderable [] orders, String name){
    // steam?
    /* for (Orderable order : orders){
      if (order instanceof Customer){
        Customer customer = (Customer) order;
        if (name.equals(customer.getName())){
          return customer;
        }
      }
    }
    return new Driver(); */

    return Arrays.stream(orders)//
            .filter(o -> o instanceof Customer)//
            .map(o -> (Customer) o)//
            .filter(c -> name.equals(c.getName()))//
            .findAny()
            .orElse(null);
  }



}
