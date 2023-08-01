
public class Office {
  private int numOfTable;
  private String location;
  private int rent;
  private String [] workers;

  public Office(int numOfTable, String location,int rent, String [] workers){
    this.numOfTable = numOfTable;
    this.location = location;
    this.rent = rent;
    this.workers = workers;
  }

  public int getNumOfTable(){
    return this.numOfTable;
  }

  public String getLocation (){
    return this.location;
  }

  public int getRent(){
    return this.rent;
  }

  public String [] getWorkers(){
    return this.workers;
  }

  public void setNumOfTable(int numOfTable){
    this.numOfTable = numOfTable;
  }

  public void setLocation(String location){
    this.location = location;
  }

  public void setRent(int rent){
    this.rent = rent;
  }
  public void setWorkers(String [] workers){
    this.workers = workers;
  }
 
}
