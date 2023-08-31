import java.util.ArrayList;
import java.util.List;

public class Company {
  List <Staff> staffs;


  public Company(){
    staffs = new ArrayList<>();
  }

  public Company (List <Staff> staffs){
    this.staffs = staffs;
  }

  public void add(Staff staff){
    this.staffs.add(staff);
  }

  public String geStaff (int staffId){
    return this.staffs.stream()
                      .filter(e -> e.id() == staffId)
                      .map(e -> e.name())
                      .findAny()
                      .orElseGet(()-> null);

  }
}
