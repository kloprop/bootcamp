package OOP.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.text.html.Option;

public class Store {
  List<Car> orders = new ArrayList<>();
  List<Car> yellowOrders = new ArrayList<>();
  List<Double> yeowOrders = new ArrayList<>();


  public void add(Car... cars) {
    for (Car car : cars) {
      this.orders.add(car);
    } ;

    this.yellowOrders = orders.stream()//
        .filter(c -> c.getColor() == Color.YELLOW)//
        .collect(Collectors.toList());
  }
  
  public Car findCar2(Model model) {
    return this.orders.stream()//
        .filter(c -> c.getModel() == model)//
        .findAny()//
        .orElseGet(() -> new Car());
  }
  

}
