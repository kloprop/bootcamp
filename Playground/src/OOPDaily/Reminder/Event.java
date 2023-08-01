package Reminder;

import java.time.LocalDate;

public class Event {
  private String name;
  private LocalDate date;

  public Event (String name,LocalDate date){
    this.name = name;
    this.date = date;
  }

  public String getName(){
    return this.name;
  }

  public LocalDate getDate(){
    return this.date;
  }
  
  public void setDate (LocalDate date){
    this.date = date;
  }
}
