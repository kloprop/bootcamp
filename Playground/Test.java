package Playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public  class Test {
  
  private double height;
 
  public Test(double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
  public static void main(String[] args) {
    PriorityQueue <Integer> queue = new PriorityQueue<>(3);
    queue.offer(3); 
    queue.offer(2);
    queue.offer(1); 
    queue.offer(0);
    
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    
    int [] arr = new int[]{1,3,4};
    String [] arr1 = new String[]{"f","d"};
    List <Integer> list = new ArrayList<>();
    Collections.addAll(list,arr);
    List <String> list2 = Arrays.asList(arr1); 
  }
 
 

 


  
}

