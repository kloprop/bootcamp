import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company2 {
  private Staff [] staffs;

  public Company2(){
    staffs = new Staff[0];
  }

  public Company2 (Staff [] staffs){
    this.staffs = staffs;
  }

  public Staff[] staffs(){
    return this.staffs;
  }

  public void add(Staff staff){
    Staff [] original = this.staffs;
    this.staffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i< original.length;i++){
      this.staffs[i] = original[i];
    }
    this.staffs[this.staffs.length -1] = staff;
  }

  public void remove (Staff staff){
    /* Staff [] res = new Staff[this.staffs.length-1];
    int i = 0;

    for (Staff staf : this.staffs){
      if (staf.equals(staff)){
        continue;
      }
      res[i++] = staf;
    }
    this.staffs = res; */
    this.staffs = (Staff[]) Arrays.stream(this.staffs)
          .filter(e -> !e.equals(staff))
          .toArray();
    
    
  }
  public static void main(String[] args) {
   Company2 company = new Company2();
   company.add(new Staff(1, 20000, "John"));
   company.add(new Staff(2, 30000, "Mary"));

   List <Person3> persons = Arrays.stream(company.staffs)
          .filter(s -> s.salary() > 20000)
          .map( e -> new Person3(e.name()))
          .collect(Collectors.toList());
   
  }
}
