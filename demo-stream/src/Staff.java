import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department,int performance){
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  @Override
  public String toString(){
    return this.department + "staff name :" + this.name;
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR"),10),
    new Staff("Peter", new Department("IT"),60)
    , new Staff("Eric", new Department("IT"),70));

  
     staffs.stream()//
    .collect(Collectors.groupingBy(staff -> staff.department))// be careful of object 
    .forEach((dept , staffList) -> System.out.println(dept +" "+ staffList));

    // 
    Map <Boolean, List<Staff>> gradeMap = staffs.stream()//
    .collect(Collectors.partitioningBy(staff -> staff.performance >=60));

    gradeMap.entrySet().stream().forEach(e -> System.out.println(e));
    
    Map <String, Integer> map1 = new HashMap<>();
    List <Integer> list2 = new LinkedList<>();
  

    
  }
}
