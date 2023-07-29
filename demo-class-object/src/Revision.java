public class Revision {
  String name;

  public void print(String name){
    System.out.println("hello " + this.name);
  }

  public static void print2(String input){
    System.out.println("hello " + input );
  }

  public static void main (String [] args){
    Revision r1 = new Revision();
    r1.name = "John";

    r1.print("world");
    Revision.print2("world");

    Revision r2 = new Revision();
    r2.name = "John";
    System.out.println(r1 ==r2);
    System.out.println(r1.name == r2.name);

    
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1 == s2);

    String s3 = new String("abc");
    System.out.println(s1 == s3);

    //-127 -128

    String temp = s1;
    s1 += "d";
    System.out.println(temp == s1);


  }
}
