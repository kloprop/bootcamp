package G_revision;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // ArrayDeque & LinkedList -> different inderlying structure

    Deque<String> arrayDeque = new ArrayDeque<>(); // array (faster when reading)
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    Deque<String> linkedList = new LinkedList<>(); // linked list (faster when modifiying)(slow when reading last element)
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();

    Queue<String> arrQueue = new ArrayDeque<>(); // useful when the length of array is fixed
    arrQueue.add("a");
    arrQueue.poll();

    Queue<String> linkedQueue = new LinkedList<>();
    arrQueue.add("a");
    arrQueue.poll();

    Queue<String> pQueue = new PriorityQueue<>(); // array
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arraylist = new ArrayList<>();
    arraylist.add(3);
    arraylist.remove(Integer.valueOf(3));

    List<Integer> linkedlist2 = new LinkedList<>();
    // linkedlist.poll();
    linkedlist2.add(3);
    linkedlist2.remove(Integer.valueOf(3));

    Stack<String> stack = new Stack<>();

    Vector<String> stack2 = new Stack<>();
    // Vector does not have pop and push


  }
}
