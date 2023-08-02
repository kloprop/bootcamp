package Fly;

public abstract class Aircrafts implements Airtransport {
  private double maxSpeed;
  private double oilTank;
  private boolean isFlying;

  public double getMaxspeed() {
    return this.maxSpeed;
  }

  public void setMaxSpeed(double speed) {
    if (speed <= 0) {
      return;
    }
    this.maxSpeed = speed;
  }

  public double getOilTank() {
    return this.oilTank;
  }

  public void setOilTank(double volume) {
    if (volume < 0) {
      return;
    }
    this.oilTank = volume;
  }

  public boolean flying() {
    return this.isFlying;
  }

  public void setFlying(boolean b) {
    this.isFlying = b;
  }
}
