package queue1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoQuene {
  public static void main(String[] args) {
    LinkedList <String> quene = new LinkedList<>();
    // First In First out ?
    // 排隊
    quene.add("hello");
    quene.add("world");
  

    
    System.out.println(quene);
    //poll and peek 
    // removefirst, removelast,addfirst, addlast
    //remove(ind)
    System.out.println(quene.peek());
    System.out.println(quene.poll());
    System.out.println(quene.poll());
    System.out.println(quene);
    quene.add("abc");
    quene.add("abc");
    quene.add("def");
    quene.add("xyz");
    System.out.println(quene.remove("abc")); //true
    System.out.println(quene);
    System.out.println(quene.poll());
    System.out.println(quene.offer("ilk"));
    System.out.println(quene.offer("ilk"));
    System.out.println(quene);

    LinkedList <String> backup = quene;

    
  
    while (!quene.isEmpty()){
      System.out.println(quene.poll());
    }
    
    System.out.println(backup.size());

    LinkedList <Integer> queneNum = new LinkedList<>(); 
    queneNum.add(10);
    queneNum.add(9);
    queneNum.add(-3);
    queneNum.add(0);
    queneNum.add(10);
    queneNum.add(100);
    // 10,9,-3,100
    int countEven = 0;
    int element = 0;

    int size = queneNum.size();
    int i = 0;
    while(i++<size){
      element = queneNum.poll();
      if (element %2 == 0 && ++countEven ==2){
        
        continue;
      }
      queneNum.add(element);
    }
    System.out.println(queneNum);

    
  }
}
