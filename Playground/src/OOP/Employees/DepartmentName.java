package OOP.Employees;

public enum DepartmentName {
  SALES(1), 
  IT(2),
  ;

  private int id;

  private DepartmentName(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
}
