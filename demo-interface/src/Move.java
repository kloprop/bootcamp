

public interface Move extends BigMoves {
  // Constant

  static final int SPEED = 10;

  void jump();

  // After Java 8, lambda, stream
  default void print(){
    System.out.println("I am Java 8 defalut method");
  }
  static String concat(String a,String b){
    return a+b;
  }
}
