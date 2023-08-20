package OOP.Car;

public class Main {
  public static void main (String [] args){
    Store store = new Store();
    Car car = Car.builder().color(Color.RED).build();
    Car car2 = Car.builder().color(Color.YELLOW).price(45.45).build();
    Car car24 = Car.builder().color(Color.YELLOW).price(45.45).build();
    Car car25 = Car.builder().color(Color.YELLOW).price(45.458).build();
    Car car3 = Car.builder().color(Color.RED).price(435.343).build();
    Car car4 = Car.builder().color(Color.RED).price(42343).model(Model.HK749).build();
    Car car5 = Car.builder().color(Color.RED).price(435.345).model(Model.XL304).build();
    
    store.add(car,car2,car3,car4,car5,car24,car25);
    System.out.println(store.yellowOrders);
    System.out.println(store.yeowOrders);

    Car foundCar = store.findCar2(Model.IE123);
    System.out.println(foundCar);
    
  }
}
