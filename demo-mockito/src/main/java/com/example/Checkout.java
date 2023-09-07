package com.example;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor // must pass a calculator, no empty constructor provided
public class Checkout {

  @NonNull
  private Calculator calculator;

  public String print(String name){
    return name;
  }

  public int add(int x, int y) {
    // Calculator calculator = new Calculator(weight);
    if (x > 1) {
      return y + this.calculator.substract(x, y);
      // return 104 ;//+ this.calculator.substract(x, y);
    }
    return x + y;
  }

  public int multiply(int x, int y) {
    if (x > 1) {
      return y + this.calculator.multiply(x, y);
    } else if (x == 0) {
      return y + this.calculator.substract(x, y);
    }
    return this.calculator.multiply(x, y) 
            + this.calculator.substract(x, y);
    // Use Spy to test multiply and substract's return value
  }



}
