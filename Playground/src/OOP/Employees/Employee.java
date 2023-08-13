package OOP.Employees;

import java.time.LocalDate;

public abstract class Employee {
  private String name;
  private LocalDate entryDate;
  private int salery;
  private DepartmentName department;

  public Employee(String name, LocalDate entryDate, int salery,
      DepartmentName department) {


    this.name = name;
    this.entryDate = entryDate;
    this.salery = salery;
    this.department = department;

  }

  public String getName() {
    return this.name;
  }

  public LocalDate getEntryDate() {
    return this.entryDate;
  }

  public int getSalery() {
    return this.salery;
  }

  public DepartmentName getDepartment() {
    return this.department;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEntryDate(LocalDate date) {
    this.entryDate = date;
  }

  public void setSalery(int salery) {
    this.salery = salery;
  }

  public void setDepartment(DepartmentName department) {
    this.department = department;
  }

}
