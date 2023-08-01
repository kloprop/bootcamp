package Supermarket;

public class Staff {
  private String name;
  private String position;
  private int salery;
  private int performance;
  private String workTime;

  public Staff(String name,String position,int salery){
    this.name = name;
    this.position = position;
    this.salery = salery;
  }
  public Staff(String name,String position,int salery,String workTime){
    this.name = name;
    this.position = position;
    this.salery = salery;
    this.workTime = workTime;
  }

  public String getName (){
    return this.name;
  }
  public String getPosition (){
    return this.position;
  }
  public int getSalery (){
    return this.salery;
  }
  public int getPerformance (){
    return this.performance;
  }
  public String getWorkTime (){
    return this.workTime;
  }
  
  public void setName(String name){ 
    this.name = name;
  }
  public void setPosition(String position){
    this.position = position;
  }
  public void setSalery(int salery){
    this.salery = salery;
  }
  public void setPerformance(int performance){
    this.performance = performance;
  }
  public void setWorkTime(String workTime){
    this.workTime = workTime;
  }

  public void adjustSalery (int amount){
    this.salery += amount;
  }

  public void adjustPerformance (int adjustment){
    this.performance += adjustment;
    String f = "dd";

    
  }
  



  
} // End of Class
