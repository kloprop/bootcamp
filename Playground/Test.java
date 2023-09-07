package Playground;

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
    
  }
 
 

 


  
}

