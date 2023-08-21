public class TestSynchronizedLock {
  int x;
  Object lock1 = new Object();
  Object lock2 = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized(lock1){
      this.x++;
    };
    //this.increment(); // x++
    return total + this.x;
  }

  // public synchronized void increment() {
  //   this.x++;
  // }

  public static void main(String[] args) {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable formula = ()->{
      for (int x = 0; x < 10000000; x++){
        obj.calculate(0);}
    };
    Thread thread = new Thread(formula);
    Thread thread2 = new Thread(formula);

    thread.start();
    thread2.start();

    try{
      thread.join();
      thread2.join();
    }catch(Exception e){
  }
  System.out.println(obj.x);
}
}
