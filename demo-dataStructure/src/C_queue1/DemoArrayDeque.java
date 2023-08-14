package C_queue1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

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
    HashMap<String, Character> map = new HashMap<>();

    // Quene and dequene


    Deque<String> deque = new LinkedList<>(); //two exits and two entry
    Queue<String> quene = new LinkedList<>(); // left out, right in 
    LinkedList<String> list = new LinkedList<>(); // can perform both deque and quene, but poor in readabilty
    // Deque's method shall larger or equal to Queue
    // LinkedList can perform all actions, but deque and quene narrow the scoop to increase readability
    // Quene's methods and Deque's added methods 互補
    //readability, precise (subclass may have different implementation, percise limit the implementation)

    run(new LinkedList<>());
    run(new ArrayDeque<>());

    run2(new LinkedList<>());
    run2(new ArrayDeque<>());
    run2(new PriorityQueue<>());
    run2(quene);
    run2(list);
    Queue <Integer>  deq = new ArrayDeque<>();
     

   
  
  }
   public static void run(Deque<String> deque){ // make sure only subclass with addFirst in
      deque.addFirst("ss");
      deque.addLast("ss");
      deque.add("ss"); // Deque block priorityQueue for preventing PQ's add implementation
      deque.add("ss");
    }
    public static void run2(Queue<String> queue){ 
      queue.add("ss");
      queue.add("ss");
    }
    public static void run3(LinkedList <String> queue){ // limit performance, Linkedlist's add must be used
      queue.add("ss");
      queue.add("ss");
    }

}
