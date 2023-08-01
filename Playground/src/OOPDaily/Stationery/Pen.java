package Stationery;

public abstract class Pen extends Stationery {
  private double maxInk;
  private double totalInk;



  public abstract void refill();

  public double getMaxInk() {
    return this.maxInk;
  }

  public double getTotalInk() {
    return this.totalInk;
  }

  public void setMaxInk(double maxInk) {
    this.maxInk = maxInk;
  }

  public void setTotalInk(double totalInk) {
    this.totalInk = totalInk;
  }
}
