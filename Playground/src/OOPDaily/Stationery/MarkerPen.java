package Stationery;

import java.math.BigDecimal;
import java.util.Objects;

public class MarkerPen extends Pen {
  private String color;
  private static final double pricePerml = 0.3;
  private static final double useagePermin = 0.2;

  public MarkerPen(String color, double maxInk) {
    this.color = color;
    this.setType("Marker Pen");
    this.setMaxInk(maxInk);
    this.setTotalInk(maxInk);
    this.setFunction("Marking");
    this.setPrice(pricing(maxInk));

  }

  private static double pricing(double maxInk){
   return BigDecimal.valueOf(pricePerml)
        .multiply(BigDecimal.valueOf(maxInk)).doubleValue();
  }

  public void use(int time) {
    BigDecimal usage = BigDecimal.valueOf(time * useagePermin);
    double ink =
        BigDecimal.valueOf(this.getMaxInk()).subtract(usage).doubleValue();
    this.setTotalInk(ink);

  }

  @Override
  public void refill() {
    this.setTotalInk(this.getMaxInk());;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getFunction(), this.getMaxInk(), this.getType());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof MarkerPen)) {
      return false;
    }
    MarkerPen p = (MarkerPen) obj;

    return Objects.equals(this.getFunction(), p.getFunction())
        && Objects.equals(this.getMaxInk(), p.getMaxInk())
        && Objects.equals(this.getType(), p.getType());

  }

  @Override
  public String toString() {
    return "Color: " + this.color + " Remaining ink: " + this.getTotalInk();
  }
}
