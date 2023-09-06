package com.vtxlab.g2307.model.Staff;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)

public class Staff2 extends Human {
  private double salary;

  public Staff2(String name, double salary){
    super(name);
    this.salary = salary;
  }


  public static void main(String[] args) {
    Staff2 staff = new Staff2("John", 3000.0);
    Staff2 staff2 = new Staff2("Mary", 3000.0);
    System.out.println(staff.equals(staff2));
  }
}
