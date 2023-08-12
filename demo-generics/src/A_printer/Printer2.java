package A_printer;
import java.util.ArrayList;
import java.util.List;

public class Printer2<T> { // dont know print what // Class signature, add <> T represent any class

  Object value2;

  
  public Object getValue(){
    return this.value2;
  }

  public void setValue(Object value){
    this.value2 = value;
  }
  public void setObject(Object ele){
    this.value2 = ele;
  }
  public Object getObject(){
    return this.value2;
  }


  public static void main(String[] args) {
    Printer printer = new Printer<>();
    printer.setValue("r");
    System.out.println(printer.getObject());
    printer.setValue(4);
    System.out.println(printer.getObject());

  }
  
}
