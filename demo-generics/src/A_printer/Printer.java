package A_printer;
import java.util.ArrayList;
import java.util.List;

public class Printer<T>  { // dont know print what // Class signature, add <> T represent any class

  T value;
  Object value2;

  
  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    
    this.value = value;
  }
  public void setObject(Object ele){
    this.value2 = ele;
  }
  public Object getObject(){
    return this.value;
  }


  public static void main(String[] args) {
    Printer<String> printer = new Printer<>();
    // Strong Type checking -> check if you put a real class into<>
    List<String> list = new ArrayList<>();

    Printer<Integer> printer2 = new Printer<>();
    System.out.println(1);

    Printer<Boolean> printer3 = new Printer<>();
    printer3.setObject("jk");
    System.out.println(printer3.getObject());
    System.out.println(printer3.getObject().getClass());
  }
  
}
