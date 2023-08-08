package queue1;

import java.util.ArrayDeque;

public class DemoArrayDeque {
  public static void main(String[] args) {
    //雙頭蛇
    ArrayDeque <String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    
    
  
    
    System.out.println(strings.poll()) ;// abc
    System.out.println(strings.size()); // 2
    strings.addLast("xyz"); // addLast() = add()
    System.out.println(strings);
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk");
    System.out.println(strings);
  
  }
}
