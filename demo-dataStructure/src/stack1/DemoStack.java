package stack1;

import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // First in Last out
    Stack<String> stack = new Stack<>();
    // push and pop
    // 
    stack.push("abc");
    stack.push("def");
    System.out.println(stack.pop());
    System.out.println(stack.removeElement("abc"));
    System.out.println(stack);
    

    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }
    stack.push("dsf");
    stack.push("dsfds");
    stack.add("kl");
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);

  }
}
