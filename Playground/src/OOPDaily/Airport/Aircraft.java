package Airport;


import java.time.LocalDate;

public class Aircraft {
  private String model;
  private int price;
  private String dateOfProduction;
  private int yearOfLastCheck;
  
  public Aircraft (String model, int price, String dateOfProduction,int yearOfLastCheck){
    this.model = model;
    this.price = price;
    this.dateOfProduction = dateOfProduction;
  }

  public String getModel (){
    return this.model;
  }
  public int getPrice(){
    return this.price;
  }
  public String getDateOfProduction(){
    return this.dateOfProduction;
  }
  public int getyearOfLastCheck(){
    return this.yearOfLastCheck;
  }

  public void setYearOfLastCheck(int year){
    this.yearOfLastCheck = year;
  }

  public boolean isCheckExpired(){
    return ((LocalDate.now().getYear() - this.yearOfLastCheck) > 5); 
  }

}
