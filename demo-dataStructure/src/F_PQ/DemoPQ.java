
package F_PQ;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    // Priority : natural order by default 
    
    Queue <String> queue = new PriorityQueue<>(new SortByDescending());
    Deque <Integer> deque = new ArrayDeque<>();
    System.out.println(deque.poll());
    queue.add("bcd");
    queue.add("abc");
    queue.add("acc");
    queue.add("pcc");
    queue.add("def");
    //System.out.println(queue);
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); //abc
  }
}
