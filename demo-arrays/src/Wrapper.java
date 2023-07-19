public class Wrapper {
  public static void main(String [] args){
    // Primitives: byte, short
    // Wrapper Classes, corresponding primitive\

    boolean isMale = true; // isMale is not an object, can not be null
    Boolean isFemale = true; // isFemale is an object reference, can be null

    isMale = false;
    

    int num = 2 ;
    Integer num2 = 2; 
    num2 = null;

    num2.toString();
    Integer.valueOf("123");
    int i = Integer.valueOf("123");
    System.out.println(i);
    Integer num3 = 4;
    if (num3.compareTo(3)>0){
      System.out.println("num 3 is greater than 3");
    }
    

    char c = 'a';
    Character c2 = 'A';
    char result = Character.toLowerCase('B');

    // Difference?
    Character c3 = Character.valueOf('s');
    Character c4 = 's';
  }
}
