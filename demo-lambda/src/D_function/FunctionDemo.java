package D_function;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
    Function <String, Integer> lengthFunc = str -> str.length(); // Function is functional interface
    Function <String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc")); 

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    Function <String, String> formula = str -> "default";
    String result = map.computeIfAbsent("def", str->"default"); // add new entry without possibly affecting the existing key
    String result1 = map.computeIfPresent("def", (s1,s2)->"changed"); // 
   
    System.out.println(map);

    //Bi Function
    BiFunction <Integer,Integer, BigDecimal> addition = (x,y) -> BigDecimal.valueOf(x+y); 
    // Create class of addition which implements Bifunction that can be reused

    System.out.println(addition.apply(7, 9));
    
    // map compute
    Map <String,Integer> stock = new HashMap<>();
    stock.put("clothes",100);

    stock.compute("clothes", (item,oldPrice) -> (int) (oldPrice*0.9));
    stock.compute("clothe", (item,oldPrice) -> (int) (120));
   }
}
