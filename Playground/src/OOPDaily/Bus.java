
public class Bus {
  private String driver;
  private int price;
  private String customers;
  private String engineModel;
  private int numOfWheel;

  public Bus (){

  };
  public Bus (String driver,int price,String customers,String engineModel,int numOfWheel){
    this.driver = driver;
    this.price = price;
    this.customers = customers;
    this.engineModel = engineModel;
    this.numOfWheel = numOfWheel;
  }

  public String getDriver(){
    return this.driver;
  }
  public int getPrice (){
    return this.price;
  }
  public String getCustomers(){
    return this.customers;
  }
  public String getEngineModel(){
    return this.engineModel;
  }
  public int getNumOfWheel(){
    return this.numOfWheel;
  }

  public void setDriver(String driver){
    this.driver = driver;
  }
  public void setPrice (int price){
    this.price = price;
  }
  public void setCustomers(String customers){
    this.customers = customers;
  }
  public void setEngineModel(String engineModel){
    this.engineModel= engineModel;
  }
  public void setNumOfWheel(int numOfWheel){
    this.numOfWheel = numOfWheel;
  }
}
