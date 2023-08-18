public class TestSynchronized {
  
  int number;

  public synchronized void increment(){ // Like a "Atomic" method
    this.number++; // non -atomic operation
  }
  
  public static void main(String[] args) {
    TestSynchronized n = new TestSynchronized();
    Runnable add = () ->{for (int i = 0; i<10000; i++){
      n .increment();}
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
    System.out.println(n.number);
    
  
  }
}
