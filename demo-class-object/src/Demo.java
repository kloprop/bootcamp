import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Demo {
  public static void main(String [] args){
    Car car = new Car();
    Car car4 = new Car();
    System.out.println("car"+ car.equals(car4)); // false
    car4 = car;
    System.out.println("car"+ car.equals(car4)); // true


    Computer computer = new Computer(); 
    Car car2 = new Car(7,9,"Red");
    System.out.println(car.getColor());
    System.out.println(car.getCapacity());
    System.out.println(car.getNoOFWheel());
    
    //car2 = new Car (7,9,"Yellow");
    car2.setColor("Yellow"); //car2 -> object reference, storing the object address
    System.out.println(car2.getColor());
    System.out.println(car2.getNoOFWheel());
    String str = "Hello"; // str -> object reference
    System.out.println(car2); // -> return object reference
    
    car2 = new Car (3,4,"Black");
    //car2 = null; // remove ref

    System.out.println(car2);
    int [] arr = new int [] {2,3,4};
    Integer sum = 0; // one ball
    for (int i = 0 ; i< arr.length;i++){
      sum = sum + arr[i];
    }

    for ( int j = 0 ; j<arr.length;j++){
      Integer sum1 = arr[j]; // create new object and reference each time
    }

    // Car factory
    CarFactory factory = new CarFactory();
    factory.changeColor(car2, "yellow");

    // Student
    Student john = new Student("John", "Wong", 17);

    char c = '5'-'0';
    int i = Integer.valueOf(c);
    System.out.println(i);

    String [] strs = new String [] {"Hello","lp"};
    char [] chars = new char [] {'f','f'};
    System.out.println(String.valueOf(chars)); 
    
    int [] arrs = new int [] {2,3,4,4};
    
   

    

  

    
  }
}
