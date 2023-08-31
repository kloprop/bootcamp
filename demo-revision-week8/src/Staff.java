import java.util.Objects;

public class Staff {
  private int id;
  private double salary;
  private String name;

  public Staff (int id , double salary, String name){
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  public int id(){
    return this.id;
  }
  public String name(){
    return this.name;
  }
  public double salary(){
    return this.salary;
  }

  @Override
  public boolean equals (Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Staff)){
      return false;
    }

    Staff s = (Staff) obj;
    return Objects.equals(s.id(),this.id());
  }
}
