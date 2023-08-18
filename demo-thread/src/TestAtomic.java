import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
  AtomicInteger number = new AtomicInteger();

  public static void main(String[] args) {
    TestAtomic i = new TestAtomic();
    //i.number++; // Non-Atomic Operaion 
    // can be changed during changing
    
    //Thread thread = new Thread(()-> i.number+=2);
    //thread.start();
    //System.out.println(i.number); // 1
  
    Runnable increment = () -> {
      for (int x = 0; x< 1000; x++){
        i.number.incrementAndGet();
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    
    thread1.start();
    thread2.start();

    try{
    thread1.join();
    thread2.join();
  }catch(InterruptedException e){
  }
  System.out.println(i.number);

  }
}
