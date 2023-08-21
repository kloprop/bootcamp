package OOP.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main (String [] args){
    Store store = new Store();
    Car car = Car.builder().color(Color.RED).build();
    Car car2 = Car.builder().color(Color.YELLOW).price(45.45).build();
    Car car3 = Car.builder().color(Color.RED).price(435.343).build();
    Car car4 = Car.builder().color(Color.RED).price(42343).model(Model.HK749).build();
    Car car5 = Car.builder().color(Color.RED).price(435.345).model(Model.XL304).build();
    Car car6 = Car.builder().color(Color.YELLOW).price(45.45).build();
    Car car7 = Car.builder().color(Color.YELLOW).price(45.458).build();
    
    List <Car> list = new ArrayList<>();
    list.add(car);
    list.add(car2);
    list.add(car3);
    list.add(car4);
    list.add(car5);
    list.stream()//
    .collect(Collectors.groupingBy(c -> c.getModel()))//
    .forEach((key,value)-> System.out.println(String.format("%s :  %s", key,value)));;
    

    
    
  }
}
