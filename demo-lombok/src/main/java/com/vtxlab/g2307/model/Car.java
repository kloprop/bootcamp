package com.vtxlab.g2307.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
// @NoArgsConstructor
@RequiredArgsConstructor // minimal constructor to create object, augs that must be declared

public class Car {

  @NonNull
  private Integer capacity;
  private final double weight =9;
  private String color;

  public Car(String color){
    this.color = color;
  }

  
public static void main(String[] args) {
  Car car = new Car(10);
  System.out.println(car.capacity);
}
}
