package OOPDaily.SportsEvent;

public class SportsDay {
  private Day day;
  
  public Day getDay(){
    return this.day;
  } 
  public void setDay (Day day){
    this.day = day;
  }
  public void start(){
    System.out.println("Sports Day starts");
  }
}
