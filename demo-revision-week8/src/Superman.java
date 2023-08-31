public class Superman implements Flyable {
  @Override
  public void fly(){
    System.out.println("I am flying");
  }

  public static void main(String[] args) {
    Flyable superman = new Superman();

    Flyable superman2 = new Flyable() {
      @Override
      public void fly(){
        System.out.println("I am fly");
      }
    };

    Flyable superman3 = ()->{
      System.out.println("Yeah!");
    };
  }
}
