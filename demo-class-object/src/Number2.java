public class Number2 {
  int number1;
  int number2;

  public void setNumber1(int number1){
    this.number1 = number1;
  }

  public void setNumber2 (int number2){
    this.number2 = number2;
  }
  public int divide (){ // Must not be static as internal data is used, static method can not use this to retrieve internal data
    this.print(); // non static method call non static method
    Number2.add(this.number1,this.number2); // non static method call static method, static method can call non static by creating new object inside the static method
    return this.number2/this.number1;
  }
  public static int divide(int number1, int number2){ // can be static or not be static as no internal data is used, but static is better for storing memory.
    return number1/number2;
  }

  public int addition (int n){
   return this.number1 +n;
  }

  public void print(){
    System.out.println("this number1 is "+ number1);
  }
  public static int add(int number1, int number2){
    return number1 + number2;
  }

  public static void main (String [] args){
    Number2 n1 = new Number2();
    n1.setNumber1(13);
    n1.setNumber2(26);

    Number2 n2 = new Number2();
    n2.setNumber1(10);
    n2.setNumber1(100);
    System.out.println(n1.divide());
    n1.print();
    
  } // End of Main



} // End of Class


