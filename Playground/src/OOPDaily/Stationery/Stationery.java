package Stationery;

import java.math.BigDecimal;

public abstract class Stationery {
  private String type;
  private double price;
  private String function;

  public abstract void use(int time);


  public static double totalPrice(Stationery[] arr) {
    BigDecimal total = BigDecimal.valueOf(0);
    for (Stationery s : arr) {
      total = total.add(BigDecimal.valueOf(s.getPrice()));
    }
    return total.doubleValue();
  }

  public String getType() {
    return this.type;
  }

  public double getPrice() {
    return this.price;
  }

  public String getFunction() {
    return this.function;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setFunction(String function) {
    this.function = function;
  }
}
