package crash;

public  class Y {
  private  String name;

  public Y(){

  }
  
  public String getName() {
    return this.name;
  }

  public Y (String name){
    this.name = name;
  }
  public static void staticMethod(){
    System.out.println("I am Y");
  }
  public String ty(){
    return ("Y");
  }

  /* public static void main(String[] args) {
    X x = new X();
    x.getName();
  } */
}
