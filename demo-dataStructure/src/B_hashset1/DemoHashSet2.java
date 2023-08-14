package B_hashset1;

import java.util.HashSet;

public class DemoHashSet2 {
  public static void main(String[] args) {
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(Byte.valueOf((byte) 4));
    bytes.add(Byte.valueOf((byte) 10));
    
    
    HashSet <Byte> bytes2 = new HashSet<>();
    bytes.add(Byte.valueOf((byte) 4));
    bytes.add(Byte.valueOf((byte) 10));

    System.out.println(bytes.equals(bytes2)); // true

    boolean isRemoved10 = bytes.remove((byte)(10));
    System.out.println(isRemoved10); 
    

  }
}
