public class Methods {
  public static void main (String [] args){
    String str = "hello";
    str = str + " world";
    print(); // Calling the method
    
    int x = 10;
    int y = 100;
    int z = sum(1000,100);
    System.out.println(sum(x,y));
    System.out.println(z);
    printing("Hello");
    
  } // end of main


  public static void print(){
    System.out.println("Hello in print method.");
  }
  
  public static int sum(int x,int y){
    return x+y;
  }

  public static void printing(String str){
    if (str == null || "".equals(str)){
      return;
    }
    System.out.println(str);
  }

  
} //End of Class
