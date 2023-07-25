public class Integer3 {
  
  public static void main(String [] args){
    // Internal cache (-128 - 127)
  Integer i1 = 100;
  Integer i2 = 100;
  Integer i34 = new Integer(100);
  System.out.println(i34 ==i2); //address, true 

  Integer i3 = 128;
  Integer i4 = 128;

  System.out.println(i3 == i4); //address, false
  Integer i5 = -128;
  Integer i6 = -128;

  System.out.println(i5 == i6); //address, false
  Byte b1 = 127;
  

  Float f1 = 2.3f;
  Float f2 = 2.3f;
  System.out.println(f1 == f2); // false, no cache


Double d1 = 2.3;
Double d2 = 2.3;

System.out.println(  d1 == d2); // false, no cache


  Boolean bool1 = false;
  Boolean bool2 = false;
  System.out.println("b"+ bool1.equals(bool2)); //true , same address (cache)

  // Internal Cache -> ASCII

  Character c1 = 'a';
  Character c2 = 'a';
  Character c3 = 'Ϩ';
  Character c4 = 'Ϩ';

  

  System.out.println(c1 ==c2); // true, same address (cache) (as within ASCII code)
  System.out.println(c3 ==c4); // false, (out of cache)

  Integer i7 = Integer.valueOf(127); // refer to cache
  Integer i8 = 127; // refer to cache

  System.out.println(i7 ==i8); //true 

  Integer i9 = Integer.valueOf(128); // outside pool
  Integer i10 = 128;
  Integer i11 = 128;
  System.out.println(i10==i11); // false



  System.out.println(i9 ==i10); //false

  

  }
}
