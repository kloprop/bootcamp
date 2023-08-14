package OOP.Employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class Department2{

  private List<ITStaff> list;

  private List<SalesStaff> list2;

  private DepartmentName department;

  private int departmentID;

  private Department2() {
    this.list = new ArrayList<>();

  }

  private Department2(DepartmentName department, T... staffs) {
    this();
    for (T staff : staffs) {
      this.list.add(staff);
    }
    this.department = department;
    this.departmentID = department.getId();

  }

  public static <T extends Employee> Department2<T> of(DepartmentName department, T... staffs) {
    return new Department2<>(department, staffs);
  }

  public int getDepartmentID() {
    return this.departmentID;
  }

  public Employee getHighestSalery() {
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
