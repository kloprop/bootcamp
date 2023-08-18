import java.util.List;
import java.util.Vector;

public class TestVector {
  List<Integer> vector = new Vector<>();

  public static void main(String[] args) {
    TestVector str2 = new TestVector();
    Runnable add = () ->{for (int i = 0; i<10000; i++){
      str2.vector.add(1);}
    };

    Thread thread = new Thread(add);
    Thread thread2 = new Thread(add);

    thread.start();
    thread2.start();

    try{
      thread.join();
      thread2.join();
    }catch(Exception e){


    }
    System.out.println(str2.vector.size());
    
  }
}
