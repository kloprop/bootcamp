import java.util.Objects;

public class Laptop extends Machine { // Laptop is subclass, Machine is super class // machine is inside Laptop
  // All variables and methods from Machine are all here, but hidden
  private Keyboard keyboard;
  private Monitor monitor;
  private int volume;

  // subclass must call superclass construct

  public Laptop() {
    // implicitly superclass empty constructor
    super(1.2); // not a must to call empty constructor
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;

  }

  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
    this.keyboard = new Keyboard(buttonType, noOfButton); // help user to create
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {

    // super(weight); // call super first
    // this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;


  }

  @Override // Overriding //check if super have or not
  public void start() {
    System.out.println("Laptop starts...");
  }

  @Override
  public void stop() {
    System.out.println("Laptop ends...");
  }

  public void mute() {
    this.volume = 0;
  }


  public static String staticMethod(String x, String y) {
    return (y);
  } // can not override super class method

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Laptop)) {
      return false;
    }
    Laptop l = (Laptop) obj;
    return Objects.equals(l.keyboard, this.keyboard)
        && Objects.equals(l.monitor, this.monitor);
  }


  public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();
    System.out.println(Machine.staticMethod("x", "y"));
    System.out.println(Laptop.staticMethod("x", "y"));

    // Machine
    /*
     * Machine m = new Machine(); //m.setWeight(5.0d); System.out.println(m.getWeight()); m.start(); m.stop();
     */

    // Laptop laptop2 = new Laptop();

    Machine.staticMethod("r", "t");


  }

}
