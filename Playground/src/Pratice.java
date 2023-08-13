import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Pratice {

  public static void main(String[] args) {
  
    isValid("()");
  }
  
  public static boolean isValid(String s) {
        Map <Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack <Character> stack = new Stack<>();
        for (int i  = 0; i<s.length() ;i++){
            Character curr = Character.valueOf(s.charAt(i));
            System.out.println(curr);
            if (stack.isEmpty() || map.containsKey(curr)){
                stack.push(curr);
            }
            else if (map.get(stack.peek()) == curr){
                stack.pop();
            }
            else{
                return false;
            }
            System.out.println(stack);
        }
        return stack.size() == 0;   
    }
}
