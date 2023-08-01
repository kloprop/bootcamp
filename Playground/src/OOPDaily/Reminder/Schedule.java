package Reminder;

import java.time.LocalDate;


public class Schedule {
  private String owner;
  private final Event[] events;

  private Schedule(String name) {
    this.owner = name;
    this.events = new Event[10];
  }

  public static Schedule of(String name) {
    return new Schedule(name);
  }


  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String name) {
    this.owner = name;
  }

  public Event[] getEvent() {
    return this.events;
  }


  public void add(String name, int day, int month, int year) {
    int emptyId = getEmptyInd();
    if (emptyId == -1) {
      System.out.println("Your schedule is full");
      return;
    }
    Event event = new Event(name, getLocalDate(day, month, year));
    this.events[emptyId] = event;
  }

 /*  public void delete(String name) {
    int id = getInd(name);
    if (id == -1) {
      System.out.println("Event not found");
    } else {
      this.events[id] = null;
    }
  } */

 /*  public void changeDate(String name, int day, int month, int year) {
    if (getInd(name) == -1) {
      System.out.println("Event not found");
    } else {
      this.events[getInd(name)].setDate(null);
    }
  } */

  public int check() {
    return this.events.length;
  }



  private LocalDate getLocalDate(int day, int month, int year) {
    return LocalDate.of(year, month, day);
  }

  private int getEmptyInd() {
    for (int i = 0; i < this.events.length; i++) {
      if (this.events[i] == null){
        return i;
      }
    }
    return -1;
  }

 /*  private int getInd(String name) {
    for (int i = 0; i < this.events.length; i++) {
      if (name.equals(this.events[i].getName()))
        return i;
    }
    return -1;
  } */


} // End Of Class
