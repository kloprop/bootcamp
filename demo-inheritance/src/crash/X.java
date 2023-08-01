package crash;

public class X extends Y{
  private String name;

/* public X(){

} */


  public X(String name){
    super("John");
    this.name = name;
  }
  public String getName() {
    return this.name;
  }

  public String getParentName(){
    return super.getName();
  }
  public String ParentName(){
    return "sdf";
  }

  public static void staticMethod(){
    System.out.println("I am X");
  }

  public static void main(String[] args) {
    X x = new X("peter"); // x Peter, y John
    System.out.println(x.getName()); //Peter //hiding
    System.out.println(x.getParentName()); //John
    
    
    
    // hiding
    //Y.staticMethod(); //hide super class (Y) static method
    
    Y y = new X("Tommy"); // variables and methods from Y is overriden, others that Y does not own are hidden
    System.out.println(y.getName()); // x get name is called
    
  }
}
