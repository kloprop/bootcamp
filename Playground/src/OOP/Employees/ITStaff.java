package OOP.Employees;

import java.time.LocalDate;

public class ITStaff extends Employee {

  public ITStaff(String name, LocalDate entryDate, int salery) {
    super(name, entryDate, salery, DepartmentName.IT);

  }

  @Override
  public String toString() {
    return this.getName() + " " + this.getEntryDate();
  }
}
