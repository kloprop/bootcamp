package OOP.Employees;

import java.time.LocalDate;

public class SalesStaff extends Employee {

  public SalesStaff(String name, LocalDate entryDate, int salery) {
    super(name, entryDate, salery, Department.SALES);
  }


}
