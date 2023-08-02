package Fly;

import java.util.Objects;

public class Helicopter extends Aircrafts implements Flyable {

  private int id;
  private static int counter;

  public Helicopter(double maxSpeed) {
    if (maxSpeed <= 0) {
      return;
    }
    this.id = ++counter;
    this.setMaxSpeed(maxSpeed);
    this.setOilTank(1000);
  }

  @Override
  public void transportation() {
    System.out.println("I transport with the use of ariplane");
  }

  @Override
  public void fly() {
    System.out.println("Helicopter " + this.id + " is flying");
    this.setFlying(true);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Helicopter)) {
      return false;
    }
    Helicopter he = (Helicopter) obj;
    return Objects.equals(he.id, this.id);
  }

  @Override
  public String toString() {
    return "ID: " + this.id;
  }



}
