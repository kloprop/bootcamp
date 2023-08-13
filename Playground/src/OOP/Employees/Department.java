package OOP.Employees;

public enum Department {
  SALES(1), 
  IT(2),
  ;

  private int id;

  private Department(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
}
