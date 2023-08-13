package OOP.Employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
  List<EmployeesInfo> allRecord;

  public DataBase() {
    this.allRecord = new ArrayList<>();
  }

  public void add(EmployeesInfo list) {
    int curr = list.getDepartmentID();
    if (!this.allRecord.isEmpty()) {
      for (int i = 0; i < this.allRecord.size(); i++) {
        if (curr < this.allRecord.get(i).getDepartmentID()) {
          this.allRecord.add(i, list);
          return;
        }
      }
    }
    this.allRecord.add(list);
  }

  public static void main(String[] args) {
    EmployeesInfo<ITStaff> it = EmployeesInfo.of(Department.IT,
        new ITStaff("Peter", LocalDate.of(2002, 4, 5), 10000),
        new ITStaff("John", LocalDate.of(2022, 5, 15), 30000),
        new ITStaff("Coman", LocalDate.of(2023, 8, 15), 5000));
    EmployeesInfo<SalesStaff> sales = EmployeesInfo.of(Department.SALES,
        new SalesStaff("Mary", LocalDate.of(2023, 5, 20), 1000));
    System.out.println(it.getHighestSalery());
    System.out.println(it.getList().get(2));
    DataBase base = new DataBase();
    base.add(it);
    base.add(sales);
    System.out.println(base.allRecord);
  }


}
