package OOP.Employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class EmployeesInfo<T extends Employee> {

  private List<T> list;

  private Department department;

  private int departmentID;

  private EmployeesInfo() {
    this.list = new ArrayList<>();

  }

  private EmployeesInfo(Department department, T... staffs) {
    this();
    for (T staff : staffs) {
      this.list.add(staff);
    }
    this.department = department;
    this.departmentID = department.getId();

  }

  public static <T extends Employee> EmployeesInfo<T> of(Department department, T... staffs) {
    return new EmployeesInfo<>(department, staffs);
  }

  public int getDepartmentID() {
    return this.departmentID;
  }

  public T getHighestSalery() {
    int max = Integer.MIN_VALUE;
    T target = null;

    for (T employee : this.list) {
      if (employee.getSalery() > max) {
        max = employee.getSalery();
        target = employee;
      }
    }
    return target;
  }

  public T getNewMember() {
    LocalDate date = this.list.get(0).getEntryDate();
    T target = this.list.get(0);

    for (int i = 1; i < this.list.size(); i++) {
      LocalDate curr = this.list.get(i).getEntryDate();
      if (curr.isAfter(date)) {
        date = curr;
        target = this.list.get(i);
      }
    }
    return target;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (T em : this.list) {
      sb.append(em.getName()).append(" ");
    }
    return this.department +": "+ sb.toString().trim();
  }


  public List<T> getList() {
    return this.list;
  }

  public static void main(String[] args) {

    // System.out.println(it.getNewMember());
    //System.out.println(it.getList());
  }
}
