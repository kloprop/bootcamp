package com.vtxlab.g2307.model.Staff;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode(callSuper = true) // Default would not call super attribute
// how to write equals and hash manually in extended class?

public class Staff extends Human{
  private double salary;

  // Must manually code the constructor with parent's attribute when extending
  // Allargument and NoArgconstructors shall not be inclued in child class
  public Staff(String name, double salary){
    super(name);
    this.salary = salary;
  }

  /* @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Staff)){
      return false;
    }
    Staff s = (Staff) obj;

    return this.getName().equals(s.getName());
  } */

  public static void main(String[] args) {
    Staff staff = new Staff("John", 3000.0);
    Staff staff2 = new Staff("Mary", 3000.0);
    Staff staff3 = Staff.builder().name("op").build();
    System.out.println(staff.equals(staff2));
  }

}
