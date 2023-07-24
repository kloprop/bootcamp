public class Car {
 private int noOfWheel;

 private int capacity;

 private String color;


  public Car (){
    this.noOfWheel = 0;
    this.capacity = 0;
    this.color = null;
  }

public Car (int noOfWheel, int capacity,String color){
  this.noOfWheel = noOfWheel;
  this.capacity = capacity;
  this.color = color;
}


  public int getNoOFWheel(){
    return this.noOfWheel;
  }

  public int getCapacity(){
    return this.capacity;
  }
  public String getColor(){
    return this.color;
  }

  public void setNoOfWheel(int n){
    this.noOfWheel = n;

  }

  public void setCapacity(int n){
    this.capacity = n;

  }

  public void setColor(String color){
    this.color = color;
  }

} // End of Class
