package Fly;

import java.util.Objects;

public class Airplane extends Aircrafts implements Flyable {
  public Airplane(double maxSpeed, double oilTank) {
    if (maxSpeed <= 0 || oilTank <= 500) {
      return;
    }
    this.setMaxSpeed(maxSpeed);
    this.setOilTank(3000);
  }

  @Override
  public void transportation() {
    System.out.println("I transport with the use of ariplane");
  }

  @Override
  public void fly() {
    System.out.println("I am flying");
    this.setFlying(true);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getOilTank());
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Airplane)) {
      return false;
    }
    Airplane air = (Airplane) obj;
    return Objects.equals(this.getOilTank(), air.getOilTank());
  }

  @Override
  public String toString() {
    return "I am an airplane";
  }


}
