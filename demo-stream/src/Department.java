import java.util.Objects;

public class Department  {
  String name;

  public Department(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return "Dept[" +"name:" +this.name +" ]";
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }
  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Department)){
      return false;
    }
    Department d = (Department) obj;

    return Objects.equals(this.name, d.name);
  }
}
