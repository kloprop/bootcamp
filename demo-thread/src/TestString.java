public class TestString {
  StringBuilder str = new StringBuilder();

  public static void main(String[] args) {
    TestString str2 = new TestString();
    Runnable add = () ->{for (int i = 0; i<10; i++){
      str2.str.append("H");}
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
    System.out.println(str2.str.length());
    
  }
}
