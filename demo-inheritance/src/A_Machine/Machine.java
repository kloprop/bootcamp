public class Machine {

  private double weight;

  public Machine() {

  }

  public Machine(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void start() {
    System.out.println("Machine starts...");
  }

  public void stop() {
    System.out.println("Machine stops...");

  }

  public static  String staticMethod(String x, String y) {
    return  x;
  }
  public static Machine produce(int code) { // produce subclass
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop (int code){
    Machine machine = Machine.produce(code);
    machine.stop(); // different sub class will have different implements
  }




  public static void main(String[] args) {
    boolean stopCondition = 3>2; // customoized condition
    if (stopCondition){
      Machine.stop(1); // Machine stop
    }
    
  }
}
