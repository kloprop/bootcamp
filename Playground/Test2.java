package Playground;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import javax.management.Query;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public interface Test2  {
  void print ();
  

  /* public double getHeight(){
    return this.height;
  } */
  public static void main(String[] args) {
    System.out.println(Test.weight);
    List <Integer> list = new ArrayList<>();
    List <Integer> list2 = new ArrayList<>();
    System.out.println(list.equals(list2));
    Map <String,Integer> map = new HashMap<>();
    map.put("a",4);
    map.put("b",0);
    Queue <Integer>qu = new ArrayDeque<>();
    Stack <Integer> stack = new Stack<>();
    stack.pop();
    map.put("c",3);

   
    
    
  }
}