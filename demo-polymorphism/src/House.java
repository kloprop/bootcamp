public class House extends Building{
  private double capacity;


  public House(){

  }
  public House(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity(){
    return this.capacity;
  }

  @Override
  public void print(){
    System.out.println("I am house");
  }

  public void print(String s){ // override
    System.out.println("String printing");
  }

  public void live(){
    System.out.println("live");
  }

}
